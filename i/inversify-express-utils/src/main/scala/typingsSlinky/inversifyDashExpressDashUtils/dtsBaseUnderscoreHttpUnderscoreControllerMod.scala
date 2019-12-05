package typingsSlinky.inversifyDashExpressDashUtils

import typingsSlinky.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.HttpContext
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.BadRequestErrorMessageResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.BadRequestResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.ConflictResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.CreatedNegotiatedContentResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.ExceptionResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.InternalServerErrorResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.JsonResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.NotFoundResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.OkNegotiatedContentResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.OkResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.RedirectResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.ResponseMessageResult
import typingsSlinky.inversifyDashExpressDashUtils.dtsResultsMod.StatusCodeResult
import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_http_controller", JSImport.Namespace)
@js.native
object dtsBaseUnderscoreHttpUnderscoreControllerMod extends js.Object {
  @js.native
  class BaseHttpController () extends js.Object {
    val httpContext: HttpContext = js.native
    /* protected */ def badRequest(): BadRequestResult = js.native
    /* protected */ def badRequest(message: String): BadRequestErrorMessageResult = js.native
    /* protected */ def conflict(): ConflictResult = js.native
    /* protected */ def created[T](location: String, content: T): CreatedNegotiatedContentResult[T] = js.native
    /* protected */ def created[T](location: URL, content: T): CreatedNegotiatedContentResult[T] = js.native
    /* protected */ def internalServerError(): InternalServerErrorResult = js.native
    /* protected */ def internalServerError(error: js.Error): ExceptionResult = js.native
    /* protected */ def json(content: js.Any): JsonResult = js.native
    /* protected */ def json(content: js.Any, statusCode: Double): JsonResult = js.native
    /* protected */ def notFound(): NotFoundResult = js.native
    /* protected */ def ok(): OkResult = js.native
    /* protected */ def ok[T](content: T): OkNegotiatedContentResult[T] = js.native
    /* protected */ def redirect(uri: String): RedirectResult = js.native
    /* protected */ def redirect(uri: URL): RedirectResult = js.native
    /* protected */ def responseMessage(message: HttpResponseMessage): ResponseMessageResult = js.native
    /* protected */ def statusCode(statusCode: Double): StatusCodeResult = js.native
  }
  
}

