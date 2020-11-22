package typingsSlinky.dbMigratePg.mod

import typingsSlinky.dbMigrateBase.mod.CallbackFunction
import typingsSlinky.dbMigrateBase.mod.ColumnSpec
import typingsSlinky.dbMigrateBase.mod.InternalOptions
import typingsSlinky.dbMigrateBase.mod.^
import typingsSlinky.pg.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("db-migrate-pg", "PgDriver")
@js.native
class PgDriver protected () extends ^ {
  def this(connection: Client, schema: String, intern: InternalOptions) = this()
  
  def createColumnConstraint(spec: ColumnSpec, options: ColumnConstraintOptions, tableName: String, columnName: String): ColumnConstraint = js.native
  
  def createDatabase(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def createDatabase(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def createDatabase(dbName: String, optionsOrCb: CreateDatabaseOptions): Unit = js.native
  def createDatabase(dbName: String, optionsOrCb: CreateDatabaseOptions, callback: CallbackFunction): Unit = js.native
  
  def createDatabaseAsync(dbName: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def createDatabaseAsync(dbName: String, options: CreateDatabaseOptions): typingsSlinky.bluebird.mod.^[_] = js.native
  
  def createSequence(sqName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def createSequence(sqName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def createSequence(sqName: String, optionsOrCb: CreateSequenceOptions): Unit = js.native
  def createSequence(sqName: String, optionsOrCb: CreateSequenceOptions, callback: CallbackFunction): Unit = js.native
  
  def createSequenceAsync(sqName: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def createSequenceAsync(sqName: String, options: CreateSequenceOptions): typingsSlinky.bluebird.mod.^[_] = js.native
  
  def dropDatabase(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def dropDatabase(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def dropDatabase(dbName: String, optionsOrCb: DropDatabaseOptions): Unit = js.native
  def dropDatabase(dbName: String, optionsOrCb: DropDatabaseOptions, callback: CallbackFunction): Unit = js.native
  
  def dropDatabaseAsync(dbName: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def dropDatabaseAsync(dbName: String, options: DropDatabaseOptions): typingsSlinky.bluebird.mod.^[_] = js.native
  
  def dropSequence(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def dropSequence(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def dropSequence(dbName: String, optionsOrCb: DropSequenceOptions): Unit = js.native
  def dropSequence(dbName: String, optionsOrCb: DropSequenceOptions, callback: CallbackFunction): Unit = js.native
  
  def dropSequenceAsync(dbName: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def dropSequenceAsync(dbName: String, options: DropSequenceOptions): typingsSlinky.bluebird.mod.^[_] = js.native
  
  def switchDatabase(options: String, callback: CallbackFunction): Unit = js.native
  def switchDatabase(options: SwitchDatabaseOptions, callback: CallbackFunction): Unit = js.native
  
  def switchDatabaseAsync(options: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def switchDatabaseAsync(options: SwitchDatabaseOptions): typingsSlinky.bluebird.mod.^[_] = js.native
}
