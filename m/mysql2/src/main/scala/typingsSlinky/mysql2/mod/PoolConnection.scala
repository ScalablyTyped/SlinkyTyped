package typingsSlinky.mysql2.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mysql2.fieldPacketMod.FieldPacket
import typingsSlinky.mysql2.mysqlMod.Query
import typingsSlinky.mysql2.okPacketMod.OkPacket
import typingsSlinky.mysql2.queryMod.QueryError
import typingsSlinky.mysql2.queryMod.QueryOptions
import typingsSlinky.mysql2.resultSetHeaderMod.ResultSetHeader
import typingsSlinky.mysql2.rowDataPacketMod.RowDataPacket
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
- typingsSlinky.node.eventsMod.EventEmitter because Already inherited
- typingsSlinky.mysql2.connectionMod.Connection because Already inherited
- typingsSlinky.mysql2.connectionMod.^ because Already inherited
- typingsSlinky.mysql2.mod.Connection because var conflicts: config, threadId. Inlined execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, ping, ping, promise, promise */ @js.native
trait PoolConnection
  extends typingsSlinky.mysql2.poolConnectionMod.PoolConnection {
  
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    options: QueryOptions,
    callback: js.Function3[
      /* err */ QueryError | Null, 
      /* result */ T, 
      /* fields */ js.UndefOr[js.Array[FieldPacket]], 
      _
    ]
  ): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    options: QueryOptions,
    values: js.Any,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    options: QueryOptions,
    values: js.Array[_],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    options: QueryOptions,
    values: StringDictionary[js.Any],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Any,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Array[_],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): Query = js.native
  def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: StringDictionary[js.Any],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): Query = js.native
  
  def ping(): Unit = js.native
  def ping(callback: js.Function1[/* err */ QueryError | Null, _]): Unit = js.native
  
  def promise(): typingsSlinky.mysql2.promiseMod.PoolConnection = js.native
  def promise(promiseImpl: PromiseConstructor): typingsSlinky.mysql2.promiseMod.PoolConnection = js.native
  @JSName("promise")
  def promise_Connection(): typingsSlinky.mysql2.promiseMod.Connection = js.native
  @JSName("promise")
  def promise_Connection(promiseImpl: PromiseConstructor): typingsSlinky.mysql2.promiseMod.Connection = js.native
}
