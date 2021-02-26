package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusStateMod {
  
  @JSImport("@react-md/form/types/useFocusState", "useFocusState")
  @js.native
  def useFocusState(hasOnFocusOnBlur: Options): js.Tuple3[Boolean, FocusEventHandler, BlurEventHandler] = js.native
  
  type BlurEventHandler = typingsSlinky.react.mod.FocusEventHandler[FocusElement]
  
  type FocusElement = HTMLInputElement | HTMLTextAreaElement | HTMLLabelElement | HTMLSelectElement | HTMLDivElement
  
  type FocusEventHandler = typingsSlinky.react.mod.FocusEventHandler[FocusElement]
  
  /* Inlined std.Pick<react.react.HTMLAttributes<@react-md/form.@react-md/form/types/useFocusState.FocusElement>, 'onBlur' | 'onFocus'> */
  @js.native
  trait Options extends StObject {
    
    var onBlur: js.UndefOr[typingsSlinky.react.mod.FocusEventHandler[FocusElement]] = js.native
    
    var onFocus: js.UndefOr[typingsSlinky.react.mod.FocusEventHandler[FocusElement]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[FocusElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[FocusElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
