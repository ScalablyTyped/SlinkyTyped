package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IMessage
import typingsSlinky.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QueryResult. */
@js.native
trait IQueryResult extends js.Object {
  /** QueryResult action */
  var action: js.UndefOr[String | Null] = js.native
  /** QueryResult allRequiredParamsPresent */
  var allRequiredParamsPresent: js.UndefOr[Boolean | Null] = js.native
  /** QueryResult diagnosticInfo */
  var diagnosticInfo: js.UndefOr[IStruct | Null] = js.native
  /** QueryResult fulfillmentMessages */
  var fulfillmentMessages: js.UndefOr[js.Array[IMessage] | Null] = js.native
  /** QueryResult fulfillmentText */
  var fulfillmentText: js.UndefOr[String | Null] = js.native
  /** QueryResult intent */
  var intent: js.UndefOr[IIntent | Null] = js.native
  /** QueryResult intentDetectionConfidence */
  var intentDetectionConfidence: js.UndefOr[Double | Null] = js.native
  /** QueryResult knowledgeAnswers */
  var knowledgeAnswers: js.UndefOr[IKnowledgeAnswers | Null] = js.native
  /** QueryResult languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  /** QueryResult outputContexts */
  var outputContexts: js.UndefOr[js.Array[IContext] | Null] = js.native
  /** QueryResult parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.native
  /** QueryResult queryText */
  var queryText: js.UndefOr[String | Null] = js.native
  /** QueryResult sentimentAnalysisResult */
  var sentimentAnalysisResult: js.UndefOr[ISentimentAnalysisResult | Null] = js.native
  /** QueryResult speechRecognitionConfidence */
  var speechRecognitionConfidence: js.UndefOr[Double | Null] = js.native
  /** QueryResult webhookPayload */
  var webhookPayload: js.UndefOr[IStruct | Null] = js.native
  /** QueryResult webhookSource */
  var webhookSource: js.UndefOr[String | Null] = js.native
}

object IQueryResult {
  @scala.inline
  def apply(): IQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryResult]
  }
  @scala.inline
  implicit class IQueryResultOps[Self <: IQueryResult] (val x: Self) extends AnyVal {
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
    def withActionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(null)
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
    def withAllRequiredParamsPresentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRequiredParamsPresent")(null)
        ret
    }
    @scala.inline
    def withDiagnosticInfo(value: IStruct): Self = {
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
    def withDiagnosticInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticInfo")(null)
        ret
    }
    @scala.inline
    def withFulfillmentMessages(value: js.Array[IMessage]): Self = {
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
    def withFulfillmentMessagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentMessages")(null)
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
    def withFulfillmentTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentText")(null)
        ret
    }
    @scala.inline
    def withIntent(value: IIntent): Self = {
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
    def withIntentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(null)
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
    def withIntentDetectionConfidenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentDetectionConfidence")(null)
        ret
    }
    @scala.inline
    def withKnowledgeAnswers(value: IKnowledgeAnswers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeAnswers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnowledgeAnswers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeAnswers")(js.undefined)
        ret
    }
    @scala.inline
    def withKnowledgeAnswersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeAnswers")(null)
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
    def withLanguageCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(null)
        ret
    }
    @scala.inline
    def withOutputContexts(value: js.Array[IContext]): Self = {
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
    def withOutputContextsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContexts")(null)
        ret
    }
    @scala.inline
    def withParameters(value: IStruct): Self = {
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
    def withParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(null)
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
    def withQueryTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryText")(null)
        ret
    }
    @scala.inline
    def withSentimentAnalysisResult(value: ISentimentAnalysisResult): Self = {
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
    def withSentimentAnalysisResultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentAnalysisResult")(null)
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
    def withSpeechRecognitionConfidenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechRecognitionConfidence")(null)
        ret
    }
    @scala.inline
    def withWebhookPayload(value: IStruct): Self = {
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
    def withWebhookPayloadNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookPayload")(null)
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
    @scala.inline
    def withWebhookSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookSource")(null)
        ret
    }
  }
  
}

