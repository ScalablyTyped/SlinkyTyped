package typingsSlinky.inversifyExpressUtils

import typingsSlinky.inversifyExpressUtils.badRequestErrorMessageResultMod.default
import typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils/dts/results", JSImport.Namespace)
@js.native
object resultsMod extends js.Object {
  
  @js.native
  class BadRequestErrorMessageResult protected () extends default {
    def this(message: String, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typingsSlinky.inversifyExpressUtils.badRequestResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typingsSlinky.inversifyExpressUtils.conflictResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyExpressUtils.createdNegotiatedContentResultMod.default[T] {
    def this(location: String, content: T, apiController: BaseHttpController) = this()
    def this(location: URL_, content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typingsSlinky.inversifyExpressUtils.exceptionResultMod.default {
    def this(error: js.Error, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typingsSlinky.inversifyExpressUtils.internalServerErrorMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typingsSlinky.inversifyExpressUtils.jsonResultMod.default {
    def this(json: js.Any, statusCode: Double, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typingsSlinky.inversifyExpressUtils.notFoundResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyExpressUtils.okNegotiatedContentResultMod.default[T] {
    def this(content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typingsSlinky.inversifyExpressUtils.okResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typingsSlinky.inversifyExpressUtils.redirectResultMod.default {
    def this(location: String, apiController: BaseHttpController) = this()
    def this(location: URL_, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typingsSlinky.inversifyExpressUtils.responseMessageResultMod.default {
    def this(message: HttpResponseMessage, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typingsSlinky.inversifyExpressUtils.statusCodeResultMod.default {
    def this(statusCode: Double, apiController: BaseHttpController) = this()
  }
}
