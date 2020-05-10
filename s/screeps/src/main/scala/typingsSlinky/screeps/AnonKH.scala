package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKH extends js.Object {
  var KH: AnonCapacity = js.native
  var KH2O: Anon26 = js.native
  var XKH2O: Anon27 = js.native
}

object AnonKH {
  @scala.inline
  def apply(KH: AnonCapacity, KH2O: Anon26, XKH2O: Anon27): AnonKH = {
    val __obj = js.Dynamic.literal(KH = KH.asInstanceOf[js.Any], KH2O = KH2O.asInstanceOf[js.Any], XKH2O = XKH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKH]
  }
  @scala.inline
  implicit class AnonKHOps[Self <: AnonKH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKH(value: AnonCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKH2O(value: Anon26): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KH2O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXKH2O(value: Anon27): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XKH2O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

