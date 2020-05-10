package typingsSlinky.inAppPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnoreCanceled extends js.Object {
  var ignoreCanceled: Boolean = js.native
  var ignoreExpired: Boolean = js.native
}

object AnonIgnoreCanceled {
  @scala.inline
  def apply(ignoreCanceled: Boolean, ignoreExpired: Boolean): AnonIgnoreCanceled = {
    val __obj = js.Dynamic.literal(ignoreCanceled = ignoreCanceled.asInstanceOf[js.Any], ignoreExpired = ignoreExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreCanceled]
  }
  @scala.inline
  implicit class AnonIgnoreCanceledOps[Self <: AnonIgnoreCanceled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreCanceled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExpired")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

