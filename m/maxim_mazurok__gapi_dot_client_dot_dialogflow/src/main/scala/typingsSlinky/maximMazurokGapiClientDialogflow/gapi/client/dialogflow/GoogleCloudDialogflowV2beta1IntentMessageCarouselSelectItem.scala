package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem extends StObject {
  
  /** Optional. The body text of the card. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. The image to display. */
  var image: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  
  /** Required. Additional info about the option item. */
  var info: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo] = js.native
  
  /** Required. Title of the carousel item. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setInfo(value: GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
