package typingsSlinky.mysql2.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mysql2.connectionMod.^
import typingsSlinky.mysql2.fieldPacketMod.FieldPacket
import typingsSlinky.mysql2.mysql2Strings.acquire
import typingsSlinky.mysql2.mysql2Strings.connection
import typingsSlinky.mysql2.mysql2Strings.enqueue
import typingsSlinky.mysql2.mysql2Strings.release
import typingsSlinky.mysql2.mysqlMod.Query
import typingsSlinky.mysql2.okPacketMod.OkPacket
import typingsSlinky.mysql2.queryMod.QueryError
import typingsSlinky.mysql2.queryMod.QueryOptions
import typingsSlinky.mysql2.resultSetHeaderMod.ResultSetHeader
import typingsSlinky.mysql2.rowDataPacketMod.RowDataPacket
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool extends ^ {
  
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
  
  def getConnection(callback: js.Function2[/* err */ ErrnoException, /* connection */ PoolConnection, _]): Unit = js.native
  
  @JSName("on")
  def on_acquire(event: acquire, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
  @JSName("on")
  def on_enqueue(event: enqueue, listener: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_release(event: release, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
  
  def promise(): typingsSlinky.mysql2.promiseMod.Pool = js.native
  def promise(promiseImpl: PromiseConstructor): typingsSlinky.mysql2.promiseMod.Pool = js.native
}
