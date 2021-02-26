package typingsSlinky.koaUseragent

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-useragent", JSImport.Default)
  @js.native
  val default: Middleware[DefaultState, DefaultContext] = js.native
  
  @JSImport("koa-useragent", "userAgent")
  @js.native
  val userAgent: Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait UserAgentContext extends StObject {
    
    var userAgent: typingsSlinky.koaUseragent.useragentMod.default = js.native
  }
  object UserAgentContext {
    
    @scala.inline
    def apply(userAgent: typingsSlinky.koaUseragent.useragentMod.default): UserAgentContext = {
      val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentContext]
    }
    
    @scala.inline
    implicit class UserAgentContextMutableBuilder[Self <: UserAgentContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserAgent(value: typingsSlinky.koaUseragent.useragentMod.default): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Middleware[DefaultState, DefaultContext]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Middleware[DefaultState, DefaultContext] = default
}
