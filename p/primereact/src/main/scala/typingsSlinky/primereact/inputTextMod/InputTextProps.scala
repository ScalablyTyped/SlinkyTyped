package typingsSlinky.primereact.inputTextMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputTextProps
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]
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
  implicit class InputTextPropsOps[Self <: InputTextProps] (val x: Self) extends AnyVal {
    
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
    def setKeyfilter(value: js.Any): Self = this.set("keyfilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyfilter: Self = this.set("keyfilter", js.undefined)
    
    @scala.inline
    def setOnInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: /* event */ SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = this.set("validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnly: Self = this.set("validateOnly", js.undefined)
  }
}
