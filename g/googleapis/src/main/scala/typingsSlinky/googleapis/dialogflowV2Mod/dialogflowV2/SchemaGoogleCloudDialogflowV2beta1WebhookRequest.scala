package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for a webhook call.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1WebhookRequest extends js.Object {
  /**
    * Alternative query results from KnowledgeService.
    */
  var alternativeQueryResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1QueryResult]] = js.native
  /**
    * Optional. The contents of the original request that was passed to
    * `[Streaming]DetectIntent` call.
    */
  var originalDetectIntentRequest: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest] = js.native
  /**
    * The result of the conversational query or event processing. Contains the
    * same value as `[Streaming]DetectIntentResponse.query_result`.
    */
  var queryResult: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryResult] = js.native
  /**
    * The unique identifier of the response. Contains the same value as
    * `[Streaming]DetectIntentResponse.response_id`.
    */
  var responseId: js.UndefOr[String] = js.native
  /**
    * The unique identifier of detectIntent request session. Can be used to
    * identify end-user inside webhook implementation. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
    * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment
    * ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session ID&gt;`.
    */
  var session: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1WebhookRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1WebhookRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1WebhookRequestOps[Self <: SchemaGoogleCloudDialogflowV2beta1WebhookRequest] (val x: Self) extends AnyVal {
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
    def withOriginalDetectIntentRequest(value: SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest): Self = {
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

