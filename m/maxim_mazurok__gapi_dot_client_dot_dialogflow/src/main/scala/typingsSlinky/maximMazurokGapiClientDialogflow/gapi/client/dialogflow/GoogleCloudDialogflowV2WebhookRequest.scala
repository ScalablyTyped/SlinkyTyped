package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2WebhookRequest extends js.Object {
  
  /** Optional. The contents of the original request that was passed to `[Streaming]DetectIntent` call. */
  var originalDetectIntentRequest: js.UndefOr[GoogleCloudDialogflowV2OriginalDetectIntentRequest] = js.native
  
  /** The result of the conversational query or event processing. Contains the same value as `[Streaming]DetectIntentResponse.query_result`. */
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2QueryResult] = js.native
  
  /** The unique identifier of the response. Contains the same value as `[Streaming]DetectIntentResponse.response_id`. */
  var responseId: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier of detectIntent request session. Can be used to identify end-user inside webhook implementation. Format: `projects//agent/sessions/`, or
    * `projects//agent/environments//users//sessions/`.
    */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOriginalDetectIntentRequest(value: GoogleCloudDialogflowV2OriginalDetectIntentRequest): Self = this.set("originalDetectIntentRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalDetectIntentRequest: Self = this.set("originalDetectIntentRequest", js.undefined)
    
    @scala.inline
    def setQueryResult(value: GoogleCloudDialogflowV2QueryResult): Self = this.set("queryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryResult: Self = this.set("queryResult", js.undefined)
    
    @scala.inline
    def setResponseId(value: String): Self = this.set("responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseId: Self = this.set("responseId", js.undefined)
    
    @scala.inline
    def setSession(value: String): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}
