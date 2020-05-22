package typingsSlinky.loadableComponent.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fallback extends js.Object {
  var fallback: js.UndefOr[ReactElement] = js.undefined
}

object Fallback {
  @scala.inline
  def apply(fallback: ReactElement = null): Fallback = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback]
  }
}

