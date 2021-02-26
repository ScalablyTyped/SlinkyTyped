package typingsSlinky.cordovaSqliteStorage

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cordovaSqliteStorage.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SQLitePlugin {
  
  @js.native
  trait Database extends StObject {
    
    def close(): Unit = js.native
    def close(success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
    def close(success: SuccessCallback): Unit = js.native
    def close(success: SuccessCallback, error: ErrorCallback): Unit = js.native
    
    def executeSql(statement: String): Unit = js.native
    def executeSql(
      statement: String,
      params: js.UndefOr[scala.Nothing],
      success: js.UndefOr[scala.Nothing],
      error: ErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: js.UndefOr[scala.Nothing], success: StatementSuccessCallback): Unit = js.native
    def executeSql(
      statement: String,
      params: js.UndefOr[scala.Nothing],
      success: StatementSuccessCallback,
      error: ErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: js.Array[_]): Unit = js.native
    def executeSql(statement: String, params: js.Array[_], success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
    def executeSql(statement: String, params: js.Array[_], success: StatementSuccessCallback): Unit = js.native
    def executeSql(statement: String, params: js.Array[_], success: StatementSuccessCallback, error: ErrorCallback): Unit = js.native
    
    def readTransaction(fn: TransactionFunction): Unit = js.native
    def readTransaction(fn: TransactionFunction, error: js.UndefOr[scala.Nothing], success: SuccessCallback): Unit = js.native
    def readTransaction(fn: TransactionFunction, error: ErrorCallback): Unit = js.native
    def readTransaction(fn: TransactionFunction, error: ErrorCallback, success: SuccessCallback): Unit = js.native
    
    def sqlBatch(sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[_]])]): Unit = js.native
    def sqlBatch(
      sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[_]])],
      success: js.UndefOr[scala.Nothing],
      error: ErrorCallback
    ): Unit = js.native
    def sqlBatch(sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[_]])], success: SuccessCallback): Unit = js.native
    def sqlBatch(
      sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[_]])],
      success: SuccessCallback,
      error: ErrorCallback
    ): Unit = js.native
    
    def transaction(fn: TransactionFunction): Unit = js.native
    def transaction(fn: TransactionFunction, error: js.UndefOr[scala.Nothing], success: SuccessCallback): Unit = js.native
    def transaction(fn: TransactionFunction, error: ErrorCallback): Unit = js.native
    def transaction(fn: TransactionFunction, error: ErrorCallback, success: SuccessCallback): Unit = js.native
  }
  
  type DatabaseSuccessCallback = js.Function1[/* db */ Database, Unit]
  
  @js.native
  trait DeleteArgs extends StObject {
    
    var iosDatabaseLocation: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
  object DeleteArgs {
    
    @scala.inline
    def apply(name: String): DeleteArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteArgs]
    }
    
    @scala.inline
    implicit class DeleteArgsMutableBuilder[Self <: DeleteArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIosDatabaseLocation(value: String): Self = StObject.set(x, "iosDatabaseLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosDatabaseLocationUndefined: Self = StObject.set(x, "iosDatabaseLocation", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  
  @js.native
  trait OpenArgs
    extends /* key */ StringDictionary[js.Any] {
    
    var androidDatabaseImplementation: js.UndefOr[Double] = js.native
    
    var androidLockWorkaround: js.UndefOr[Double] = js.native
    
    var createFromLocation: js.UndefOr[Double] = js.native
    
    var iosDatabaseLocation: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
  object OpenArgs {
    
    @scala.inline
    def apply(name: String): OpenArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenArgs]
    }
    
    @scala.inline
    implicit class OpenArgsMutableBuilder[Self <: OpenArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroidDatabaseImplementation(value: Double): Self = StObject.set(x, "androidDatabaseImplementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidDatabaseImplementationUndefined: Self = StObject.set(x, "androidDatabaseImplementation", js.undefined)
      
      @scala.inline
      def setAndroidLockWorkaround(value: Double): Self = StObject.set(x, "androidLockWorkaround", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidLockWorkaroundUndefined: Self = StObject.set(x, "androidLockWorkaround", js.undefined)
      
      @scala.inline
      def setCreateFromLocation(value: Double): Self = StObject.set(x, "createFromLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromLocationUndefined: Self = StObject.set(x, "createFromLocation", js.undefined)
      
      @scala.inline
      def setIosDatabaseLocation(value: String): Self = StObject.set(x, "iosDatabaseLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosDatabaseLocationUndefined: Self = StObject.set(x, "iosDatabaseLocation", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Results extends StObject {
    
    var insertId: js.UndefOr[Double] = js.native
    
    var rows: Item = js.native
    
    var rowsAffected: Double = js.native
  }
  object Results {
    
    @scala.inline
    def apply(rows: Item, rowsAffected: Double): Results = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
      
      @scala.inline
      def setRows(value: Item): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SQLite extends StObject {
    
    def deleteDatabase(args: DeleteArgs): Unit = js.native
    def deleteDatabase(args: DeleteArgs, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
    def deleteDatabase(args: DeleteArgs, success: SuccessCallback): Unit = js.native
    def deleteDatabase(args: DeleteArgs, success: SuccessCallback, error: ErrorCallback): Unit = js.native
    
    def echoTest(): Unit = js.native
    def echoTest(ok: js.UndefOr[scala.Nothing], error: js.Function1[/* msg */ String, Unit]): Unit = js.native
    def echoTest(ok: js.Function1[/* value */ String, Unit]): Unit = js.native
    def echoTest(ok: js.Function1[/* value */ String, Unit], error: js.Function1[/* msg */ String, Unit]): Unit = js.native
    
    def openDatabase(args: OpenArgs): Database = js.native
    def openDatabase(args: OpenArgs, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Database = js.native
    def openDatabase(args: OpenArgs, success: DatabaseSuccessCallback): Database = js.native
    def openDatabase(args: OpenArgs, success: DatabaseSuccessCallback, error: ErrorCallback): Database = js.native
    
    def selfTest(): Unit = js.native
    def selfTest(success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
    def selfTest(success: SuccessCallback): Unit = js.native
    def selfTest(success: SuccessCallback, error: ErrorCallback): Unit = js.native
  }
  
  type StatementSuccessCallback = js.Function1[/* results */ Results, Unit]
  
  type SuccessCallback = js.Function0[Unit]
  
  @js.native
  trait Transaction extends StObject {
    
    def executeSql(statement: String): Unit = js.native
    def executeSql(
      statement: String,
      params: js.UndefOr[scala.Nothing],
      success: js.UndefOr[scala.Nothing],
      error: TransactionStatementErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: js.UndefOr[scala.Nothing], success: TransactionStatementSuccessCallback): Unit = js.native
    def executeSql(
      statement: String,
      params: js.UndefOr[scala.Nothing],
      success: TransactionStatementSuccessCallback,
      error: TransactionStatementErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: js.Array[_]): Unit = js.native
    def executeSql(
      statement: String,
      params: js.Array[_],
      success: js.UndefOr[scala.Nothing],
      error: TransactionStatementErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: js.Array[_], success: TransactionStatementSuccessCallback): Unit = js.native
    def executeSql(
      statement: String,
      params: js.Array[_],
      success: TransactionStatementSuccessCallback,
      error: TransactionStatementErrorCallback
    ): Unit = js.native
  }
  
  type TransactionFunction = js.Function1[/* tx */ Transaction, Unit]
  
  type TransactionStatementErrorCallback = js.Function2[/* tx */ Transaction, /* err */ js.Error, Boolean | Unit]
  
  type TransactionStatementSuccessCallback = js.Function2[/* tx */ Transaction, /* results */ Results, Unit]
}
