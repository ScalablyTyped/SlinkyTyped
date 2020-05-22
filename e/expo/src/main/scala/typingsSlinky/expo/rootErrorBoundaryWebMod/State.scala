package typingsSlinky.expo.rootErrorBoundaryWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var error: js.Error | Null
}

object State {
  @scala.inline
  def apply(error: js.Error = null): State = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

