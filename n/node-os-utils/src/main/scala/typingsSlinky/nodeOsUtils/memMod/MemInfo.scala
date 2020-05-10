package typingsSlinky.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.nodeOsUtils.memMod.MemUsedInfo because var conflicts: totalMemMb. Inlined usedMemMb */ @js.native
trait MemInfo extends MemFreeInfo {
  var freeMemPercentage: Double = js.native
  var usedMemMb: Double = js.native
}

object MemInfo {
  @scala.inline
  def apply(freeMemMb: Double, freeMemPercentage: Double, totalMemMb: Double, usedMemMb: Double): MemInfo = {
    val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], freeMemPercentage = freeMemPercentage.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemInfo]
  }
  @scala.inline
  implicit class MemInfoOps[Self <: MemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreeMemPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeMemPercentage")(value.asInstanceOf[js.Any])
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

