package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedScaling extends js.Object {
  /**
    * The maximum number of container instances that Amazon ECS will scale in or scale out at one time. If this parameter is omitted, the default value of 10000 is used.
    */
  var maximumScalingStepSize: js.UndefOr[ManagedScalingStepSize] = js.native
  /**
    * The minimum number of container instances that Amazon ECS will scale in or scale out at one time. If this parameter is omitted, the default value of 1 is used.
    */
  var minimumScalingStepSize: js.UndefOr[ManagedScalingStepSize] = js.native
  /**
    * Whether or not to enable managed scaling for the capacity provider.
    */
  var status: js.UndefOr[ManagedScalingStatus] = js.native
  /**
    * The target capacity value for the capacity provider. The specified value must be greater than 0 and less than or equal to 100. A value of 100 will result in the Amazon EC2 instances in your Auto Scaling group being completely utilized.
    */
  var targetCapacity: js.UndefOr[ManagedScalingTargetCapacity] = js.native
}

object ManagedScaling {
  @scala.inline
  def apply(): ManagedScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedScaling]
  }
  @scala.inline
  implicit class ManagedScalingOps[Self <: ManagedScaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumScalingStepSize(value: ManagedScalingStepSize): Self = {
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
    def withMinimumScalingStepSize(value: ManagedScalingStepSize): Self = {
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
    def withStatus(value: ManagedScalingStatus): Self = {
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
    def withTargetCapacity(value: ManagedScalingTargetCapacity): Self = {
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

