package typingsSlinky.grommet.formMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import typingsSlinky.grommet.AnonInvalid
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var messages: js.UndefOr[AnonInvalid] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[Element], Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event_, Element], _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with Element, Event_], Unit]] = js.undefined
  var value: js.UndefOr[js.Object] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    errors: js.Object = null,
    messages: AnonInvalid = null,
    onChange: /* event */ ChangeEvent[Element] => Unit = null,
    onReset: /* event */ SyntheticEvent[Event_, Element] => _ = null,
    onSubmit: SyntheticEvent[EventTarget with Element, Event_] => Unit = null,
    value: js.Object = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
}

