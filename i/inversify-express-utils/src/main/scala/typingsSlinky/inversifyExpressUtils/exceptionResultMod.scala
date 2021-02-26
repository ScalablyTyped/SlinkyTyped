package typingsSlinky.inversifyExpressUtils

import typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionResultMod {
  
  @JSImport("inversify-express-utils/dts/results/ExceptionResult", JSImport.Default)
  @js.native
  class default protected () extends ExceptionResult {
    def this(error: js.Error, apiController: BaseHttpController) = this()
  }
  
  @js.native
  trait ExceptionResult extends IHttpActionResult {
    
    var apiController: js.Any = js.native
    
    var error: js.Any = js.native
  }
  object ExceptionResult {
    
    @scala.inline
    def apply(apiController: js.Any, error: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): ExceptionResult = {
      val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
      __obj.asInstanceOf[ExceptionResult]
    }
    
    @scala.inline
    implicit class ExceptionResultMutableBuilder[Self <: ExceptionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiController(value: js.Any): Self = StObject.set(x, "apiController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
