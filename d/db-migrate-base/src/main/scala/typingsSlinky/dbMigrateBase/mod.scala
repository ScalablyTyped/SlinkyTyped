package typingsSlinky.dbMigrateBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("db-migrate-base", JSImport.Namespace)
  @js.native
  class ^ protected () extends Base {
    def this(intern: InternalOptions) = this()
  }
  
  @js.native
  trait Base extends StObject {
    
    def addColumn(tableName: String, columnName: String, columnSpec: ColumnSpec, callback: CallbackFunction): Unit = js.native
    
    def addColumnAsync(tableName: String, columnName: String, columnSpec: ColumnSpec): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def addForeignKey(
      tableName: String,
      referencedTableName: String,
      keyName: String,
      fieldMapping: js.Any,
      rules: ForeignKeyRules,
      callback: CallbackFunction
    ): Unit = js.native
    
    def addForeignKeyAsync(
      tableName: String,
      referencedTableName: String,
      keyName: String,
      fieldMapping: js.Any,
      rules: ForeignKeyRules
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def addIndex(tableName: String, indexName: String, columns: String): Unit = js.native
    def addIndex(
      tableName: String,
      indexName: String,
      columns: String,
      uniqueOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def addIndex(tableName: String, indexName: String, columns: String, uniqueOrCb: Boolean): Unit = js.native
    def addIndex(
      tableName: String,
      indexName: String,
      columns: String,
      uniqueOrCb: Boolean,
      callback: CallbackFunction
    ): Unit = js.native
    def addIndex(tableName: String, indexName: String, columns: String, uniqueOrCb: CallbackFunction): Unit = js.native
    def addIndex(
      tableName: String,
      indexName: String,
      columns: String,
      uniqueOrCb: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    def addIndex(tableName: String, indexName: String, columns: js.Array[String]): Unit = js.native
    def addIndex(
      tableName: String,
      indexName: String,
      columns: js.Array[String],
      uniqueOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def addIndex(tableName: String, indexName: String, columns: js.Array[String], uniqueOrCb: Boolean): Unit = js.native
    def addIndex(
      tableName: String,
      indexName: String,
      columns: js.Array[String],
      uniqueOrCb: Boolean,
      callback: CallbackFunction
    ): Unit = js.native
    def addIndex(tableName: String, indexName: String, columns: js.Array[String], uniqueOrCb: CallbackFunction): Unit = js.native
    def addIndex(
      tableName: String,
      indexName: String,
      columns: js.Array[String],
      uniqueOrCb: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    
    def addIndexAsync(tableName: String, indexName: String, columns: String): typingsSlinky.bluebird.mod.^[_] = js.native
    def addIndexAsync(tableName: String, indexName: String, columns: String, unique: Boolean): typingsSlinky.bluebird.mod.^[_] = js.native
    def addIndexAsync(tableName: String, indexName: String, columns: js.Array[String]): typingsSlinky.bluebird.mod.^[_] = js.native
    def addIndexAsync(tableName: String, indexName: String, columns: js.Array[String], unique: Boolean): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def addMigrationRecord(name: String, callback: CallbackFunction): Unit = js.native
    
    def addMigrationRecordAsync(name: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def addSeedRecord(name: String, callback: CallbackFunction): Unit = js.native
    
    def addSeedRecordAsync(name: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def all(sql: String): Unit = js.native
    def all(sql: String, paramsOrCb: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
    def all(sql: String, paramsOrCb: js.Array[_]): Unit = js.native
    def all(sql: String, paramsOrCb: js.Array[_], callback: CallbackFunction): Unit = js.native
    def all(sql: String, paramsOrCb: CallbackFunction): Unit = js.native
    def all(sql: String, paramsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    
    def allAsync(sql: String): typingsSlinky.bluebird.mod.^[_] = js.native
    def allAsync(sql: String, params: js.Array[_]): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def allLoadedMigrations(callback: CallbackFunction): Unit = js.native
    
    def allLoadedMigrationsAsync(): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def allLoadedSeeds(callback: CallbackFunction): Unit = js.native
    
    def allLoadedSeedsAsync(): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def bindForeignKey(tableName: String, columnName: String, fkOptions: ForeignKeySpec): js.Function1[/* callback */ CallbackFunction, Unit] = js.native
    
    // TODO Make ids match the type of ids in buildWhereClause(ids);
    def buildWhereClause(ids: js.Any): String = js.native
    
    def changeColumn(tableName: String, columnName: String, columnSpec: ColumnSpec, callback: CallbackFunction): Unit = js.native
    
    def changeColumnAsync(tableName: String, columnName: String, columnSpec: ColumnSpec): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def checkDBMS(dbms: js.Any, callback: CallbackFunction): Unit = js.native
    
    def checkDBMSAsync(dbms: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def close(): Unit = js.native
    def close(callback: CallbackFunction): Unit = js.native
    
    // Promisified methods
    def closeAsync(): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def createColumnDef(name: String, spec: ColumnSpec): ColumnDef = js.native
    def createColumnDef(name: String, spec: ColumnSpec, options: js.Any): ColumnDef = js.native
    
    def createDatabase(options: js.Any*): Unit = js.native
    
    def createDatabaseAsync(options: js.Any*): typingsSlinky.bluebird.mod.^[_] = js.native
    
    // TODO Figure out a type for `options`!
    //createColumnConstraint(spec: Base.ColumnSpec, options?: any, ...implementationDefinedOptions: any[]): string;
    def createMigrationsTable(callback: CallbackFunction): Unit = js.native
    
    def createMigrationsTableAsync(): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def createSeedsTable(callback: CallbackFunction): Unit = js.native
    
    def createSeedsTableAsync(): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def createTable(tableName: String, options: js.Any, callback: CallbackFunction): Unit = js.native
    def createTable(tableName: String, options: CreateTableOptions, callback: CallbackFunction): Unit = js.native
    
    def createTableAsync(tableName: String, options: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    def createTableAsync(tableName: String, options: CreateTableOptions): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def deleteMigration(migrationName: String, callback: CallbackFunction): Unit = js.native
    
    def deleteMigrationAsync(migrationName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def deleteSeed(seedName: String, callback: CallbackFunction): Unit = js.native
    
    def deleteSeedAsync(seedName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def dropDatabase(options: js.Any*): Unit = js.native
    
    def dropDatabaseAsync(options: js.Any*): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def dropTable(tableName: String): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: DropTableOptions): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: DropTableOptions, callback: CallbackFunction): Unit = js.native
    
    def dropTableAsync(tableName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    def dropTableAsync(tableName: String, options: DropTableOptions): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def endMigration(callback: CallbackFunction): Unit = js.native
    
    def endMigrationAsync(callback: CallbackFunction): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def escape(str: String): String = js.native
    
    def escapeDDL(str: String): String = js.native
    
    def escapeString(str: String): String = js.native
    
    def insert(tableName: String, columnNameOrValueArray: js.Any): Unit = js.native
    def insert(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def insert(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrCb: js.Any): Unit = js.native
    def insert(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrCb: js.Any,
      callback: CallbackFunction
    ): Unit = js.native
    def insert(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrCb: CallbackFunction): Unit = js.native
    def insert(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrCb: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    
    def insertAsync(tableName: String, columnNameOrValueArray: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    def insertAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def insertAsync(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrCb: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    def insertAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrCb: js.Any,
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def insertAsync(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrCb: CallbackFunction): typingsSlinky.bluebird.mod.^[_] = js.native
    def insertAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrCb: CallbackFunction,
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def lookup(tableName: String, column: String): Unit = js.native
    def lookup(tableName: String, column: String, id: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
    def lookup(tableName: String, column: String, id: js.Any): Unit = js.native
    def lookup(tableName: String, column: String, id: js.Any, callback: CallbackFunction): Unit = js.native
    
    def lookupAsync(tableName: String, column: String): typingsSlinky.bluebird.mod.^[_] = js.native
    def lookupAsync(tableName: String, column: String, id: js.UndefOr[scala.Nothing], callback: CallbackFunction): typingsSlinky.bluebird.mod.^[_] = js.native
    def lookupAsync(tableName: String, column: String, id: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    def lookupAsync(tableName: String, column: String, id: js.Any, callback: CallbackFunction): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def mapDataType(str: String): String = js.native
    
    def normalizeColumnSpec(spec: String): ColumnSpec = js.native
    def normalizeColumnSpec(spec: ColumnSpec): ColumnSpec = js.native
    
    def quoteArr(arr: js.Array[String]): js.Array[String] = js.native
    
    def quoteDDLArr(arr: js.Array[String]): js.Array[String] = js.native
    
    def recurseCallbackArray(foreignKeys: js.Array[String], callback: CallbackFunction): Unit = js.native
    
    def recurseCallbackArrayAsync(foreignKeys: js.Array[String]): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def remove(table: String, ids: js.Any, callback: CallbackFunction): Unit = js.native
    
    def removeAsync(table: String, ids: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def removeColumn(tableName: String, columnName: String, callback: CallbackFunction): Unit = js.native
    
    def removeColumnAsync(tableName: String, columnName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def removeForeignKey(tableName: String, keyName: String): Unit = js.native
    def removeForeignKey(
      tableName: String,
      keyName: String,
      optionsOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def removeForeignKey(tableName: String, keyName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def removeForeignKey(tableName: String, keyName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def removeForeignKey(tableName: String, keyName: String, optionsOrCb: RemoveForeignKeyOptions): Unit = js.native
    def removeForeignKey(
      tableName: String,
      keyName: String,
      optionsOrCb: RemoveForeignKeyOptions,
      callback: CallbackFunction
    ): Unit = js.native
    
    def removeForeignKeyAsync(tableName: String, keyName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    def removeForeignKeyAsync(tableName: String, keyName: String, options: RemoveForeignKeyOptions): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def removeIndex(tableNameOrIndexName: String): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: String): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: String, callback: CallbackFunction): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: CallbackFunction): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    
    def removeIndexAsync(tableNameOrIndexName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    def removeIndexAsync(tableNameOrIndexName: String, indexName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def renameColumn(tableName: String, oldColumnName: String, newColumnName: String, callback: CallbackFunction): Unit = js.native
    
    def renameColumnAsync(tableName: String, oldColumnName: String, newColumnName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def renameTable(tableName: String, newTableName: String, callback: CallbackFunction): Unit = js.native
    
    def renameTableAsync(tableName: String, newTableName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def runSql(): Unit = js.native
    def runSql(sql: js.UndefOr[scala.Nothing], paramsOrCb: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
    def runSql(sql: js.UndefOr[scala.Nothing], paramsOrCb: js.Array[_]): Unit = js.native
    def runSql(sql: js.UndefOr[scala.Nothing], paramsOrCb: js.Array[_], callback: CallbackFunction): Unit = js.native
    def runSql(sql: js.UndefOr[scala.Nothing], paramsOrCb: CallbackFunction): Unit = js.native
    def runSql(sql: js.UndefOr[scala.Nothing], paramsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def runSql(sql: String): Unit = js.native
    def runSql(sql: String, paramsOrCb: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
    def runSql(sql: String, paramsOrCb: js.Array[_]): Unit = js.native
    def runSql(sql: String, paramsOrCb: js.Array[_], callback: CallbackFunction): Unit = js.native
    def runSql(sql: String, paramsOrCb: CallbackFunction): Unit = js.native
    def runSql(sql: String, paramsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    
    def runSqlAsync(): typingsSlinky.bluebird.mod.^[_] = js.native
    def runSqlAsync(sql: js.UndefOr[scala.Nothing], params: js.Array[_]): typingsSlinky.bluebird.mod.^[_] = js.native
    def runSqlAsync(sql: String): typingsSlinky.bluebird.mod.^[_] = js.native
    def runSqlAsync(sql: String, params: js.Array[_]): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def startMigration(callback: CallbackFunction): Unit = js.native
    
    def startMigrationAsync(): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def switchDatabase(options: js.Any*): Unit = js.native
    
    def switchDatabaseAsync(options: js.Any*): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def truncate(tableName: String, callback: CallbackFunction): Unit = js.native
    
    def truncateAsync(tableName: String): typingsSlinky.bluebird.mod.^[_] = js.native
    
    def update(tableName: String, columnNameOrValueArray: js.Any): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: js.Any
    ): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: js.Any,
      callback: CallbackFunction
    ): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: CallbackFunction
    ): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    def update(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.Any,
      idsOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): Unit = js.native
    def update(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any, idsOrCb: js.Any): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.Any,
      idsOrCb: js.Any,
      callback: CallbackFunction
    ): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.Any,
      idsOrCb: CallbackFunction
    ): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.Any,
      idsOrCb: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    
    def updateAsync(tableName: String, columnNameOrValueArray: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: js.Any
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: js.Any,
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.UndefOr[scala.Nothing],
      idsOrCb: CallbackFunction,
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.Any,
      idsOrCb: js.UndefOr[scala.Nothing],
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any, idsOrCb: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.Any,
      idsOrCb: js.Any,
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.Any,
      idsOrCb: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: js.Any,
      valueArrayOrIds: js.Any,
      idsOrCb: CallbackFunction,
      callback: CallbackFunction
    ): typingsSlinky.bluebird.mod.^[_] = js.native
  }
  
  type CallbackFunction = js.Function2[/* err */ js.Any, /* response */ js.Any, Unit]
  
  @js.native
  trait ColumnDef extends StObject {
    
    // TODO Figure this out!
    var constraints: String = js.native
    
    var foreignKey: js.UndefOr[js.Any] = js.native
  }
  object ColumnDef {
    
    @scala.inline
    def apply(constraints: String): ColumnDef = {
      val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnDef]
    }
    
    @scala.inline
    implicit class ColumnDefMutableBuilder[Self <: ColumnDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraints(value: String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeignKey(value: js.Any): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    }
  }
  
  @js.native
  trait ColumnSpec extends StObject {
    
    var autoIncrement: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var foreignKey: js.UndefOr[ForeignKeySpec] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var notNull: js.UndefOr[Boolean] = js.native
    
    var primaryKey: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
    
    var unique: js.UndefOr[Boolean] = js.native
    
    var unsigned: js.UndefOr[Boolean] = js.native
  }
  object ColumnSpec {
    
    @scala.inline
    def apply(`type`: String): ColumnSpec = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnSpec]
    }
    
    @scala.inline
    implicit class ColumnSpecMutableBuilder[Self <: ColumnSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setForeignKey(value: ForeignKeySpec): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
      
      @scala.inline
      def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      @scala.inline
      def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
    }
  }
  
  @js.native
  trait CreateTableOptions extends StObject {
    
    var columns: js.UndefOr[js.Array[ColumnSpec]] = js.native
    
    var ifNotExists: js.UndefOr[Boolean] = js.native
  }
  object CreateTableOptions {
    
    @scala.inline
    def apply(): CreateTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTableOptions]
    }
    
    @scala.inline
    implicit class CreateTableOptionsMutableBuilder[Self <: CreateTableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[ColumnSpec]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnSpec*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setIfNotExists(value: Boolean): Self = StObject.set(x, "ifNotExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfNotExistsUndefined: Self = StObject.set(x, "ifNotExists", js.undefined)
    }
  }
  
  @js.native
  trait DropTableOptions extends StObject {
    
    var ifExists: js.UndefOr[Boolean] = js.native
  }
  object DropTableOptions {
    
    @scala.inline
    def apply(): DropTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropTableOptions]
    }
    
    @scala.inline
    implicit class DropTableOptionsMutableBuilder[Self <: DropTableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    }
  }
  
  @js.native
  trait ForeignKeyRules extends StObject {
    
    var onDelete: String = js.native
    
    var onUpdate: String = js.native
  }
  object ForeignKeyRules {
    
    @scala.inline
    def apply(onDelete: String, onUpdate: String): ForeignKeyRules = {
      val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForeignKeyRules]
    }
    
    @scala.inline
    implicit class ForeignKeyRulesMutableBuilder[Self <: ForeignKeyRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDelete(value: String): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ForeignKeySpec extends StObject {
    
    var mapping: String | js.Any = js.native
    
    var name: String = js.native
    
    var rules: js.UndefOr[ForeignKeyRules] = js.native
    
    var table: String = js.native
  }
  object ForeignKeySpec {
    
    @scala.inline
    def apply(mapping: String | js.Any, name: String, table: String): ForeignKeySpec = {
      val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForeignKeySpec]
    }
    
    @scala.inline
    implicit class ForeignKeySpecMutableBuilder[Self <: ForeignKeySpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMapping(value: String | js.Any): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: ForeignKeyRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InternalModule extends StObject {
    
    var log: js.Any = js.native
    
    var `type`: js.Any = js.native
  }
  object InternalModule {
    
    @scala.inline
    def apply(log: js.Any, `type`: js.Any): InternalModule = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalModule]
    }
    
    @scala.inline
    implicit class InternalModuleMutableBuilder[Self <: InternalModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InternalOptions extends StObject {
    
    var mod: InternalModule = js.native
  }
  object InternalOptions {
    
    @scala.inline
    def apply(mod: InternalModule): InternalOptions = {
      val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalOptions]
    }
    
    @scala.inline
    implicit class InternalOptionsMutableBuilder[Self <: InternalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMod(value: InternalModule): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveForeignKeyOptions extends StObject {
    
    var dropIndex: js.UndefOr[Boolean] = js.native
  }
  object RemoveForeignKeyOptions {
    
    @scala.inline
    def apply(): RemoveForeignKeyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveForeignKeyOptions]
    }
    
    @scala.inline
    implicit class RemoveForeignKeyOptionsMutableBuilder[Self <: RemoveForeignKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropIndex(value: Boolean): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropIndexUndefined: Self = StObject.set(x, "dropIndex", js.undefined)
    }
  }
}
