package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnoreCancelled extends js.Object {
  var ignoreCancelled: js.UndefOr[Boolean] = js.native
}

object AnonIgnoreCancelled {
  @scala.inline
  def apply(): AnonIgnoreCancelled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIgnoreCancelled]
  }
  @scala.inline
  implicit class AnonIgnoreCancelledOps[Self <: AnonIgnoreCancelled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCancelled")(js.undefined)
        ret
    }
  }
  
}

