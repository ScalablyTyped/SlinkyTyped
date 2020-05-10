package typingsSlinky.actionsOnGoogle.apiV2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2QueryResult extends js.Object {
  var action: js.UndefOr[String] = js.native
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.native
  var diagnosticInfo: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.native
  var fulfillmentText: js.UndefOr[String] = js.native
  var intent: js.UndefOr[GoogleCloudDialogflowV2Intent] = js.native
  var intentDetectionConfidence: js.UndefOr[Double] = js.native
  var languageCode: js.UndefOr[String] = js.native
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.native
  var parameters: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var queryText: js.UndefOr[String] = js.native
  var speechRecognitionConfidence: js.UndefOr[Double] = js.native
  var webhookPayload: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var webhookSource: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2QueryResult {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2QueryResult]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2QueryResultOps[Self <: GoogleCloudDialogflowV2QueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAllRequiredParamsPresent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRequiredParamsPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllRequiredParamsPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRequiredParamsPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosticInfo(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosticInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticInfo")(js.undefined)
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
    def withIntent(value: GoogleCloudDialogflowV2Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentDetectionConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentDetectionConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentDetectionConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentDetectionConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
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
    def withParameters(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryText")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeechRecognitionConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechRecognitionConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechRecognitionConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechRecognitionConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhookPayload(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhookSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookSource")(js.undefined)
        ret
    }
  }
  
}

