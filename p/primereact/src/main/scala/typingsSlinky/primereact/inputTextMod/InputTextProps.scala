package typingsSlinky.primereact.inputTextMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Event_
import typingsSlinky.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTextProps
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var keyfilter: js.UndefOr[js.Any] = js.undefined
  @JSName("onInput")
  var onInput_InputTextProps: js.UndefOr[
    js.Function1[
      SyntheticEvent[EventTarget with org.scalajs.dom.raw.HTMLInputElement, Event_], 
      Unit
    ]
  ] = js.undefined
  @JSName("onKeyPress")
  var onKeyPress_InputTextProps: js.UndefOr[
    js.Function1[/* event */ SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLInputElement], Unit]
  ] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}

object InputTextProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLInputElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    keyfilter: js.Any = null,
    onInput: SyntheticEvent[EventTarget with org.scalajs.dom.raw.HTMLInputElement, Event_] => Unit = null,
    onKeyPress: /* event */ SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLInputElement] => Unit = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    validateOnly: js.UndefOr[Boolean] = js.undefined
  ): InputTextProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keyfilter != null) __obj.updateDynamic("keyfilter")(keyfilter.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTextProps]
  }
}

