package typingsSlinky.intlRelativeformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNow extends js.Object {
  var now: js.UndefOr[js.Date | Double | Null] = js.undefined
}

object AnonNow {
  @scala.inline
  def apply(now: js.Date | Double = null): AnonNow = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNow]
  }
}

