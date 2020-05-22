package typingsSlinky.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorAny extends js.Object {
  var error: js.Any
}

object ErrorAny {
  @scala.inline
  def apply(error: js.Any): ErrorAny = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorAny]
  }
}

