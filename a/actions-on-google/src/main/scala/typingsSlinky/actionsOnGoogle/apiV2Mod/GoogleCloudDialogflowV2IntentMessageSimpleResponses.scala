package typingsSlinky.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessageSimpleResponses extends js.Object {
  var simpleResponses: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]] = js.native
}

object GoogleCloudDialogflowV2IntentMessageSimpleResponses {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponses]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSimpleResponsesOps[Self <: GoogleCloudDialogflowV2IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimpleResponses(value: js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(js.undefined)
        ret
    }
  }
  
}

