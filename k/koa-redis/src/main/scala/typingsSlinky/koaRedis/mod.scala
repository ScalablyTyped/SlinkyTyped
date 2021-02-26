package typingsSlinky.koaRedis

import typingsSlinky.koaSession.mod.stores
import typingsSlinky.redis.mod.ClientOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-redis", JSImport.Namespace)
  @js.native
  def apply(options: RedisOptions): RedisSessionStore = js.native
  
  @js.native
  trait RedisOptions extends ClientOpts {
    
    var client: js.UndefOr[js.Any] = js.native
    
    var duplicate: js.UndefOr[Boolean] = js.native
  }
  object RedisOptions {
    
    @scala.inline
    def apply(): RedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisOptions]
    }
    
    @scala.inline
    implicit class RedisOptionsMutableBuilder[Self <: RedisOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplicateUndefined: Self = StObject.set(x, "duplicate", js.undefined)
    }
  }
  
  @js.native
  trait RedisSessionStore extends stores {
    
    var client: js.Any = js.native
  }
}
