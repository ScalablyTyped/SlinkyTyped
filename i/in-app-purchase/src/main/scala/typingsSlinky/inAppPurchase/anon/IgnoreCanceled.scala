package typingsSlinky.inAppPurchase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreCanceled extends js.Object {
  var ignoreCanceled: Boolean = js.native
  var ignoreExpired: Boolean = js.native
}

object IgnoreCanceled {
  @scala.inline
  def apply(ignoreCanceled: Boolean, ignoreExpired: Boolean): IgnoreCanceled = {
    val __obj = js.Dynamic.literal(ignoreCanceled = ignoreCanceled.asInstanceOf[js.Any], ignoreExpired = ignoreExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreCanceled]
  }
  @scala.inline
  implicit class IgnoreCanceledOps[Self <: IgnoreCanceled] (val x: Self) extends AnyVal {
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

