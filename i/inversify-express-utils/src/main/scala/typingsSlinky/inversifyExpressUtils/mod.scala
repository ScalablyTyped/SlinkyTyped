package typingsSlinky.inversifyExpressUtils

import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.Router
import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversifyExpressUtils.anon.Controller
import typingsSlinky.inversifyExpressUtils.anon.ControllerMetadata
import typingsSlinky.inversifyExpressUtils.anon.Instantiable
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.RoutingConfig
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.std.ParameterDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-express-utils", "BaseHttpController")
  @js.native
  class BaseHttpController ()
    extends typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
  
  @JSImport("inversify-express-utils", "BaseMiddleware")
  @js.native
  abstract class BaseMiddleware () extends StObject
  
  @JSImport("inversify-express-utils", "HttpContent")
  @js.native
  abstract class HttpContent ()
    extends typingsSlinky.inversifyExpressUtils.httpContentMod.HttpContent
  
  @JSImport("inversify-express-utils", "HttpResponseMessage")
  @js.native
  class HttpResponseMessage ()
    extends typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage {
    def this(statusCode: Double) = this()
  }
  
  @JSImport("inversify-express-utils", "InversifyExpressServer")
  @js.native
  class InversifyExpressServer protected ()
    extends typingsSlinky.inversifyExpressUtils.serverMod.InversifyExpressServer {
    /**
      * Wrapper for the express server.
      *
      * @param container Container loaded with all controllers and their dependencies.
      * @param customRouter optional express.Router custom router
      * @param routingConfig optional interfaces.RoutingConfig routing config
      * @param customApp optional express.Application custom app
      * @param authProvider optional interfaces.AuthProvider auth provider
      * @param forceControllers optional boolean setting to force controllers (defaults do true)
      */
    def this(
      container: Container,
      customRouter: js.UndefOr[Router | Null],
      routingConfig: js.UndefOr[RoutingConfig | Null],
      customApp: js.UndefOr[Application_ | Null],
      authProvider: js.UndefOr[Instantiable | Null],
      forceControllers: js.UndefOr[Boolean]
    ) = this()
  }
  
  @JSImport("inversify-express-utils", "JsonContent")
  @js.native
  class JsonContent protected ()
    extends typingsSlinky.inversifyExpressUtils.jsonContentMod.JsonContent {
    def this(content: js.Any) = this()
    def this(content: js.Any, mediaType: String) = this()
  }
  
  @JSImport("inversify-express-utils", "StringContent")
  @js.native
  class StringContent protected ()
    extends typingsSlinky.inversifyExpressUtils.stringContentMod.StringContent {
    def this(content: String) = this()
    def this(content: String, mediaType: String) = this()
  }
  
  object TYPE {
    
    @JSImport("inversify-express-utils", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify-express-utils", "TYPE.AuthProvider")
    @js.native
    def AuthProvider: js.Symbol = js.native
    @scala.inline
    def AuthProvider_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils", "TYPE.Controller")
    @js.native
    def Controller: js.Symbol = js.native
    @scala.inline
    def Controller_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Controller")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils", "TYPE.HttpContext")
    @js.native
    def HttpContext: js.Symbol = js.native
    @scala.inline
    def HttpContext_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpContext")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("inversify-express-utils", "all")
  @js.native
  def all(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "cleanUpMetadata")
  @js.native
  def cleanUpMetadata(): Unit = js.native
  
  @JSImport("inversify-express-utils", "controller")
  @js.native
  def controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  
  @JSImport("inversify-express-utils", "cookies")
  @js.native
  def cookies(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils", "cookies")
  @js.native
  def cookies(cookieName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "getRawMetadata")
  @js.native
  def getRawMetadata(container: Container): js.Array[ControllerMetadata] = js.native
  
  @JSImport("inversify-express-utils", "getRouteInfo")
  @js.native
  def getRouteInfo(container: Container): js.Array[Controller] = js.native
  
  @JSImport("inversify-express-utils", "httpDelete")
  @js.native
  def httpDelete(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpGet")
  @js.native
  def httpGet(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpHead")
  @js.native
  def httpHead(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpMethod")
  @js.native
  def httpMethod(method: String, path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpPatch")
  @js.native
  def httpPatch(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpPost")
  @js.native
  def httpPost(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpPut")
  @js.native
  def httpPut(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "injectHttpContext")
  @js.native
  def injectHttpContext(target: js.Any, targetKey: String): Unit = js.native
  @JSImport("inversify-express-utils", "injectHttpContext")
  @js.native
  def injectHttpContext(target: js.Any, targetKey: String, index: Double): Unit = js.native
  
  @JSImport("inversify-express-utils", "next")
  @js.native
  def next(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "principal")
  @js.native
  def principal(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "queryParam")
  @js.native
  def queryParam(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils", "queryParam")
  @js.native
  def queryParam(queryParamName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "request")
  @js.native
  def request(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "requestBody")
  @js.native
  def requestBody(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "requestHeaders")
  @js.native
  def requestHeaders(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils", "requestHeaders")
  @js.native
  def requestHeaders(headerName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "requestParam")
  @js.native
  def requestParam(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils", "requestParam")
  @js.native
  def requestParam(paramName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "response")
  @js.native
  def response(): ParameterDecorator = js.native
  
  object results {
    
    @JSImport("inversify-express-utils", "results.BadRequestErrorMessageResult")
    @js.native
    class BadRequestErrorMessageResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.BadRequestErrorMessageResult {
      def this(
        message: String,
        apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.BadRequestResult")
    @js.native
    class BadRequestResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.BadRequestResult {
      def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.ConflictResult")
    @js.native
    class ConflictResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.ConflictResult {
      def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.CreatedNegotiatedContentResult")
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
    
    @JSImport("inversify-express-utils", "results.ExceptionResult")
    @js.native
    class ExceptionResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.ExceptionResult {
      def this(
        error: js.Error,
        apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.InternalServerErrorResult")
    @js.native
    class InternalServerErrorResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.InternalServerErrorResult {
      def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.JsonResult")
    @js.native
    class JsonResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.JsonResult {
      def this(
        json: js.Any,
        statusCode: Double,
        apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.NotFoundResult")
    @js.native
    class NotFoundResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.NotFoundResult {
      def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.OkNegotiatedContentResult")
    @js.native
    class OkNegotiatedContentResult[T] protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.OkNegotiatedContentResult[T] {
      def this(
        content: T,
        apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.OkResult")
    @js.native
    class OkResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.OkResult {
      def this(apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.RedirectResult")
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
    
    @JSImport("inversify-express-utils", "results.ResponseMessageResult")
    @js.native
    class ResponseMessageResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.ResponseMessageResult {
      def this(
        message: typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage,
        apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.StatusCodeResult")
    @js.native
    class StatusCodeResult protected ()
      extends typingsSlinky.inversifyExpressUtils.resultsMod.StatusCodeResult {
      def this(
        statusCode: Double,
        apiController: typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
  }
}
