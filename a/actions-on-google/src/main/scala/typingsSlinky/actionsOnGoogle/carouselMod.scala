package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION
import typingsSlinky.actionsOnGoogle.helperHelperMod.Helper
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionArgument
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionItem
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionItems
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2OptionValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselSelectCarouselItem
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option/carousel", "Carousel")
  @js.native
  class Carousel protected () extends Helper[actionsDotintentDotOPTION, GoogleActionsV2OptionValueSpec] {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  type CarouselArgument = OptionArgument
  
  @js.native
  trait CarouselOptionItem extends OptionItem {
    
    /**
      * Description text of the item.
      * @public
      */
    @JSName("description")
    var description_CarouselOptionItem: String = js.native
  }
  object CarouselOptionItem {
    
    @scala.inline
    def apply(description: String, title: String): CarouselOptionItem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselOptionItem]
    }
    
    @scala.inline
    implicit class CarouselOptionItemMutableBuilder[Self <: CarouselOptionItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CarouselOptions extends StObject {
    
    /**
      * Sets the display options for the images in this carousel.
      * @public
      */
    var display: js.UndefOr[GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions] = js.native
    
    /**
      * List of 2-20 items to show in this carousel. Required.
      * @public
      */
    var items: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem] = js.native
  }
  object CarouselOptions {
    
    @scala.inline
    def apply(
      items: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
    ): CarouselOptions = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselOptions]
    }
    
    @scala.inline
    implicit class CarouselOptionsMutableBuilder[Self <: CarouselOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setItems(
        value: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselSelectCarouselItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
