package typingsSlinky.primereact

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTextMod {
  
  @JSImport("primereact/components/inputtext/InputText", "InputText")
  @js.native
  class InputText protected ()
    extends Component[InputTextProps, js.Any, js.Any] {
    def this(props: InputTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputTextProps, context: js.Any) = this()
  }
  
  @js.native
  trait InputTextProps
    extends HTMLProps[HTMLInputElement]
       with /* key */ StringDictionary[js.Any] {
    
    var keyfilter: js.UndefOr[js.Any] = js.native
    
    @JSName("onInput")
    var onInput_InputTextProps: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLInputElement, Event], Unit]] = js.native
    
    @JSName("onKeyPress")
    var onKeyPress_InputTextProps: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[HTMLInputElement], Unit]] = js.native
    
    var tooltip: js.UndefOr[js.Any] = js.native
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
    
    var validateOnly: js.UndefOr[Boolean] = js.native
  }
  object InputTextProps {
    
    @scala.inline
    def apply(): InputTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputTextProps]
    }
    
    @scala.inline
    implicit class InputTextPropsMutableBuilder[Self <: InputTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyfilter(value: js.Any): Self = StObject.set(x, "keyfilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyfilterUndefined: Self = StObject.set(x, "keyfilter", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: /* event */ SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    }
  }
}
