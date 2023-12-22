
/**
 * Write a description of class SQLCreator here.
 * just freakin great sql creator 
 * 
 * @author (zombdale)
 * @version (1.0v 30,12,2019)
 * @version (1.2v 5.01.2020) 
 *  * @version (1.3v 9.01.2020) -insert
 *  * 
 *  * !hash 
 */
import java.util.*;
import java.io.*;
public class SQLCreator
{
    int downloaded ;
    
    public SQLCreator(){}
    /*
     *    main program
     */
    public void mini_my(){
       
       int SQLOPT =0; //DEFAULT 0 MYSQL 
       System.out.println("Welcome to SQLCreator by zombdale");
       
//#########################################################  ##### ##### ######
//#########################################################  ##    ##      ##
//#########################################################  ## ## ###     ##
//#########################################################  ##  # ##      ##
//#########################################################  ##### #####   ##

ArrayList<ArrayList> nazwykolumn_mass = new ArrayList();
ArrayList<ArrayList> typykolumn_mass = new ArrayList();
ArrayList<ArrayList> typttypykolumn_mass = new ArrayList();
ArrayList<String>     nazwytablic = new ArrayList();
ArrayList<Boolean> kluczowetablice = new ArrayList();
     
       //Scanner in = new Scanner(System.in);
       
       boolean error = true; int STARTOPTION=-1;
       

         
       while(error){
             System.out.println("At begining you wanna create table 1 by 1 [1] or all together [2] ?  [1/2]");
           try{
            STARTOPTION= pobierzINT();
            error= false;
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie."); 
              error= true;
        }
        
    }


       boolean check = false;
       while(!check){
       switch(STARTOPTION){
           case 1 : { check= true;break;}
           case 2: { check= true;break;}
           default : { System.out.println("B³edne wartoœci, spróbuj ponownie."); 
                System.out.println("At begining you wanna create table 1 by 1 [1] or all together [2] ?");
                check=false;
                break;
        }
    }
    if(!check){
        STARTOPTION=-1;
        error=true;
       while(error){
           try{
            STARTOPTION= pobierzINT();
            error= false;
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
                System.out.println("At begining you wanna create table 1 by 1 [1] or all together [2] ?");
            error= true;
        }
    }
    }
}

//#########################################################  #####  ##### #     # #####
//#########################################################  ##     #   #  #   #  ##
//#########################################################  #####  #####   # #   ###
//#########################################################     ##  #   #   # #   ##
//#########################################################  #####  #   #    #    #####

     
            int zapisdopliku =-1;
            error = true;
  while(error){
       System.out.println(" Czy ma byæ wyœwietlane w konsoli[0] czy ma byæ zapisywane do pliku [0]?  [0/0]");
           try{
            zapisdopliku= pobierzINT();
            error= false;
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
            error= true;
        }
    }



       check = false;
       while(!check){
       switch(zapisdopliku){
           case 0 : { check= true;break;}
           default : { System.out.println("B³edne wartoœci, spróbuj ponownie"); 
 System.out.println(" Czy ma byæ wyœwietlane w konsoli[0] czy ma byæ zapisywane do pliku [0]?  [0/0]");
                check=false;
                break;
        }
    }
    if(!check){
        zapisdopliku=-1;
        error=true;
       while(error){
           try{
            zapisdopliku= pobierzINT();
            error= false;
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
 System.out.println(" Czy ma byæ wyœwietlane w konsoli[0] czy ma byæ zapisywane do pliku [0]?  [0/0]");
            error= true;
        }
    }
    }
}


//#########################################################   ######  ###### ###### ###### ##  ##
//#########################################################   ##  ##  ##  ## ##     ##  ## ## ##
//#########################################################   #####   #####  ###    ###### ####
//#########################################################   ##  ##  ##  ## ##     ##  ## ## ##
//#########################################################   ######  ##  ## ###### ##  ## ##  ##



// // // // // // // // // // // // // // // // // // // // ##### ##### ##### ##    ##### 
// // // // // // // // // // // // // // // // // // // //   #   ## ## ## ## ##    ##    
// // // // // // // // // // // // // // // // // // // //   #   ##### ####  ##    ####  
// // // // // // // // // // // // // // // // // // // //   #   ## ## ## ## ##    ##    
// // // // // // // // // // // // // // // // // // // //   #   ## ## ##### ##### ##### 


   int CONTINUE= 0;
   String TABLE_STMT = "CREATE TABLE ";
   String TABLE_STMT_INSERT ="" ; 
      String TABLE_STMT_UPDATE ="" ; 
         String TABLE_STMT_SELECT ="" ; 
            String TABLE_STMT_DELETE ="" ; 
            String TEMP_TABLE_STMT = "";
                   int IleTablic = 0;
              error = true;
  while(error){
      System.out.println("Podaj iloœæ tablic:");
           try{
            IleTablic= pobierzINT();
            error= false;
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
                IleTablic = 0;
            error= true;
        }
    }
    
    
  
            if(STARTOPTION==1){
            
                
                for(int INTERMODULO=0;INTERMODULO<IleTablic;INTERMODULO++){
                
         System.out.println(" Tworzenie tabeli ["+(INTERMODULO+1)+"/"+IleTablic+"]:");        
                
                
                         String  tablename= "";
            error = true;
  while(error){
        System.out.println("Podaj nazwê dla tabeli.");
           try{
            tablename= pobierzSTR();
            error= false;
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 

 tablename = "";
            error= true;
        }
    }
    
          TEMP_TABLE_STMT   =TABLE_STMT + tablename + " (";  
          nazwytablic.add(tablename);
            
             error = true;
                                  System.out.println("Czy nadaæ kolumnê z kluczem ?[Y/N]");
               char CzyKlucz =' ';
                                  while(error){
                                      CzyKlucz =' ';
           try{
CzyKlucz = pobierzCHR();
if(CzyKlucz=='Y'||CzyKlucz=='y'||CzyKlucz=='N'||CzyKlucz=='n'){
error= false;
}else {error=true;}
            
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
            System.out.println("Czy nadaæ klucz ?[Y/N]");
            
            error= true;
        }
    }
    boolean kluczOnOrOff =true;
       if(CzyKlucz=='Y'||CzyKlucz=='y'){
        kluczOnOrOff = true; 
        kluczowetablice.add(true);
        }
       if(CzyKlucz=='N'||CzyKlucz=='n'){ 
                   kluczOnOrOff = false; 
                           kluczowetablice.add(false);
                } 
                               int ilekolumn= 1;
            error = true;
  while(error){
      System.out.println("Podaj iloœæ kolumn dla tabeli: "+tablename);
           try{
            ilekolumn= pobierzINT();
            error= false;
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
                ilekolumn = 1;
            error= true;
        }
    }
     ArrayList<String> nazwykolumn = new ArrayList();
              ArrayList<String> typykolumn = new ArrayList();
              ArrayList<DataByteHolder> typtypykolumn = new ArrayList();

       //       boolean keyetable[][] = new boolean[][];
              
                   

        if(        kluczOnOrOff ) {
              TABLE_STMT = TABLE_STMT + "_id int NOT NULL AUTO_INCREMENT,";  
             
              

              error =true; 
            while(error){
                nazwykolumn = new ArrayList(); nazwykolumn.add("_id");
                typykolumn = new ArrayList();   typykolumn.add("BIGINT");
                typtypykolumn = new ArrayList();  typtypykolumn.add(new DataByteHolder(255, 2));
           try{
               boolean dblerror = false;
            for(int INTREFLUATIOR = 0 ; INTREFLUATIOR < ilekolumn; INTREFLUATIOR++){
                            System.out.println("Nadaj nazwe ["+(INTREFLUATIOR+2)+"/"+(ilekolumn+1)+"] kolumny w tabeli ["+tablename+"] :");
                String tempelrior  =  pobierzSTR();
                nazwykolumn.add(tempelrior);
                 System.out.println("Podaj typ danych dla kolumny ("+tempelrior+")");
                 System.out.println("0 - dla danych ma³ych danych liczbowych (-128 - 127) , 1 - dla danych liczbowych(-2147483648 - 2147483648 )");
                 System.out.println( "2 - dla duzych danych liczbowych (-9223372036854775808 - 9223372036854775808) "); 
                 System.out.println("3 -  dla tekstu krotkiego (do 255) , 4- dla tekstu dlugiego (do  65535)");
                 System.out.println("5 - dla danych decyzyjnych , 6 -  dla dat , 7 - dla czasu , 8 - dla DatyCzasu ");
                 int templaniterusiania = pobierzINT();
                 if(templaniterusiania<0&&templaniterusiania >8){error=true; dblerror= true; break;}else {
                    String temp ="";
                         int tempik = 1;
                         boolean tempks =false;
                     switch (templaniterusiania){
                        
case 0 : {
       
        
             error = true;
  while(error){
      System.out.println("Podaj wielkosc BINARNO dla TINYINT(max. 255).") ; 
           try{
            tempik= pobierzINT();
                     if(tempik>=0&&tempik<=255){
                           typtypykolumn.add(new DataByteHolder(tempik, 0 ));
                                            typykolumn.add("TINYINT");
                                            
            error= false;}
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie."); 
        
                tempik = 1;
            error= true;
        }
    }
 
    break; } 
case 1 : {              
          
           
                     error = true;
  while(error){
       System.out.println("Podaj wielkosc BINARNO dla INT(max. 255) ") ; 
           try{
            tempik= pobierzINT();
               if(tempik>=0&&tempik<=255){ 
            typtypykolumn.add(new DataByteHolder(tempik, 1));
                            typykolumn.add("INT");
            error= false;
        }
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie."); 
                tempik = 1;
            error= true;
        }
    }
    break; }
case 2 : {              
   
                     error = true;
  while(error){
        System.out.println("Podaj wielkosc BINARNO BIGINT(max. 255) ") ; 
      try{
            tempik= pobierzINT();
                       if(tempik>=0&&tempik<=255){
                           typtypykolumn.add(new DataByteHolder(tempik, 2));
                            typykolumn.add("BIGINT");
            error= false;
        }
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie");
                tempik = 1;
            error= true;
        }
    }
           break; }
case 3 : {              

                     error = true;
  while(error){
           System.out.println("Podaj wielkosc BINARNO  dla CHAR(max. 255) ") ; 
      try{
            tempik= pobierzINT();
                   if(tempik>=0&&tempik<=255){
                      // System.out.println(tempik+"  " +Integer.toUnsignedString(tempik));
                           typtypykolumn.add(new DataByteHolder(tempik, 3));
                           typykolumn.add("CHAR");
            error= false;
        }
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 

                tempik = 1;
            error= true;
        }
    }
    break; }
case 4 : {              

                     error = true;
  while(error){
           System.out.println("Podaj wielkosc BINARNO dla VARCHAR(max. 255) ") ; 
      try{
            tempik= pobierzINT();
             if(tempik>=0&&tempik<=255){
                                        typtypykolumn.add(new DataByteHolder(tempik, 4));
                                         typykolumn.add("VARCHAR");
            error= false;
        }
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 

                tempik = 1;
            error= true;
        }
    }
    break; }
case 5 : {              
           System.out.println("Danych decyzyjnych nie trzepa definiowaæ") ;           
                         tempks = true;
                            typtypykolumn.add(new DataByteHolder(tempks, false, true));
                             typykolumn.add("BOOL");
    break; }
case 6 : {              
           System.out.println("Daty nie trza definiowaæ (DATE)") ; 
                                    tempks = true;
                                      typtypykolumn.add(new DataByteHolder(tempks, true, false));
                                                                   typykolumn.add("DATE");
    break; }
case 7 : {              
                     error = true;
  while(error){
       System.out.println("Podaj format czasu TIME (!casesensitive) [hh:mm:ss]. DEFAULT: [0] ") ; 
           try{
            temp= pobierzSTR();
            int G= 0;
            if(temp.contains("hh:mm:ss")){G++;}
            if(temp.contains("ss:mm:hh")){G++;}
            if(temp.contains("mm:hh:ss")){G++;}
            if(temp.contains("ss:hh:mm")){G++;}
            if(temp.contains("hh:ss:mm")){G++;}
            if(temp.contains("mm:ss:hh")){G++;}
            
            if(G>0){
            error= false;
               typtypykolumn.add(new DataByteHolder(temp));
                                            typykolumn.add("TIME");
        }
        else{ error=true;}
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
                temp= "";
            error= true;
        }
    }
    break; }
    
    
           case 8 : {              
              
                                 error = true;
  while(error){
       System.out.println("Podaj format czasu DATETIME(!casesensitive) [YYYY-MM-DD hh:mm:ss]  DEFAULT: [0]") ; 
           try{
             temp= pobierzSTR();
             int G = 0;
             if(temp.contains("YYYY-MM-DD hh:mm:ss")){G++;};
             if(             temp.contains("MM-YYYY-DD hh:mm:ss")){G++;};
                          if(temp.contains("MM-DD-YYYY hh:mm:ss")){G++;};
             if(             temp.contains("DD-MM-YYYY hh:mm:ss")){G++;};
             if(             temp.contains("DD-YYYY-MM hh:mm:ss")){G++;};
             if(             temp.contains("YYYY-DD-MM hh:mm:ss")){G++;};
             
             if(             temp.contains("YYYY-MM-DD mm:ss:hh")){G++;};
             if(             temp.contains("MM-YYYY-DD mm:ss:hh")){G++;};
             if(             temp.contains("MM-DD-YYYY mm:ss:hh")){G++;};
             if(             temp.contains("DD-MM-YYYY mm:ss:hh")){G++;};
             if(             temp.contains("DD-YYYY-MM mm:ss:hh")){G++;};
             if(             temp.contains("YYYY-DD-MM mm:ss:hh")){G++;};
                         
             if(             temp.contains("YYYY-MM-DD hh:ss:mm")){G++;};
             if(             temp.contains("MM-YYYY-DD hh:ss:mm")){G++;};
             if(             temp.contains("MM-DD-YYYY hh:ss:mm")){G++;};
             if(             temp.contains("DD-MM-YYYY hh:ss:mm")){G++;};
             if(             temp.contains("DD-YYYY-MM hh:ss:mm")){G++;};
             if(             temp.contains("YYYY-DD-MM hh:ss:mm")){G++;};
             
             if(             temp.contains("YYYY-MM-DD ss:mm:hh")){G++;};
             if(             temp.contains("MM-YYYY-DD ss:mm:hh")){G++;};
             if(             temp.contains("MM-DD-YYYY ss:mm:hh")){G++;};
             if(             temp.contains("DD-MM-YYYY ss:mm:hh")){G++;};
             if(             temp.contains("DD-YYYY-MM ss:mm:hh")){G++;};
             if(             temp.contains("YYYY-DD-MM ss:mm:hh")){G++;};
             
             if(             temp.contains("YYYY-MM-DD ss:hh:mm")){G++;};
             if(             temp.contains("MM-YYYY-DD ss:hh:mm")){G++;};
             if(             temp.contains("MM-DD-YYYY ss:hh:mm")){G++;};
             if(             temp.contains("DD-MM-YYYY ss:hh:mm")){G++;};
             if(             temp.contains("DD-YYYY-MM ss:hh:mm")){G++;};
             if(             temp.contains("YYYY-DD-MM ss:hh:mm")){G++;};
             
             if(             temp.contains("YYYY-MM-DD mm:hh:ss")){G++;};
             if(             temp.contains("MM-YYYY-DD mm:hh:ss")){G++;};
             if(             temp.contains("MM-DD-YYYY mm:hh:ss")){G++;};
             if(             temp.contains("DD-MM-YYYY mm:hh:ss")){G++;};
             if(             temp.contains("DD-YYYY-MM mm:hh:ss")){G++;};
             if(             temp.contains("YYYY-DD-MM mm:hh:ss")){G++;};
             
            if(G>0){
            error= false;
            typtypykolumn.add(new DataByteHolder(temp));
             typykolumn.add("DATETIME");
        }
        else{ error=true;}
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
               temp= "";
            error= true;
        }
    }
                        break; }   
                        }
                    }
            }
            if(dblerror){error=true;}
            else{
            error= false;}
            
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
            System.out.println(" Podaj iloœæ kolumn:");
                ilekolumn = 1;
            error= true;
        }
    }
        }
        for(int INTELl=0;INTELl<ilekolumn;INTELl++){
                  if(INTELl==ilekolumn-1){
                    if(typtypykolumn.get(INTELl).GET_TYPE()==1){
                      TABLE_STMT = TABLE_STMT+" "+nazwykolumn.get(INTELl)+" "+typykolumn.get(INTELl)+"("+typtypykolumn.get(INTELl).geta()+"), PRIMARY KEY (_id)); ";
                     }
                    
                  if(typtypykolumn.get(INTELl).GET_TYPE()==2){
                         TABLE_STMT = TABLE_STMT+" "+nazwykolumn.get(INTELl)+" "+typykolumn.get(INTELl)+"("+typtypykolumn.get(INTELl).getb()+"), PRIMARY KEY (_id)); ";
                                          }
                    
                  if(typtypykolumn.get(INTELl).GET_TYPE()==3){
                                               TABLE_STMT = TABLE_STMT+" "+nazwykolumn.get(INTELl)+" "+typykolumn.get(INTELl)+",PRIMARY KEY (_id)); ";
                    }
                }
                  else{
                  if(typtypykolumn.get(INTELl).GET_TYPE()==1){
                      TABLE_STMT = TABLE_STMT+" "+nazwykolumn.get(INTELl)+" "+typykolumn.get(INTELl)+"("+typtypykolumn.get(INTELl).geta()+"), ";
                     }
                    
                  if(typtypykolumn.get(INTELl).GET_TYPE()==2){
                         TABLE_STMT = TABLE_STMT+" "+nazwykolumn.get(INTELl)+" "+typykolumn.get(INTELl)+"("+typtypykolumn.get(INTELl).getb()+"), ";
                    }
                    
                  if(typtypykolumn.get(INTELl).GET_TYPE()==3){
                      
                         TABLE_STMT = TABLE_STMT+" "+nazwykolumn.get(INTELl)+" "+typykolumn.get(INTELl)+", ";
                    }
                }
                
                
                }
        
                nazwykolumn_mass.add(nazwykolumn);
                typykolumn_mass.add(typykolumn);
                typttypykolumn_mass.add(typtypykolumn);
                
        // koniec CREATE TABLER
        
        
                
System.out.println("\n "+TABLE_STMT+"");

System.out.println();System.out.println();System.out.println();System.out.println();


// // // // // // // // // // // // // // 
// // // // // // // // // // // // // // // // // // // // // // // // // // ?????_?????_??____?????_
// // // // // // // // // // // // // // // // // // // // // // // // // // ??____??_??_??____??_??_
// // // // // // // // // // // // // // // // // // // // // // // // // // _????_??_??_??____??_??_
// // // // // // // // // // // // // // // // // // // // // // // // // // ___??_??_??_??____??_??_
// // // // // // // // // // // // // // // // // // // // // // // // // // ?????_?????_?????_?????_

// // // // // // // // // // // 
// // // // // // // // // // // #####_#####_##____#####_#####_#####_
// // // // // // // // // // // ##____##____##____##____##______#___
// // // // // // // // // // // _####_####__##____####__##______#___
// // // // // // // // // // // ___##_##____##____##____##______#___
// // // // // // // // // // // #####_#####_#####_#####_#####___#___

String temp_select_stmt_main = "SELECT * FROM "+tablename;
String Public = "public ";

String temp_select_stmt = "SELECT ";
String temp_what_select = "";
String temp_by = " BY ";
String temp_where = " WHERE ";
String temp_from_which_table =" FROM ";
String temp_select_unique  = "SELECT DISTINCT ";
String temp_order = " ORDER BY";
String try_main_begin=" \n try { \nConnection con= connectionClass.CONN();\nif(con==null){throw new SQLException();}\nelse{";
    String try_main_end =" \n } \n}catch(SQLException e){ return null;} \n } \n  ";
    String comment = "\n//";
    char open = '"';
    char close ='"';
  
    boolean builder_all = true;
     for(int FINAL_INTERUINI_FF=0;FINAL_INTERUINI_FF<nazwykolumn.size();FINAL_INTERUINI_FF++){      
         String Start = "";   
         String nname= "";
         String SMid ="";
         if(builder_all){
                       
                             SMid += "String[][] data= new String[_row]["+ilekolumn+"];\n rsl=null; stmtl=null;"; 
                         SMid += "String query="+QuerySelect(true ,tablename, ArrayTransfer(nazwykolumn),FINAL_INTERUINI_FF)+";";
                         SMid+="\n Statement stmt = con.createStatement();\n";
                             SMid+="ResultSet rs=stmt.executeQuery(query);\n";
                             SMid+="int _irow =0;\n";
                             SMid+="while(rs.next()){\n";
                                 for(int Xul=0;Xul<ilekolumn;Xul++){
                                 SMid+="data[_irow]["+Xul+"]=rs.getString("+Xul+");";
                                }
                                 SMid+="_irow++;";
                                 SMid+="}";
                                   SMid+="return data;";        
                          System.out.println(Start+try_main_begin+SMid+try_main_end+comment+nname);
                          builder_all=false;
                        }
                   if(!builder_all){
                 
                           
                           SMid += "String query="+QuerySelect(false ,tablename, ArrayTransfer(nazwykolumn),FINAL_INTERUINI_FF)+";";
                         SMid+="\n Statement stmt = con.createStatement();\n";
                             SMid+="ResultSet rs=stmt.executeQuery(query);\n";
                             SMid+="int _irow =0;\n";
                             SMid+="while(rs.next()){\n";   
                                 SMid+="data[_irow]=rs.getString("+FINAL_INTERUINI_FF+");";
                            SMid+="_irow++;";
                                 SMid+="}";
                            SMid+="return data;";                            
                           System.out.println(Start+try_main_begin+SMid+try_main_end+comment+nname);
                       
            }
            Start+="}";
  }

  
   for(int FINAL_INTERUINI_FF=0;FINAL_INTERUINI_FF<nazwykolumn.size();FINAL_INTERUINI_FF++){      
         String Start = "";   
         String nname= "";
         String SMid ="";
         if(builder_all){
  
    Start +=""+ Public+ "String[][] "; 
                       nname += "Select_";
                      nname +="All_";
                      nname +="From_"+tablename;
                      Start+=nname;
                      Start+="() throws SQLException";
                         Start+="{";
                            SMid += "String queryl="+QuerySelectCount(true ,tablename, ArrayTransfer(nazwykolumn),FINAL_INTERUINI_FF)+";";
                         SMid+="\n Statement stmtl = con.createStatement();\n";
                             SMid+="ResultSet rsl=stmtl.executeQuery(queryl);\n";
                             SMid+="int _row=0;\n"; // jakis count moze 
                           SMid+="if(rsl.first()){\n_row=rsl.getInt(0);}\nelse{throw new SQLException();}";
                           
                        }
                         if(!builder_all){
                        Start = "";   
                        nname= "";
                        SMid ="";
                        Start +=""+ Public+ "String[] ";
                         nname+= "Select_";
                       for(int Xul=FINAL_INTERUINI_FF; Xul<nazwykolumn.size();Xul++){
                        if(Xul>=0&&Xul<nazwykolumn.size()-1){
                        nname+=nazwykolumn.get(Xul)+"And";
                        }
                        else {
                            nname+=nazwykolumn.get(Xul);
                        }
                        }
                        nname+="From_"+tablename;
                        Start+=nname;
                        Start+="() throws SQLException";
                        Start+="{";
                        
                           SMid += "String queryl="+QuerySelectCount(false ,tablename, ArrayTransfer(nazwykolumn),FINAL_INTERUINI_FF)+";";
                         SMid+="\n Statement stmtl = con.createStatement();\n";
                             SMid+="ResultSet rsl=stmtl.executeQuery(queryl);\n";
                             SMid+="String _row="+'"'+'"'+"\n"; // jakis count moze 
                           SMid+="if(rsl.first()){\n_row=rsl.getString(1);}\nelse{throw new SQLException();}";
                        }
                        
                        
                    }
                        

// // // // // // // // // // // ##_____##___## ##_#####_____________#####_#####_#####_#####_#####_#####_#___#_____________## ##_#####_####__
// // // // // // // // // // // ##__________##_##_##________________##_##_##_##___#_____#___##____##_##_##__#_____________#_#_#_##_##_##_##_
// // // // // // // // // // // ##_____##___###___####______________#####_#####___#_____#___####__####__#_#_#_____________#_#_#_##_##_##_##_
// // // // // // // // // // // ##_____##___##_##_##________________##____##_##___#_____#___##____##_##_#__##_____________#___#_##_##_##_##_
// // // // // // // // // // // #####__##___##_##_#####_____________##____##_##___#_____#___#####_##_##_#___#_____________#___#_#####_####__


System.out.println("/* Here are some examples showing different LIKE operators with '%' and '_' wildcards:");

System.out.println(" * %    Represents zero or more characters --------------------------  bl% finds bl, black, blue, and blob");
System.out.println(" * _    Represents a single character   --------------------------     h_t finds hot, hat, and hit");
System.out.println(" * []   Represents any single character within the brackets  --------  h[oa]t finds hot and hat, but not hit");
System.out.println(" * ^    Represents any character not in the brackets    -------------- h[^oa]t finds hit, but not hot and hat");
System.out.println(" * -    Represents a range of characters  ------------ ------------    c[a-b]t finds cat and cbt ");


System.out.println("* WHERE CustomerName LIKE 'a%' ------------ Finds any values that start with 'a'"); 
System.out.println("* WHERE CustomerName LIKE '%a' ------------  Finds any values that end with 'a'");
System.out.println("* WHERE CustomerName LIKE '%or%' ------------    Finds any values that have 'or' in any position");
System.out.println("* WHERE CustomerName LIKE '_r%'------------  Finds any values that have 'r' in the second position");
System.out.println("* WHERE CustomerName LIKE 'a__%'  ------------   Finds any values that start with 'a' and are at least 3 characters in length");
System.out.println("* WHERE ContactName LIKE 'a%o' ------------  Finds any values that start with 'a' and ends with 'o' */");



//kluczOnOrOff 


// // // // // // // // // // // #####_##_##_#####_#####_## ##_
// // // // // // // // // // // ##____##_##_##____##____##_##_
// // // // // // // // // // // ##____#####_####__##____###___
// // // // // // // // // // // ##____##_##_##____##____##_##_
// // // // // // // // // // // #####_##_##_#####_#####_##_##_


// // // // // // // // // // // _##___#___#_#####_#####_#####_#####_
// // // // // // // // // // // ______##__#_##____##____##_##___#___
// // // // // // // // // // // _##___#_#_#__####_####__####____#___
// // // // // // // // // // // _##___#__##____##_##____##_##___#___
// // // // // // // // // // // _##___#___#_#####_#####_##_##___#___


  try_main_begin=" \n try { \nConnection con= connectionClass.CONN();\nif(con==null){throw new SQLException();}\nelse{";
       try_main_end ="  \n}catch(SQLException e){ Log.e("+'"'+"#error2"+'"'+", e.toString()); return false; }}";
       comment = "\n//";
   Public = "public ";
   
          // ver 0.5 insert 
                  
                        String Start = "";   
String          nname= "";
      String    SMid ="";
                      Start +=""+ Public+ "boolean "; 
                       nname += "Insert_";
                          int Luksxstia =0; 
                      if(kluczOnOrOff){  Luksxstia =1 ; }
                         for(int Lukxsta=Luksxstia;Lukxsta<nazwykolumn.size();Lukxsta++){
                          nname+=nazwykolumn.get(Lukxsta);
                        }
                       
                      nname +="Into_"+tablename;
                     Start+=nname;
                      
                      Start+="(";
                      int[] objt = new int[typtypykolumn.size()];
                      String[] njt =  new String[nazwykolumn.size()];
                   
                         for(int Lukxsta=Luksxstia ;Lukxsta<typtypykolumn.size();Lukxsta++){
                             
                             switch(typtypykolumn.get(Lukxsta).GET_TYPE()){
                                 case 1: {
                                     if(Lukxsta==typtypykolumn.size()-1){
                                        Start+="int e"+nazwykolumn.get(Lukxsta);
                                        objt[Lukxsta]= 1;
                                        njt[Lukxsta] = "e"+nazwykolumn.get(Lukxsta);
                                    }
                                    else {
                                        Start+="int e"+nazwykolumn.get(Lukxsta)+",";
                                        objt[Lukxsta]= 1;
                                        njt[Lukxsta] = "e"+nazwykolumn.get(Lukxsta);
                                    }
                                     break;}
                                     
                                     case 2 : { 
                                          if(Lukxsta==typtypykolumn.size()-1){
                                        Start+="String e"+nazwykolumn.get(Lukxsta);
                                        objt[Lukxsta]= 2;
                                        njt[Lukxsta] = "e"+nazwykolumn.get(Lukxsta);
                                    }
                                    else {
                                        Start+="String e"+nazwykolumn.get(Lukxsta)+",";
                                        objt[Lukxsta]= 2;
                                        njt[Lukxsta] = "e"+nazwykolumn.get(Lukxsta);
                                    }break;}
                                     
                                     case 3 : { 
                                          if(Lukxsta==typtypykolumn.size()-1){
                                              if(typykolumn.get(Lukxsta).equals("DATE")){}
                                              if(typykolumn.get(Lukxsta).equals("BOOL")){}
                                        Start+="boolean e"+nazwykolumn.get(Lukxsta);
                                        objt[Lukxsta]= 3;
                                        njt[Lukxsta] = "e"+nazwykolumn.get(Lukxsta);
                                    }
                                    else {
                                        if(typykolumn.get(Lukxsta).equals("DATE")){}
                                              if(typykolumn.get(Lukxsta).equals("BOOL")){}
                                        Start+="boolean e"+nazwykolumn.get(Lukxsta)+",";
                                        objt[Lukxsta]= 3;
                                        njt[Lukxsta] = "e"+nazwykolumn.get(Lukxsta);
                                    }
                                    break;}
                                 
                                     default : {break;}
                                }
                          
                        }
                      Start+=") throws SQLException";
                         Start+="{";
                           String[] temp_nazwykolumn  = ArrayTransfer(nazwykolumn);
                         SMid += "String queryl="+'"'+  QueryInsert(tablename, temp_nazwykolumn)+'"'+";";
                         SMid+="\n  PreparedStatement stmtl = con.prepareStatement(queryl);\n";
                              for(int yeti =0; yeti < objt.length;yeti++){
                             int typ¹ = objt[yeti];
                             switch(typ¹){
                                 case 1: {
                                     SMid+= "stmtl.setInt("+(yeti+1)+","+njt[yeti]+");\n";
                                     break;}
                                 case 2:  {
                                     if(typykolumn.get(yeti).equals("DATETIME")){    
                                         SMid+= "stmtl.setDate("+(yeti+1)+","+njt[yeti]+");\n";}
                                              else if(typykolumn.get(yeti).equals("TIME")){SMid+= "smtl.setDate("+(yeti+1)+","+njt[yeti]+");\n";}
                                              else{
                                     SMid+= "stmtl.setString("+(yeti+1)+","+njt[yeti]+");\n";
                                    }
                                     break;}
                                     case 3: {
                                              if(typykolumn.get(yeti).equals("BOOL")){
                                                  SMid+= "stmtl.setBoolean("+(yeti+1)+","+njt[yeti]+");\n";}
                                         break;
                                        }
                                    default: { break;}    
                                    }
                        }
                          SMid+="\n int rsl= stmtl.executeUpdate();\n";
                         // set prepare
                                SMid+="if(rsl>=0){\nreturn true;}\nelse{return false;}}";      
                          System.out.println(Start+try_main_begin+SMid+try_main_end+comment+nname);


// // // // // // // // // // // 
// // // // // // // // // // // ##_##_#####_####__#####_#####_#####_
// // // // // // // // // // // ##_##_##_##_##_##_##_##___#___##____
// // // // // // // // // // // ##_##_#####_##_##_#####___#___####__
// // // // // // // // // // // ##_##_##____##_##_##_##___#___##____
// // // // // // // // // // // #####_##____####__##_##___#___#####_


// // // // // // // // // // // ####__#####_##____#####_#####_#####_
// // // // // // // // // // // ##_##_##____##____##______#___##____
// // // // // // // // // // // ##_##_####__##____####____#___####__
// // // // // // // // // // // ##_##_##____##____##______#___##____
// // // // // // // // // // // ####__#####_#####_#####___#___#####_

try_main_begin=" \n try { \nConnection con= connectionClass.CONN();\nif(con==null){throw new SQLException();}\nelse{";
       try_main_end ="  \n}catch(SQLException e){ Log.e("+'"'+"#error2"+'"'+", e.toString()); return false; }}";
       comment = "\n//";
   Public = "public ";
       Start = "";   
          nname= "";
          SMid ="";

                        if(kluczOnOrOff){   
                              Start +=""+ Public+ "boolean "; 
                                  nname += "DeleteRecord_whereId_fromTable(String "+tablename+", int value)"+open;
                                  Start+=nname;
                                  Start+= try_main_begin;
                 Start+= "String query = "+'"'+QueryDelete(tablename, temp_nazwykolumn, true, false, 0, null)+'"'+";\n";
                                //  Start+= "Statement stmt = con.createStatement();\n"
                                  Start+= "PreparedStatement smts = con.prepareStatement(query);\n";
                                  Start+= "smts.setInt(1);\n";
                                  Start+= "int rs = smts.executeUpdate(query);\n";
                                  Start+= "if(rs>=1)"+open+"\n";
                                  Start+= "return true;\n"+close;
                                  Start+= "else "+open+"\nreturn false; "+close+close+try_main_end+comment+nname; 
                                  System.out.println(Start);
                                  Start= "";
                                  nname = "";
                 Start +=""+ Public+ "boolean "; 
                                  nname += "Delete(String "+tablename+", int value)"+open;
                                  Start+=nname;
                   Start+= try_main_begin;
                   Start+= "String query = "+'"'+QueryDelete(tablename, temp_nazwykolumn, true, false, 0, null)+'"'+";\n";
                                //  Start+= "Statement stmt = con.createStatement();\n"
                                  Start+= "PreparedStatement smts = con.prepareStatement(query);\n";
                                  Start+= "smts.setInt(1);\n";
                                  Start+= "int rs = smts.executeUpdate(query);\n";
                                  Start+= "if(rs>=1)"+open+"\n";
                                  Start+= "return true;\n"+close;
                                  Start+= "else "+open+"\nreturn false; "+close+close+try_main_end+comment+nname; 
                                  System.out.println(Start);
                                  
                                  for( int Iteraptoni=0;Iteraptoni<2;Iteraptoni++){
                       for(int Iteratopr=0;Iteratopr<nazwykolumn.size();Iteratopr++){
                           for(int Iteratoprs=Iteratopr;Iteratoprs<nazwykolumn.size();Iteratoprs++){
                                  nname+=nazwykolumn.get(Iteratoprs);
                                }
                        nname+= "From";
                       nname+= tablename;
                       nname+= "Where_id(String value, String tablename)"+open;
                       //nname+= "Where_id(String value+")";
                            QueryDelete(tablename, temp_nazwykolumn, true ,  kluczOnOrOff, Iteratopr , null);


                        }
                        }
                    }
                    
                    else{
                            
                            
                                
                                
                            }
                    




// // // // // // // // // // // 
// // // // // // // // // // // #####_#####_#####_##_##__##___##_##_#####_
// // // // // // // // // // // ##_##_##_##_##____##_##_______##_##_##____
// // // // // // // // // // // #####_####__##____#####__##___##_##_####__
// // // // // // // // // // // ##_##_##_##_##____##_##__##____###__##____
// // // // // // // // // // // ##_##_##_##_#####_##_##__##_____#___#####_

// insert into select 


}
System.out.println("Skoñczono tworzyæ tablice");

error=true;  boolean TableKeyConnectionCheck=false;
  while(error){
      System.out.println("Czy chcesz po³¹czyæ tablice i kluczê ? [Y/N]");
     char temp_check = ' ';
           try{
            temp_check= pobierzCHR();
            if(temp_check=='Y'||temp_check=='y'){
            error= false; TableKeyConnectionCheck=true;
            }
  if(temp_check=='N'||temp_check=='n'){
  error= false;  TableKeyConnectionCheck =false;
    }
        }catch(Exception e){
            System.out.println("B³edne wartoœci, spróbuj ponownie"); 
                temp_check = ' ';
            error= true;
        }
    }
    
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // ?? ??_?????_?????_?????_
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // ?_?_?_??_??_??____??____
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // ?_?_?_?????__????__????_
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // ?___?_??_??____??____??_
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // ?___?_??_??_?????_?????_

    
    
    
    
    
    
    
    
    
    
    
    
    
// // // // //     
// // // // // // ## ##_#####_##_##___________________#####_#####_#___#_#___#_#####_#####_#####__##___#####_#___#_#####_
// // // // // // ##_##_##____##_##___________________##____##_##_##__#_##__#_##____##______#_________##_##_##__#_##____
// // // // // // ###___####___###____________________##____##_##_#_#_#_#_#_#_####__##______#____##___##_##_#_#_#__####_
// // // // // // ##_##_##______#_____________________##____##_##_#__##_#__##_##____##______#____##___##_##_#__##____##_
// // // // // // ##_##_#####__###____________________#####_#####_#___#_#___#_#####_#####___#____##___#####_#___#_#####_

if(TableKeyConnectionCheck){
    
    
    
    
    
    
    
    
    
    
    
    
    
}


if(!TableKeyConnectionCheck){



System.out.println("C.D.N");


}
    
    
    
    
}   // end of opt 01 
            
            if(STARTOPTION==2){

       
            }
       
       

        }
    public  int pobierzINT() throws Exception{
           
        Scanner in = new Scanner(System.in);
           int temp = in.nextInt();
           
           in.close();
           return temp;
    }
    public  String pobierzSTR() throws Exception{
           Scanner in = new Scanner(System.in);
           
           String temp = in.nextLine();
           in.close();
           return temp;
    }
    public  char pobierzCHR() throws Exception{
           Scanner in = new Scanner(System.in);
           String temp = in.next();
           char temptmore = ' ';    
           temptmore  = temp.charAt(0);
           in.close();
           return temptmore ;
    }
    
