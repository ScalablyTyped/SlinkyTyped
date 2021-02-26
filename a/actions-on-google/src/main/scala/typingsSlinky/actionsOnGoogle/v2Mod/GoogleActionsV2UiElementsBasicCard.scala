package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsBasicCard extends StObject {
  
  /**
    * Buttons.
    * Currently at most 1 button is supported.
    * Optional.
    */
  var buttons: js.UndefOr[js.Array[GoogleActionsV2UiElementsButton]] = js.native
  
  /**
    * Body text of the card.
    * Supports a limited set of markdown syntax for formatting.
    * Required, unless image is present.
    */
  var formattedText: js.UndefOr[String] = js.native
  
  /**
    * A hero image for the card. The height is fixed to 192dp.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsBasicCardImageDisplayOptions] = js.native
  
  /**
    * Optional.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * Overall title of the card.
    * Optional.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsBasicCard {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsBasicCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsBasicCard]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsBasicCardMutableBuilder[Self <: GoogleActionsV2UiElementsBasicCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[GoogleActionsV2UiElementsButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setFormattedText(value: String): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTextUndefined: Self = StObject.set(x, "formattedText", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDisplayOptions(value: GoogleActionsV2UiElementsBasicCardImageDisplayOptions): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
