package typingsSlinky.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemFreeInfo extends js.Object {
  var freeMemMb: Double = js.native
  var totalMemMb: Double = js.native
}

object MemFreeInfo {
  @scala.inline
  def apply(freeMemMb: Double, totalMemMb: Double): MemFreeInfo = {
    val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemFreeInfo]
  }
  @scala.inline
  implicit class MemFreeInfoOps[Self <: MemFreeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreeMemMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeMemMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalMemMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMemMb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

