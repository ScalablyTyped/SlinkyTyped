package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo extends StObject {
  
  /** Always present for WebhookRequest. Required for WebhookResponse. The human-readable name of the parameter, unique within the form. This field cannot be modified by the webhook. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional for WebhookRequest. Ignored for WebhookResponse. Indicates if the parameter value was just collected on the last conversation turn. */
  var justCollected: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional for both WebhookRequest and WebhookResponse. Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user
    * specifies them. Required parameters must be filled before form filling concludes.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * Always present for WebhookRequest. Required for WebhookResponse. The state of the parameter. This field can be set to INVALID by the webhook to invalidate the parameter; other
    * values set by the webhook will be ignored.
    */
  var state: js.UndefOr[String] = js.native
  
  /** Optional for both WebhookRequest and WebhookResponse. The value of the parameter. This field can be set by the webhook to change the parameter value. */
  var value: js.UndefOr[js.Any] = js.native
}
object GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfoMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setJustCollected(value: Boolean): Self = StObject.set(x, "justCollected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustCollectedUndefined: Self = StObject.set(x, "justCollected", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
