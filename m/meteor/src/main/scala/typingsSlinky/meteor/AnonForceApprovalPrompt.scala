package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForceApprovalPrompt extends js.Object {
  var forceApprovalPrompt: js.UndefOr[js.Object] = js.native
  var passwordSignupFields: js.UndefOr[String] = js.native
  var requestOfflineToken: js.UndefOr[js.Object] = js.native
  var requestPermissions: js.UndefOr[js.Object] = js.native
}

object AnonForceApprovalPrompt {
  @scala.inline
  def apply(): AnonForceApprovalPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonForceApprovalPrompt]
  }
  @scala.inline
  implicit class AnonForceApprovalPromptOps[Self <: AnonForceApprovalPrompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceApprovalPrompt(value: js.Object): Self = {
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
    def withPasswordSignupFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordSignupFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordSignupFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordSignupFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOfflineToken(value: js.Object): Self = {
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
    def withRequestPermissions(value: js.Object): Self = {
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

