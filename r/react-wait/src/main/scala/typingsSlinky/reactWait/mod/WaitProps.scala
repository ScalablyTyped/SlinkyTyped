package typingsSlinky.reactWait.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitProps extends WaitingContextWaitProps {
  var on: String
}

object WaitProps {
  @scala.inline
  def apply(fallback: ReactElement, on: String): WaitProps = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitProps]
  }
}

