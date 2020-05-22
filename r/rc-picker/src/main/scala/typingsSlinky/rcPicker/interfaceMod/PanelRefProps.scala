package typingsSlinky.rcPicker.interfaceMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelRefProps extends js.Object {
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Boolean]] = js.undefined
}

object PanelRefProps {
  @scala.inline
  def apply(
    onBlur: SyntheticFocusEvent[HTMLElement] => Unit = null,
    onClose: () => Unit = null,
    onKeyDown: /* e */ SyntheticKeyboardEvent[HTMLElement] => Boolean = null
  ): PanelRefProps = {
    val __obj = js.Dynamic.literal()
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[PanelRefProps]
  }
}

