package typingsSlinky.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorError extends js.Object {
  var error: js.Error
}

object AnonErrorError {
  @scala.inline
  def apply(error: js.Error): AnonErrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorError]
  }
}

