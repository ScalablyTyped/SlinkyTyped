package typingsSlinky.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentFollowupIntentInfo extends js.Object {
  var followupIntentName: js.UndefOr[String] = js.native
  var parentFollowupIntentName: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2IntentFollowupIntentInfo {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentFollowupIntentInfo]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentFollowupIntentInfoOps[Self <: GoogleCloudDialogflowV2IntentFollowupIntentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowupIntentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupIntentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowupIntentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupIntentName")(js.undefined)
        ret
    }
    @scala.inline
    def withParentFollowupIntentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFollowupIntentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFollowupIntentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFollowupIntentName")(js.undefined)
        ret
    }
  }
  
}

