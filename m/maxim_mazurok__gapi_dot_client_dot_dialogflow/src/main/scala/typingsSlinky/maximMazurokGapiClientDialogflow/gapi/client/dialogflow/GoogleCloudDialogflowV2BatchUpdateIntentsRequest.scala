package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2BatchUpdateIntentsRequest extends StObject {
  
  /** The collection of intents to update or create. */
  var intentBatchInline: js.UndefOr[GoogleCloudDialogflowV2IntentBatch] = js.native
  
  /**
    * The URI to a Google Cloud Storage file containing intents to update or create. The file format can either be a serialized proto (of IntentBatch type) or JSON object. Note: The URI
    * must start with "gs://".
    */
  var intentBatchUri: js.UndefOr[String] = js.native
  
  /** Optional. The resource view to apply to the returned intent. */
  var intentView: js.UndefOr[String] = js.native
  
  /**
    * Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity
    * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Optional. The mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2BatchUpdateIntentsRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchUpdateIntentsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchUpdateIntentsRequestMutableBuilder[Self <: GoogleCloudDialogflowV2BatchUpdateIntentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntentBatchInline(value: GoogleCloudDialogflowV2IntentBatch): Self = StObject.set(x, "intentBatchInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentBatchInlineUndefined: Self = StObject.set(x, "intentBatchInline", js.undefined)
    
    @scala.inline
    def setIntentBatchUri(value: String): Self = StObject.set(x, "intentBatchUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentBatchUriUndefined: Self = StObject.set(x, "intentBatchUri", js.undefined)
    
    @scala.inline
    def setIntentView(value: String): Self = StObject.set(x, "intentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentViewUndefined: Self = StObject.set(x, "intentView", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
