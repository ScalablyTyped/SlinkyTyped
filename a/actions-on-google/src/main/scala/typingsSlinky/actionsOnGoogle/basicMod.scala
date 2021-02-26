package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsBasicCard
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsBasicCardImageDisplayOptions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsButton
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card/basic", "BasicCard")
  @js.native
  class BasicCard protected () extends GoogleActionsV2UiElementsBasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  trait BasicCardOptions extends StObject {
    
    /** @public */
    var buttons: js.UndefOr[GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]] = js.native
    
    /** @public */
    var display: js.UndefOr[GoogleActionsV2UiElementsBasicCardImageDisplayOptions] = js.native
    
    /** @public */
    var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
    
    /** @public */
    var subtitle: js.UndefOr[String] = js.native
    
    /** @public */
    var text: js.UndefOr[String] = js.native
    
    /** @public */
    var title: js.UndefOr[String] = js.native
  }
  object BasicCardOptions {
    
    @scala.inline
    def apply(): BasicCardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicCardOptions]
    }
    
    @scala.inline
    implicit class BasicCardOptionsMutableBuilder[Self <: BasicCardOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setDisplay(value: GoogleActionsV2UiElementsBasicCardImageDisplayOptions): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
