package typingsSlinky.actionsOnGoogle.apiV2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2WebhookResponse extends js.Object {
  var followupEventInput: js.UndefOr[GoogleCloudDialogflowV2EventInput] = js.native
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.native
  var fulfillmentText: js.UndefOr[String] = js.native
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.native
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var source: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2WebhookResponse {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookResponse]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2WebhookResponseOps[Self <: GoogleCloudDialogflowV2WebhookResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowupEventInput(value: GoogleCloudDialogflowV2EventInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupEventInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowupEventInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupEventInput")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentText")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

