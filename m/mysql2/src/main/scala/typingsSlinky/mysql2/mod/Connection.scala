package typingsSlinky.mysql2.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mysql2.connectionMod.^
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

@js.native
trait Connection extends ^ {
  
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
  
  def promise(): typingsSlinky.mysql2.promiseMod.Connection = js.native
  def promise(promiseImpl: PromiseConstructor): typingsSlinky.mysql2.promiseMod.Connection = js.native
}
