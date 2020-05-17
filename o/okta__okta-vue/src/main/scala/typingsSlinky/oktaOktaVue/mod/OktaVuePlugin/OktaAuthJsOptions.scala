package typingsSlinky.oktaOktaVue.mod.OktaVuePlugin

import typingsSlinky.oktaOktaVue.anon.AutoRenew
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OktaAuthJsOptions extends OktaOpenIDOptions {
  var authorizeUrl: js.UndefOr[String] = js.native
  var ignoreSignature: js.UndefOr[Boolean] = js.native
  var maxClockSkew: js.UndefOr[Double] = js.native
  var pkce: js.UndefOr[Boolean] = js.native
  var postLogoutRedirectUri: js.UndefOr[String] = js.native
  var tokenManager: js.UndefOr[AutoRenew] = js.native
  var tokenUrl: js.UndefOr[String] = js.native
  var userinfoUrl: js.UndefOr[String] = js.native
}

object OktaAuthJsOptions {
  @scala.inline
  def apply(): OktaAuthJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OktaAuthJsOptions]
  }
  @scala.inline
  implicit class OktaAuthJsOptionsOps[Self <: OktaAuthJsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSignature(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxClockSkew(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxClockSkew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxClockSkew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxClockSkew")(js.undefined)
        ret
    }
    @scala.inline
    def withPkce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkce")(js.undefined)
        ret
    }
    @scala.inline
    def withPostLogoutRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLogoutRedirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostLogoutRedirectUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postLogoutRedirectUri")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenManager(value: AutoRenew): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenManager")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUserinfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userinfoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserinfoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userinfoUrl")(js.undefined)
        ret
    }
  }
  
}

