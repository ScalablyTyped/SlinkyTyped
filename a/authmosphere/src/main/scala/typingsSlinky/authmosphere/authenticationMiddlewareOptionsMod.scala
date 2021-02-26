package typingsSlinky.authmosphere

import typingsSlinky.authmosphere.getTokenInfoMod.GetTokenInfo
import typingsSlinky.authmosphere.loggerMod.Logger
import typingsSlinky.authmosphere.tokenMod.Token
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticationMiddlewareOptionsMod {
  
  @js.native
  trait AuthenticationMiddlewareOptions extends StObject {
    
    var getTokenInfo: js.UndefOr[GetTokenInfo[Record[String, _]]] = js.native
    
    var logger: js.UndefOr[Logger] = js.native
    
    var onNotAuthenticatedHandler: js.UndefOr[
        typingsSlinky.authmosphere.authenticationMiddlewareOptionsMod.onNotAuthenticatedHandler
      ] = js.native
    
    var publicEndpoints: js.UndefOr[js.Array[String]] = js.native
    
    var tokenInfoEndpoint: String = js.native
  }
  object AuthenticationMiddlewareOptions {
    
    @scala.inline
    def apply(tokenInfoEndpoint: String): AuthenticationMiddlewareOptions = {
      val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationMiddlewareOptions]
    }
    
    @scala.inline
    implicit class AuthenticationMiddlewareOptionsMutableBuilder[Self <: AuthenticationMiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTokenInfo(
        value: (/* tokenInfoUrl */ String, /* accessToken */ String, /* logger */ js.UndefOr[Logger]) => js.Promise[Token[Record[String, _]]]
      ): Self = StObject.set(x, "getTokenInfo", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetTokenInfoUndefined: Self = StObject.set(x, "getTokenInfo", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setOnNotAuthenticatedHandler(
        value: (/* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* resonse */ Response_[js.Any], /* next */ NextFunction, /* logger */ Logger) => Unit
      ): Self = StObject.set(x, "onNotAuthenticatedHandler", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnNotAuthenticatedHandlerUndefined: Self = StObject.set(x, "onNotAuthenticatedHandler", js.undefined)
      
      @scala.inline
      def setPublicEndpoints(value: js.Array[String]): Self = StObject.set(x, "publicEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicEndpointsUndefined: Self = StObject.set(x, "publicEndpoints", js.undefined)
      
      @scala.inline
      def setPublicEndpointsVarargs(value: String*): Self = StObject.set(x, "publicEndpoints", js.Array(value :_*))
      
      @scala.inline
      def setTokenInfoEndpoint(value: String): Self = StObject.set(x, "tokenInfoEndpoint", value.asInstanceOf[js.Any])
    }
  }
  
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* resonse */ Response_[js.Any], 
    /* next */ NextFunction, 
    /* logger */ Logger, 
    Unit
  ]
}
