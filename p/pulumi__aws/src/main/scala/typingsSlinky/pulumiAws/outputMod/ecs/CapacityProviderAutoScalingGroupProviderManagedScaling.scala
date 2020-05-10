package typingsSlinky.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProviderManagedScaling extends js.Object {
  var maximumScalingStepSize: Double = js.native
  var minimumScalingStepSize: Double = js.native
  var status: String = js.native
  var targetCapacity: Double = js.native
}

object CapacityProviderAutoScalingGroupProviderManagedScaling {
  @scala.inline
  def apply(
    maximumScalingStepSize: Double,
    minimumScalingStepSize: Double,
    status: String,
    targetCapacity: Double
  ): CapacityProviderAutoScalingGroupProviderManagedScaling = {
    val __obj = js.Dynamic.literal(maximumScalingStepSize = maximumScalingStepSize.asInstanceOf[js.Any], minimumScalingStepSize = minimumScalingStepSize.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetCapacity = targetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProviderManagedScaling]
  }
  @scala.inline
  implicit class CapacityProviderAutoScalingGroupProviderManagedScalingOps[Self <: CapacityProviderAutoScalingGroupProviderManagedScaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumScalingStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScalingStepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumScalingStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumScalingStepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

