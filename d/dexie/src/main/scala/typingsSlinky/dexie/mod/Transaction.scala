package typingsSlinky.dexie.mod

import typingsSlinky.dexie.dexieStrings.abort
import typingsSlinky.dexie.dexieStrings.complete
import typingsSlinky.dexie.dexieStrings.error
import typingsSlinky.std.IDBTransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  def abort(): Unit = js.native
  
  var active: Boolean = js.native
  
  var db: Database = js.native
  
  var mode: IDBTransactionMode = js.native
  
  def on(eventName: String): DexieEvent = js.native
  @JSName("on")
  var on_Original: TransactionEvents = js.native
  @JSName("on")
  def on_abort(eventName: abort, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_complete(eventName: complete, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, subscriber: js.Function1[/* error */ js.Any, _]): Unit = js.native
  
  var parent: js.UndefOr[Transaction] = js.native
  
  //tables: { [type: string]: Table<any, any> }; Deprecated since 2.0. Obsolete from v3.0.
  var storeNames: js.Array[String] = js.native
  
  def table(tableName: String): Table[_, _] = js.native
  @JSName("table")
  def table_T[T](tableName: String): Table[T, _] = js.native
  @JSName("table")
  def table_TKey[T, Key](tableName: String): Table[T, Key] = js.native
}
