package typingsSlinky.ltijs

import typingsSlinky.express.mod.Express
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.ltijs.anon.Cert
import typingsSlinky.ltijs.anon.Method
import typingsSlinky.ltijs.anon.SameSite
import typingsSlinky.ltijs.databaseMod.DatabaseOptions
import typingsSlinky.ltijs.deepLinkingMod.DeepLinkingService
import typingsSlinky.ltijs.gradeServiceMod.GradeService
import typingsSlinky.ltijs.idTokenMod.IdToken
import typingsSlinky.ltijs.ltijsBooleans.`false`
import typingsSlinky.ltijs.ltijsBooleans.`true`
import typingsSlinky.ltijs.namesAndRolesMod.NamesAndRolesService
import typingsSlinky.ltijs.platformMod.Platform
import typingsSlinky.ltijs.platformMod.PlatformConfig
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("ltijs/lib/Provider/Provider", "Provider")
  @js.native
  class Provider protected () extends StObject {
    def this(encryptionKey: String, database: DatabaseOptions) = this()
    def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
    
    var Database: typingsSlinky.ltijs.databaseMod.Database = js.native
    
    var DeepLinking: DeepLinkingService = js.native
    
    var Grade: GradeService = js.native
    
    var NamesAndRoles: NamesAndRolesService = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    
    def appUrl(): String = js.native
    
    @JSName("app")
    var app_Original: Express = js.native
    
    def close(): js.Promise[Boolean] = js.native
    
    def deletePlatform(url: String): js.Promise[Boolean] = js.native
    
    def deploy(): js.Promise[js.UndefOr[`true`]] = js.native
    def deploy(options: DeploymentOptions): js.Promise[js.UndefOr[`true`]] = js.native
    
    def getAllPlatforms(): js.Promise[js.Array[Platform] | `false`] = js.native
    
    def getPlatform(url: String): js.Promise[Platform | `false`] = js.native
    
    def invalidTokenUrl(): String = js.native
    
    def keysetUrl(): String = js.native
    
    def loginUrl(): String = js.native
    
    def onConnect(_connectCallback: OnConnectCallback): `true` = js.native
    def onConnect(_connectCallback: OnConnectCallback, options: OnConnectOptions): `true` = js.native
    
    def onDeepLinking(_connectCallback: OnConnectCallback): `true` = js.native
    def onDeepLinking(_connectCallback: OnConnectCallback, options: OnConnectOptions): `true` = js.native
    
    def redirect(response: Response_[_], path: String): Unit = js.native
    def redirect(response: Response_[_], path: String, options: RedirectOptions): Unit = js.native
    
    def registerPlatform(config: PlatformConfig): js.Promise[Platform | `false`] = js.native
    
    def sessionTimeoutUrl(): String = js.native
    
    def whitelist(urls: (String | Method)*): `true` = js.native
  }
  
  @js.native
  trait DeploymentOptions extends StObject {
    
    var port: js.UndefOr[Double] = js.native
    
    var serverless: js.UndefOr[Boolean] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object DeploymentOptions {
    
    @scala.inline
    def apply(): DeploymentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentOptions]
    }
    
    @scala.inline
    implicit class DeploymentOptionsMutableBuilder[Self <: DeploymentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setServerless(value: Boolean): Self = StObject.set(x, "serverless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerlessUndefined: Self = StObject.set(x, "serverless", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  type OnConnectCallback = js.Function4[
    /* connection */ IdToken, 
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* response */ Response_[js.Any], 
    /* next */ NextFunction, 
    Response_[js.Any] | Unit
  ]
  
  @js.native
  trait OnConnectOptions extends StObject {
    
    var invalidToken: js.UndefOr[
        js.Function2[
          /* request */ Request_[ParamsDictionary, _, _, Query], 
          /* response */ Response_[_], 
          Response_[_]
        ]
      ] = js.native
    
    var sessionTimeout: js.UndefOr[
        js.Function2[
          /* request */ Request_[ParamsDictionary, _, _, Query], 
          /* response */ Response_[_], 
          Response_[_]
        ]
      ] = js.native
  }
  object OnConnectOptions {
    
    @scala.inline
    def apply(): OnConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnConnectOptions]
    }
    
    @scala.inline
    implicit class OnConnectOptionsMutableBuilder[Self <: OnConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalidToken(
        value: (/* request */ Request_[ParamsDictionary, _, _, Query], /* response */ Response_[_]) => Response_[_]
      ): Self = StObject.set(x, "invalidToken", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalidTokenUndefined: Self = StObject.set(x, "invalidToken", js.undefined)
      
      @scala.inline
      def setSessionTimeout(
        value: (/* request */ Request_[ParamsDictionary, _, _, Query], /* response */ Response_[_]) => Response_[_]
      ): Self = StObject.set(x, "sessionTimeout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    }
  }
  
  @js.native
  trait ProviderOptions extends StObject {
    
    var appUrl: js.UndefOr[String] = js.native
    
    var cookies: js.UndefOr[SameSite] = js.native
    
    var cors: js.UndefOr[Boolean] = js.native
    
    var https: js.UndefOr[Boolean] = js.native
    
    var invalidTokenUrl: js.UndefOr[String] = js.native
    
    var keysetUrl: js.UndefOr[String] = js.native
    
    var logger: js.UndefOr[Boolean] = js.native
    
    var loginUrl: js.UndefOr[String] = js.native
    
    var serverAddon: js.UndefOr[ServerAddonFunction] = js.native
    
    var sessionTimeoutUrl: js.UndefOr[String] = js.native
    
    var ssl: js.UndefOr[Cert] = js.native
    
    var staticPath: js.UndefOr[String] = js.native
  }
  object ProviderOptions {
    
    @scala.inline
    def apply(): ProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderOptions]
    }
    
    @scala.inline
    implicit class ProviderOptionsMutableBuilder[Self <: ProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
      
      @scala.inline
      def setCookies(value: SameSite): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setInvalidTokenUrl(value: String): Self = StObject.set(x, "invalidTokenUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidTokenUrlUndefined: Self = StObject.set(x, "invalidTokenUrl", js.undefined)
      
      @scala.inline
      def setKeysetUrl(value: String): Self = StObject.set(x, "keysetUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysetUrlUndefined: Self = StObject.set(x, "keysetUrl", js.undefined)
      
      @scala.inline
      def setLogger(value: Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      @scala.inline
      def setServerAddon(value: /* app */ Express => Unit): Self = StObject.set(x, "serverAddon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setServerAddonUndefined: Self = StObject.set(x, "serverAddon", js.undefined)
      
      @scala.inline
      def setSessionTimeoutUrl(value: String): Self = StObject.set(x, "sessionTimeoutUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUrlUndefined: Self = StObject.set(x, "sessionTimeoutUrl", js.undefined)
      
      @scala.inline
      def setSsl(value: Cert): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setStaticPath(value: String): Self = StObject.set(x, "staticPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticPathUndefined: Self = StObject.set(x, "staticPath", js.undefined)
    }
  }
  
  @js.native
  trait RedirectOptions extends StObject {
    
    var ignoreRoot: js.UndefOr[Boolean] = js.native
    
    var isNewResource: js.UndefOr[Boolean] = js.native
  }
  object RedirectOptions {
    
    @scala.inline
    def apply(): RedirectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedirectOptions]
    }
    
    @scala.inline
    implicit class RedirectOptionsMutableBuilder[Self <: RedirectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreRoot(value: Boolean): Self = StObject.set(x, "ignoreRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRootUndefined: Self = StObject.set(x, "ignoreRoot", js.undefined)
      
      @scala.inline
      def setIsNewResource(value: Boolean): Self = StObject.set(x, "isNewResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNewResourceUndefined: Self = StObject.set(x, "isNewResource", js.undefined)
    }
  }
  
  type ServerAddonFunction = js.Function1[/* app */ Express, Unit]
}
