package typingsSlinky.antd.libAutoDashCompleteMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import typingsSlinky.react.reactMod.FormEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteInputProps extends js.Object {
  var onChange: js.UndefOr[FormEventHandler[_]] = js.undefined
  var value: js.Any
}

object AutoCompleteInputProps {
  @scala.inline
  def apply(value: js.Any, onChange: SyntheticEvent[EventTarget with _, Event] => Unit = null): AutoCompleteInputProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[AutoCompleteInputProps]
  }
}

