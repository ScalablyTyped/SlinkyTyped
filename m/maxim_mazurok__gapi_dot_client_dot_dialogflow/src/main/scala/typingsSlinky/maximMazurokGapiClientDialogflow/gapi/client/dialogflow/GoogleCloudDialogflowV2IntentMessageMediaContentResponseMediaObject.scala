package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObject extends StObject {
  
  /** Required. Url where the media is stored. */
  var contentUrl: js.UndefOr[String] = js.native
  
  /** Optional. Description of media card. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. Icon to display above media content. */
  var icon: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.native
  
  /** Optional. Image to display above media content. */
  var largeImage: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.native
  
  /** Required. Name of media card. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObject {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObject]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIcon(value: GoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLargeImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "largeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeImageUndefined: Self = StObject.set(x, "largeImage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
