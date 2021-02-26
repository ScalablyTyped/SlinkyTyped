package typingsSlinky.feathersjsAuthenticationClient

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Storage
import typingsSlinky.feathersjsAuthenticationClient.anon.Typeofself
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@feathersjs/authentication-client", JSImport.Default)
  @js.native
  val default: (js.Function1[/* config */ js.UndefOr[FeathersAuthClientConfig], js.Function0[Unit]]) with Typeofself = js.native
  
  object defaults {
    
    @JSImport("@feathersjs/authentication-client", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/authentication-client", "defaults.cookie")
    @js.native
    def cookie: String = js.native
    @scala.inline
    def cookie_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookie")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.entity")
    @js.native
    def entity: String = js.native
    @scala.inline
    def entity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entity")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.header")
    @js.native
    def header: String = js.native
    @scala.inline
    def header_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("header")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.jwtStrategy")
    @js.native
    def jwtStrategy: String = js.native
    @scala.inline
    def jwtStrategy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jwtStrategy")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.path")
    @js.native
    def path: String = js.native
    @scala.inline
    def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.service")
    @js.native
    def service: String = js.native
    @scala.inline
    def service_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("service")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.storageKey")
    @js.native
    def storageKey: String = js.native
    @scala.inline
    def storageKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.timeout")
    @js.native
    def timeout: Double = js.native
    @scala.inline
    def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FeathersAuthClientConfig extends StObject {
    
    var cookie: js.UndefOr[String] = js.native
    
    var entity: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var jwtStrategy: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var service: js.UndefOr[String] = js.native
    
    var storage: js.UndefOr[Storage] = js.native
    
    var storageKey: js.UndefOr[String] = js.native
  }
  object FeathersAuthClientConfig {
    
    @scala.inline
    def apply(): FeathersAuthClientConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeathersAuthClientConfig]
    }
    
    @scala.inline
    implicit class FeathersAuthClientConfigMutableBuilder[Self <: FeathersAuthClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setJwtStrategy(value: String): Self = StObject.set(x, "jwtStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtStrategyUndefined: Self = StObject.set(x, "jwtStrategy", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  @js.native
  trait FeathersAuthCredentials
    extends /* index */ StringDictionary[js.Any] {
    
    var strategy: String = js.native
  }
  object FeathersAuthCredentials {
    
    @scala.inline
    def apply(strategy: String): FeathersAuthCredentials = {
      val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeathersAuthCredentials]
    }
    
    @scala.inline
    implicit class FeathersAuthCredentialsMutableBuilder[Self <: FeathersAuthCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Passport extends StObject {
    
    def authenticate(): js.Any = js.native
    def authenticate(credentials: FeathersAuthCredentials): js.Any = js.native
    
    def authenticateSocket(credentials: FeathersAuthCredentials, socket: js.Any, emit: js.Any): js.Any = js.native
    
    def clearCookie(name: String): Null = js.native
    
    def connected(): js.Promise[_] = js.native
    
    def getCookie(name: String): String = js.native
    
    def getJWT(): js.Promise[_] = js.native
    
    def getStorage(storage: js.Any): js.Any = js.native
    
    def logout(): js.Promise[_] = js.native
    
    def logoutSocket(socket: js.Any, emit: js.Any): js.Promise[_] = js.native
    
    def payloadIsValid(payload: String): Boolean = js.native
    
    def setJWT(data: js.Any): js.Promise[_] = js.native
    
    def setupSocketListeners(): Unit = js.native
    
    def verifyJWT(token: String): js.Promise[_] = js.native
  }
  
  type _To = (js.Function1[/* config */ js.UndefOr[FeathersAuthClientConfig], js.Function0[Unit]]) with Typeofself
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* config */ js.UndefOr[FeathersAuthClientConfig], js.Function0[Unit]]) with Typeofself = default
  
  object feathersjsFeathersAugmentingMod {
    
    @js.native
    trait Application[ServiceTypes] extends StObject {
      
      def authenticate(): js.Promise[_] = js.native
      def authenticate(options: FeathersAuthCredentials): js.Promise[_] = js.native
      
      def logout(): js.Promise[Unit] = js.native
      
      var passport: Passport = js.native
    }
  }
}
