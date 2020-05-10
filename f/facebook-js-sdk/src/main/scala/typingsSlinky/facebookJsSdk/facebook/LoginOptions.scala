package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.reauthenticate
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.reauthorize
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.rerequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginOptions extends js.Object {
  var auth_type: js.UndefOr[reauthenticate | reauthorize | rerequest] = js.native
  var enable_profile_selector: js.UndefOr[Boolean] = js.native
  var profile_selector_ids: js.UndefOr[String] = js.native
  var return_scopes: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[String] = js.native
}

object LoginOptions {
  @scala.inline
  def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  @scala.inline
  implicit class LoginOptionsOps[Self <: LoginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_type(value: reauthenticate | reauthorize | rerequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_type")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable_profile_selector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_profile_selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable_profile_selector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_profile_selector")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_selector_ids(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_selector_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_selector_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_selector_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_scopes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_scopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_scopes")(js.undefined)
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
  }
  
}

