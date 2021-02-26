package typingsSlinky.expoSqlite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteTypesMod {
  
  @JSImport("expo-sqlite/build/SQLite.types", "SQLError")
  @js.native
  class SQLError () extends StObject {
    
    var code: Double = js.native
    
    var message: String = js.native
  }
  /* static members */
  object SQLError {
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.CONSTRAINT_ERR")
    @js.native
    def CONSTRAINT_ERR: Double = js.native
    @scala.inline
    def CONSTRAINT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSTRAINT_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.DATABASE_ERR")
    @js.native
    def DATABASE_ERR: Double = js.native
    @scala.inline
    def DATABASE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATABASE_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.QUOTA_ERR")
    @js.native
    def QUOTA_ERR: Double = js.native
    @scala.inline
    def QUOTA_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.SYNTAX_ERR")
    @js.native
    def SYNTAX_ERR: Double = js.native
    @scala.inline
    def SYNTAX_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.TIMEOUT_ERR")
    @js.native
    def TIMEOUT_ERR: Double = js.native
    @scala.inline
    def TIMEOUT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.TOO_LARGE_ERR")
    @js.native
    def TOO_LARGE_ERR: Double = js.native
    @scala.inline
    def TOO_LARGE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_LARGE_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.UNKNOWN_ERR")
    @js.native
    def UNKNOWN_ERR: Double = js.native
    @scala.inline
    def UNKNOWN_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite/build/SQLite.types", "SQLError.VERSION_ERR")
    @js.native
    def VERSION_ERR: Double = js.native
    @scala.inline
    def VERSION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION_ERR")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Database extends StObject {
    
    def readTransaction(callback: SQLTransactionCallback): Unit = js.native
    def readTransaction(
      callback: SQLTransactionCallback,
      errorCallback: js.UndefOr[scala.Nothing],
      successCallback: SQLVoidCallback
    ): Unit = js.native
    def readTransaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
    def readTransaction(
      callback: SQLTransactionCallback,
      errorCallback: SQLTransactionErrorCallback,
      successCallback: SQLVoidCallback
    ): Unit = js.native
    
    def transaction(callback: SQLTransactionCallback): Unit = js.native
    def transaction(
      callback: SQLTransactionCallback,
      errorCallback: js.UndefOr[scala.Nothing],
      successCallback: SQLVoidCallback
    ): Unit = js.native
    def transaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
    def transaction(
      callback: SQLTransactionCallback,
      errorCallback: SQLTransactionErrorCallback,
      successCallback: SQLVoidCallback
    ): Unit = js.native
    
    var version: String = js.native
  }
  
  type DatabaseCallback = js.Function1[/* database */ Database, Unit]
  
  @js.native
  trait Query extends StObject {
    
    var args: js.Array[_] = js.native
    
    var sql: String = js.native
  }
  object Query {
    
    @scala.inline
    def apply(args: js.Array[_], sql: String): Query = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResultSet extends StObject {
    
    var insertId: js.UndefOr[Double] = js.native
    
    var rows: js.Array[StringDictionary[_]] = js.native
    
    var rowsAffected: Double = js.native
  }
  object ResultSet {
    
    @scala.inline
    def apply(rows: js.Array[StringDictionary[_]], rowsAffected: Double): ResultSet = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSet]
    }
    
    @scala.inline
    implicit class ResultSetMutableBuilder[Self <: ResultSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
      
      @scala.inline
      def setRows(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ResultSetError extends StObject {
    
    var error: js.Error = js.native
  }
  object ResultSetError {
    
    @scala.inline
    def apply(error: js.Error): ResultSetError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSetError]
    }
    
    @scala.inline
    implicit class ResultSetErrorMutableBuilder[Self <: ResultSetError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SQLResultSet extends StObject {
    
    var insertId: Double = js.native
    
    var rows: SQLResultSetRowList = js.native
    
    var rowsAffected: Double = js.native
  }
  object SQLResultSet {
    
    @scala.inline
    def apply(insertId: Double, rows: SQLResultSetRowList, rowsAffected: Double): SQLResultSet = {
      val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQLResultSet]
    }
    
    @scala.inline
    implicit class SQLResultSetMutableBuilder[Self <: SQLResultSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: SQLResultSetRowList): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SQLResultSetRowList extends StObject {
    
    def item(index: Double): js.Any = js.native
    
    var length: Double = js.native
  }
  object SQLResultSetRowList {
    
    @scala.inline
    def apply(item: Double => js.Any, length: Double): SQLResultSetRowList = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQLResultSetRowList]
    }
    
    @scala.inline
    implicit class SQLResultSetRowListMutableBuilder[Self <: SQLResultSetRowList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: Double => js.Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  type SQLStatementCallback = js.Function2[/* transaction */ SQLTransaction, /* resultSet */ SQLResultSet, Unit]
  
  type SQLStatementErrorCallback = js.Function2[/* transaction */ SQLTransaction, /* error */ SQLError, Boolean]
  
  @js.native
  trait SQLTransaction extends StObject {
    
    def executeSql(sqlStatement: String): Unit = js.native
    def executeSql(
      sqlStatement: String,
      args: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      errorCallback: SQLStatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, args: js.UndefOr[scala.Nothing], callback: SQLStatementCallback): Unit = js.native
    def executeSql(
      sqlStatement: String,
      args: js.UndefOr[scala.Nothing],
      callback: SQLStatementCallback,
      errorCallback: SQLStatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, args: js.Array[_]): Unit = js.native
    def executeSql(
      sqlStatement: String,
      args: js.Array[_],
      callback: js.UndefOr[scala.Nothing],
      errorCallback: SQLStatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, args: js.Array[_], callback: SQLStatementCallback): Unit = js.native
    def executeSql(
      sqlStatement: String,
      args: js.Array[_],
      callback: SQLStatementCallback,
      errorCallback: SQLStatementErrorCallback
    ): Unit = js.native
  }
  
  type SQLTransactionCallback = js.Function1[/* transaction */ SQLTransaction, Unit]
  
  type SQLTransactionErrorCallback = js.Function1[/* error */ SQLError, Unit]
  
  type SQLVoidCallback = js.Function0[Unit]
  
  type SQLiteCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | Null], 
    /* resultSet */ js.UndefOr[js.Array[ResultSetError | ResultSet]], 
    Unit
  ]
  
  @js.native
  trait WebSQLDatabase extends Database {
    
    def exec(queries: js.Array[Query], readOnly: Boolean, callback: SQLiteCallback): Unit = js.native
  }
  
  @js.native
  trait Window extends StObject {
    
    var openDatabase: js.UndefOr[
        js.Function5[
          /* name */ String, 
          /* version */ String, 
          /* displayName */ String, 
          /* estimatedSize */ Double, 
          /* creationCallback */ js.UndefOr[DatabaseCallback], 
          Database
        ]
      ] = js.native
  }
  object Window {
    
    @scala.inline
    def apply(): Window = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenDatabase(
        value: (/* name */ String, /* version */ String, /* displayName */ String, /* estimatedSize */ Double, /* creationCallback */ js.UndefOr[DatabaseCallback]) => Database
      ): Self = StObject.set(x, "openDatabase", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOpenDatabaseUndefined: Self = StObject.set(x, "openDatabase", js.undefined)
    }
  }
}
