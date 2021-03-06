package typingsSlinky.inversifyExpressUtils

import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.Router
import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversifyExpressUtils.anon.Instantiable
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ConfigFunction
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.RoutingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("inversify-express-utils/dts/server", "InversifyExpressServer")
  @js.native
  class InversifyExpressServer protected () extends StObject {
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
    
    var _AuthProvider: js.Any = js.native
    
    var _app: js.Any = js.native
    
    var _configFn: js.Any = js.native
    
    var _container: js.Any = js.native
    
    /* private */ def _createHttpContext(req: js.Any, res: js.Any, next: js.Any): js.Any = js.native
    
    var _errorConfigFn: js.Any = js.native
    
    var _forceControllers: js.Any = js.native
    
    /* private */ def _getCurrentUser(req: js.Any, res: js.Any, next: js.Any): js.Any = js.native
    
    /* private */ def _getHttpContext(req: js.Any): js.Any = js.native
    
    /* private */ def _getPrincipal(req: js.Any): js.Any = js.native
    
    var _router: js.Any = js.native
    
    var _routingConfig: js.Any = js.native
    
    /**
      * Applies all routes and configuration to the server, returning the express application.
      */
    def build(): Application_ = js.native
    
    /* private */ def copyHeadersTo(headers: js.Any, target: js.Any): js.Any = js.native
    
    /* private */ def extractParameters(req: js.Any, res: js.Any, next: js.Any, params: js.Any): js.Any = js.native
    
    /* private */ def getParam(source: js.Any, paramType: js.Any, injectRoot: js.Any, name: js.Any): js.Any = js.native
    
    /* private */ def handleHttpResponseMessage(message: js.Any, res: js.Any): js.Any = js.native
    
    /* private */ def handlerFactory(controllerName: js.Any, key: js.Any, parameterMetadata: js.Any): js.Any = js.native
    
    /* private */ def registerControllers(): js.Any = js.native
    
    /* private */ def resolveMidleware(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middleware because its type <none> is not an array type */ middleware: js.Any
    ): js.Any = js.native
    
    /**
      * Sets the configuration function to be applied to the application.
      * Note that the config function is not actually executed until a call to InversifyExpresServer.build().
      *
      * This method is chainable.
      *
      * @param fn Function in which app-level middleware can be registered.
      */
    def setConfig(fn: ConfigFunction): InversifyExpressServer = js.native
    
    /**
      * Sets the error handler configuration function to be applied to the application.
      * Note that the error config function is not actually executed until a call to InversifyExpresServer.build().
      *
      * This method is chainable.
      *
      * @param fn Function in which app-level error handlers can be registered.
      */
    def setErrorConfig(fn: ConfigFunction): InversifyExpressServer = js.native
  }
}
