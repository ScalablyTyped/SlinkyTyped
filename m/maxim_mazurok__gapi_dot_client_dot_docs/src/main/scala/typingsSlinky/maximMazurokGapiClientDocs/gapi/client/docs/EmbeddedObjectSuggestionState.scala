package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedObjectSuggestionState extends js.Object {
  
  /** Indicates if there was a suggested change to description. */
  var descriptionSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in embedded_drawing_properties have been changed in this suggestion. */
  var embeddedDrawingPropertiesSuggestionState: js.UndefOr[js.Any] = js.native
  
  /** A mask that indicates which of the fields in embedded_object_border have been changed in this suggestion. */
  var embeddedObjectBorderSuggestionState: js.UndefOr[EmbeddedObjectBorderSuggestionState] = js.native
  
  /** A mask that indicates which of the fields in image_properties have been changed in this suggestion. */
  var imagePropertiesSuggestionState: js.UndefOr[ImagePropertiesSuggestionState] = js.native
  
  /** A mask that indicates which of the fields in linked_content_reference have been changed in this suggestion. */
  var linkedContentReferenceSuggestionState: js.UndefOr[LinkedContentReferenceSuggestionState] = js.native
  
  /** Indicates if there was a suggested change to margin_bottom. */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_left. */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_right. */
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_top. */
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in size have been changed in this suggestion. */
  var sizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.native
  
  /** Indicates if there was a suggested change to title. */
  var titleSuggested: js.UndefOr[Boolean] = js.native
}
object EmbeddedObjectSuggestionState {
  
  @scala.inline
  def apply(): EmbeddedObjectSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectSuggestionState]
  }
  
  @scala.inline
  implicit class EmbeddedObjectSuggestionStateOps[Self <: EmbeddedObjectSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setDescriptionSuggested(value: Boolean): Self = this.set("descriptionSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionSuggested: Self = this.set("descriptionSuggested", js.undefined)
    
    @scala.inline
    def setEmbeddedDrawingPropertiesSuggestionState(value: js.Any): Self = this.set("embeddedDrawingPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedDrawingPropertiesSuggestionState: Self = this.set("embeddedDrawingPropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setEmbeddedObjectBorderSuggestionState(value: EmbeddedObjectBorderSuggestionState): Self = this.set("embeddedObjectBorderSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedObjectBorderSuggestionState: Self = this.set("embeddedObjectBorderSuggestionState", js.undefined)
    
    @scala.inline
    def setImagePropertiesSuggestionState(value: ImagePropertiesSuggestionState): Self = this.set("imagePropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePropertiesSuggestionState: Self = this.set("imagePropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setLinkedContentReferenceSuggestionState(value: LinkedContentReferenceSuggestionState): Self = this.set("linkedContentReferenceSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedContentReferenceSuggestionState: Self = this.set("linkedContentReferenceSuggestionState", js.undefined)
    
    @scala.inline
    def setMarginBottomSuggested(value: Boolean): Self = this.set("marginBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottomSuggested: Self = this.set("marginBottomSuggested", js.undefined)
    
    @scala.inline
    def setMarginLeftSuggested(value: Boolean): Self = this.set("marginLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeftSuggested: Self = this.set("marginLeftSuggested", js.undefined)
    
    @scala.inline
    def setMarginRightSuggested(value: Boolean): Self = this.set("marginRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRightSuggested: Self = this.set("marginRightSuggested", js.undefined)
    
    @scala.inline
    def setMarginTopSuggested(value: Boolean): Self = this.set("marginTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTopSuggested: Self = this.set("marginTopSuggested", js.undefined)
    
    @scala.inline
    def setSizeSuggestionState(value: SizeSuggestionState): Self = this.set("sizeSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeSuggestionState: Self = this.set("sizeSuggestionState", js.undefined)
    
    @scala.inline
    def setTitleSuggested(value: Boolean): Self = this.set("titleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleSuggested: Self = this.set("titleSuggested", js.undefined)
  }
}
