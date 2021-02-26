package typingsSlinky.promisePg

import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.pg.anon.TypeofPg
import typingsSlinky.pg.mod.ConnectionConfig
import typingsSlinky.pg.mod.Defaults_
import typingsSlinky.pg.mod.PoolConfig
import typingsSlinky.pg.mod.QueryResultRow
import typingsSlinky.pgTypes.mod.TypeFormat
import typingsSlinky.pgTypes.mod.TypeId
import typingsSlinky.pgTypes.mod.TypesBuiltins
import typingsSlinky.promisePg.promisePgStrings.drain
import typingsSlinky.promisePg.promisePgStrings.error
import typingsSlinky.promisePg.promisePgStrings.notice
import typingsSlinky.promisePg.promisePgStrings.notification
import typingsSlinky.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-pg", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(config: ClientConfig) = this()
    def this(connection: String) = this()
    
    def connect(): Promise[Unit] = js.native
    
    def copyFrom(queryText: String): Writable = js.native
    
    def copyTo(queryText: String): Readable = js.native
    
    def end(): Promise[Unit] = js.native
    
    def on(event: String, listener: js.Function): Client = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): Client = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): Client = js.native
    @JSName("on")
    def on_notice(event: notice, listener: js.Function1[/* message */ js.Any, Unit]): Client = js.native
    @JSName("on")
    def on_notification(event: notification, listener: js.Function1[/* message */ js.Any, Unit]): Client = js.native
    
    def pauseDrain(): Unit = js.native
    
    def query(config: QueryConfig): Query = js.native
    def query(queryText: String): Query = js.native
    def query(queryText: String, values: js.Array[_]): Query = js.native
    
    var raw: typingsSlinky.pg.mod.Client = js.native
    
    def resumeDrain(): Unit = js.native
    
    def transaction(task: js.Function0[Promise[_]]): Promise[_] = js.native
  }
  
  @JSImport("promise-pg", "Query")
  @js.native
  class Query ()
    extends typingsSlinky.pg.mod.Query[js.Any, js.Any] {
    def this(queryTextOrConfig: String) = this()
    def this(queryTextOrConfig: typingsSlinky.pg.mod.QueryConfig[_]) = this()
    def this(queryTextOrConfig: js.UndefOr[scala.Nothing], values: js.Any) = this()
    def this(queryTextOrConfig: String, values: js.Any) = this()
    def this(queryTextOrConfig: typingsSlinky.pg.mod.QueryConfig[_], values: js.Any) = this()
    
    var promise: Promise[QueryResult] = js.native
  }
  
  @JSImport("promise-pg", "connect")
  @js.native
  def connect(connection: String): Promise[Client] = js.native
  @JSImport("promise-pg", "connect")
  @js.native
  def connect(connection: typingsSlinky.pg.mod.ClientConfig): Promise[Client] = js.native
  
  @JSImport("promise-pg", "end")
  @js.native
  def end(): Promise[Unit] = js.native
  
  object raw {
    
    @JSImport("promise-pg", "raw.Client")
    @js.native
    class Client ()
      extends typingsSlinky.pg.mod.Client {
      def this(config: String) = this()
      def this(config: typingsSlinky.pg.mod.ClientConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.ClientBase")
    @js.native
    class ClientBase ()
      extends typingsSlinky.pg.mod.ClientBase {
      def this(config: String) = this()
      def this(config: typingsSlinky.pg.mod.ClientConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.Connection")
    @js.native
    class Connection ()
      extends typingsSlinky.pg.mod.Connection {
      def this(config: ConnectionConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.Events")
    @js.native
    class Events ()
      extends typingsSlinky.pg.mod.Events {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("promise-pg", "raw.Pool")
    @js.native
    /**
      * Every field of the config object is entirely optional.
      * The config passed to the pool is also passed to every client
      * instance within the pool when the pool creates that client.
      */
    class Pool ()
      extends typingsSlinky.pg.mod.Pool {
      def this(config: PoolConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.Query")
    @js.native
    class Query[R /* <: QueryResultRow */, I /* <: js.Array[_] */] ()
      extends typingsSlinky.pg.mod.Query[R, I] {
      def this(queryTextOrConfig: String) = this()
      def this(queryTextOrConfig: typingsSlinky.pg.mod.QueryConfig[I]) = this()
      def this(queryTextOrConfig: js.UndefOr[scala.Nothing], values: I) = this()
      def this(queryTextOrConfig: String, values: I) = this()
      def this(queryTextOrConfig: typingsSlinky.pg.mod.QueryConfig[I], values: I) = this()
    }
    
    @JSImport("promise-pg", "raw.defaults")
    @js.native
    val defaults: Defaults_ with typingsSlinky.pg.mod.ClientConfig = js.native
    
    @JSImport("promise-pg", "raw.native")
    @js.native
    val native: TypeofPg | Null = js.native
    
    object types {
      
      @JSImport("promise-pg", "raw.types.arrayParser")
      @js.native
      def arrayParser(source: String, transform: js.Function1[/* entry */ js.Any, _]): js.Array[_] = js.native
      
      @JSImport("promise-pg", "raw.types.builtins")
      @js.native
      val builtins: TypesBuiltins = js.native
      
      @JSImport("promise-pg", "raw.types.getTypeParser")
      @js.native
      def getTypeParser(id: TypeId): js.Any = js.native
      @JSImport("promise-pg", "raw.types.getTypeParser")
      @js.native
      def getTypeParser(id: TypeId, format: TypeFormat): js.Any = js.native
      
      @JSImport("promise-pg", "raw.types.setTypeParser")
      @js.native
      def setTypeParser(id: TypeId, format: TypeFormat, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
      @JSImport("promise-pg", "raw.types.setTypeParser")
      @js.native
      def setTypeParser(id: TypeId, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
    }
  }
  
  type ClientConfig = typingsSlinky.pg.mod.ClientConfig
  
  @js.native
  trait QueryConfig
    extends typingsSlinky.pg.mod.QueryConfig[js.Array[js.Any]] {
    
    var buffer: js.UndefOr[Boolean] = js.native
  }
  object QueryConfig {
    
    @scala.inline
    def apply(text: String): QueryConfig = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryConfig]
    }
    
    @scala.inline
    implicit class QueryConfigMutableBuilder[Self <: QueryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    }
  }
  
  type QueryResult = typingsSlinky.pg.mod.QueryResult[js.Any]
  
  type ResultBuilder = typingsSlinky.pg.mod.ResultBuilder[js.Any]
}
