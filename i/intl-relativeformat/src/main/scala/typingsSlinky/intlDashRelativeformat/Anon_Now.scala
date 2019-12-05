package typingsSlinky.intlDashRelativeformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Now extends js.Object {
  var now: js.UndefOr[js.Date | Double | Null] = js.undefined
}

object Anon_Now {
  @scala.inline
  def apply(now: js.Date | Double = null): Anon_Now = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Now]
  }
}

