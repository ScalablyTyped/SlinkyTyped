package typingsSlinky.pRetry.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortErrorClass extends Error {
  @JSName("name")
  val name_AbortErrorClass: typingsSlinky.pRetry.pRetryStrings.AbortError
  val originalError: js.Error
}

object AbortErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typingsSlinky.pRetry.pRetryStrings.AbortError,
    originalError: js.Error,
    stack: String = null
  ): AbortErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortErrorClass]
  }
}

