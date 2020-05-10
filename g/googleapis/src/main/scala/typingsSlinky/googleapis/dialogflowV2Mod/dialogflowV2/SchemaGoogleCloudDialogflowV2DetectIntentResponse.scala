package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned from the DetectIntent method.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2DetectIntentResponse extends js.Object {
  /**
    * The audio data bytes encoded as specified in the request. Note: The
    * output audio is generated based on the values of default platform text
    * responses found in the `query_result.fulfillment_messages` field. If
    * multiple default text responses exist, they will be concatenated when
    * generating audio. If no default platform text responses exist, the
    * generated audio content will be empty.
    */
  var outputAudio: js.UndefOr[String] = js.native
  /**
    * The config used by the speech synthesizer to generate the output audio.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2OutputAudioConfig] = js.native
  /**
    * The selected results of the conversational query or event processing. See
    * `alternative_query_results` for additional potential results.
    */
  var queryResult: js.UndefOr[SchemaGoogleCloudDialogflowV2QueryResult] = js.native
  /**
    * The unique identifier of the response. It can be used to locate a
    * response in the training example set or for reporting issues.
    */
  var responseId: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the webhook request.
    */
  var webhookStatus: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}

object SchemaGoogleCloudDialogflowV2DetectIntentResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2DetectIntentResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2DetectIntentResponseOps[Self <: SchemaGoogleCloudDialogflowV2DetectIntentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputAudio(value: String): Self = {
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
    def withOutputAudioConfig(value: SchemaGoogleCloudDialogflowV2OutputAudioConfig): Self = {
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
    def withQueryResult(value: SchemaGoogleCloudDialogflowV2QueryResult): Self = {
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
    def withWebhookStatus(value: SchemaGoogleRpcStatus): Self = {
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
  }
  
}

