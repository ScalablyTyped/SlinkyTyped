package typingsSlinky.mysql2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mysql2.fieldPacketMod.FieldPacket
import typingsSlinky.mysql2.mod.ConnectionOptions
import typingsSlinky.mysql2.mod.PoolOptions
import typingsSlinky.mysql2.mysql2Strings.acquire
import typingsSlinky.mysql2.mysql2Strings.connection
import typingsSlinky.mysql2.mysql2Strings.enqueue
import typingsSlinky.mysql2.mysql2Strings.release
import typingsSlinky.mysql2.mysqlMod.PoolCluster
import typingsSlinky.mysql2.okPacketMod.OkPacket
import typingsSlinky.mysql2.poolClusterMod.PoolClusterOptions
import typingsSlinky.mysql2.queryMod.QueryOptions
import typingsSlinky.mysql2.resultSetHeaderMod.ResultSetHeader
import typingsSlinky.mysql2.rowDataPacketMod.RowDataPacket
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("mysql2/promise", "createConnection")
  @js.native
  def createConnection(config: ConnectionOptions): js.Promise[Connection] = js.native
  @JSImport("mysql2/promise", "createConnection")
  @js.native
  def createConnection(connectionUri: String): js.Promise[Connection] = js.native
  
  @JSImport("mysql2/promise", "createPool")
  @js.native
  def createPool(config: PoolOptions): Pool = js.native
  
  @JSImport("mysql2/promise", "createPoolCluster")
  @js.native
  def createPoolCluster(): PoolCluster = js.native
  @JSImport("mysql2/promise", "createPoolCluster")
  @js.native
  def createPoolCluster(config: PoolClusterOptions): PoolCluster = js.native
  
  @JSImport("mysql2/promise", "escape")
  @js.native
  def escape(value: js.Any): String = js.native
  
  @JSImport("mysql2/promise", "format")
  @js.native
  def format(sql: String): String = js.native
  @JSImport("mysql2/promise", "format")
  @js.native
  def format(sql: String, values: js.Any): String = js.native
  @JSImport("mysql2/promise", "format")
  @js.native
  def format(sql: String, values: js.Array[_]): String = js.native
  
  @js.native
  trait Connection extends EventEmitter {
    
    def beginTransaction(): js.Promise[Unit] = js.native
    
    def changeUser(options: ConnectionOptions): js.Promise[Unit] = js.native
    
    def commit(): js.Promise[Unit] = js.native
    
    var config: ConnectionOptions = js.native
    
    def connect(): js.Promise[Unit] = js.native
    
    def destroy(): Unit = js.native
    
    def end(): js.Promise[Unit] = js.native
    def end(options: js.Any): js.Promise[Unit] = js.native
    
    def escape(value: js.Any): String = js.native
    
    def escapeId(value: String): String = js.native
    def escapeId(values: js.Array[String]): String = js.native
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    
    def format(sql: String): String = js.native
    def format(sql: String, values: js.Any): String = js.native
    def format(sql: String, values: js.Array[_]): String = js.native
    def format(sql: String, values: StringDictionary[js.Any]): String = js.native
    
    def pause(): Unit = js.native
    
    def ping(): js.Promise[Unit] = js.native
    
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    
    def resume(): Unit = js.native
    
    def rollback(): js.Promise[Unit] = js.native
    
    var threadId: Double = js.native
    
    def unprepare(sql: String): Unit = js.native
  }
  
  @js.native
  trait Pool extends EventEmitter {
    
    def end(): js.Promise[Unit] = js.native
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    
    def getConnection(): js.Promise[PoolConnection] = js.native
    
    @JSName("on")
    def on_acquire(event: acquire, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
    @JSName("on")
    def on_connection(event: connection, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
    @JSName("on")
    def on_enqueue(event: enqueue, listener: js.Function0[_]): this.type = js.native
    @JSName("on")
    def on_release(event: release, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
    
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
  }
  
  @js.native
  trait PoolConnection extends Connection {
    
    def release(): Unit = js.native
  }
}
