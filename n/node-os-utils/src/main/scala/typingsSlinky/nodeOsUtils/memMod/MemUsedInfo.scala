package typingsSlinky.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemUsedInfo extends js.Object {
  var totalMemMb: Double = js.native
  var usedMemMb: Double = js.native
}

object MemUsedInfo {
  @scala.inline
  def apply(totalMemMb: Double, usedMemMb: Double): MemUsedInfo = {
    val __obj = js.Dynamic.literal(totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemUsedInfo]
  }
  @scala.inline
  implicit class MemUsedInfoOps[Self <: MemUsedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalMemMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMemMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedMemMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedMemMb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

