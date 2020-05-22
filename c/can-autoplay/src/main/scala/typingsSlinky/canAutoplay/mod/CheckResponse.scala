package typingsSlinky.canAutoplay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResponse extends js.Object {
  var error: js.Error
  var result: Boolean
}

object CheckResponse {
  @scala.inline
  def apply(error: js.Error, result: Boolean): CheckResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResponse]
  }
}

