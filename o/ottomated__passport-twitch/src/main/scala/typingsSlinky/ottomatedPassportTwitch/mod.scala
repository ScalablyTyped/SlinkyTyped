package typingsSlinky.ottomatedPassportTwitch

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.ottomatedPassportTwitch.ottomatedPassportTwitchBooleans.`false`
import typingsSlinky.ottomatedPassportTwitch.ottomatedPassportTwitchBooleans.`true`
import typingsSlinky.passportOauth2.mod.OAuth2Strategy
import typingsSlinky.passportOauth2.mod.StateStore
import typingsSlinky.passportOauth2.mod.VerifyCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ottomated/passport-twitch", JSImport.Namespace)
  @js.native
  class ^ protected () extends Strategy {
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify twitch.StrategyOptions */ js.Any,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify twitch.Profile */ /* profile */ js.Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    // NOTE: A union of function types prevents contextual typing of arguments.
    // tslint:disable-next-line:unified-signatures
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify twitch.StrategyOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify twitch.StrategyOptionsWithRequest */ js.Any,
      verify: js.Function5[
            (/* req */ Request_[ParamsDictionary, _, _, Query]) | (/* accessToken */ String), 
            /* refreshToken */ /* accessToken */ String, 
            (/* params */ js.Any) | (/* refreshToken */ String), 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify twitch.Profile */ /* profile */ js.Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
    // NOTE: A union of function types prevents contextual typing of arguments.
    // tslint:disable-next-line:unified-signatures max-line-length
    def this(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify twitch.StrategyOptionsWithRequest */ js.Any,
      verify: js.Function6[
            /* req */ Request_[ParamsDictionary, _, _, Query], 
            /* accessToken */ String, 
            /* params */ js.Any, 
            /* refreshToken */ String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify twitch.Profile */ /* profile */ js.Any, 
            /* done */ VerifyCallback, 
            Unit
          ]
    ) = this()
  }
  
  @js.native
  trait Profile
    extends typingsSlinky.passport.mod.Profile {
    
    var _json: js.Object = js.native
    
    var _raw: String = js.native
    
    var profileImageUrl: String = js.native
    
    var userName: String = js.native
    
    var viewCount: Double = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(
      _json: js.Object,
      _raw: String,
      displayName: String,
      id: String,
      profileImageUrl: String,
      provider: String,
      userName: String,
      viewCount: Double
    ): Profile = {
      val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], profileImageUrl = profileImageUrl.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfileImageUrl(value: String): Self = StObject.set(x, "profileImageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewCount(value: Double): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_json(value: js.Object): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Strategy extends OAuth2Strategy {
    
    def checkScope(
      scope: String,
      accessToken: String,
      cb: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* value */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
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
  trait StrategyOptionsBase extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.native
    
    var callbackURL: js.UndefOr[String] = js.native
    
    var clientID: String = js.native
    
    var clientSecret: String = js.native
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var scope: js.UndefOr[String | js.Array[String]] = js.native
    
    var scopeSeparator: js.UndefOr[String] = js.native
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var store: js.UndefOr[StateStore] = js.native
    
    var tokenURL: js.UndefOr[String] = js.native
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
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
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
}
