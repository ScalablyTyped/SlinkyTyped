package typingsSlinky.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that may be passed to `authorize`.
  */
@js.native
trait AuthorizeOptions extends js.Object {
  /**
    * Specifies when to show a login screen to the user.
    * `"auto"` will attempt to use a cached token. If the cached token fails or does not exist, the user will be presented with a login screen.
    * `"always"` does not use the cached token and always presents a login screen.
    * `"never"` will used the cached token; if the token does not work, authorize will return `invalid_grant`.
    * Defaults to `"auto"`.
    */
  var interactive: js.UndefOr[AuthorizeInteractiveOption] = js.native
  /**
    * `true` to use a popup window for login, `false` to redirect the current browser window to the authorization dialog. Defaults to `true`. If `false`, the next parameter MUST be a redirect URL.
    */
  var popup: js.UndefOr[Boolean] = js.native
  /**
    * The grant type requested. Specify `token` to request an Implicit grant or `code` to request an Authorization Code grant. Defaults to `token`.
    */
  var response_type: js.UndefOr[AuthorizeResponseType] = js.native
  /**
    * The access scope requested.
    */
  var scope: AuthorizeScope = js.native
  var scope_data: js.UndefOr[AuthorizeScopeData] = js.native
  /**
    * An opaque value used by the client to maintain state between this request and the response. The Login with Amazon authorization service will include this value when redirecting the user back
    * to the client. It is also used to prevent cross-site request forgery.
    * For more information see [Cross-site Request Forgery](https://developer.amazon.com/docs/login-with-amazon/cross-site-request-forgery.html).
    *
    */
  var state: js.UndefOr[String] = js.native
}

object AuthorizeOptions {
  @scala.inline
  def apply(scope: AuthorizeScope): AuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeOptions]
  }
  @scala.inline
  implicit class AuthorizeOptionsOps[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: AuthorizeScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractive(value: AuthorizeInteractiveOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_type(value: AuthorizeResponseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(js.undefined)
        ret
    }
    @scala.inline
    def withScope_data(value: AuthorizeScopeData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope_data")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

