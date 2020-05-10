package typingsSlinky.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveUsedInfo extends js.Object {
  var totalGb: Double = js.native
  var usedGb: Double = js.native
  var usedPercentage: Double = js.native
}

object DriveUsedInfo {
  @scala.inline
  def apply(totalGb: Double, usedGb: Double, usedPercentage: Double): DriveUsedInfo = {
    val __obj = js.Dynamic.literal(totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveUsedInfo]
  }
  @scala.inline
  implicit class DriveUsedInfoOps[Self <: DriveUsedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedPercentage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

