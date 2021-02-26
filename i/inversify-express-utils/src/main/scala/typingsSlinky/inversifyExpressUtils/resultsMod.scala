package typingsSlinky.inversifyExpressUtils

import typingsSlinky.inversifyExpressUtils.badRequestErrorMessageResultMod.default
import typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultsMod {
  
  @JSImport("inversify-express-utils/dts/results", "BadRequestErrorMessageResult")
  @js.native
  class BadRequestErrorMessageResult protected () extends default {
    def this(message: String, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "BadRequestResult")
  @js.native
  class BadRequestResult protected ()
    extends typingsSlinky.inversifyExpressUtils.badRequestResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "ConflictResult")
  @js.native
  class ConflictResult protected ()
    extends typingsSlinky.inversifyExpressUtils.conflictResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "CreatedNegotiatedContentResult")
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyExpressUtils.createdNegotiatedContentResultMod.default[T] {
    def this(location: String, content: T, apiController: BaseHttpController) = this()
    def this(location: URL_, content: T, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "ExceptionResult")
  @js.native
  class ExceptionResult protected ()
    extends typingsSlinky.inversifyExpressUtils.exceptionResultMod.default {
    def this(error: js.Error, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "InternalServerErrorResult")
  @js.native
  class InternalServerErrorResult protected ()
    extends typingsSlinky.inversifyExpressUtils.internalServerErrorMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "JsonResult")
  @js.native
  class JsonResult protected ()
    extends typingsSlinky.inversifyExpressUtils.jsonResultMod.default {
    def this(json: js.Any, statusCode: Double, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "NotFoundResult")
  @js.native
  class NotFoundResult protected ()
    extends typingsSlinky.inversifyExpressUtils.notFoundResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "OkNegotiatedContentResult")
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typingsSlinky.inversifyExpressUtils.okNegotiatedContentResultMod.default[T] {
    def this(content: T, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "OkResult")
  @js.native
  class OkResult protected ()
    extends typingsSlinky.inversifyExpressUtils.okResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "RedirectResult")
  @js.native
  class RedirectResult protected ()
    extends typingsSlinky.inversifyExpressUtils.redirectResultMod.default {
    def this(location: String, apiController: BaseHttpController) = this()
    def this(location: URL_, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "ResponseMessageResult")
  @js.native
  class ResponseMessageResult protected ()
    extends typingsSlinky.inversifyExpressUtils.responseMessageResultMod.default {
    def this(message: HttpResponseMessage, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "StatusCodeResult")
  @js.native
  class StatusCodeResult protected ()
    extends typingsSlinky.inversifyExpressUtils.statusCodeResultMod.default {
    def this(statusCode: Double, apiController: BaseHttpController) = this()
  }
}
