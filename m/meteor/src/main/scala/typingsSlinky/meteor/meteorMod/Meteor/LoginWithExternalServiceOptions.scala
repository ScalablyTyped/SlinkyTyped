package typingsSlinky.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Login **/
@js.native
trait LoginWithExternalServiceOptions extends js.Object {
  var forceApprovalPrompt: js.UndefOr[Boolean] = js.native
  var loginHint: js.UndefOr[String] = js.native
  var loginStyle: js.UndefOr[String] = js.native
  var loginUrlParameters: js.UndefOr[js.Object] = js.native
  var redirectUrl: js.UndefOr[String] = js.native
  var requestOfflineToken: js.UndefOr[Boolean] = js.native
  var requestPermissions: js.UndefOr[js.Array[String]] = js.native
}

object LoginWithExternalServiceOptions {
  @scala.inline
  def apply(): LoginWithExternalServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginWithExternalServiceOptions]
  }
  @scala.inline
  implicit class LoginWithExternalServiceOptionsOps[Self <: LoginWithExternalServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceApprovalPrompt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceApprovalPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceApprovalPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceApprovalPrompt")(js.undefined)
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
    def withLoginStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginUrlParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrlParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginUrlParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrlParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOfflineToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOfflineToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOfflineToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOfflineToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPermissions")(js.undefined)
        ret
    }
  }
  
}

