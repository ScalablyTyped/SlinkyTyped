package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned from the DetectIntent method.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse extends js.Object {
  /**
    * If Knowledge Connectors are enabled, there could be more than one result
    * returned for a given query or event, and this field will contain all
    * results except for the top one, which is captured in query_result. The
    * alternative results are ordered by decreasing
    * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are
    * disabled, this field will be empty until multiple responses for regular
    * intents are supported, at which point those additional results will be
    * surfaced here.
    */
  var alternativeQueryResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1QueryResult]] = js.native
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
    * Instructs the speech synthesizer how to generate the output audio. This
    * field is populated from the agent-level speech synthesizer configuration,
    * if enabled.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig] = js.native
  /**
    * The selected results of the conversational query or event processing. See
    * `alternative_query_results` for additional potential results.
    */
  var queryResult: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryResult] = js.native
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

object SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1DetectIntentResponseOps[Self <: SchemaGoogleCloudDialogflowV2beta1DetectIntentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternativeQueryResults(value: js.Array[SchemaGoogleCloudDialogflowV2beta1QueryResult]): Self = {
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
    def withOutputAudioConfig(value: SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig): Self = {
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
    def withQueryResult(value: SchemaGoogleCloudDialogflowV2beta1QueryResult): Self = {
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

