package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard extends StObject {
  
  /** Optional. Settings for displaying the image. Applies to every image in items. */
  var imageDisplayOptions: js.UndefOr[String] = js.native
  
  /** Required. List of items in the Browse Carousel Card. Minimum of two items, maximum of ten. */
  var items: js.UndefOr[
    js.Array[
      GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem
    ]
  ] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageDisplayOptions(value: String): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    @scala.inline
    def setItems(
      value: js.Array[
          GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
