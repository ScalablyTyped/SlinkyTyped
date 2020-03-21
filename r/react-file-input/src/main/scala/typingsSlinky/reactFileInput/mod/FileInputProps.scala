package typingsSlinky.reactFileInput.mod

import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInputProps extends js.Object {
  var accept: String
  var className: String
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: String
  var placeholder: String
  def onChange(event: SyntheticEvent[Event_, _]): Unit
}

object FileInputProps {
  @scala.inline
  def apply(
    accept: String,
    className: String,
    name: String,
    onChange: SyntheticEvent[Event_, _] => Unit,
    placeholder: String,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): FileInputProps = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInputProps]
  }
}

