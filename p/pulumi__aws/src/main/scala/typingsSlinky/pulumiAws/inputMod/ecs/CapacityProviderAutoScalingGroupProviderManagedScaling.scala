package typingsSlinky.pulumiAws.inputMod.ecs

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProviderManagedScaling extends js.Object {
  var maximumScalingStepSize: js.UndefOr[Input[Double]] = js.native
  var minimumScalingStepSize: js.UndefOr[Input[Double]] = js.native
  var status: js.UndefOr[Input[String]] = js.native
  var targetCapacity: js.UndefOr[Input[Double]] = js.native
}

object CapacityProviderAutoScalingGroupProviderManagedScaling {
  @scala.inline
  def apply(): CapacityProviderAutoScalingGroupProviderManagedScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProviderManagedScaling]
  }
  @scala.inline
  implicit class CapacityProviderAutoScalingGroupProviderManagedScalingOps[Self <: CapacityProviderAutoScalingGroupProviderManagedScaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumScalingStepSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScalingStepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumScalingStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScalingStepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumScalingStepSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumScalingStepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumScalingStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumScalingStepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCapacity")(js.undefined)
        ret
    }
  }
  
}

