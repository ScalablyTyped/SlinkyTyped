package typingsSlinky.blueprintjsCore.propsMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlledProps extends js.Object {
  /** Initial value of the input, for uncontrolled usage. */
  var defaultValue: js.UndefOr[String] = js.undefined
  /** Change event handler. Use `event.target.value` for new value. */
  var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  /** Form value of the input, for controlled usage. */
  var value: js.UndefOr[String] = js.undefined
}

object IControlledProps {
  @scala.inline
  def apply(
    defaultValue: String = null,
    onChange: SyntheticEvent[EventTarget with HTMLElement, Event_] => Unit = null,
    value: String = null
  ): IControlledProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlledProps]
  }
}

