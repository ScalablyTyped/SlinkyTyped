package typingsSlinky.reactMdMenu

import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactMdMenu.useVisibilityMod.FocusType
import typingsSlinky.reactMdMenu.useVisibilityMod.VisibilityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useItemVisibilityMod {
  
  @JSImport("@react-md/menu/types/useItemVisibility", "useItemVisibility")
  @js.native
  def useItemVisibility(): ReturnValue = js.native
  @JSImport("@react-md/menu/types/useItemVisibility", "useItemVisibility")
  @js.native
  def useItemVisibility(hasHorizontalOnClickOnKeyDownDefaultVisibleDefaultFocusOnVisibilityChange: ItemVisibilityOptions): ReturnValue = js.native
  
  @js.native
  trait ItemVisibilityOptions extends VisibilityOptions {
    
    var horizontal: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
  }
  object ItemVisibilityOptions {
    
    @scala.inline
    def apply(): ItemVisibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemVisibilityOptions]
    }
    
    @scala.inline
    implicit class ItemVisibilityOptionsMutableBuilder[Self <: ItemVisibilityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLLIElement>, 'onClick' | 'onKeyDown'> */
  @js.native
  trait ReturnValue extends StObject {
    
    var defaultFocus: FocusType = js.native
    
    def hide(): Unit = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
    
    var visible: Boolean = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply(defaultFocus: FocusType, hide: () => Unit, visible: Boolean): ReturnValue = {
      val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLLIElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
