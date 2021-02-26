package typingsSlinky.passportGoogleOauth20

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.passport.mod.AuthenticateOptions
import typingsSlinky.passportGoogleOauth20.passportGoogleOauth20Booleans.`false`
import typingsSlinky.passportGoogleOauth20.passportGoogleOauth20Booleans.`true`
import typingsSlinky.passportGoogleOauth20.passportGoogleOauth20Strings.google
import typingsSlinky.passportGoogleOauth20.passportGoogleOauth20Strings.offline
import typingsSlinky.passportGoogleOauth20.passportGoogleOauth20Strings.online
import typingsSlinky.passportOauth2.mod.OAuth2Strategy
import typingsSlinky.passportOauth2.mod.StateStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-google-oauth20", "Strategy")
  @js.native
  class Strategy protected () extends OAuth2Strategy {
    def this(
      options: StrategyOptionsWithRequest,
      verify: js.Function5[
            /* req */ Request_[ParamsDictionary, _, _, Query], 
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    def this(
      options: StrategyOptionsWithRequest,
      verify: js.Function6[
            /* req */ Request_[ParamsDictionary, _, _, Query], 
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* params */ js.Any, 
            /* profile */ Profile, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    def this(
      options: StrategyOptions,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    def this(
      options: StrategyOptions,
      verify: js.Function5[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* params */ js.Any, 
            /* profile */ Profile, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
  }
  
  @js.native
  trait AuthenticateOptionsGoogle extends AuthenticateOptions {
    
    var accessType: js.UndefOr[offline | online] = js.native
    
    var display: js.UndefOr[String] = js.native
    
    var hd: js.UndefOr[String] = js.native
    
    var hostedDomain: js.UndefOr[String] = js.native
    
    var includeGrantedScopes: js.UndefOr[Boolean] = js.native
    
    var loginHint: js.UndefOr[String] = js.native
    
    var openIDRealm: js.UndefOr[js.Any] = js.native
    
    var requestVisibleActions: js.UndefOr[js.Any] = js.native
  }
  object AuthenticateOptionsGoogle {
    
    @scala.inline
    def apply(): AuthenticateOptionsGoogle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptionsGoogle]
    }
    
    @scala.inline
    implicit class AuthenticateOptionsGoogleMutableBuilder[Self <: AuthenticateOptionsGoogle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessType(value: offline | online): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
      
      @scala.inline
      def setHostedDomain(value: String): Self = StObject.set(x, "hostedDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedDomainUndefined: Self = StObject.set(x, "hostedDomain", js.undefined)
      
      @scala.inline
      def setIncludeGrantedScopes(value: Boolean): Self = StObject.set(x, "includeGrantedScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGrantedScopesUndefined: Self = StObject.set(x, "includeGrantedScopes", js.undefined)
      
      @scala.inline
      def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      @scala.inline
      def setOpenIDRealm(value: js.Any): Self = StObject.set(x, "openIDRealm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIDRealmUndefined: Self = StObject.set(x, "openIDRealm", js.undefined)
      
      @scala.inline
      def setRequestVisibleActions(value: js.Any): Self = StObject.set(x, "requestVisibleActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestVisibleActionsUndefined: Self = StObject.set(x, "requestVisibleActions", js.undefined)
    }
  }
  
  /* Inlined std.Pick<passport-oauth2.passport-oauth2._StrategyOptionsBase, std.Exclude<keyof passport-oauth2.passport-oauth2._StrategyOptionsBase, 'authorizationURL' | 'tokenURL'>> */
  @js.native
  trait OAuth2StrategyOptionsWithoutRequiredURLs extends StObject {
    
    var callbackURL: js.UndefOr[String] = js.native
    
    var clientID: String = js.native
    
    var clientSecret: String = js.native
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var pkce: js.UndefOr[Boolean] = js.native
    
    var proxy: js.UndefOr[js.Any] = js.native
    
    var scope: js.UndefOr[String | js.Array[String]] = js.native
    
    var scopeSeparator: js.UndefOr[String] = js.native
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var skipUserProfile: js.UndefOr[js.Any] = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var store: js.UndefOr[StateStore] = js.native
  }
  object OAuth2StrategyOptionsWithoutRequiredURLs {
    
    @scala.inline
    def apply(clientID: String, clientSecret: String): OAuth2StrategyOptionsWithoutRequiredURLs = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2StrategyOptionsWithoutRequiredURLs]
    }
    
    @scala.inline
    implicit class OAuth2StrategyOptionsWithoutRequiredURLsMutableBuilder[Self <: OAuth2StrategyOptionsWithoutRequiredURLs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      @scala.inline
      def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      @scala.inline
      def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setSkipUserProfile(value: js.Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  @js.native
  trait Profile
    extends typingsSlinky.passport.mod.Profile {
    
    var _json: js.Any = js.native
    
    var _raw: String = js.native
    
    var profileUrl: String = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(_json: js.Any, _raw: String, displayName: String, id: String, profileUrl: String, provider: String): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrategyOptions extends StrategyOptionsBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.native
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(clientID: String, clientSecret: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  @js.native
  trait StrategyOptionsBase extends OAuth2StrategyOptionsWithoutRequiredURLs {
    
    var authorizationURL: js.UndefOr[String] = js.native
    
    var tokenURL: js.UndefOr[String] = js.native
    
    var userProfileURL: js.UndefOr[String] = js.native
  }
  object StrategyOptionsBase {
    
    @scala.inline
    def apply(clientID: String, clientSecret: String): StrategyOptionsBase = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsBase]
    }
    
    @scala.inline
    implicit class StrategyOptionsBaseMutableBuilder[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
      
      @scala.inline
      def setUserProfileURL(value: String): Self = StObject.set(x, "userProfileURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProfileURLUndefined: Self = StObject.set(x, "userProfileURL", js.undefined)
    }
  }
  
  @js.native
  trait StrategyOptionsWithRequest extends StrategyOptionsBase {
    
    var passReqToCallback: `true` = js.native
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(clientID: String, clientSecret: String, passReqToCallback: `true`): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[String | js.Error], 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    Unit
  ]
  
  // allow Google-specific options when using "google" strategy
  /* augmented module */
  object passportAugmentingMod {
    
    @js.native
    trait Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthorizeOptions] extends StObject {
      
      @JSName("authenticate")
      def authenticate_google(strategy: google, options: AuthenticateOptionsGoogle): AuthenticateRet = js.native
      @JSName("authenticate")
      def authenticate_google(
        strategy: google,
        options: AuthenticateOptionsGoogle,
        callback: js.Function1[/* repeated */ js.Any, _]
      ): AuthenticateRet = js.native
      
      @JSName("authorize")
      def authorize_google(strategy: google, options: AuthenticateOptionsGoogle): AuthorizeRet = js.native
      @JSName("authorize")
      def authorize_google(
        strategy: google,
        options: AuthenticateOptionsGoogle,
        callback: js.Function1[/* repeated */ js.Any, _]
      ): AuthorizeRet = js.native
    }
  }
}
