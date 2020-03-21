package typingsSlinky.inversifyExpressUtils.mod

import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "results")
@js.native
object results extends js.Object {
  @js.native
  class BadRequestErrorMessageResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.BadRequestErrorMessageResult {
    def this(
      message: String,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.BadRequestResult {
    def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.ConflictResult {
    def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.CreatedNegotiatedContentResult[T] {
    def this(
      location: String,
      content: T,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL_,
      content: T,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.ExceptionResult {
    def this(
      error: js.Error,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.InternalServerErrorResult {
    def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.JsonResult {
    def this(
      json: js.Any,
      statusCode: Double,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.NotFoundResult {
    def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.OkNegotiatedContentResult[T] {
    def this(
      content: T,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.OkResult {
    def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.RedirectResult {
    def this(
      location: String,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL_,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.ResponseMessageResult {
    def this(
      message: typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typingsSlinky.inversifyExpressUtils.resultsMod.StatusCodeResult {
    def this(
      statusCode: Double,
      apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
}

