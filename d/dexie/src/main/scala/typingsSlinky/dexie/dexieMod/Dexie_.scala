package typingsSlinky.dexie.dexieMod

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.IDBDatabase
import org.scalajs.dom.raw.IDBVersionChangeEvent
import typingsSlinky.dexie.Anon_Addons
import typingsSlinky.dexie.dexieMod.Dexie.Collection
import typingsSlinky.dexie.dexieMod.Dexie.DbEvents
import typingsSlinky.dexie.dexieMod.Dexie.DexieEvent
import typingsSlinky.dexie.dexieMod.Dexie.Promise
import typingsSlinky.dexie.dexieMod.Dexie.Table
import typingsSlinky.dexie.dexieMod.Dexie.Transaction
import typingsSlinky.dexie.dexieMod.Dexie.Version
import typingsSlinky.dexie.dexieMod.Dexie.WhereClause
import typingsSlinky.dexie.dexieStrings.blocked
import typingsSlinky.dexie.dexieStrings.populate
import typingsSlinky.dexie.dexieStrings.ready
import typingsSlinky.dexie.dexieStrings.versionchange
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie")
@js.native
class Dexie_ protected () extends js.Object {
  def this(databaseName: String) = this()
  def this(databaseName: String, options: Anon_Addons) = this()
  var Collection: Instantiable0[Collection[js.Any, js.Any]] = js.native
  // Make it possible to touch physical class constructors where they reside - as properties on db instance.
  // For example, checking if (x instanceof db.Table). Can't do (x instanceof Dexie.Table because it's just a virtual interface)
  var Table: Instantiable0[Table[js.Any, js.Any]] = js.native
  var Transaction: Instantiable0[Transaction] = js.native
  var Version: Instantiable0[Version] = js.native
  var WhereClause: Instantiable0[WhereClause[js.Any, js.Any]] = js.native
  val name: String = js.native
  @JSName("on")
  var on_Original: DbEvents = js.native
  val tables: js.Array[Table[_, _]] = js.native
  val verno: Double = js.native
  def backendDB(): IDBDatabase = js.native
  def close(): Unit = js.native
  def delete(): Promise[Unit] = js.native
  def dynamicallyOpened(): Boolean = js.native
  def hasBeenClosed(): Boolean = js.native
  def hasFailed(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def on(eventName: String): DexieEvent = js.native
  @JSName("on")
  def on_blocked(eventName: blocked, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_populate(eventName: populate, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, subscriber: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, subscriber: js.Function0[_], bSticky: Boolean): Unit = js.native
  @JSName("on")
  def on_versionchange(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  def open(): Promise[Dexie] = js.native
  def table(tableName: String): Table[_, _] = js.native
  @JSName("table")
  def table_T[T](tableName: String): Table[T, _] = js.native
  @JSName("table")
  def table_TKey[T, Key](tableName: String): Table[T, Key] = js.native
  def transaction[U](mode: TransactionMode, tables: js.Array[Table[_, _]], scope: js.Function0[js.Thenable[U] | U]): Promise[U] = js.native
  def transaction[U](mode: TransactionMode, table: Table[_, _], scope: js.Function0[js.Thenable[U] | U]): Promise[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, _],
    table2: Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): Promise[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, _],
    table2: Table[_, _],
    table3: Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): Promise[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, _],
    table2: Table[_, _],
    table3: Table[_, _],
    table4: Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): Promise[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[_, _],
    table2: Table[_, _],
    table3: Table[_, _],
    table4: Table[_, _],
    table5: Table[_, _],
    scope: js.Function0[js.Thenable[U] | U]
  ): Promise[U] = js.native
  def version(versionNumber: Number): Version = js.native
  def vip[U](scopeFunction: js.Function0[U]): U = js.native
}

