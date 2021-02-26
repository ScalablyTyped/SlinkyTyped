package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1WebhookResponse extends StObject {
  
  /** The fulfillment response to send to the user. This field can be omitted by the webhook if it does not intend to send any response to the user. */
  var fulfillmentResponse: js.UndefOr[GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse] = js.native
  
  /** Information about page status. This field can be omitted by the webhook if it does not intend to modify page status. */
  var pageInfo: js.UndefOr[GoogleCloudDialogflowCxV3beta1PageInfo] = js.native
  
  /** Value to append directly to QueryResult.webhook_payloads. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3beta1WebhookResponse with TopLevel[js.Any]
  ] = js.native
  
  /** Information about session status. This field can be omitted by the webhook if it does not intend to modify session status. */
  var sessionInfo: js.UndefOr[GoogleCloudDialogflowCxV3beta1SessionInfo] = js.native
  
  /** The target flow to transition to. Format: `projects//locations//agents//flows/`. */
  var targetFlow: js.UndefOr[String] = js.native
  
  /** The target page to transition to. Format: `projects//locations//agents//flows//pages/`. */
  var targetPage: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3beta1WebhookResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1WebhookResponseMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1WebhookResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFulfillmentResponse(value: GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse): Self = StObject.set(x, "fulfillmentResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentResponseUndefined: Self = StObject.set(x, "fulfillmentResponse", js.undefined)
    
    @scala.inline
    def setPageInfo(value: GoogleCloudDialogflowCxV3beta1PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3beta1WebhookResponse with TopLevel[js.Any]
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSessionInfo(value: GoogleCloudDialogflowCxV3beta1SessionInfo): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
    @scala.inline
    def setTargetFlow(value: String): Self = StObject.set(x, "targetFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFlowUndefined: Self = StObject.set(x, "targetFlow", js.undefined)
    
    @scala.inline
    def setTargetPage(value: String): Self = StObject.set(x, "targetPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPageUndefined: Self = StObject.set(x, "targetPage", js.undefined)
  }
}