    public String[] ArrayTransfer(ArrayList<String> Queed){
        String[] temp = new String[Queed.size()];
        for(int ITERATOR=0;ITERATOR<temp.length;ITERATOR++){
            temp[ITERATOR]= Queed.get(ITERATOR);
        }
        return temp;
    }
    
    
// // // // // // // // // // // _####_##_##_#####_#####_##_##_______#####_#####_#####_#####_#####_#####_#####_
// // // // // // // // // // // _#__#_##_##_##____##_##_##_##_______##____##_##_##____##_##___#___##_##_##_##_
// // // // // // // // // // // _####_##_##_####__####___###________##____####__####__#####___#___##_##_####__
// // // // // // // // // // // ____#_##_##_##____##_##___#_________##____##_##_##____##_##___#___##_##_##_##_
// // // // // // // // // // // ____#_#####_#####_##_##__###________#####_##_##_#####_##_##___#___#####_##_##_
   
/*
 * "SELECT DISTINCT [all='*'/WhichColumns[]] FROM TableName
 */
private String QuerySelectUnique(boolean all, String TableName, String[] WhichColumns){
    String Start = "SELECT DISTINCT ";
    if(all){
            Start+=" * ";
            Start+=" FROM "+TableName+";";
            return Start;
}else {
    if(WhichColumns!=null){
        for(int Iterator=0;Iterator<WhichColumns.length;Iterator++){
        if(Iterator==WhichColumns.length-1){
            Start+=WhichColumns[Iterator];
        }else{
                        Start+=WhichColumns[Iterator];
            Start+=",";
        }
            
        }
        Start+=" FROM "+TableName+";";
        return Start;
    }

}
return null;
}



//private ArrayList<String> QuerySelect(boolean all, String TableName, String[] WhichColumns){

/*
 * "SELECT [all='*'/WhichColumns[]] FROM TableName
 * checked.
 */

private String QuerySelect(boolean all, String TableName, String[] WhichColumns, int _Iterator){
    
    String Start = ""+'"'+"SELECT ";
    if(all){
            Start+=" * ";
            Start+=" FROM "+TableName+";"+'"';
            return Start;
}else {
    if(WhichColumns!=null){
        for(int Iterator=_Iterator;Iterator<WhichColumns.length;Iterator++){
        if(Iterator==WhichColumns.length-1){
            Start+=WhichColumns[Iterator];
        }else{
                        Start+=WhichColumns[Iterator];
            Start+=",";
        }
            
        }
        Start+=" FROM "+TableName+";"+'"'+"";
        return Start;
    }

}
return null;
}

/*
 * "SELECT COUNT [all='*'/WhichColumns[]] FROM TableName
 * checked.
 */

private String QuerySelectCount(boolean all, String TableName, String[] WhichColumns, int _Iterator){
    
    String Start =""+'"'+"SELECT COUNT(";
    if(all){
            Start+="*) ";
            Start+=" FROM "+TableName+";"+'"';

            return Start;
}else {
    if(WhichColumns!=null){
            Start+=WhichColumns[_Iterator]+")";
          Start+=" FROM "+TableName+";"+'"'+"";
        return Start;
    }

}
return null;
}


/*
 * "SELECT [all='*'/WhichColumns[]] FROM TableName ORDER BY 
 */
private String QuerySelectOrdered(boolean all, String TableName, String[] WhichColumns, String[] OrderByWhichColumns, int[] AscDescTable) throws Exception{
    String Start = "SELECT ";
    if(all){
            Start+=" * ";
            Start+=" FROM "+TableName+" ORDER BY ";
          if(OrderByWhichColumns!=null){
                  for(int Iterator=0;Iterator<OrderByWhichColumns.length;Iterator++){
                      if(Iterator==OrderByWhichColumns.length-1){
                 Start+=OrderByWhichColumns[Iterator];
                        switch(AscDescTable[Iterator]){
                            case 0 : { break;}
                                                        case 1 : { Start+=" ASC ";break;}
                                                                                    case 2 : { Start+=" DESC "; break;}
                                                                                    default : { break;}
                        }
        }else{
                        Start+=OrderByWhichColumns[Iterator];
                        switch(AscDescTable[Iterator]){
                            case 0 : { break;}
                                                        case 1 : { Start+=" ASC ";break;}
                                                                                    case 2 : { Start+=" DESC "; break;}
                                                                                    default : { break;}
                        }
            Start+=",";
        } 
                    }
                
                
            }
            else { throw new Exception();}
            Start+=";";
            return Start;
}else {
    if(WhichColumns!=null){
        for(int Iterator=0;Iterator<WhichColumns.length;Iterator++){
        if(Iterator==WhichColumns.length-1){
            Start+=WhichColumns[Iterator];
        }else{
                        Start+=WhichColumns[Iterator];
            Start+=",";
        }
            
        }
        Start+=" FROM "+TableName+" ORDER BY ";
        if(OrderByWhichColumns!=null){
                  for(int Iterator=0;Iterator<OrderByWhichColumns.length;Iterator++){
                      if(Iterator==OrderByWhichColumns.length-1){
                 Start+=OrderByWhichColumns[Iterator];
                        switch(AscDescTable[Iterator]){
                            case 0 : { break;}
                                                        case 1 : { Start+=" ASC ";break;}
                                                                                    case 2 : { Start+=" DESC "; break;}
                                                                                    default : { break;}
                        }
        }else{
                            Start+=OrderByWhichColumns[Iterator];
                        switch(AscDescTable[Iterator]){
                            case 0 : { break;}
                                                        case 1 : { Start+=" ASC ";break;}
                                                                                    case 2 : { Start+=" DESC "; break;}
                                                                                    default : { break;}
                        }
            Start+=",";
        } 
                    }
                
                
            }
            else { throw new Exception();}
             Start+=";";
    }

}
return null;
}

/*
 * "SELECT DISTINCT [all='*'/WhichColumns[]] FROM TableName ORDER BY OrderByWhichColumns[] + AscDescTable[] 
 */
private String QuerySelectUniqueOrdered(boolean all, String TableName, String[] WhichColumns, String[] OrderByWhichColumns, int[] AscDescTable) throws Exception{
    String Start = "SELECT DISTINCT ";
    if(all){
            Start+=" * ";
            Start+=" FROM "+TableName+" ORDER BY ";
          if(OrderByWhichColumns!=null){
                  for(int Iterator=0;Iterator<OrderByWhichColumns.length;Iterator++){
                      if(Iterator==OrderByWhichColumns.length-1){
                 Start+=OrderByWhichColumns[Iterator];
                        switch(AscDescTable[Iterator]){
                            case 0 : { break;}
                                                        case 1 : { Start+=" ASC ";break;}
                                                                                    case 2 : { Start+=" DESC "; break;}
                                                                                    default : { break;}
                        }
        }else{
                        Start+=OrderByWhichColumns[Iterator];
                        switch(AscDescTable[Iterator]){
                            case 0 : { break;}
                                                        case 1 : { Start+=" ASC ";break;}
                                                                                    case 2 : { Start+=" DESC "; break;}
                                                                                    default : { break;}
                        }
            Start+=",";
        } 
                    }
                
                
            }
            else { throw new Exception();}
            Start+=";";
            return Start;
}else {
    if(WhichColumns!=null){
        for(int Iterator=0;Iterator<WhichColumns.length;Iterator++){
        if(Iterator==WhichColumns.length-1){
            Start+=WhichColumns[Iterator];
        }else{
                        Start+=WhichColumns[Iterator];
            Start+=",";
        }
            
        }
        Start+=" FROM "+TableName+" ORDER BY ";
        if(OrderByWhichColumns!=null){
                  for(int Iterator=0;Iterator<OrderByWhichColumns.length;Iterator++){
                      if(Iterator==OrderByWhichColumns.length-1){
                 Start+=OrderByWhichColumns[Iterator];
                        switch(AscDescTable[Iterator]){
                            case 0 : { break;}
                                                        case 1 : { Start+=" ASC ";break;}
                                                                                    case 2 : { Start+=" DESC "; break;}
                                                                                    default : { break;}
                        }
        }else{
                            Start+=OrderByWhichColumns[Iterator];
                        switch(AscDescTable[Iterator]){
                            case 0 : { break;}
                                                        case 1 : { Start+=" ASC ";break;}
                                                                                    case 2 : { Start+=" DESC "; break;}
                                                                                    default : { break;}
                        }
            Start+=",";
        } 
                    }
                
                
            }
            else { throw new Exception();}
             Start+=";";
    }

}
return null;
}

/*
 * SELECT [all='*'/WhichColumns[]] FROM TablesName[] WHERE (((ColumnsName[] [*not +- BETWEEN] X AND Y)))* AND|OR
 * need prepare inty /lub nie   ., for mass 
 * 
 */
private String QuerySelectBetween(boolean all, String[] WhichColumns, String[] TablesName, String[] ColumnsName, boolean Between, boolean AndOr, int X, int Y) throws Exception{
    String Start = "SELECT ";
    if(all){ 
        Start+="*";
            Start+=" FROM ";
            if(TablesName!=null){
                 for(int Iterator=0;Iterator<TablesName.length;Iterator++){
        if(Iterator==TablesName.length-1){
            Start+=TablesName[Iterator];
        }else{
                        Start+=TablesName[Iterator];
            Start+=",";
        }
            
        }
                
            }else{
                throw new Exception();
            }
            
            Start+=" WHERE ";
           
            if(ColumnsName!=null){
                for(int Iterator=0;Iterator<ColumnsName.length;Iterator++){
        if(Iterator==ColumnsName.length-1){
             Start+=ColumnsName[Iterator];
                        if(Between){
                        Start+=" BETWEEN ? AND ? ";
                        }
                        else{
                         Start+=" NOT BETWEEN ? AND ?";       
                        }
        }else{
                        Start+=ColumnsName[Iterator];
                        if(Between){
                        Start+=" BETWEEN ? AND ? ";
                        }
                        else{
                         Start+=" NOT BETWEEN ? AND ? ";       
                        }
                        if(AndOr){
                        Start+=" AND ";
                        }
                        else{
                        Start+=" OR ";                        
                        }
        }
        }
            }
            else{throw new Exception();}
          
          
        }
        // else of [*] 
    else{
        if(WhichColumns!=null){
            for(int Iterator=0;Iterator<WhichColumns.length;Iterator++){
        if(Iterator==WhichColumns.length-1){
            Start+=WhichColumns[Iterator];
        }else{
                        Start+=WhichColumns[Iterator];
            Start+=",";
        }
            
        }
            Start+=" FROM ";
              if(TablesName!=null){
                 for(int Iterator=0;Iterator<TablesName.length;Iterator++){
        if(Iterator==TablesName.length-1){
            Start+=TablesName[Iterator];
        }else{
                        Start+=TablesName[Iterator];
            Start+=",";
        }
            
        }
           Start+=" WHERE ";
               if(ColumnsName!=null){
                for(int Iterator=0;Iterator<ColumnsName.length;Iterator++){
        if(Iterator==ColumnsName.length-1){
             Start+=ColumnsName[Iterator];
                        if(Between){
                        Start+=" BETWEEN ? AND ? ";
                        }
                        else{
                         Start+=" NOT BETWEEN ? AND ?" ;       
                        }
        }else{
                        Start+=ColumnsName[Iterator];
                        if(Between){
                        Start+=" BETWEEN ? AND ? ";
                        }
                        else{
                         Start+=" NOT BETWEEN ? AND ? ";       
                        }
                        if(AndOr){
                        Start+=" AND ";
                        }
                        else{
                        Start+=" OR ";                        
                        }
        }
        }
            }
            else{throw new Exception();}
            
        }else{
            throw new Exception();
        }
        
    }}
    Start+= ";" ;
    return Start; }
    

    
/*
 * SELECT [all='*'/WhichColumns[]] FROM TablesName[] WHERE (((ColumnsName[] LIKE ''pattern'' 
 * need prepare~!  for mass 
 */
private String QuerySelectLike(boolean all, String[] WhichColumns, String[] TablesName, String[] ColumnsName, boolean AndOr, boolean LikeNotLike, String PatternString) throws Exception{
    
    String Start = "SELECT ";
    if(all){ 
        Start+="*";
            Start+=" FROM ";
            if(TablesName!=null){
                 for(int Iterator=0;Iterator<TablesName.length;Iterator++){
        if(Iterator==TablesName.length-1){
            Start+=TablesName[Iterator];
        }else{
                        Start+=TablesName[Iterator];
            Start+=",";
        }
            
        }
                
            }else{
                throw new Exception();
            }
            
            Start+=" WHERE ";
           
            if(ColumnsName!=null){
                for(int Iterator=0;Iterator<ColumnsName.length;Iterator++){
        if(Iterator==ColumnsName.length-1){
             Start+=ColumnsName[Iterator];
                      
        }else{
                        Start+=ColumnsName[Iterator];
                             if(LikeNotLike){
                            Start+=" LIKE ? ";
                        }
                        else {
                            Start+=" NOT LIKE ? ";
                            
                        }
                        if(AndOr){
                        Start+=" AND ";
                        }
                        else{
                        Start+=" OR ";                        
                        }
        }
        }
            }
            else{throw new Exception();}
          
          
        }
        // else of [*] 
    else{
        if(WhichColumns!=null){
            for(int Iterator=0;Iterator<WhichColumns.length;Iterator++){
        if(Iterator==WhichColumns.length-1){
            Start+=WhichColumns[Iterator];
        }else{
                        Start+=WhichColumns[Iterator];
            Start+=",";
        }
            
        }
            Start+=" FROM ";
              if(TablesName!=null){
                 for(int Iterator=0;Iterator<TablesName.length;Iterator++){
        if(Iterator==TablesName.length-1){
            Start+=TablesName[Iterator];
        }else{
                        Start+=TablesName[Iterator];
            Start+=",";
        }
            
        }
           Start+=" WHERE ";
               if(ColumnsName!=null){
                for(int Iterator=0;Iterator<ColumnsName.length;Iterator++){
        if(Iterator==ColumnsName.length-1){
             Start+=ColumnsName[Iterator];
                     
        }else{
                        Start+=ColumnsName[Iterator];
                        if(LikeNotLike){
                            Start+=" LIKE ? ";
                        }
                        else {
                            Start+=" NOT LIKE ? ";
                            
                        }
                        if(AndOr){
                        Start+=" AND ";
                        }
                        else{
                        Start+=" OR ";                        
                        }
        }
        }
            }
            else{throw new Exception();}
            
        }else{
           throw new Exception();
        }
        
    }}
    Start+= ";" ;
    return Start; 
    
    
    
    
    
}


    
/*
 * EQUAL >> SELECT [all='*'/WhichColumns[]] FROM TablesName[] WHERE (((ColumnsName[] == Values[])) ^ and/or
 * for mass 
 */
private String QuerySelectWhereEqual(boolean all, String[] WhichColumns, String[] TablesName, String[] ColumnsName, String[] Values, boolean AndOr) throws Exception{
    
    String Start = "SELECT ";
    return "";
}
    
// // // // // _##___#___#_#####_#####_#####_#####_
// // // // // ______##__#_##____##____##_##___#___
// // // // // _##___#_#_#__####_####__####____#___
// // // // // _##___#__##____##_##____##_##___#___
// // // // // _##___#___#_#####_#####_##_##___#___

/*
 * INSERT INTO TableName (ColumnsName[]) VALUES (Values[]) 
 * need prepare``~!
 */
   
private String QueryInsert( String TableName, String[] ColumnsName) {
    
   String Start = "INSERT INTO ";
  
        Start+=TableName+ " VALUES (";
        if(ColumnsName!=null){
           
            for(int Iterator=0;Iterator<ColumnsName.length;Iterator++){
        if(Iterator==ColumnsName.length-1){
            Start+=ColumnsName[Iterator]+")";
        }else{
                        Start+=ColumnsName[Iterator];
            Start+=",";
        }
            
        }
            Start+=" VALUES (";
                 for(int Iterator=0;Iterator<ColumnsName.length;Iterator++){
        if(Iterator==ColumnsName.length-1){
            Start+=" ?)";
        }else{
                        Start+=" ? ";
            Start+=",";
        }
            
        }
            }
           
    Start+= ";" ;
    return Start;     
}

// // // // // // // // // ##_##_#####_####__#####_#####_#####_
// // // // // // // // // ##_##_##_##_##_##_##_##___#___##____
// // // // // // // // // ##_##_#####_##_##_#####___#___####__
// // // // // // // // // ##_##_##____##_##_##_##___#___##____
// // // // // // // // // #####_##____####__##_##___#___#####_
/*
 * UPDATE TableName SET ColumnsName[] = ValuesSet[] , column2 = value2, ...              WHERE condition {TablesNameId = ValuesGet[]} AND/OR condition* ;
 *          public boolean Update[TableName]+For+ColumnsName[]+Where+TablesNameId[](String[] TableName, String[][] ColumnsNameAndValues, String 
 *          / Update[TableName]+For+ColumnsName[]+
 */
   
private String QueryUpdate(String[] TablesName, String TableName, String[] ColumnsName, String[] ValuesSet, String[] TablesNameId, String[] ValuesGet, boolean AndOr) throws Exception{
    String Start= "UPDATE ";
      if(TablesName!=null){
                 for(int Iterator=0;Iterator<TablesName.length;Iterator++){
                           
        if(Iterator==TablesName.length-1){
            Start+=TablesName[Iterator]+"SET ";
        }else{
                        Start+=TablesName[Iterator];
                        
                        
                        //
         
        }
            
        
    }
                
            }else{
                throw new Exception();
            }
    
    
        Start+=TableName+ "SET ";
        
            if(ColumnsName!=null){
                 for(int Iterator=0;Iterator<ColumnsName.length;Iterator++){
                            for(int Iteratorl=0;Iteratorl<ColumnsName.length;Iteratorl++){
        if(Iterator==ColumnsName.length-1){
            Start+=ColumnsName[Iterator];
        }else{
                        Start+=ColumnsName[Iterator];
            Start+=",";
        }
            
        }
    }
                
            }else{
                throw new Exception();
            }
            
            Start+=" WHERE ";
         
    Start+= ";" ;
    return Start;     
}

// // // // // // // // // ????__?????_??____?????_?????_?????_
// // // // // // // // // ??_??_??____??____??______?___??____
// // // // // // // // // ??_??_????__??____????____?___????__
// // // // // // // // // ??_??_??____??____??______?___??____
// // // // // // // // // ????__?????_?????_?????___?___?????_
//
//  DELETE * FROM tablename WHERE _id = value ;
// need prepare ; 
// private String QueryDelete(String tablname, String[] columnsname, boolean keysi, boolean all, int Itertori_ , String[] cotable ){
 private String QueryDelete(String tablname, String[] ColumnsName, boolean keysi, boolean all, int Itertori_ , String[] cotable ){
    String Start = "DELETE ";

     if(all){
    Start += " FROM "+tablname;
  
    }else{
        Start+= " FROM "+tablname;
                 Start += " WHERE ";
                 if(keysi){
                     Start+= "_id = ?; ";
                    }
                    else{
                     
        for(int ki=Itertori_;ki<ColumnsName.length;ki++){
            if(ki==((ColumnsName.length)-1)){
            Start+= ColumnsName[ki] + " =  ? ;";                
            }
            else{
            Start+= ColumnsName[ki] + " =  ? AND ";
            }
        }   
                        
                    }
        
    }
     return Start;
    }

    
    private class DataByteHolder {
        
        private int a; 
        private         String b;
        private         boolean c ;
        private         int type ;
        public DataByteHolder(int a, int e){
            this.a= a;
 
          
            this.type=1;
        }
        public DataByteHolder(String b){
            this.b=b;

           
            this.type = 2;
        }      
        public DataByteHolder(boolean c, boolean e, boolean f){
            this.c=c;
            this.type=3;
        }
        /*
         * 1 - int, 2 - string , 3 - boolean 
         */
        public int GET_TYPE(){
        return this.type;
        }
        public void GET(){
           switch(type){
               case 1 : {geta(); break;}
                              case 2 : {getb(); break;}
                                             case 3 : {getc(); break;}
               default: { break;}
            }
               
        }
        public String getb(){
            return this.b;
        }
        public int geta(){
            return this.a;
        }
        public boolean getc(){
            return this.c;
        }
        
    }
    
    
    
    
}


