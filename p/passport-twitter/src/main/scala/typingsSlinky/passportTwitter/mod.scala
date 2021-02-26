package typingsSlinky.passportTwitter

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passportTwitter.passportTwitterBooleans.`false`
import typingsSlinky.passportTwitter.passportTwitterBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-twitter", "Strategy")
  @js.native
  class Strategy protected ()
    extends typingsSlinky.passport.mod.Strategy {
    def this(
      options: IStrategyOptionWithRequest,
      verify: js.Function5[
            /* req */ Request_[ParamsDictionary, _, _, Query], 
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
            Unit
          ]
    ) = this()
    def this(
      options: IStrategyOption,
      verify: js.Function4[
            /* accessToken */ String, 
            /* refreshToken */ String, 
            /* profile */ Profile, 
            /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
            Unit
          ]
    ) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  }
  
  @js.native
  trait IStrategyOption extends IStrategyOptionBase {
    
    var passReqToCallback: js.UndefOr[`false`] = js.native
  }
  object IStrategyOption {
    
    @scala.inline
    def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IStrategyOption = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStrategyOption]
    }
    
    @scala.inline
    implicit class IStrategyOptionMutableBuilder[Self <: IStrategyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
    }
  }
  
  @js.native
  trait IStrategyOptionBase extends StObject {
    
    var accessTokenURL: js.UndefOr[String] = js.native
    
    var callbackURL: String = js.native
    
    var consumerKey: String = js.native
    
    var consumerSecret: String = js.native
    
    var forceLogin: js.UndefOr[Boolean] = js.native
    
    var includeEmail: js.UndefOr[Boolean] = js.native
    
    var includeEntities: js.UndefOr[Boolean] = js.native
    
    var includeStatus: js.UndefOr[Boolean] = js.native
    
    var requestTokenURL: js.UndefOr[String] = js.native
    
    var screenName: js.UndefOr[String] = js.native
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var skipExtendedUserProfile: js.UndefOr[Boolean] = js.native
    
    var userAuthorizationURL: js.UndefOr[String] = js.native
    
    var userProfileURL: js.UndefOr[String] = js.native
  }
  object IStrategyOptionBase {
    
    @scala.inline
    def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IStrategyOptionBase = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStrategyOptionBase]
    }
    
    @scala.inline
    implicit class IStrategyOptionBaseMutableBuilder[Self <: IStrategyOptionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessTokenURL(value: String): Self = StObject.set(x, "accessTokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenURLUndefined: Self = StObject.set(x, "accessTokenURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceLogin(value: Boolean): Self = StObject.set(x, "forceLogin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceLoginUndefined: Self = StObject.set(x, "forceLogin", js.undefined)
      
      @scala.inline
      def setIncludeEmail(value: Boolean): Self = StObject.set(x, "includeEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeEmailUndefined: Self = StObject.set(x, "includeEmail", js.undefined)
      
      @scala.inline
      def setIncludeEntities(value: Boolean): Self = StObject.set(x, "includeEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeEntitiesUndefined: Self = StObject.set(x, "includeEntities", js.undefined)
      
      @scala.inline
      def setIncludeStatus(value: Boolean): Self = StObject.set(x, "includeStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeStatusUndefined: Self = StObject.set(x, "includeStatus", js.undefined)
      
      @scala.inline
      def setRequestTokenURL(value: String): Self = StObject.set(x, "requestTokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTokenURLUndefined: Self = StObject.set(x, "requestTokenURL", js.undefined)
      
      @scala.inline
      def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setSkipExtendedUserProfile(value: Boolean): Self = StObject.set(x, "skipExtendedUserProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipExtendedUserProfileUndefined: Self = StObject.set(x, "skipExtendedUserProfile", js.undefined)
      
      @scala.inline
      def setUserAuthorizationURL(value: String): Self = StObject.set(x, "userAuthorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAuthorizationURLUndefined: Self = StObject.set(x, "userAuthorizationURL", js.undefined)
      
      @scala.inline
      def setUserProfileURL(value: String): Self = StObject.set(x, "userProfileURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProfileURLUndefined: Self = StObject.set(x, "userProfileURL", js.undefined)
    }
  }
  
  @js.native
  trait IStrategyOptionWithRequest extends IStrategyOptionBase {
    
    var passReqToCallback: `true` = js.native
  }
  object IStrategyOptionWithRequest {
    
    @scala.inline
    def apply(callbackURL: String, consumerKey: String, consumerSecret: String, passReqToCallback: `true`): IStrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit class IStrategyOptionWithRequestMutableBuilder[Self <: IStrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Profile
    extends typingsSlinky.passport.mod.Profile {
    
    var _accessLevel: String = js.native
    
    var _json: js.Any = js.native
    
    var _raw: String = js.native
    
    var gender: String = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(
      _accessLevel: String,
      _json: js.Any,
      _raw: String,
      displayName: String,
      gender: String,
      id: String,
      provider: String
    ): Profile = {
      val __obj = js.Dynamic.literal(_accessLevel = _accessLevel.asInstanceOf[js.Any], _json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_accessLevel(value: String): Self = StObject.set(x, "_accessLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_json(value: js.Any): Self = StObject.set(x, "_json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
}
