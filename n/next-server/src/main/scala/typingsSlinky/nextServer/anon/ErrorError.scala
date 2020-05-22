package typingsSlinky.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorError extends js.Object {
  var error: js.Error
}

object ErrorError {
  @scala.inline
  def apply(error: js.Error): ErrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorError]
  }
}

