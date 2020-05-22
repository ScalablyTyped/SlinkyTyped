package typingsSlinky.nextReactDevOverlay.errorBoundaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBoundaryState extends js.Object {
  var error: js.Error | Null
}

object ErrorBoundaryState {
  @scala.inline
  def apply(error: js.Error = null): ErrorBoundaryState = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBoundaryState]
  }
}

