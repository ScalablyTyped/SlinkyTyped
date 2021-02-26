package typingsSlinky.koaXmlBody

import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaXmlBody.anon.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-xml-body", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-xml-body", JSImport.Namespace)
  @js.native
  def apply(opts: Encoding): Middleware[DefaultState, DefaultContext] = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      var body: js.Any = js.native
    }
    object Request {
      
      @scala.inline
      def apply(body: js.Any): Request = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      }
    }
  }
}
