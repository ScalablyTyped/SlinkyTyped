package typingsSlinky.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ scope in login-with-amazon-sdk-browser.AuthorizationScopeOptions ]:? {  essential  :boolean}} */
@js.native
trait AuthorizeScopeData extends js.Object {
  var postal_code: js.UndefOr[AnonEssential] = js.native
  var profile: js.UndefOr[AnonEssential] = js.native
  @JSName("profile:user_id")
  var profileColonuser_id: js.UndefOr[AnonEssential] = js.native
}

object AuthorizeScopeData {
  @scala.inline
  def apply(): AuthorizeScopeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeScopeData]
  }
  @scala.inline
  implicit class AuthorizeScopeDataOps[Self <: AuthorizeScopeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostal_code(value: AnonEssential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostal_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: AnonEssential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileColonuser_id(value: AnonEssential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile:user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileColonuser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile:user_id")(js.undefined)
        ret
    }
  }
  
}

