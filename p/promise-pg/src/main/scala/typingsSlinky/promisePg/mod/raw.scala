package typingsSlinky.promisePg.mod

import typingsSlinky.pg.anon.TypeofPg
import typingsSlinky.pg.mod.ConnectionConfig
import typingsSlinky.pg.mod.Defaults_
import typingsSlinky.pg.mod.PoolConfig
import typingsSlinky.pg.mod.QueryResultRow
import typingsSlinky.pgTypes.mod.TypeFormat
import typingsSlinky.pgTypes.mod.TypeId
import typingsSlinky.pgTypes.mod.TypesBuiltins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "raw")
@js.native
object raw extends js.Object {
  @js.native
  class Client ()
    extends typingsSlinky.pg.mod.Client {
    def this(config: String) = this()
    def this(config: typingsSlinky.pg.mod.ClientConfig) = this()
  }
  
  @js.native
  class ClientBase ()
    extends typingsSlinky.pg.mod.ClientBase {
    def this(config: String) = this()
    def this(config: typingsSlinky.pg.mod.ClientConfig) = this()
  }
  
  @js.native
  class Connection ()
    extends typingsSlinky.pg.mod.Connection {
    def this(config: ConnectionConfig) = this()
  }
  
  @js.native
  class Events ()
    extends typingsSlinky.pg.mod.Events
  
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
  
  @js.native
  class Query[R /* <: QueryResultRow */, I /* <: js.Array[_] */] ()
    extends typingsSlinky.pg.mod.Query[R, I] {
    def this(queryTextOrConfig: String) = this()
    def this(queryTextOrConfig: typingsSlinky.pg.mod.QueryConfig[I]) = this()
    def this(queryTextOrConfig: js.UndefOr[scala.Nothing], values: I) = this()
    def this(queryTextOrConfig: String, values: I) = this()
    def this(queryTextOrConfig: typingsSlinky.pg.mod.QueryConfig[I], values: I) = this()
  }
  
  val defaults: Defaults_ with typingsSlinky.pg.mod.ClientConfig = js.native
  val native: TypeofPg | Null = js.native
  @js.native
  object types extends js.Object {
    val builtins: TypesBuiltins = js.native
    def arrayParser(source: String, transform: js.Function1[/* entry */ js.Any, _]): js.Array[_] = js.native
    def getTypeParser(id: TypeId): js.Any = js.native
    def getTypeParser(id: TypeId, format: TypeFormat): js.Any = js.native
    def setTypeParser(id: TypeId, format: TypeFormat, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
    def setTypeParser(id: TypeId, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
  }
  
}

