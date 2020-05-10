package typingsSlinky.hapiBell.mod

import typingsSlinky.hapiBell.AnonExtendedProfile
import typingsSlinky.hapiBell.AnonUri
import typingsSlinky.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalOptions extends js.Object {
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
  var config: js.UndefOr[AnonExtendedProfile | AnonUri] = js.native
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
  implicit class OptionalOptionsOps[Self <: OptionalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowRuntimeProviderParams(value: StringLikeMap | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRuntimeProviderParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRuntimeProviderParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRuntimeProviderParams")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: AnonExtendedProfile | AnonUri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withForceHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHttps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHttps")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHttpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHttpOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHttpOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationFunction1(value: /* req */ Request => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocation(value: String | (js.Function1[/* req */ Request, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileParams(value: StringLikeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileParams")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderParamsFunction1(value: /* request */ Request => StringLikeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProviderParams(value: StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerParams")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeStateCallback(value: /* req */ Request => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeStateCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRuntimeStateCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeStateCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeFunction1(value: /* request */ Request => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScope(value: js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

