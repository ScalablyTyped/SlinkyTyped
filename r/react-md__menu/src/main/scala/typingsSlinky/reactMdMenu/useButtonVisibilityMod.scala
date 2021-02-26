package typingsSlinky.reactMdMenu

import org.scalajs.dom.raw.HTMLButtonElement
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

object useButtonVisibilityMod {
  
  @JSImport("@react-md/menu/types/useButtonVisibility", "useButtonVisibility")
  @js.native
  def useButtonVisibility(): ReturnValue = js.native
  @JSImport("@react-md/menu/types/useButtonVisibility", "useButtonVisibility")
  @js.native
  def useButtonVisibility(hasOnClickOnKeyDownDefaultVisibleDefaultFocusOnVisibilityChange: ButtonVisibilityOptions): ReturnValue = js.native
  
  @js.native
  trait ButtonVisibilityOptions extends VisibilityOptions {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
  }
  object ButtonVisibilityOptions {
    
    @scala.inline
    def apply(): ButtonVisibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonVisibilityOptions]
    }
    
    @scala.inline
    implicit class ButtonVisibilityOptionsMutableBuilder[Self <: ButtonVisibilityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined parent std.Required<std.Pick<react.react.HTMLAttributes<std.HTMLButtonElement>, 'onClick' | 'onKeyDown'>> */
  @js.native
  trait ReturnValue extends StObject {
    
    var defaultFocus: FocusType = js.native
    
    def hide(): Unit = js.native
    
    var onClick: MouseEventHandler[HTMLButtonElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLButtonElement] = js.native
    
    var visible: Boolean = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply(
      defaultFocus: FocusType,
      hide: () => Unit,
      onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit,
      onKeyDown: SyntheticKeyboardEvent[HTMLButtonElement] => Unit,
      visible: Boolean
    ): ReturnValue = {
      val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), onClick = js.Any.fromFunction1(onClick), onKeyDown = js.Any.fromFunction1(onKeyDown), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFocus(value: FocusType): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
