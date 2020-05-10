package typingsSlinky.passportGoogleOauth20.mod

import typingsSlinky.passport.mod.AuthenticateOptions
import typingsSlinky.passportGoogleOauth20.passportGoogleOauth20Strings.offline
import typingsSlinky.passportGoogleOauth20.passportGoogleOauth20Strings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOptionsGoogle extends AuthenticateOptions {
  var accessType: js.UndefOr[offline | online] = js.native
  var display: js.UndefOr[String] = js.native
  var hd: js.UndefOr[String] = js.native
  var hostedDomain: js.UndefOr[String] = js.native
  var includeGrantedScopes: js.UndefOr[Boolean] = js.native
  var loginHint: js.UndefOr[String] = js.native
  var openIDRealm: js.UndefOr[js.Any] = js.native
  var requestVisibleActions: js.UndefOr[js.Any] = js.native
}

object AuthenticateOptionsGoogle {
  @scala.inline
  def apply(): AuthenticateOptionsGoogle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptionsGoogle]
  }
  @scala.inline
  implicit class AuthenticateOptionsGoogleOps[Self <: AuthenticateOptionsGoogle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessType(value: offline | online): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessType")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withHd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeGrantedScopes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGrantedScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGrantedScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGrantedScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginHint")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIDRealm(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIDRealm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIDRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIDRealm")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestVisibleActions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVisibleActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestVisibleActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVisibleActions")(js.undefined)
        ret
    }
  }
  
}

