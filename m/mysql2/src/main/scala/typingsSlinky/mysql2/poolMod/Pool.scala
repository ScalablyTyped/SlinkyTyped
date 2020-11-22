package typingsSlinky.mysql2.poolMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mysql2.fieldPacketMod.FieldPacket
import typingsSlinky.mysql2.mysql2Strings.connection
import typingsSlinky.mysql2.okPacketMod.OkPacket
import typingsSlinky.mysql2.queryMod.QueryError
import typingsSlinky.mysql2.queryMod.QueryOptions
import typingsSlinky.mysql2.resultSetHeaderMod.ResultSetHeader
import typingsSlinky.mysql2.rowDataPacketMod.RowDataPacket
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool extends EventEmitter {
  
  var config: PoolOptions = js.native
  
  def end(): Unit = js.native
  def end(callback: js.Function2[/* err */ ErrnoException | Null, /* repeated */ js.Any, _]): Unit = js.native
  
  def getConnection(
    callback: js.Function2[
      /* err */ ErrnoException, 
      /* connection */ typingsSlinky.mysql2.poolConnectionMod.^, 
      _
    ]
  ): Unit = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_connection(
    event: connection,
    listener: js.Function1[/* connection */ typingsSlinky.mysql2.poolConnectionMod.^, _]
  ): this.type = js.native
  
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    options: QueryOptions,
    callback: js.Function3[
      /* err */ QueryError | Null, 
      /* result */ T, 
      /* fields */ js.UndefOr[js.Array[FieldPacket]], 
      _
    ]
  ): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    options: QueryOptions,
    values: js.Any,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    options: QueryOptions,
    values: js.Array[_],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    options: QueryOptions,
    values: StringDictionary[js.Any],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Any,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Array[_],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): typingsSlinky.mysql2.queryMod.^ = js.native
  def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: StringDictionary[js.Any],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typingsSlinky.mysql2.queryMod.^ = js.native
}
