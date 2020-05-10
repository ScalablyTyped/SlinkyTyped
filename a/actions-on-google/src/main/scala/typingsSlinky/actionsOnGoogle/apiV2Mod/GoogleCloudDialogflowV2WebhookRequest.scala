package typingsSlinky.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2WebhookRequest extends js.Object {
  var originalDetectIntentRequest: js.UndefOr[GoogleCloudDialogflowV2OriginalDetectIntentRequest] = js.native
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2QueryResult] = js.native
  var responseId: js.UndefOr[String] = js.native
  var session: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2WebhookRequest {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2WebhookRequest]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2WebhookRequestOps[Self <: GoogleCloudDialogflowV2WebhookRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalDetectIntentRequest(value: GoogleCloudDialogflowV2OriginalDetectIntentRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDetectIntentRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalDetectIntentRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalDetectIntentRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryResult(value: GoogleCloudDialogflowV2QueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryResult")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseId")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

