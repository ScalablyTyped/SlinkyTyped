package typingsSlinky.pulumiAws.inputMod.ecs

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProvider extends js.Object {
  var autoScalingGroupArn: Input[String] = js.native
  var managedScaling: js.UndefOr[Input[CapacityProviderAutoScalingGroupProviderManagedScaling]] = js.native
  var managedTerminationProtection: js.UndefOr[Input[String]] = js.native
}

object CapacityProviderAutoScalingGroupProvider {
  @scala.inline
  def apply(autoScalingGroupArn: Input[String]): CapacityProviderAutoScalingGroupProvider = {
    val __obj = js.Dynamic.literal(autoScalingGroupArn = autoScalingGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProvider]
  }
  @scala.inline
  implicit class CapacityProviderAutoScalingGroupProviderOps[Self <: CapacityProviderAutoScalingGroupProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagedScaling(value: Input[CapacityProviderAutoScalingGroupProviderManagedScaling]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedTerminationProtection(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedTerminationProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedTerminationProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedTerminationProtection")(js.undefined)
        ret
    }
  }
  
}

