package typingsSlinky.loadableComponent

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFallback extends js.Object {
  var fallback: js.UndefOr[ReactElement] = js.undefined
}

object AnonFallback {
  @scala.inline
  def apply(fallback: ReactElement = null): AnonFallback = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFallback]
  }
}

