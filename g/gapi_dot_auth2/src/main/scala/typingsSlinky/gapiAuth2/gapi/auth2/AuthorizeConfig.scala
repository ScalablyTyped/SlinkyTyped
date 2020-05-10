package typingsSlinky.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeconfig
  */
@js.native
trait AuthorizeConfig extends js.Object {
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
  implicit class AuthorizeConfigOps[Self <: AuthorizeConfig] (val x: Self) extends AnyVal {
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
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp_package_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_package_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_package_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_package_name")(js.undefined)
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
    def withInclude_granted_scopes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_granted_scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_granted_scopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_granted_scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin_hint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login_hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogin_hint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login_hint")(js.undefined)
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
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_type(value: String): Self = {
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
  }
  
}

