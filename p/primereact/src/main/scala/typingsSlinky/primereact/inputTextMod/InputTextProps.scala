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
import scala.scalajs.js.annotation._

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
    def withKeyfilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyfilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyfilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyfilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: /* event */ SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipOptions(value: TooltipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnly")(js.undefined)
        ret
    }
  }
  
}

