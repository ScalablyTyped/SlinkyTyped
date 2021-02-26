package typingsSlinky.keyvRedis

import typingsSlinky.keyv.mod.Store
import typingsSlinky.keyvRedis.keyvRedisBooleans.`true`
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.redis.mod.ClientOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keyv/redis", JSImport.Namespace)
  @js.native
  class ^ () extends KeyvRedis {
    def this(options: Options) = this()
    def this(uri: String) = this()
    def this(uri: String, options: Options) = this()
  }
  
  @js.native
  trait KeyvRedis
    extends EventEmitter
       with Store[js.UndefOr[String]] {
    
    var namespace: js.UndefOr[String] = js.native
    
    def set(key: String): js.Promise[Double] = js.native
    def set(key: String, value: String): js.Promise[Double] = js.native
    def set(key: String, value: String, ttl: Double): js.Promise[Double] = js.native
    
    val ttlSupport: `true` = js.native
  }
  
  @js.native
  trait Options extends ClientOpts {
    
    var uri: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
