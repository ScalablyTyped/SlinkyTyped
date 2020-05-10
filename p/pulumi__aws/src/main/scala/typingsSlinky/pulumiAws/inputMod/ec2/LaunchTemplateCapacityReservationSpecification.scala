package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCapacityReservationSpecification extends js.Object {
  var capacityReservationPreference: js.UndefOr[Input[String]] = js.native
  var capacityReservationTarget: js.UndefOr[Input[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget]] = js.native
}

object LaunchTemplateCapacityReservationSpecification {
  @scala.inline
  def apply(): LaunchTemplateCapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecification]
  }
  @scala.inline
  implicit class LaunchTemplateCapacityReservationSpecificationOps[Self <: LaunchTemplateCapacityReservationSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityReservationPreference(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityReservationPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityReservationPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacityReservationTarget(value: Input[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityReservationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityReservationTarget")(js.undefined)
        ret
    }
  }
  
}

