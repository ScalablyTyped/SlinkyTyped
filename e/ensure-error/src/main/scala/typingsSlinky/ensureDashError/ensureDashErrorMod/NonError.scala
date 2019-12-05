package typingsSlinky.ensureDashError.ensureDashErrorMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonError extends Error {
  @JSName("name")
  var name_NonError: typingsSlinky.ensureDashError.ensureDashErrorStrings.NonError
}

object NonError {
  @scala.inline
  def apply(
    message: String,
    name: typingsSlinky.ensureDashError.ensureDashErrorStrings.NonError,
    stack: String = null
  ): NonError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonError]
  }
}

