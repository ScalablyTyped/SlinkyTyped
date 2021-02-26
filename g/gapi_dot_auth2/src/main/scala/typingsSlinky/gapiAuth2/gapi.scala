package typingsSlinky.gapiAuth2

import typingsSlinky.gapiAuth2.anon.Code
import typingsSlinky.gapiAuth2.anon.Details
import typingsSlinky.gapiAuth2.gapiAuth2Strings.consent
import typingsSlinky.gapiAuth2.gapiAuth2Strings.popup
import typingsSlinky.gapiAuth2.gapiAuth2Strings.redirect
import typingsSlinky.gapiAuth2.gapiAuth2Strings.select_account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object auth2 {
    
    /**
      * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authresponse
      */
    @js.native
    trait AuthResponse extends StObject {
      
      var access_token: String = js.native
      
      var expires_at: Double = js.native
      
      var expires_in: Double = js.native
      
      var first_issued_at: Double = js.native
      
      var id_token: String = js.native
      
      var login_hint: String = js.native
      
      var scope: String = js.native
    }
    object AuthResponse {
      
      @scala.inline
      def apply(
        access_token: String,
        expires_at: Double,
        expires_in: Double,
        first_issued_at: Double,
        id_token: String,
        login_hint: String,
        scope: String
      ): AuthResponse = {
        val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], first_issued_at = first_issued_at.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], login_hint = login_hint.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuthResponse]
      }
      
      @scala.inline
      implicit class AuthResponseMutableBuilder[Self <: AuthResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirst_issued_at(value: Double): Self = StObject.set(x, "first_issued_at", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogin_hint(value: String): Self = StObject.set(x, "login_hint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeconfig
      */
    @js.native
    trait AuthorizeConfig extends StObject {
      
      var app_package_name: js.UndefOr[String] = js.native
      
      var client_id: String = js.native
      
      var cookie_policy: js.UndefOr[String] = js.native
      
      var hosted_domain: js.UndefOr[String] = js.native
      
      var include_granted_scopes: js.UndefOr[Boolean] = js.native
      
      var login_hint: js.UndefOr[String] = js.native
      
      var openid_realm: js.UndefOr[String] = js.native
      
      var prompt: js.UndefOr[String] = js.native
      
      var response_type: js.UndefOr[String] = js.native
      
      var scope: String = js.native
    }
    object AuthorizeConfig {
      
      @scala.inline
      def apply(client_id: String, scope: String): AuthorizeConfig = {
        val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuthorizeConfig]
      }
      
      @scala.inline
      implicit class AuthorizeConfigMutableBuilder[Self <: AuthorizeConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApp_package_name(value: String): Self = StObject.set(x, "app_package_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApp_package_nameUndefined: Self = StObject.set(x, "app_package_name", js.undefined)
        
        @scala.inline
        def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookie_policy(value: String): Self = StObject.set(x, "cookie_policy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookie_policyUndefined: Self = StObject.set(x, "cookie_policy", js.undefined)
        
        @scala.inline
        def setHosted_domain(value: String): Self = StObject.set(x, "hosted_domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHosted_domainUndefined: Self = StObject.set(x, "hosted_domain", js.undefined)
        
        @scala.inline
        def setInclude_granted_scopes(value: Boolean): Self = StObject.set(x, "include_granted_scopes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInclude_granted_scopesUndefined: Self = StObject.set(x, "include_granted_scopes", js.undefined)
        
        @scala.inline
        def setLogin_hint(value: String): Self = StObject.set(x, "login_hint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogin_hintUndefined: Self = StObject.set(x, "login_hint", js.undefined)
        
        @scala.inline
        def setOpenid_realm(value: String): Self = StObject.set(x, "openid_realm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenid_realmUndefined: Self = StObject.set(x, "openid_realm", js.undefined)
        
        @scala.inline
        def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
        
        @scala.inline
        def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeresponse
      */
    @js.native
    trait AuthorizeResponse extends StObject {
      
      var access_token: String = js.native
      
      var code: String = js.native
      
      var error: String = js.native
      
      var error_subtype: String = js.native
      
      var expires_at: Double = js.native
      
      var expires_in: Double = js.native
      
      var first_issued_at: Double = js.native
      
      var id_token: String = js.native
      
      var scope: String = js.native
    }
    object AuthorizeResponse {
      
      @scala.inline
      def apply(
        access_token: String,
        code: String,
        error: String,
        error_subtype: String,
        expires_at: Double,
        expires_in: Double,
        first_issued_at: Double,
        id_token: String,
        scope: String
      ): AuthorizeResponse = {
        val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], error_subtype = error_subtype.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], first_issued_at = first_issued_at.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuthorizeResponse]
      }
      
      @scala.inline
      implicit class AuthorizeResponseMutableBuilder[Self <: AuthorizeResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError_subtype(value: String): Self = StObject.set(x, "error_subtype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirst_issued_at(value: Double): Self = StObject.set(x, "first_issued_at", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait BasicProfile extends StObject {
      
      def getEmail(): String = js.native
      
      def getFamilyName(): String = js.native
      
      def getGivenName(): String = js.native
      
      def getId(): String = js.native
      
      def getImageUrl(): String = js.native
      
      def getName(): String = js.native
    }
    object BasicProfile {
      
      @scala.inline
      def apply(
        getEmail: () => String,
        getFamilyName: () => String,
        getGivenName: () => String,
        getId: () => String,
        getImageUrl: () => String,
        getName: () => String
      ): BasicProfile = {
        val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getFamilyName = js.Any.fromFunction0(getFamilyName), getGivenName = js.Any.fromFunction0(getGivenName), getId = js.Any.fromFunction0(getId), getImageUrl = js.Any.fromFunction0(getImageUrl), getName = js.Any.fromFunction0(getName))
        __obj.asInstanceOf[BasicProfile]
      }
      
      @scala.inline
      implicit class BasicProfileMutableBuilder[Self <: BasicProfile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetEmail(value: () => String): Self = StObject.set(x, "getEmail", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetFamilyName(value: () => String): Self = StObject.set(x, "getFamilyName", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetGivenName(value: () => String): Self = StObject.set(x, "getGivenName", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetImageUrl(value: () => String): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * Interface that represents the different configuration parameters for the gapi.auth2.init method.
      * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2clientconfig
      */
    @js.native
    trait ClientConfig extends StObject {
      
      /**
        * The app's client ID, found and created in the Google Developers Console.
        */
      var client_id: js.UndefOr[String] = js.native
      
      /**
        * The domains for which to create sign-in cookies. Either a URI, single_host_origin, or none.
        * Defaults to single_host_origin if unspecified.
        */
      var cookie_policy: js.UndefOr[String] = js.native
      
      /**
        * Fetch users' basic profile information when they sign in. Adds 'profile' and 'email' to the requested scopes. True if unspecified.
        */
      var fetch_basic_profile: js.UndefOr[Boolean] = js.native
      
      /**
        * The Google Apps domain to which users must belong to sign in. This is susceptible to modification by clients,
        * so be sure to verify the hosted domain property of the returned user. Use GoogleUser.getHostedDomain() on the client,
        * and the hd claim in the ID Token on the server to verify the domain is what you expected.
        */
      var hosted_domain: js.UndefOr[String] = js.native
      
      /**
        * Used only for OpenID 2.0 client migration. Set to the value of the realm that you are currently using for OpenID 2.0,
        * as described in <a href="https://developers.google.com/accounts/docs/OpenID#openid-connect">OpenID 2.0 (Migration)</a>.
        */
      var openid_realm: js.UndefOr[String] = js.native
      
      /**
        * If using ux_mode='redirect', this parameter allows you to override the default redirect_uri that will be used at the end of the consent flow.
        * The default redirect_uri is the current URL stripped of query parameters and hash fragment.
        */
      var redirect_uri: js.UndefOr[String] = js.native
      
      /**
        * The scopes to request, as a space-delimited string. Optional if fetch_basic_profile is not set to false.
        */
      var scope: js.UndefOr[String] = js.native
      
      /**
        * The UX mode to use for the sign-in flow.
        * By default, it will open the consent flow in a popup.
        */
      var ux_mode: js.UndefOr[popup | redirect] = js.native
    }
    object ClientConfig {
      
      @scala.inline
      def apply(): ClientConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClientConfig]
      }
      
      @scala.inline
      implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
        
        @scala.inline
        def setCookie_policy(value: String): Self = StObject.set(x, "cookie_policy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookie_policyUndefined: Self = StObject.set(x, "cookie_policy", js.undefined)
        
        @scala.inline
        def setFetch_basic_profile(value: Boolean): Self = StObject.set(x, "fetch_basic_profile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFetch_basic_profileUndefined: Self = StObject.set(x, "fetch_basic_profile", js.undefined)
        
        @scala.inline
        def setHosted_domain(value: String): Self = StObject.set(x, "hosted_domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHosted_domainUndefined: Self = StObject.set(x, "hosted_domain", js.undefined)
        
        @scala.inline
        def setOpenid_realm(value: String): Self = StObject.set(x, "openid_realm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenid_realmUndefined: Self = StObject.set(x, "openid_realm", js.undefined)
        
        @scala.inline
        def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        @scala.inline
        def setUx_mode(value: popup | redirect): Self = StObject.set(x, "ux_mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUx_modeUndefined: Self = StObject.set(x, "ux_mode", js.undefined)
      }
    }
    
    @js.native
    trait CurrentUser extends StObject {
      
      /**
        * Returns a GoogleUser object that represents the current user. Note that in a newly-initialized
        * GoogleAuth instance, the current user has not been set. Use the currentUser.listen() method or the
        * GoogleAuth.then() to get an initialized GoogleAuth instance.
        */
      def get(): GoogleUser = js.native
      
      /**
        * Listen for changes in currentUser.
        */
      def listen(listener: js.Function1[/* user */ GoogleUser, _]): Unit = js.native
    }
    object CurrentUser {
      
      @scala.inline
      def apply(get: () => GoogleUser, listen: js.Function1[/* user */ GoogleUser, _] => Unit): CurrentUser = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), listen = js.Any.fromFunction1(listen))
        __obj.asInstanceOf[CurrentUser]
      }
      
      @scala.inline
      implicit class CurrentUserMutableBuilder[Self <: CurrentUser] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: () => GoogleUser): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
        
        @scala.inline
        def setListen(value: js.Function1[/* user */ GoogleUser, _] => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * GoogleAuth is a singleton class that provides methods to allow the user to sign in with a Google account,
      * get the user's current sign-in status, get specific data from the user's Google profile,
      * request additional scopes, and sign out from the current account.
      */
    @js.native
    trait GoogleAuth extends StObject {
      
      /**
        * Attaches the sign-in flow to the specified container's click handler.
        */
      def attachClickHandler(
        container: js.Any,
        options: SigninOptions,
        onsuccess: js.Function1[/* googleUser */ GoogleUser, _],
        onfailure: js.Function1[/* reason */ String, _]
      ): js.Any = js.native
      
      var currentUser: CurrentUser = js.native
      
      /**
        * Revokes all of the scopes that the user granted.
        */
      def disconnect(): js.Any = js.native
      
      /**
        * Get permission from the user to access the specified scopes offline.
        */
      def grantOfflineAccess(): js.Promise[Code] = js.native
      def grantOfflineAccess(options: OfflineAccessOptions): js.Promise[Code] = js.native
      
      var isSignedIn: IsSignedIn = js.native
      
      /**
        * Signs in the user using the specified options.
        * If no option specified here, fallback to the options specified to gapi.auth2.init().
        */
      def signIn(): js.Promise[GoogleUser] = js.native
      def signIn(options: SigninOptions): js.Promise[GoogleUser] = js.native
      def signIn(options: SigninOptionsBuilder): js.Promise[GoogleUser] = js.native
      
      /**
        * Signs out all accounts from the application.
        */
      def signOut(): js.Any = js.native
      
      /**
        * Calls the onInit function when the GoogleAuth object is fully initialized, or calls the onFailure function if
        * initialization fails.
        */
      def `then`(onInit: js.Function1[/* googleAuth */ this.type, _]): js.Any = js.native
      def `then`(
        onInit: js.Function1[/* googleAuth */ this.type, _],
        onFailure: js.Function1[/* reason */ Details, _]
      ): js.Any = js.native
    }
    
    /**
      * A GoogleUser object represents one user account.
      */
    @js.native
    trait GoogleUser extends StObject {
      
      /**
        * Revokes all of the scopes that the user granted.
        */
      def disconnect(): Unit = js.native
      
      /**
        * Get the response object from the user's auth session.
        */
      def getAuthResponse(): AuthResponse = js.native
      def getAuthResponse(includeAuthorizationData: Boolean): AuthResponse = js.native
      
      /**
        * Get the user's basic profile information.
        */
      def getBasicProfile(): BasicProfile = js.native
      
      /**
        * Get the scopes that the user granted as a space-delimited string.
        */
      def getGrantedScopes(): String = js.native
      
      /**
        * Get the user's Google Apps domain if the user signed in with a Google Apps account.
        */
      def getHostedDomain(): String = js.native
      
      /**
        * Get the user's unique ID string.
        */
      def getId(): String = js.native
      
      /**
        * See GoogleUser.signIn()
        */
      def grant(): js.Any = js.native
      def grant(options: SigninOptions): js.Any = js.native
      def grant(options: SigninOptionsBuilder): js.Any = js.native
      
      /**
        * Get permission from the user to access the specified scopes offline.
        * When you use GoogleUser.grantOfflineAccess(), the sign-in flow skips the account chooser step.
        * See GoogleUser.grantOfflineAccess().
        */
      def grantOfflineAccess(scopes: String): Unit = js.native
      
      /**
        * Returns true if the user granted the specified scopes.
        */
      def hasGrantedScopes(scopes: String): Boolean = js.native
      
      /**
        * Returns true if the user is signed in.
        */
      def isSignedIn(): Boolean = js.native
      
      /**
        * Forces a refresh of the access token, and then returns a Promise for the new AuthResponse.
        */
      def reloadAuthResponse(): js.Promise[AuthResponse] = js.native
      
      /**
        * Signs in the user. Use this method to request additional scopes for incremental
        * authorization or to sign in a user after the user has signed out.
        * When you use GoogleUser.signIn(), the sign-in flow skips the account chooser step.
        * See GoogleAuth.signIn().
        */
      def signIn(): js.Any = js.native
      def signIn(options: SigninOptions): js.Any = js.native
      def signIn(options: SigninOptionsBuilder): js.Any = js.native
    }
    
    @js.native
    trait IsSignedIn extends StObject {
      
      /**
        * Returns whether the current user is currently signed in.
        */
      def get(): Boolean = js.native
      
      /**
        * Listen for changes in the current user's sign-in state.
        */
      def listen(listener: js.Function1[/* signedIn */ Boolean, _]): Unit = js.native
    }
    object IsSignedIn {
      
      @scala.inline
      def apply(get: () => Boolean, listen: js.Function1[/* signedIn */ Boolean, _] => Unit): IsSignedIn = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), listen = js.Any.fromFunction1(listen))
        __obj.asInstanceOf[IsSignedIn]
      }
      
      @scala.inline
      implicit class IsSignedInMutableBuilder[Self <: IsSignedIn] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: () => Boolean): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
        
        @scala.inline
        def setListen(value: js.Function1[/* signedIn */ Boolean, _] => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Definitions by: John <https://github.com/jhcao23>
      * Interface that represents the different configuration parameters for the GoogleAuth.grantOfflineAccess(options) method.
      * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2offlineaccessoptions
      */
    @js.native
    trait OfflineAccessOptions extends StObject {
      
      var app_package_name: js.UndefOr[String] = js.native
      
      var prompt: js.UndefOr[select_account | consent] = js.native
      
      var scope: js.UndefOr[String] = js.native
    }
    object OfflineAccessOptions {
      
      @scala.inline
      def apply(): OfflineAccessOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OfflineAccessOptions]
      }
      
      @scala.inline
      implicit class OfflineAccessOptionsMutableBuilder[Self <: OfflineAccessOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApp_package_name(value: String): Self = StObject.set(x, "app_package_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApp_package_nameUndefined: Self = StObject.set(x, "app_package_name", js.undefined)
        
        @scala.inline
        def setPrompt(value: select_account | consent): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      }
    }
    
    @js.native
    trait SigninOptions extends StObject {
      
      /**
        * The package name of the Android app to install over the air.
        * See Android app installs from your web site:
        * https://developers.google.com/identity/sign-in/web/android-app-installs
        */
      var app_package_name: js.UndefOr[String] = js.native
      
      /**
        *     Fetch users' basic profile information when they sign in.
        *     Adds 'profile', 'email' and 'openid' to the requested scopes.
        *     True if unspecified.
        */
      var fetch_basic_profile: js.UndefOr[Boolean] = js.native
      
      /**
        * When your app knows which user it is trying to authenticate, it can provide this parameter as a hint to the authentication server.
        * Passing this hint suppresses the account chooser and either pre-fill the email box on the sign-in form, or select the proper session (if the user is using multiple sign-in),
        * which can help you avoid problems that occur if your app logs in the wrong user account. The value can be either an email address or the sub string,
        * which is equivalent to the user's Google ID.
        * https://developers.google.com/identity/protocols/OpenIDConnect?hl=en#authenticationuriparameters
        */
      var login_hint: js.UndefOr[String] = js.native
      
      /**
        * Specifies whether to prompt the user for re-authentication.
        * See OpenID Connect Request Parameters:
        * https://openid.net/specs/openid-connect-basic-1_0.html#RequestParameters
        */
      var prompt: js.UndefOr[String] = js.native
      
      /**
        * If using ux_mode='redirect', this parameter allows you to override the default redirect_uri that will be used at the end of the consent flow.
        * The default redirect_uri is the current URL stripped of query parameters and hash fragment.
        */
      var redirect_uri: js.UndefOr[String] = js.native
      
      /**
        * The scopes to request, as a space-delimited string.
        * Optional if fetch_basic_profile is not set to false.
        */
      var scope: js.UndefOr[String] = js.native
      
      /**
        * The UX mode to use for the sign-in flow.
        * By default, it will open the consent flow in a popup.
        */
      var ux_mode: js.UndefOr[popup | redirect] = js.native
    }
    object SigninOptions {
      
      @scala.inline
      def apply(): SigninOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SigninOptions]
      }
      
      @scala.inline
      implicit class SigninOptionsMutableBuilder[Self <: SigninOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApp_package_name(value: String): Self = StObject.set(x, "app_package_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApp_package_nameUndefined: Self = StObject.set(x, "app_package_name", js.undefined)
        
        @scala.inline
        def setFetch_basic_profile(value: Boolean): Self = StObject.set(x, "fetch_basic_profile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFetch_basic_profileUndefined: Self = StObject.set(x, "fetch_basic_profile", js.undefined)
        
        @scala.inline
        def setLogin_hint(value: String): Self = StObject.set(x, "login_hint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogin_hintUndefined: Self = StObject.set(x, "login_hint", js.undefined)
        
        @scala.inline
        def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
        
        @scala.inline
        def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        @scala.inline
        def setUx_mode(value: popup | redirect): Self = StObject.set(x, "ux_mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUx_modeUndefined: Self = StObject.set(x, "ux_mode", js.undefined)
      }
    }
    
    @js.native
    trait SigninOptionsBuilder extends StObject {
      
      def setAppPackageName(name: String): js.Any = js.native
      
      def setFetchBasicProfile(fetch: Boolean): js.Any = js.native
      
      def setLoginHint(hint: String): js.Any = js.native
      
      def setPrompt(prompt: String): js.Any = js.native
      
      def setScope(scope: String): js.Any = js.native
    }
    object SigninOptionsBuilder {
      
      @scala.inline
      def apply(
        setAppPackageName: String => js.Any,
        setFetchBasicProfile: Boolean => js.Any,
        setLoginHint: String => js.Any,
        setPrompt: String => js.Any,
        setScope: String => js.Any
      ): SigninOptionsBuilder = {
        val __obj = js.Dynamic.literal(setAppPackageName = js.Any.fromFunction1(setAppPackageName), setFetchBasicProfile = js.Any.fromFunction1(setFetchBasicProfile), setLoginHint = js.Any.fromFunction1(setLoginHint), setPrompt = js.Any.fromFunction1(setPrompt), setScope = js.Any.fromFunction1(setScope))
        __obj.asInstanceOf[SigninOptionsBuilder]
      }
      
      @scala.inline
      implicit class SigninOptionsBuilderMutableBuilder[Self <: SigninOptionsBuilder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetAppPackageName(value: String => js.Any): Self = StObject.set(x, "setAppPackageName", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetFetchBasicProfile(value: Boolean => js.Any): Self = StObject.set(x, "setFetchBasicProfile", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetLoginHint(value: String => js.Any): Self = StObject.set(x, "setLoginHint", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetPrompt(value: String => js.Any): Self = StObject.set(x, "setPrompt", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetScope(value: String => js.Any): Self = StObject.set(x, "setScope", js.Any.fromFunction1(value))
      }
    }
  }
}
