package typingsSlinky.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
  var certificates: js.Array[String] = js.native
  var force_authn: js.UndefOr[Boolean] = js.native
  var sign_get_request: js.UndefOr[Boolean] = js.native
  var sso_login_url: String = js.native
  var sso_logout_url: String = js.native
}

object IdentityProviderOptions {
  @scala.inline
  def apply(certificates: js.Array[String], sso_login_url: String, sso_logout_url: String): IdentityProviderOptions = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], sso_login_url = sso_login_url.asInstanceOf[js.Any], sso_logout_url = sso_logout_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderOptions]
  }
  @scala.inline
  implicit class IdentityProviderOptionsOps[Self <: IdentityProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSso_login_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso_login_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSso_logout_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso_logout_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_unencrypted_assertion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_unencrypted_assertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_unencrypted_assertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_unencrypted_assertion")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_authn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_authn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_authn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_authn")(js.undefined)
        ret
    }
    @scala.inline
    def withSign_get_request(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_get_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign_get_request: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_get_request")(js.undefined)
        ret
    }
  }
  
}

