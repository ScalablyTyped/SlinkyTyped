package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget extends js.Object {
  var capacityReservationId: js.UndefOr[String] = js.native
}

object LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget {
  @scala.inline
  def apply(): LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget]
  }
  @scala.inline
  implicit class LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetOps[Self <: LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityReservationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityReservationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityReservationId")(js.undefined)
        ret
    }
  }
  
}

