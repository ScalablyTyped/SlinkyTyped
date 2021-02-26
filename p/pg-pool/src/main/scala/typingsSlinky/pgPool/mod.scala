package typingsSlinky.pgPool

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.pg.mod.Client
import typingsSlinky.pg.mod.ClientConfig
import typingsSlinky.pg.mod.PoolClient
import typingsSlinky.pg.mod.PoolConfig
import typingsSlinky.pgPool.pgPoolStrings.acquire
import typingsSlinky.pgPool.pgPoolStrings.connect
import typingsSlinky.pgPool.pgPoolStrings.error
import typingsSlinky.pgPool.pgPoolStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-pool", JSImport.Namespace)
  @js.native
  class ^[T /* <: typingsSlinky.pg.mod.Client */] () extends Pool[T] {
    def this(config: Config[T]) = this()
    def this(config: js.UndefOr[scala.Nothing], client: ClientLikeCtr[T]) = this()
    def this(config: Config[T], client: ClientLikeCtr[T]) = this()
  }
  
  type ClientLikeCtr[T /* <: Client */] = Instantiable1[/* config */ js.UndefOr[String | ClientConfig], T]
  
  @js.native
  trait Config[T /* <: Client */] extends PoolConfig {
    
    var Client: js.UndefOr[ClientLikeCtr[T]] = js.native
  }
  object Config {
    
    @scala.inline
    def apply[T /* <: Client */](): Config[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[T]]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config[_], T /* <: Client */] (val x: Self with Config[T]) extends AnyVal {
      
      @scala.inline
      def setClient(value: ClientLikeCtr[T]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "Client", js.undefined)
    }
  }
  
  @js.native
  trait Pool[T /* <: typingsSlinky.pg.mod.Client */]
    extends typingsSlinky.pg.mod.Pool {
    
    val Client: ClientLikeCtr[T] = js.native
    
    @JSName("on")
    def on_acquire(event: acquire, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* client */ T with PoolClient, Unit]): this.type = js.native
    @JSName("on")
    def on_remove(event: remove, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
  }
}
