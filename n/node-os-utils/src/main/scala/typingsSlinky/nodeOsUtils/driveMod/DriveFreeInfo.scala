package typingsSlinky.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveFreeInfo extends js.Object {
  var freeGb: Double = js.native
  var freePercentage: Double = js.native
  var totalGb: Double = js.native
}

object DriveFreeInfo {
  @scala.inline
  def apply(freeGb: Double, freePercentage: Double, totalGb: Double): DriveFreeInfo = {
    val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveFreeInfo]
  }
  @scala.inline
  implicit class DriveFreeInfoOps[Self <: DriveFreeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreeGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreePercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalGb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

