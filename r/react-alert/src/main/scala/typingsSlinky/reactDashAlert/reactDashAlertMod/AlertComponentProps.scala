package typingsSlinky.reactDashAlert.reactDashAlertMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertComponentProps extends js.Object {
  var id: String
  var message: TagMod[Any]
  var options: AlertCustomOptionsWithType
  def close(): Unit
}

object AlertComponentProps {
  @scala.inline
  def apply(close: () => Unit, id: String, message: TagMod[Any], options: AlertCustomOptionsWithType): AlertComponentProps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlertComponentProps]
  }
}

