package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.rpc.IStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingDetectIntentResponse. */
@js.native
trait IStreamingDetectIntentResponse extends js.Object {
  /** StreamingDetectIntentResponse alternativeQueryResults */
  var alternativeQueryResults: js.UndefOr[js.Array[IQueryResult] | Null] = js.native
  /** StreamingDetectIntentResponse outputAudio */
  var outputAudio: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** StreamingDetectIntentResponse outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.native
  /** StreamingDetectIntentResponse queryResult */
  var queryResult: js.UndefOr[IQueryResult | Null] = js.native
  /** StreamingDetectIntentResponse recognitionResult */
  var recognitionResult: js.UndefOr[IStreamingRecognitionResult | Null] = js.native
  /** StreamingDetectIntentResponse responseId */
  var responseId: js.UndefOr[String | Null] = js.native
  /** StreamingDetectIntentResponse webhookStatus */
  var webhookStatus: js.UndefOr[IStatus | Null] = js.native
}

object IStreamingDetectIntentResponse {
  @scala.inline
  def apply(): IStreamingDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingDetectIntentResponse]
  }
  @scala.inline
  implicit class IStreamingDetectIntentResponseOps[Self <: IStreamingDetectIntentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternativeQueryResults(value: js.Array[IQueryResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeQueryResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternativeQueryResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeQueryResults")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternativeQueryResultsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeQueryResults")(null)
        ret
    }
    @scala.inline
    def withOutputAudio(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputAudioNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudio")(null)
        ret
    }
    @scala.inline
    def withOutputAudioConfig(value: IOutputAudioConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudioConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputAudioConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudioConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputAudioConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudioConfig")(null)
        ret
    }
    @scala.inline
    def withQueryResult(value: IQueryResult): Self = {
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
    def withQueryResultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryResult")(null)
        ret
    }
    @scala.inline
    def withRecognitionResult(value: IStreamingRecognitionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognitionResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognitionResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognitionResult")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognitionResultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognitionResult")(null)
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
    def withResponseIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseId")(null)
        ret
    }
    @scala.inline
    def withWebhookStatus(value: IStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhookStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookStatus")(null)
        ret
    }
  }
  
}

