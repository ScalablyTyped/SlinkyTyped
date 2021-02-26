package typingsSlinky.inversifyExpressUtils

import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.HttpContext
import typingsSlinky.inversifyExpressUtils.resultsMod.BadRequestErrorMessageResult
import typingsSlinky.inversifyExpressUtils.resultsMod.BadRequestResult
import typingsSlinky.inversifyExpressUtils.resultsMod.ConflictResult
import typingsSlinky.inversifyExpressUtils.resultsMod.CreatedNegotiatedContentResult
import typingsSlinky.inversifyExpressUtils.resultsMod.ExceptionResult
import typingsSlinky.inversifyExpressUtils.resultsMod.InternalServerErrorResult
import typingsSlinky.inversifyExpressUtils.resultsMod.JsonResult
import typingsSlinky.inversifyExpressUtils.resultsMod.NotFoundResult
import typingsSlinky.inversifyExpressUtils.resultsMod.OkNegotiatedContentResult
import typingsSlinky.inversifyExpressUtils.resultsMod.OkResult
import typingsSlinky.inversifyExpressUtils.resultsMod.RedirectResult
import typingsSlinky.inversifyExpressUtils.resultsMod.ResponseMessageResult
import typingsSlinky.inversifyExpressUtils.resultsMod.StatusCodeResult
import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHttpControllerMod {
  
  @JSImport("inversify-express-utils/dts/base_http_controller", "BaseHttpController")
  @js.native
  class BaseHttpController () extends StObject {
    
    /* protected */ def badRequest(): BadRequestResult = js.native
    /* protected */ def badRequest(message: String): BadRequestErrorMessageResult = js.native
    
    /* protected */ def conflict(): ConflictResult = js.native
    
    /* protected */ def created[T](location: String, content: T): CreatedNegotiatedContentResult[T] = js.native
    /* protected */ def created[T](location: URL_, content: T): CreatedNegotiatedContentResult[T] = js.native
    
    val httpContext: HttpContext = js.native
    
    /* protected */ def internalServerError(): InternalServerErrorResult = js.native
    /* protected */ def internalServerError(error: js.Error): ExceptionResult = js.native
    
    /* protected */ def json(content: js.Any): JsonResult = js.native
    /* protected */ def json(content: js.Any, statusCode: Double): JsonResult = js.native
    
    /* protected */ def notFound(): NotFoundResult = js.native
    
    /* protected */ def ok(): OkResult = js.native
    /* protected */ def ok[T](content: T): OkNegotiatedContentResult[T] = js.native
    
    /* protected */ def redirect(uri: String): RedirectResult = js.native
    /* protected */ def redirect(uri: URL_): RedirectResult = js.native
    
    /* protected */ def responseMessage(message: HttpResponseMessage): ResponseMessageResult = js.native
    
    /* protected */ def statusCode(statusCode: Double): StatusCodeResult = js.native
  }
}
