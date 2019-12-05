package typingsSlinky.inversifyDashExpressDashUtils

import typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
import typingsSlinky.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsBadRequestErrorMessageResultMod.default
import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results", JSImport.Namespace)
@js.native
object dtsResultsMod extends js.Object {
  @js.native
  class BadRequestErrorMessageResult protected () extends default {
    def this(message: String, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsBadRequestResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsConflictResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsCreatedNegotiatedContentResultMod.default[T] {
    def this(location: String, content: T, apiController: BaseHttpController) = this()
    def this(location: URL, content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsExceptionResultMod.default {
    def this(error: js.Error, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsInternalServerErrorMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsJsonResultMod.default {
    def this(json: js.Any, statusCode: Double, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsNotFoundResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsOkNegotiatedContentResultMod.default[T] {
    def this(content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsOkResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsRedirectResultMod.default {
    def this(location: String, apiController: BaseHttpController) = this()
    def this(location: URL, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsResponseMessageResultMod.default {
    def this(message: HttpResponseMessage, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsStatusCodeResultMod.default {
    def this(statusCode: Double, apiController: BaseHttpController) = this()
  }
  
}

