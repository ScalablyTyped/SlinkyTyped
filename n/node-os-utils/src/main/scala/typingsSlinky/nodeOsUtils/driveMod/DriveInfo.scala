package typingsSlinky.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.nodeOsUtils.driveMod.DriveUsedInfo because var conflicts: totalGb. Inlined usedGb, usedPercentage */ @js.native
trait DriveInfo extends DriveFreeInfo {
  var usedGb: Double = js.native
  var usedPercentage: Double = js.native
}

object DriveInfo {
  @scala.inline
  def apply(freeGb: Double, freePercentage: Double, totalGb: Double, usedGb: Double, usedPercentage: Double): DriveInfo = {
    val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveInfo]
  }
  @scala.inline
  implicit class DriveInfoOps[Self <: DriveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

