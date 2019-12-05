package typingsSlinky.inversifyDashExpressDashUtils.inversifyDashExpressDashUtilsMod

import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "results")
@js.native
object results extends js.Object {
  @js.native
  class BadRequestErrorMessageResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.BadRequestErrorMessageResult {
    def this(
      message: String,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.BadRequestResult {
    def this(apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.ConflictResult {
    def this(apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.CreatedNegotiatedContentResult[T] {
    def this(
      location: String,
      content: T,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL,
      content: T,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.ExceptionResult {
    def this(
      error: js.Error,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.InternalServerErrorResult {
    def this(apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.JsonResult {
    def this(
      json: js.Any,
      statusCode: Double,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.NotFoundResult {
    def this(apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.OkNegotiatedContentResult[T] {
    def this(
      content: T,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.OkResult {
    def this(apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.RedirectResult {
    def this(
      location: String,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.ResponseMessageResult {
    def this(
      message: typingsSlinky.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.StatusCodeResult {
    def this(
      statusCode: Double,
      apiController: typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
}

