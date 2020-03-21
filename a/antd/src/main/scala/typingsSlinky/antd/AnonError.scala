package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[js.Error | Null] = js.undefined
  var info: AnonComponentStack
}

object AnonError {
  @scala.inline
  def apply(info: AnonComponentStack, error: js.Error = null): AnonError = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

