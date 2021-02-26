package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.grommet.grommetStrings.component
import typingsSlinky.grommet.grommetStrings.document
import typingsSlinky.grommet.utilsMod.KeyboardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardMod {
  
  @JSImport("grommet/components/Keyboard", "Keyboard")
  @js.native
  val Keyboard: ReactComponentClass[KeyboardProps] = js.native
  
  @js.native
  trait KeyboardProps extends StObject {
    
    var onBackspace: js.UndefOr[KeyboardType] = js.native
    
    var onComma: js.UndefOr[KeyboardType] = js.native
    
    var onDown: js.UndefOr[KeyboardType] = js.native
    
    var onEnter: js.UndefOr[KeyboardType] = js.native
    
    var onEsc: js.UndefOr[KeyboardType] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardType] = js.native
    
    var onLeft: js.UndefOr[KeyboardType] = js.native
    
    var onRight: js.UndefOr[KeyboardType] = js.native
    
    var onShift: js.UndefOr[KeyboardType] = js.native
    
    var onSpace: js.UndefOr[KeyboardType] = js.native
    
    var onTab: js.UndefOr[KeyboardType] = js.native
    
    var onUp: js.UndefOr[KeyboardType] = js.native
    
    var target: js.UndefOr[component | document] = js.native
  }
  object KeyboardProps {
    
    @scala.inline
    def apply(): KeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardProps]
    }
    
    @scala.inline
    implicit class KeyboardPropsMutableBuilder[Self <: KeyboardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBackspace(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBackspace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackspaceUndefined: Self = StObject.set(x, "onBackspace", js.undefined)
      
      @scala.inline
      def setOnComma(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onComma", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCommaUndefined: Self = StObject.set(x, "onComma", js.undefined)
      
      @scala.inline
      def setOnDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownUndefined: Self = StObject.set(x, "onDown", js.undefined)
      
      @scala.inline
      def setOnEnter(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEsc(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEsc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnLeft(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeftUndefined: Self = StObject.set(x, "onLeft", js.undefined)
      
      @scala.inline
      def setOnRight(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRightUndefined: Self = StObject.set(x, "onRight", js.undefined)
      
      @scala.inline
      def setOnShift(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onShift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShiftUndefined: Self = StObject.set(x, "onShift", js.undefined)
      
      @scala.inline
      def setOnSpace(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onSpace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSpaceUndefined: Self = StObject.set(x, "onSpace", js.undefined)
      
      @scala.inline
      def setOnTab(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      @scala.inline
      def setOnUp(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpUndefined: Self = StObject.set(x, "onUp", js.undefined)
      
      @scala.inline
      def setTarget(value: component | document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
