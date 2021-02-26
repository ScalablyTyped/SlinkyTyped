package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsCarouselSelect extends StObject {
  
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions] = js.native
  
  /**
    * min: 2 max: 10
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]] = js.native
  
  /**
    * Subtitle of the carousel. Optional.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * Title of the carousel. Optional.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsCarouselSelect {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselSelect]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsCarouselSelectMutableBuilder[Self <: GoogleActionsV2UiElementsCarouselSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageDisplayOptions(value: GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselSelectCarouselItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
