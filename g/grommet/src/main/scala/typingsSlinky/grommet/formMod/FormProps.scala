package typingsSlinky.grommet.formMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import typingsSlinky.grommet.anon.Invalid
import typingsSlinky.grommet.grommetStrings.blur
import typingsSlinky.grommet.grommetStrings.submit
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var infos: js.UndefOr[js.Object] = js.undefined
  var messages: js.UndefOr[Invalid] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[Element], Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with Element, Event], Unit]] = js.undefined
  var validate: js.UndefOr[blur | submit] = js.undefined
  var value: js.UndefOr[js.Object] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    errors: js.Object = null,
    infos: js.Object = null,
    messages: Invalid = null,
    onChange: /* event */ ChangeEvent[Element] => Unit = null,
    onReset: /* event */ SyntheticEvent[Event, Element] => _ = null,
    onSubmit: SyntheticEvent[EventTarget with Element, Event] => Unit = null,
    validate: blur | submit = null,
    value: js.Object = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (infos != null) __obj.updateDynamic("infos")(infos.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
}

