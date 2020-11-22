package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard extends js.Object {
  
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
  implicit class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard] (val x: Self) extends AnyVal {
    
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
    def setImageDisplayOptions(value: String): Self = this.set("imageDisplayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDisplayOptions: Self = this.set("imageDisplayOptions", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(
      value: js.Array[
          GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
