package typingsSlinky.gapiAuth2.gapi.auth2

import typingsSlinky.gapiAuth2.gapiAuth2Strings.popup
import typingsSlinky.gapiAuth2.gapiAuth2Strings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that represents the different configuration parameters for the gapi.auth2.init method.
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2clientconfig
  */
@js.native
trait ClientConfig extends js.Object {
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
  implicit class ClientConfigOps[Self <: ClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch_basic_profile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch_basic_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch_basic_profile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch_basic_profile")(js.undefined)
        ret
    }
    @scala.inline
    def withHosted_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosted_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHosted_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosted_domain")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenid_realm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openid_realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenid_realm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openid_realm")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
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
    def withUx_mode(value: popup | redirect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ux_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUx_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ux_mode")(js.undefined)
        ret
    }
  }
  
}

