package typingsSlinky.bell

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.bell.anon.ExtendedProfile
import typingsSlinky.bell.anon.Uri
import typingsSlinky.bell.bellBooleans.`false`
import typingsSlinky.bell.bellStrings.`HMAC-SHA1`
import typingsSlinky.bell.bellStrings.`RSA-SHA1`
import typingsSlinky.bell.bellStrings.`try`
import typingsSlinky.bell.bellStrings.custom
import typingsSlinky.bell.bellStrings.oauth
import typingsSlinky.bell.bellStrings.oauth2
import typingsSlinky.bell.bellStrings.optional
import typingsSlinky.bell.bellStrings.required
import typingsSlinky.hapi.mod.AuthCredentials
import typingsSlinky.hapi.mod.Plugin
import typingsSlinky.hapi.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bell", "plugin")
  @js.native
  val plugin: Plugin[BellOptions] = js.native
  
  @JSImport("bell", "simulate")
  @js.native
  def simulate(credentialsFunc: RequestPassThrough): Unit = js.native
  @JSImport("bell", "simulate")
  @js.native
  def simulate_false(state: `false`): Unit = js.native
  
  type AuthedRequest = js.Function2[
    /* uri */ String, 
    /* params */ js.UndefOr[StringDictionary[String]], 
    js.Promise[js.Object]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bell.mod.CustomProviderOptions
    - typingsSlinky.bell.mod.KnownProviderOptions
  */
  trait BellOptions extends StObject
  object BellOptions {
    
    @scala.inline
    def CustomProviderOptions(
      clientId: String,
      clientSecret: String,
      password: String,
      provider: CustomProtocol1 | CustomProtocol2
    ): typingsSlinky.bell.mod.CustomProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.bell.mod.CustomProviderOptions]
    }
    
    @scala.inline
    def KnownProviderOptions(clientId: String, clientSecret: String, password: String, provider: Provider): typingsSlinky.bell.mod.KnownProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.bell.mod.KnownProviderOptions]
    }
  }
  
  @js.native
  trait Credentials extends StObject {
    
    /**
      * Varying data depending on provider.
      */
    var profile: js.UndefOr[js.Object] = js.native
    
    var provider: Provider | custom = js.native
    
    var query: StringLikeMap = js.native
    
    var token: String = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(provider: Provider | custom, query: StringLikeMap, token: String): Credentials = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfile(value: js.Object): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setProvider(value: Provider | custom): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: StringLikeMap): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Credentials1 extends Credentials {
    
    var secret: String = js.native
  }
  object Credentials1 {
    
    @scala.inline
    def apply(provider: Provider | custom, query: StringLikeMap, secret: String, token: String): Credentials1 = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials1]
    }
    
    @scala.inline
    implicit class Credentials1MutableBuilder[Self <: Credentials1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Credentials2 extends Credentials {
    
    var expiresIn: js.UndefOr[Double] = js.native
    
    var refreshToken: js.UndefOr[String] = js.native
  }
  object Credentials2 {
    
    @scala.inline
    def apply(provider: Provider | custom, query: StringLikeMap, token: String): Credentials2 = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials2]
    }
    
    @scala.inline
    implicit class Credentials2MutableBuilder[Self <: Credentials2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    }
  }
  
  @js.native
  trait CustomProtocol extends StObject {
    
    /**
      * the authorization endpoint URI.
      */
    var auth: String = js.native
    
    /**
      * a headers object with additional headers required by the provider
      * (e.g. GitHub required the 'User-Agent' header which is set by default).
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The name of the protocol.
      * @default custom
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * the access token endpoint URI.
      */
    var token: String = js.native
  }
  object CustomProtocol {
    
    @scala.inline
    def apply(auth: String, token: String): CustomProtocol = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProtocol]
    }
    
    @scala.inline
    implicit class CustomProtocolMutableBuilder[Self <: CustomProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomProtocol1 extends CustomProtocol {
    
    def profile(credentials: Credentials1, params: StringDictionary[String], get: AuthedRequest): js.Promise[Unit] = js.native
    @JSName("profile")
    var profile_Original: ProfileGetter[Credentials1] = js.native
    
    /**
      * the authorization protocol used.
      */
    var protocol: oauth = js.native
    
    /**
      * the OAuth signature method. Must be one of:
      * * 'HMAC-SHA1' - default
      * * 'RSA-SHA1' - in that case, the clientSecret is your RSA private key
      */
    var signatureMethod: js.UndefOr[`HMAC-SHA1` | `RSA-SHA1`] = js.native
    
    /**
      * the temporary credentials (request token) endpoint).
      */
    var temporary: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait CustomProtocol2 extends CustomProtocol {
    
    def profile(credentials: Credentials2, params: StringDictionary[String], get: AuthedRequest): js.Promise[Unit] = js.native
    @JSName("profile")
    var profile_Original: ProfileGetter[Credentials2] = js.native
    
    /**
      * the authorization protocol used.
      */
    var protocol: oauth2 = js.native
    
    /**
      * an array of scope strings.
      */
    var scope: js.UndefOr[js.Array[String] | (js.Function1[/* query */ StringLikeMap, js.Array[String]])] = js.native
    
    /**
      * the scope separator character. Only required when a provider has a broken OAuth 2.0 implementation. Defaults to space (Facebook and GitHub default to comma).
      */
    var scopeSeparator: js.UndefOr[String] = js.native
    
    /**
      * boolean that determines if OAuth client id and client secret will be sent
      * as parameters as opposed to an Authorization header.
      * Defaults to false.
      */
    var useParamsAuth: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait CustomProviderOptions
    extends RequiredProviderOptions
       with OptionalOptions
       with BellOptions {
    
    var provider: CustomProtocol1 | CustomProtocol2 = js.native
  }
  object CustomProviderOptions {
    
    @scala.inline
    def apply(
      clientId: String,
      clientSecret: String,
      password: String,
      provider: CustomProtocol1 | CustomProtocol2
    ): CustomProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProviderOptions]
    }
    
    @scala.inline
    implicit class CustomProviderOptionsMutableBuilder[Self <: CustomProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: CustomProtocol1 | CustomProtocol2): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KnownProviderOptions
    extends RequiredProviderOptions
       with OptionalOptions
       with BellOptions {
    
    var provider: Provider = js.native
  }
  object KnownProviderOptions {
    
    @scala.inline
    def apply(clientId: String, clientSecret: String, password: String, provider: Provider): KnownProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[KnownProviderOptions]
    }
    
    @scala.inline
    implicit class KnownProviderOptionsMutableBuilder[Self <: KnownProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionalOptions extends StObject {
    
    /**
      * allows passing query parameters from a bell protected endpoint to the auth request.
      * It will merge the query params you pass along with the providerParams and any other predefined ones.
      * Be aware that this will override predefined query parameters!
      * Default to false.
      */
    var allowRuntimeProviderParams: js.UndefOr[StringLikeMap | Boolean] = js.native
    
    /**
      * a configuration object used to customize the provider settings.
      * The built-in 'twitter' provider accepts the `extendedProfile` & `getMethod` options.
      * option which allows disabling the extra profile request when the provider
      * returns the user information in the callback (defaults to true).
      * The built-in 'github' and 'phabricator' providers accept the uri
      * option which allows pointing to a private enterprise installation (e.g. 'https://vpn.example.com').
      * See Providers documentation for more information.
      */
    var config: js.UndefOr[ExtendedProfile | Uri] = js.native
    
    /**
      * the name of the cookie used to manage the temporary state.
      * Defaults to 'bell-provider' where 'provider' is the provider name (or 'custom' for custom providers).
      * For example, the Twitter cookie name defaults to 'bell-twitter'.
      */
    var cookie: js.UndefOr[String] = js.native
    
    /**
      * the domain scope.
      * Defaults to null (no domain).
      */
    var domain: js.UndefOr[String] = js.native
    
    // THESE ARE IN THE *REQUIRED* section but are actually not...
    /**
      * A boolean indicating whether or not you want the redirect_uri to be forced to https.
      * Useful if your hapi application runs as http, but is accessed through https.
      */
    var forceHttps: js.UndefOr[Boolean] = js.native
    
    /**
      * sets the cookie HTTP only flag.
      * Defaults to true.
      */
    var isHttpOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * sets the cookie secure flag.
      * Defaults to true.
      */
    var isSecure: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the base redirect_uri manually if it cannot be inferred properly from server settings.
      * Useful to override port, protocol, and host if proxied or forwarded.
      */
    var location: js.UndefOr[String | (js.Function1[/* req */ Request, String])] = js.native
    
    /**
      * an object of key-value pairs that specify additional
      * URL query parameters to send with the profile request to the provider.
      * The built-in facebook provider,
      * for example, could have fields specified to determine the fields returned from the user's graph,
      * which would then be available to you in the auth.credentials.profile.raw object.
      */
    var profileParams: js.UndefOr[StringLikeMap] = js.native
    
    /**
      * provider-specific query parameters for the authentication endpoint.
      * It may be passed either as an object to merge into the query string,
      * or a function which takes the client's request and returns an object.
      * Each provider supports its own set of parameters which customize the user's login experience.
      * For example:
      * * Facebook supports `display` ('page', 'popup', or 'touch'), `auth_type`, `auth_nonce`.
      * * Google supports `access_type`, `approval_prompt`, `prompt`, `login_hint`, `user_id`, `hd`.
      * * Twitter supports `force_login`, `screen_name`.
      * * Linkedin supports `fields`.
      */
    var providerParams: js.UndefOr[StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])] = js.native
    
    /**
      * allows passing additional OAuth state from initial request.
      * This must be a function returning a string,
      * which will be appended to the bell internal state parameter for OAuth code flow.
      */
    var runtimeStateCallback: js.UndefOr[js.Function1[/* req */ Request, String]] = js.native
    
    /**
      * Each built-in vendor comes with the required scope for basic profile information.
      * Use scope to specify a different scope as required by your application.
      * It may be passed either as an object to merge into the query string,
      * or a function which takes the client's request and returns an object.
      * Consult the provider for their specific supported scopes.
      */
    var scope: js.UndefOr[js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])] = js.native
    
    /**
      * skips obtaining a user profile from the provider.
      * Useful if you need specific scopes,
      * but not the user profile.
      * Defaults to false.
      */
    var skipProfile: js.UndefOr[Boolean] = js.native
    
    /**
      * cookie time-to-live in milliseconds.
      * Defaults to null (session time-life - cookies are deleted when the browser is closed).
      */
    var ttl: js.UndefOr[Double] = js.native
  }
  object OptionalOptions {
    
    @scala.inline
    def apply(): OptionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalOptions]
    }
    
    @scala.inline
    implicit class OptionalOptionsMutableBuilder[Self <: OptionalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowRuntimeProviderParams(value: StringLikeMap | Boolean): Self = StObject.set(x, "allowRuntimeProviderParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRuntimeProviderParamsUndefined: Self = StObject.set(x, "allowRuntimeProviderParams", js.undefined)
      
      @scala.inline
      def setConfig(value: ExtendedProfile | Uri): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
      
      @scala.inline
      def setIsHttpOnly(value: Boolean): Self = StObject.set(x, "isHttpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHttpOnlyUndefined: Self = StObject.set(x, "isHttpOnly", js.undefined)
      
      @scala.inline
      def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
      
      @scala.inline
      def setLocation(value: String | (js.Function1[/* req */ Request, String])): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationFunction1(value: /* req */ Request => String): Self = StObject.set(x, "location", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setProfileParams(value: StringLikeMap): Self = StObject.set(x, "profileParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileParamsUndefined: Self = StObject.set(x, "profileParams", js.undefined)
      
      @scala.inline
      def setProviderParams(value: StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])): Self = StObject.set(x, "providerParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderParamsFunction1(value: /* request */ Request => StringLikeMap): Self = StObject.set(x, "providerParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProviderParamsUndefined: Self = StObject.set(x, "providerParams", js.undefined)
      
      @scala.inline
      def setRuntimeStateCallback(value: /* req */ Request => String): Self = StObject.set(x, "runtimeStateCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRuntimeStateCallbackUndefined: Self = StObject.set(x, "runtimeStateCallback", js.undefined)
      
      @scala.inline
      def setScope(value: js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeFunction1(value: /* request */ Request => js.Array[String]): Self = StObject.set(x, "scope", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSkipProfile(value: Boolean): Self = StObject.set(x, "skipProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipProfileUndefined: Self = StObject.set(x, "skipProfile", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  type ProfileGetter[C /* <: Credentials */] = js.ThisFunction3[
    /* this */ CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ StringDictionary[String], 
    /* get */ AuthedRequest, 
    js.Promise[Unit]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bell.bellStrings.arcgisonline
    - typingsSlinky.bell.bellStrings.auth0
    - typingsSlinky.bell.bellStrings.azuread
    - typingsSlinky.bell.bellStrings.bitbucket
    - typingsSlinky.bell.bellStrings.digitalocean
    - typingsSlinky.bell.bellStrings.discord
    - typingsSlinky.bell.bellStrings.dropbox
    - typingsSlinky.bell.bellStrings.dropboxV2
    - typingsSlinky.bell.bellStrings.facebook
    - typingsSlinky.bell.bellStrings.fitbit
    - typingsSlinky.bell.bellStrings.foursquare
    - typingsSlinky.bell.bellStrings.github
    - typingsSlinky.bell.bellStrings.gitlab
    - typingsSlinky.bell.bellStrings.google
    - typingsSlinky.bell.bellStrings.googleplus
    - typingsSlinky.bell.bellStrings.instagram
    - typingsSlinky.bell.bellStrings.linkedin
    - typingsSlinky.bell.bellStrings.live
    - typingsSlinky.bell.bellStrings.medium
    - typingsSlinky.bell.bellStrings.meetup
    - typingsSlinky.bell.bellStrings.mixer
    - typingsSlinky.bell.bellStrings.nest
    - typingsSlinky.bell.bellStrings.office365
    - typingsSlinky.bell.bellStrings.okta
    - typingsSlinky.bell.bellStrings.phabricator
    - typingsSlinky.bell.bellStrings.pingfed
    - typingsSlinky.bell.bellStrings.pinterest
    - typingsSlinky.bell.bellStrings.reddit
    - typingsSlinky.bell.bellStrings.salesforce
    - typingsSlinky.bell.bellStrings.slack
    - typingsSlinky.bell.bellStrings.spotify
    - typingsSlinky.bell.bellStrings.stripe
    - typingsSlinky.bell.bellStrings.trakt
    - typingsSlinky.bell.bellStrings.tumblr
    - typingsSlinky.bell.bellStrings.twitch
    - typingsSlinky.bell.bellStrings.twitter
    - typingsSlinky.bell.bellStrings.vk
    - typingsSlinky.bell.bellStrings.wordpress
    - typingsSlinky.bell.bellStrings.yahoo
  */
  trait Provider extends StObject
  object Provider {
    
    @scala.inline
    def arcgisonline: typingsSlinky.bell.bellStrings.arcgisonline = "arcgisonline".asInstanceOf[typingsSlinky.bell.bellStrings.arcgisonline]
    
    @scala.inline
    def auth0: typingsSlinky.bell.bellStrings.auth0 = "auth0".asInstanceOf[typingsSlinky.bell.bellStrings.auth0]
    
    @scala.inline
    def azuread: typingsSlinky.bell.bellStrings.azuread = "azuread".asInstanceOf[typingsSlinky.bell.bellStrings.azuread]
    
    @scala.inline
    def bitbucket: typingsSlinky.bell.bellStrings.bitbucket = "bitbucket".asInstanceOf[typingsSlinky.bell.bellStrings.bitbucket]
    
    @scala.inline
    def digitalocean: typingsSlinky.bell.bellStrings.digitalocean = "digitalocean".asInstanceOf[typingsSlinky.bell.bellStrings.digitalocean]
    
    @scala.inline
    def discord: typingsSlinky.bell.bellStrings.discord = "discord".asInstanceOf[typingsSlinky.bell.bellStrings.discord]
    
    @scala.inline
    def dropbox: typingsSlinky.bell.bellStrings.dropbox = "dropbox".asInstanceOf[typingsSlinky.bell.bellStrings.dropbox]
    
    @scala.inline
    def dropboxV2: typingsSlinky.bell.bellStrings.dropboxV2 = "dropboxV2".asInstanceOf[typingsSlinky.bell.bellStrings.dropboxV2]
    
    @scala.inline
    def facebook: typingsSlinky.bell.bellStrings.facebook = "facebook".asInstanceOf[typingsSlinky.bell.bellStrings.facebook]
    
    @scala.inline
    def fitbit: typingsSlinky.bell.bellStrings.fitbit = "fitbit".asInstanceOf[typingsSlinky.bell.bellStrings.fitbit]
    
    @scala.inline
    def foursquare: typingsSlinky.bell.bellStrings.foursquare = "foursquare".asInstanceOf[typingsSlinky.bell.bellStrings.foursquare]
    
    @scala.inline
    def github: typingsSlinky.bell.bellStrings.github = "github".asInstanceOf[typingsSlinky.bell.bellStrings.github]
    
    @scala.inline
    def gitlab: typingsSlinky.bell.bellStrings.gitlab = "gitlab".asInstanceOf[typingsSlinky.bell.bellStrings.gitlab]
    
    @scala.inline
    def google: typingsSlinky.bell.bellStrings.google = "google".asInstanceOf[typingsSlinky.bell.bellStrings.google]
    
    @scala.inline
    def googleplus: typingsSlinky.bell.bellStrings.googleplus = "googleplus".asInstanceOf[typingsSlinky.bell.bellStrings.googleplus]
    
    @scala.inline
    def instagram: typingsSlinky.bell.bellStrings.instagram = "instagram".asInstanceOf[typingsSlinky.bell.bellStrings.instagram]
    
    @scala.inline
    def linkedin: typingsSlinky.bell.bellStrings.linkedin = "linkedin".asInstanceOf[typingsSlinky.bell.bellStrings.linkedin]
    
    @scala.inline
    def live: typingsSlinky.bell.bellStrings.live = "live".asInstanceOf[typingsSlinky.bell.bellStrings.live]
    
    @scala.inline
    def medium: typingsSlinky.bell.bellStrings.medium = "medium".asInstanceOf[typingsSlinky.bell.bellStrings.medium]
    
    @scala.inline
    def meetup: typingsSlinky.bell.bellStrings.meetup = "meetup".asInstanceOf[typingsSlinky.bell.bellStrings.meetup]
    
    @scala.inline
    def mixer: typingsSlinky.bell.bellStrings.mixer = "mixer".asInstanceOf[typingsSlinky.bell.bellStrings.mixer]
    
    @scala.inline
    def nest: typingsSlinky.bell.bellStrings.nest = "nest".asInstanceOf[typingsSlinky.bell.bellStrings.nest]
    
    @scala.inline
    def office365: typingsSlinky.bell.bellStrings.office365 = "office365".asInstanceOf[typingsSlinky.bell.bellStrings.office365]
    
    @scala.inline
    def okta: typingsSlinky.bell.bellStrings.okta = "okta".asInstanceOf[typingsSlinky.bell.bellStrings.okta]
    
    @scala.inline
    def phabricator: typingsSlinky.bell.bellStrings.phabricator = "phabricator".asInstanceOf[typingsSlinky.bell.bellStrings.phabricator]
    
    @scala.inline
    def pingfed: typingsSlinky.bell.bellStrings.pingfed = "pingfed".asInstanceOf[typingsSlinky.bell.bellStrings.pingfed]
    
    @scala.inline
    def pinterest: typingsSlinky.bell.bellStrings.pinterest = "pinterest".asInstanceOf[typingsSlinky.bell.bellStrings.pinterest]
    
    @scala.inline
    def reddit: typingsSlinky.bell.bellStrings.reddit = "reddit".asInstanceOf[typingsSlinky.bell.bellStrings.reddit]
    
    @scala.inline
    def salesforce: typingsSlinky.bell.bellStrings.salesforce = "salesforce".asInstanceOf[typingsSlinky.bell.bellStrings.salesforce]
    
    @scala.inline
    def slack: typingsSlinky.bell.bellStrings.slack = "slack".asInstanceOf[typingsSlinky.bell.bellStrings.slack]
    
    @scala.inline
    def spotify: typingsSlinky.bell.bellStrings.spotify = "spotify".asInstanceOf[typingsSlinky.bell.bellStrings.spotify]
    
    @scala.inline
    def stripe: typingsSlinky.bell.bellStrings.stripe = "stripe".asInstanceOf[typingsSlinky.bell.bellStrings.stripe]
    
    @scala.inline
    def trakt: typingsSlinky.bell.bellStrings.trakt = "trakt".asInstanceOf[typingsSlinky.bell.bellStrings.trakt]
    
    @scala.inline
    def tumblr: typingsSlinky.bell.bellStrings.tumblr = "tumblr".asInstanceOf[typingsSlinky.bell.bellStrings.tumblr]
    
    @scala.inline
    def twitch: typingsSlinky.bell.bellStrings.twitch = "twitch".asInstanceOf[typingsSlinky.bell.bellStrings.twitch]
    
    @scala.inline
    def twitter: typingsSlinky.bell.bellStrings.twitter = "twitter".asInstanceOf[typingsSlinky.bell.bellStrings.twitter]
    
    @scala.inline
    def vk: typingsSlinky.bell.bellStrings.vk = "vk".asInstanceOf[typingsSlinky.bell.bellStrings.vk]
    
    @scala.inline
    def wordpress: typingsSlinky.bell.bellStrings.wordpress = "wordpress".asInstanceOf[typingsSlinky.bell.bellStrings.wordpress]
    
    @scala.inline
    def yahoo: typingsSlinky.bell.bellStrings.yahoo = "yahoo".asInstanceOf[typingsSlinky.bell.bellStrings.yahoo]
  }
  
  type RequestPassThrough = js.Function1[/* request */ Request, js.Thenable[AuthCredentials] | AuthCredentials]
  
  @js.native
  trait RequiredProviderOptions extends StObject {
    
    /**
      * the OAuth client identifier (consumer key).
      */
    var clientId: String = js.native
    
    /**
      * the OAuth client secret (consumer secret)
      */
    var clientSecret: String = js.native
    
    /**
      * the cookie encryption password.
      * Used to encrypt the temporary state cookie used by the module in
      * between the authorization protocol steps.
      */
    var password: String = js.native
  }
  object RequiredProviderOptions {
    
    @scala.inline
    def apply(clientId: String, clientSecret: String, password: String): RequiredProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredProviderOptions]
    }
    
    @scala.inline
    implicit class RequiredProviderOptionsMutableBuilder[Self <: RequiredProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  type StringLikeMap = StringDictionary[String | Double]
  
  /* augmented module */
  object hapiAugmentingMod {
    
    @js.native
    trait ServerAuth extends StObject {
      
      def strategy(name: String, scheme: typingsSlinky.bell.bellStrings.bell, mode: `try`, options: BellOptions): Unit = js.native
      def strategy(name: String, scheme: typingsSlinky.bell.bellStrings.bell, mode: optional, options: BellOptions): Unit = js.native
      def strategy(name: String, scheme: typingsSlinky.bell.bellStrings.bell, mode: required, options: BellOptions): Unit = js.native
      @JSName("strategy")
      def strategy_bell(name: String, scheme: typingsSlinky.bell.bellStrings.bell, mode: Boolean, options: BellOptions): Unit = js.native
      @JSName("strategy")
      def strategy_bell(name: String, scheme: typingsSlinky.bell.bellStrings.bell, options: BellOptions): Unit = js.native
    }
  }
}
