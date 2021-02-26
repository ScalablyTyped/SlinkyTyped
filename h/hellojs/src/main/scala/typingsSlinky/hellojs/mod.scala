package typingsSlinky.hellojs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.URL
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Location
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.Window
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.hellojs.anon.Code
import typingsSlinky.hellojs.hellojsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hellojs", JSImport.Namespace)
  @js.native
  val ^ : HelloJSStatic = js.native
  
  @js.native
  trait HelloJSAuthResponse extends StObject {
    
    var access_token: js.UndefOr[String] = js.native
    
    var client_id: js.UndefOr[String] = js.native
    
    var display: js.UndefOr[HelloJSDisplayType] = js.native
    
    var expires: js.UndefOr[Double] = js.native
    
    var expires_in: js.UndefOr[Double] = js.native
    
    var id_token: js.UndefOr[String] = js.native
    
    var network: js.UndefOr[String] = js.native
    
    var redirect_uri: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var session_state: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var token_type: js.UndefOr[String] = js.native
  }
  object HelloJSAuthResponse {
    
    @scala.inline
    def apply(): HelloJSAuthResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelloJSAuthResponse]
    }
    
    @scala.inline
    implicit class HelloJSAuthResponseMutableBuilder[Self <: HelloJSAuthResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      @scala.inline
      def setDisplay(value: HelloJSDisplayType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      @scala.inline
      def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      @scala.inline
      def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      @scala.inline
      def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.hellojs.hellojsStrings.popup
    - typingsSlinky.hellojs.hellojsStrings.page
    - typingsSlinky.hellojs.hellojsStrings.none
  */
  trait HelloJSDisplayType extends StObject
  object HelloJSDisplayType {
    
    @scala.inline
    def none: typingsSlinky.hellojs.hellojsStrings.none = "none".asInstanceOf[typingsSlinky.hellojs.hellojsStrings.none]
    
    @scala.inline
    def page: typingsSlinky.hellojs.hellojsStrings.page = "page".asInstanceOf[typingsSlinky.hellojs.hellojsStrings.page]
    
    @scala.inline
    def popup: typingsSlinky.hellojs.hellojsStrings.popup = "popup".asInstanceOf[typingsSlinky.hellojs.hellojsStrings.popup]
  }
  
  @js.native
  trait HelloJSEvent extends StObject {
    
    def emit(event: String, data: js.Any): HelloJSStatic = js.native
    
    def emitAfter(): HelloJSStatic = js.native
    
    def findEvents(event: String, callback: js.Function2[/* name */ String, /* index */ Double, Unit]): Unit = js.native
    
    def off(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic = js.native
    
    def on(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic = js.native
  }
  object HelloJSEvent {
    
    @scala.inline
    def apply(
      emit: (String, js.Any) => HelloJSStatic,
      emitAfter: () => HelloJSStatic,
      findEvents: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit,
      off: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic,
      on: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic
    ): HelloJSEvent = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), emitAfter = js.Any.fromFunction0(emitAfter), findEvents = js.Any.fromFunction2(findEvents), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[HelloJSEvent]
    }
    
    @scala.inline
    implicit class HelloJSEventMutableBuilder[Self <: HelloJSEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: (String, js.Any) => HelloJSStatic): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmitAfter(value: () => HelloJSStatic): Self = StObject.set(x, "emitAfter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindEvents(value: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit): Self = StObject.set(x, "findEvents", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOff(value: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait HelloJSEventArgument extends StObject {
    
    var authResponse: js.UndefOr[HelloJSAuthResponse] = js.native
    
    var network: String = js.native
  }
  object HelloJSEventArgument {
    
    @scala.inline
    def apply(network: String): HelloJSEventArgument = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSEventArgument]
    }
    
    @scala.inline
    implicit class HelloJSEventArgumentMutableBuilder[Self <: HelloJSEventArgument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthResponse(value: HelloJSAuthResponse): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthResponseUndefined: Self = StObject.set(x, "authResponse", js.undefined)
      
      @scala.inline
      def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HelloJSLoginEventArguement extends StObject {
    
    var authResponse: js.UndefOr[HelloJSAuthResponse] = js.native
    
    var error: js.UndefOr[js.Error] = js.native
    
    var network: String = js.native
  }
  object HelloJSLoginEventArguement {
    
    @scala.inline
    def apply(network: String): HelloJSLoginEventArguement = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSLoginEventArguement]
    }
    
    @scala.inline
    implicit class HelloJSLoginEventArguementMutableBuilder[Self <: HelloJSLoginEventArguement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthResponse(value: HelloJSAuthResponse): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthResponseUndefined: Self = StObject.set(x, "authResponse", js.undefined)
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HelloJSLoginOptions extends StObject {
    
    var default_service: js.UndefOr[String] = js.native
    
    var display: js.UndefOr[HelloJSDisplayType] = js.native
    
    var force: js.UndefOr[Boolean | Null] = js.native
    
    var oauth_proxy: js.UndefOr[String] = js.native
    
    var popup: js.UndefOr[HelloJSPopupOptions] = js.native
    
    var redirect_uri: js.UndefOr[String] = js.native
    
    var response_type: js.UndefOr[HelloJSTokenResponseType] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object HelloJSLoginOptions {
    
    @scala.inline
    def apply(): HelloJSLoginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelloJSLoginOptions]
    }
    
    @scala.inline
    implicit class HelloJSLoginOptionsMutableBuilder[Self <: HelloJSLoginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault_service(value: String): Self = StObject.set(x, "default_service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_serviceUndefined: Self = StObject.set(x, "default_service", js.undefined)
      
      @scala.inline
      def setDisplay(value: HelloJSDisplayType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceNull: Self = StObject.set(x, "force", null)
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setOauth_proxy(value: String): Self = StObject.set(x, "oauth_proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_proxyUndefined: Self = StObject.set(x, "oauth_proxy", js.undefined)
      
      @scala.inline
      def setPopup(value: HelloJSPopupOptions): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      @scala.inline
      def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      @scala.inline
      def setResponse_type(value: HelloJSTokenResponseType): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait HelloJSLogoutOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
  }
  object HelloJSLogoutOptions {
    
    @scala.inline
    def apply(): HelloJSLogoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelloJSLogoutOptions]
    }
    
    @scala.inline
    implicit class HelloJSLogoutOptionsMutableBuilder[Self <: HelloJSLogoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  @js.native
  trait HelloJSOAuth1Def extends HelloJSOAuthDef {
    
    var request: js.UndefOr[String] = js.native
    
    var token: js.UndefOr[String] = js.native
  }
  object HelloJSOAuth1Def {
    
    @scala.inline
    def apply(version: String | Double): HelloJSOAuth1Def = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSOAuth1Def]
    }
    
    @scala.inline
    implicit class HelloJSOAuth1DefMutableBuilder[Self <: HelloJSOAuth1Def] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  @js.native
  trait HelloJSOAuth2Def extends HelloJSOAuthDef {
    
    var grant: js.UndefOr[String] = js.native
    
    var response_type: js.UndefOr[HelloJSTokenResponseType] = js.native
  }
  object HelloJSOAuth2Def {
    
    @scala.inline
    def apply(version: String | Double): HelloJSOAuth2Def = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSOAuth2Def]
    }
    
    @scala.inline
    implicit class HelloJSOAuth2DefMutableBuilder[Self <: HelloJSOAuth2Def] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrant(value: String): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantUndefined: Self = StObject.set(x, "grant", js.undefined)
      
      @scala.inline
      def setResponse_type(value: HelloJSTokenResponseType): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    }
  }
  
  @js.native
  trait HelloJSOAuthDef extends StObject {
    
    var auth: js.UndefOr[String] = js.native
    
    var version: String | Double = js.native
  }
  object HelloJSOAuthDef {
    
    @scala.inline
    def apply(version: String | Double): HelloJSOAuthDef = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSOAuthDef]
    }
    
    @scala.inline
    implicit class HelloJSOAuthDefMutableBuilder[Self <: HelloJSOAuthDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HelloJSPopupOptions extends StObject {
    
    var height: Double = js.native
    
    var resizable: Double = js.native
    
    var scrollbars: Double = js.native
    
    var width: Double = js.native
  }
  object HelloJSPopupOptions {
    
    @scala.inline
    def apply(height: Double, resizable: Double, scrollbars: Double, width: Double): HelloJSPopupOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], scrollbars = scrollbars.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSPopupOptions]
    }
    
    @scala.inline
    implicit class HelloJSPopupOptionsMutableBuilder[Self <: HelloJSPopupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizable(value: Double): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbars(value: Double): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type HelloJSResponseCallback = js.Function2[/* r */ js.Any, /* headers */ js.Any, Unit]
  
  @js.native
  trait HelloJSServiceDef extends StObject {
    
    var base: js.UndefOr[String] = js.native
    
    var del: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
    
    var form: js.UndefOr[(js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean] = js.native
    
    var get: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
    
    var jsonp: js.UndefOr[(js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean] = js.native
    
    var login: js.UndefOr[js.Function1[/* p */ js.Any, Unit]] = js.native
    
    var logout: js.UndefOr[(js.Function1[/* callback */ js.Function0[Unit | String], Unit]) | String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var oauth: HelloJSOAuth2Def | HelloJSOAuth1Def = js.native
    
    var patch: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
    
    var post: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
    
    var put: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
    
    var refresh: js.UndefOr[Boolean] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[StringDictionary[String]] = js.native
    
    var scope_delim: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[
        StringDictionary[js.Function3[/* r */ js.Any, /* headers */ js.Any, /* p */ js.Any, Unit]]
      ] = js.native
    
    var xhr: js.UndefOr[js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]] = js.native
  }
  object HelloJSServiceDef {
    
    @scala.inline
    def apply(oauth: HelloJSOAuth2Def | HelloJSOAuth1Def): HelloJSServiceDef = {
      val __obj = js.Dynamic.literal(oauth = oauth.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSServiceDef]
    }
    
    @scala.inline
    implicit class HelloJSServiceDefMutableBuilder[Self <: HelloJSServiceDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setDel(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      @scala.inline
      def setForm(value: (js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormFunction2(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = StObject.set(x, "form", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setGet(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setJsonp(value: (js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonpFunction2(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = StObject.set(x, "jsonp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      @scala.inline
      def setLogin(value: /* p */ js.Any => Unit): Self = StObject.set(x, "login", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
      
      @scala.inline
      def setLogout(value: (js.Function1[/* callback */ js.Function0[Unit | String], Unit]) | String): Self = StObject.set(x, "logout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoutFunction1(value: /* callback */ js.Function0[Unit | String] => Unit): Self = StObject.set(x, "logout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOauth(value: HelloJSOAuth2Def | HelloJSOAuth1Def): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setPost(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPut(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      @scala.inline
      def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setScope(value: StringDictionary[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScope_delim(value: String): Self = StObject.set(x, "scope_delim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope_delimUndefined: Self = StObject.set(x, "scope_delim", js.undefined)
      
      @scala.inline
      def setWrap(value: StringDictionary[js.Function3[/* r */ js.Any, /* headers */ js.Any, /* p */ js.Any, Unit]]): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
      @scala.inline
      def setXhr(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = StObject.set(x, "xhr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  @js.native
  trait HelloJSStatic extends HelloJSEvent {
    
    def apply(network: String): HelloJSStatic = js.native
    
    def api(): js.Thenable[_] = js.native
    def api(options: js.Object): js.Thenable[_] = js.native
    def api(
      path: js.UndefOr[scala.Nothing],
      method: js.UndefOr[scala.Nothing],
      data: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* json */ js.Any, Unit]
    ): js.Thenable[_] = js.native
    def api(path: js.UndefOr[scala.Nothing], method: js.UndefOr[scala.Nothing], data: js.Object): js.Thenable[_] = js.native
    def api(
      path: js.UndefOr[scala.Nothing],
      method: js.UndefOr[scala.Nothing],
      data: js.Object,
      callback: js.Function1[/* json */ js.Any, Unit]
    ): js.Thenable[_] = js.native
    def api(path: js.UndefOr[scala.Nothing], method: String): js.Thenable[_] = js.native
    def api(
      path: js.UndefOr[scala.Nothing],
      method: String,
      data: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* json */ js.Any, Unit]
    ): js.Thenable[_] = js.native
    def api(path: js.UndefOr[scala.Nothing], method: String, data: js.Object): js.Thenable[_] = js.native
    def api(
      path: js.UndefOr[scala.Nothing],
      method: String,
      data: js.Object,
      callback: js.Function1[/* json */ js.Any, Unit]
    ): js.Thenable[_] = js.native
    def api(
      path: js.UndefOr[String],
      query: js.UndefOr[js.Object],
      method: js.UndefOr[String],
      data: js.UndefOr[js.Object],
      timeout: js.UndefOr[Double],
      callback: js.UndefOr[js.Function1[/* json */ js.Any, Unit]]
    ): js.Thenable[_] = js.native
    def api(path: String): js.Thenable[_] = js.native
    def api(
      path: String,
      method: js.UndefOr[scala.Nothing],
      data: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* json */ js.Any, Unit]
    ): js.Thenable[_] = js.native
    def api(path: String, method: js.UndefOr[scala.Nothing], data: js.Object): js.Thenable[_] = js.native
    def api(
      path: String,
      method: js.UndefOr[scala.Nothing],
      data: js.Object,
      callback: js.Function1[/* json */ js.Any, Unit]
    ): js.Thenable[_] = js.native
    def api(path: String, method: String): js.Thenable[_] = js.native
    def api(
      path: String,
      method: String,
      data: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* json */ js.Any, Unit]
    ): js.Thenable[_] = js.native
    def api(path: String, method: String, data: js.Object): js.Thenable[_] = js.native
    def api(path: String, method: String, data: js.Object, callback: js.Function1[/* json */ js.Any, Unit]): js.Thenable[_] = js.native
    
    def getAuthResponse(): HelloJSAuthResponse = js.native
    def getAuthResponse(network: String): HelloJSAuthResponse = js.native
    
    def init(serviceAppIds: StringDictionary[HelloJSServiceDef | String]): Unit = js.native
    def init(serviceAppIds: StringDictionary[String], options: HelloJSLoginOptions): Unit = js.native
    
    def login(): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(
      network: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function0[Unit]
    ): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(network: js.UndefOr[scala.Nothing], options: HelloJSLoginOptions): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(network: js.UndefOr[scala.Nothing], options: HelloJSLoginOptions, callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(network: String): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(network: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(network: String, options: HelloJSLoginOptions): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(network: String, options: HelloJSLoginOptions, callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(options: HelloJSLoginOptions): js.Thenable[HelloJSLoginEventArguement] = js.native
    def login(options: HelloJSLoginOptions, callback: js.Function0[Unit]): js.Thenable[HelloJSLoginEventArguement] = js.native
    
    def logout(): js.Thenable[_] = js.native
    def logout(callback: js.Function0[Unit]): js.Thenable[_] = js.native
    def logout(
      network: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function0[Unit]
    ): js.Thenable[_] = js.native
    def logout(network: js.UndefOr[scala.Nothing], options: HelloJSLogoutOptions): js.Thenable[_] = js.native
    def logout(network: js.UndefOr[scala.Nothing], options: HelloJSLogoutOptions, callback: js.Function0[Unit]): js.Thenable[_] = js.native
    def logout(network: String): js.Thenable[_] = js.native
    def logout(network: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Thenable[_] = js.native
    def logout(network: String, options: HelloJSLogoutOptions): js.Thenable[_] = js.native
    def logout(network: String, options: HelloJSLogoutOptions, callback: js.Function0[Unit]): js.Thenable[_] = js.native
    def logout(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Thenable[_] = js.native
    def logout(options: HelloJSLogoutOptions): js.Thenable[_] = js.native
    def logout(options: HelloJSLogoutOptions, callback: js.Function0[Unit]): js.Thenable[_] = js.native
    
    var settings: HelloJSLoginOptions = js.native
    
    var utils: HelloJSUtils = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.hellojs.hellojsStrings.code
    - typingsSlinky.hellojs.hellojsStrings.`code id_token`
    - typingsSlinky.hellojs.hellojsStrings.`code id_token token`
    - typingsSlinky.hellojs.hellojsStrings.`code token`
    - typingsSlinky.hellojs.hellojsStrings.id_token
    - typingsSlinky.hellojs.hellojsStrings.`id_token token`
    - typingsSlinky.hellojs.hellojsStrings.none
    - typingsSlinky.hellojs.hellojsStrings.token
  */
  trait HelloJSTokenResponseType extends StObject
  object HelloJSTokenResponseType {
    
    @scala.inline
    def code: typingsSlinky.hellojs.hellojsStrings.code = "code".asInstanceOf[typingsSlinky.hellojs.hellojsStrings.code]
    
    @scala.inline
    def `code id_token`: typingsSlinky.hellojs.hellojsStrings.`code id_token` = ("code id_token").asInstanceOf[typingsSlinky.hellojs.hellojsStrings.`code id_token`]
    
    @scala.inline
    def `code id_token token`: typingsSlinky.hellojs.hellojsStrings.`code id_token token` = ("code id_token token").asInstanceOf[typingsSlinky.hellojs.hellojsStrings.`code id_token token`]
    
    @scala.inline
    def `code token`: typingsSlinky.hellojs.hellojsStrings.`code token` = ("code token").asInstanceOf[typingsSlinky.hellojs.hellojsStrings.`code token`]
    
    @scala.inline
    def id_token: typingsSlinky.hellojs.hellojsStrings.id_token = "id_token".asInstanceOf[typingsSlinky.hellojs.hellojsStrings.id_token]
    
    @scala.inline
    def `id_token token`: typingsSlinky.hellojs.hellojsStrings.`id_token token` = ("id_token token").asInstanceOf[typingsSlinky.hellojs.hellojsStrings.`id_token token`]
    
    @scala.inline
    def none: typingsSlinky.hellojs.hellojsStrings.none = "none".asInstanceOf[typingsSlinky.hellojs.hellojsStrings.none]
    
    @scala.inline
    def token: typingsSlinky.hellojs.hellojsStrings.token = "token".asInstanceOf[typingsSlinky.hellojs.hellojsStrings.token]
  }
  
  type HelloJSUrlMappingFunction = js.Function2[/* p */ js.Any, /* callback */ js.Function1[/* url */ String, Unit], Unit]
  
  // API utilities
  @js.native
  trait HelloJSUtils extends StObject {
    
    var Event: HelloJSEvent = js.native
    
    def append(node: String, attr: js.UndefOr[scala.Nothing], target: String): HTMLElement = js.native
    def append(node: String, attr: js.UndefOr[scala.Nothing], target: HTMLElement): HTMLElement = js.native
    def append(node: String, attr: js.Object, target: String): HTMLElement = js.native
    def append(node: String, attr: js.Object, target: HTMLElement): HTMLElement = js.native
    def append(node: String, attr: Null, target: String): HTMLElement = js.native
    def append(node: String, attr: Null, target: HTMLElement): HTMLElement = js.native
    def append(node: HTMLElement, attr: js.UndefOr[scala.Nothing], target: String): HTMLElement = js.native
    def append(node: HTMLElement, attr: js.UndefOr[scala.Nothing], target: HTMLElement): HTMLElement = js.native
    def append(node: HTMLElement, attr: js.Object, target: String): HTMLElement = js.native
    def append(node: HTMLElement, attr: js.Object, target: HTMLElement): HTMLElement = js.native
    def append(node: HTMLElement, attr: Null, target: String): HTMLElement = js.native
    def append(node: HTMLElement, attr: Null, target: HTMLElement): HTMLElement = js.native
    
    def args(o: js.Object, args: js.Object): js.Any | `false` = js.native
    
    def clone[T](obj: T): T = js.native
    
    def dataToJSON(p: js.Any): js.Any = js.native
    
    def diff(a: js.Array[_], b: js.Array[_]): js.Array[_] = js.native
    
    def diffKey(a: js.Array[_], b: js.Array[_]): js.Array[_] = js.native
    
    def domInstance(`type`: String, data: js.Any): Boolean = js.native
    
    def error(code: Double, message: String): Code = js.native
    
    def extend(r: js.Object, a: js.Any*): js.Any = js.native
    
    def globalEvent(callback: js.Function0[Unit]): String = js.native
    def globalEvent(callback: js.Function0[Unit], guid: String): String = js.native
    
    def hasBinary(data: js.Any): Boolean = js.native
    
    def iframe(src: String): Unit = js.native
    def iframe(src: String, redirectUri: String): Unit = js.native
    
    def isBinary(data: js.Any): Boolean = js.native
    
    def isEmpty(obj: js.Any): Boolean = js.native
    
    def jsonp(url: String, callback: js.Function0[Unit]): Unit = js.native
    def jsonp(url: String, callback: js.Function0[Unit], callbackID: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
    def jsonp(url: String, callback: js.Function0[Unit], callbackID: String): Unit = js.native
    def jsonp(url: String, callback: js.Function0[Unit], callbackID: String, timeout: Double): Unit = js.native
    
    def merge(a: js.Any*): js.Any = js.native
    
    def nodeListToJSON(nodelist: NodeList): js.Any = js.native
    
    def param(o: js.Object): String = js.native
    def param(o: js.Object, formatFunction: js.Function1[/* param */ js.Any, String]): String = js.native
    def param(s: String): js.Any = js.native
    def param(s: String, formatFunction: js.Function1[/* param */ String, _]): js.Any = js.native
    
    def popup(url: String): Window | js.Any = js.native
    def popup(url: String, redirectUri: js.UndefOr[scala.Nothing], options: js.Object): Window | js.Any = js.native
    def popup(url: String, redirectUri: String): Window | js.Any = js.native
    def popup(url: String, redirectUri: String, options: js.Object): Window | js.Any = js.native
    
    def post(url: String, data: js.Any, options: js.Object, callback: HelloJSResponseCallback): Unit = js.native
    def post(
      url: String,
      data: js.Any,
      options: js.Object,
      callback: HelloJSResponseCallback,
      callbackID: js.UndefOr[scala.Nothing],
      timeout: Double
    ): Unit = js.native
    def post(
      url: String,
      data: js.Any,
      options: js.Object,
      callback: HelloJSResponseCallback,
      callbackID: String
    ): Unit = js.native
    def post(
      url: String,
      data: js.Any,
      options: js.Object,
      callback: HelloJSResponseCallback,
      callbackID: String,
      timeout: Double
    ): Unit = js.native
    
    def qs(url: String): String = js.native
    def qs(
      url: String,
      params: js.UndefOr[scala.Nothing],
      formatFunction: js.Function1[/* param */ js.Any, String]
    ): String = js.native
    def qs(url: String, params: js.Object): String = js.native
    def qs(url: String, params: js.Object, formatFunction: js.Function1[/* param */ js.Any, String]): String = js.native
    
    def request(p: js.Object, callback: HelloJSResponseCallback): Unit = js.native
    
    def request_cors(callback: HelloJSResponseCallback): Boolean = js.native
    
    def responseHandler(window: Window): Unit = js.native
    def responseHandler(window: Window, parent: js.Any): Unit = js.native
    
    def store(): js.Any = js.native
    def store(name: js.UndefOr[scala.Nothing], value: js.Any): js.Any = js.native
    def store(name: String): js.Any = js.native
    def store(name: String, value: js.Any): js.Any = js.native
    
    def toBlob(dataURI: String): Blob | String = js.native
    
    def unique(a: js.Array[_]): js.Array[_] = js.native
    
    def url(): Location = js.native
    def url(path: String): URL | HTMLAnchorElement = js.native
    
    def xhr(method: String, url: String, headers: js.Object, data: js.Any, callback: HelloJSResponseCallback): XMLHttpRequest = js.native
  }
  
  type _To = HelloJSStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HelloJSStatic = ^
}
