package typingsSlinky.anydbSql.mod

import typingsSlinky.anydbSql.anon.RTRIM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnydbSql extends DatabaseConnection {
  
  def allOf(tables: Table[_]*): js.Any = js.native
  
  def begin(): Transaction = js.native
  
  def close(): Unit = js.native
  
  def define[T](map: TableDefinition): Table[T] = js.native
  
  def dialect(): String = js.native
  
  var functions: RTRIM = js.native
  
  def getPool(): AnyDBPool = js.native
  
  def makeFunction(name: String): js.Function = js.native
  
  var models: Dictionary[Table[_]] = js.native
  
  def open(): Unit = js.native
  
  def transaction[T](fn: js.Function1[/* tx */ Transaction, typingsSlinky.bluebird.mod.^[T]]): typingsSlinky.bluebird.mod.^[T] = js.native
}
