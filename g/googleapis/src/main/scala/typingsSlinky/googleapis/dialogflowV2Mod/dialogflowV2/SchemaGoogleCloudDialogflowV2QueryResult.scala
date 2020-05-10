package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of conversational query or event processing.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2QueryResult extends js.Object {
  /**
    * The action name from the matched intent.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * This field is set to: - `false` if the matched intent has required
    * parameters and not all of    the required parameter values have been
    * collected. - `true` if all required parameter values have been collected,
    * or if the    matched intent doesn&#39;t contain any required parameters.
    */
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.native
  /**
    * The free-form diagnostic info. For example, this field could contain
    * webhook call latency. The string keys of the Struct&#39;s fields map can
    * change without notice.
    */
  var diagnosticInfo: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The collection of rich messages to present to the user.
    */
  var fulfillmentMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]] = js.native
  /**
    * The text to be pronounced to the user or shown on the screen. Note: This
    * is a legacy field, `fulfillment_messages` should be preferred.
    */
  var fulfillmentText: js.UndefOr[String] = js.native
  /**
    * The intent that matched the conversational query. Some, not all fields
    * are filled in this message, including but not limited to: `name`,
    * `display_name` and `webhook_state`.
    */
  var intent: js.UndefOr[SchemaGoogleCloudDialogflowV2Intent] = js.native
  /**
    * The intent detection confidence. Values range from 0.0 (completely
    * uncertain) to 1.0 (completely certain). If there are `multiple
    * knowledge_answers` messages, this value is set to the greatest
    * `knowledgeAnswers.match_confidence` value in the list.
    */
  var intentDetectionConfidence: js.UndefOr[Double] = js.native
  /**
    * The language that was triggered during intent detection. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The collection of output contexts. If applicable,
    * `output_contexts.parameters` contains entries with name `&lt;parameter
    * name&gt;.original` containing the original parameter values before the
    * query.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.native
  /**
    * The collection of extracted parameters.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The original conversational query text: - If natural language text was
    * provided as input, `query_text` contains   a copy of the input. - If
    * natural language speech audio was provided as input, `query_text`
    * contains the speech recognition result. If speech recognizer produced
    * multiple alternatives, a particular one is picked. - If an event was
    * provided as input, `query_text` is not set.
    */
  var queryText: js.UndefOr[String] = js.native
  /**
    * The sentiment analysis result, which depends on the
    * `sentiment_analysis_request_config` specified in the request.
    */
  var sentimentAnalysisResult: js.UndefOr[SchemaGoogleCloudDialogflowV2SentimentAnalysisResult] = js.native
  /**
    * The Speech recognition confidence between 0.0 and 1.0. A higher number
    * indicates an estimated greater likelihood that the recognized words are
    * correct. The default of 0.0 is a sentinel value indicating that
    * confidence was not set.  This field is not guaranteed to be accurate or
    * set. In particular this field isn&#39;t set for StreamingDetectIntent
    * since the streaming endpoint has separate confidence estimates per
    * portion of the audio in StreamingRecognitionResult.
    */
  var speechRecognitionConfidence: js.UndefOr[Double] = js.native
  /**
    * If the query was fulfilled by a webhook call, this field is set to the
    * value of the `payload` field returned in the webhook response.
    */
  var webhookPayload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * If the query was fulfilled by a webhook call, this field is set to the
    * value of the `source` field returned in the webhook response.
    */
  var webhookSource: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2QueryResult {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2QueryResult]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2QueryResultOps[Self <: SchemaGoogleCloudDialogflowV2QueryResult] (val x: Self) extends AnyVal {
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
    def withDiagnosticInfo(value: StringDictionary[js.Any]): Self = {
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
    def withFulfillmentMessages(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]): Self = {
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
    def withIntent(value: SchemaGoogleCloudDialogflowV2Intent): Self = {
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
    def withOutputContexts(value: js.Array[SchemaGoogleCloudDialogflowV2Context]): Self = {
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
    def withParameters(value: StringDictionary[js.Any]): Self = {
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
    def withSentimentAnalysisResult(value: SchemaGoogleCloudDialogflowV2SentimentAnalysisResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentAnalysisResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentimentAnalysisResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentAnalysisResult")(js.undefined)
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
    def withWebhookPayload(value: StringDictionary[js.Any]): Self = {
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

