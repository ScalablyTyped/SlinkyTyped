package typingsSlinky.inversifyExpressUtils

import typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badRequestResultMod {
  
  @JSImport("inversify-express-utils/dts/results/BadRequestResult", JSImport.Default)
  @js.native
  class default protected () extends BadRequestResult {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  trait BadRequestResult extends IHttpActionResult {
    
    var apiController: js.Any = js.native
  }
  object BadRequestResult {
    
    @scala.inline
    def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): BadRequestResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[BadRequestResult]
    }
    
    @scala.inline
    implicit class BadRequestResultMutableBuilder[Self <: BadRequestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
    }
  }
}
