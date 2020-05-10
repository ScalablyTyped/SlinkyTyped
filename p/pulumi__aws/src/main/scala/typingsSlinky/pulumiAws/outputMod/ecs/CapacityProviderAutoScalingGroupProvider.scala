package typingsSlinky.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderAutoScalingGroupProvider extends js.Object {
  var autoScalingGroupArn: String = js.native
  var managedScaling: CapacityProviderAutoScalingGroupProviderManagedScaling = js.native
  var managedTerminationProtection: String = js.native
}

object CapacityProviderAutoScalingGroupProvider {
  @scala.inline
  def apply(
    autoScalingGroupArn: String,
    managedScaling: CapacityProviderAutoScalingGroupProviderManagedScaling,
    managedTerminationProtection: String
  ): CapacityProviderAutoScalingGroupProvider = {
    val __obj = js.Dynamic.literal(autoScalingGroupArn = autoScalingGroupArn.asInstanceOf[js.Any], managedScaling = managedScaling.asInstanceOf[js.Any], managedTerminationProtection = managedTerminationProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderAutoScalingGroupProvider]
  }
  @scala.inline
  implicit class CapacityProviderAutoScalingGroupProviderOps[Self <: CapacityProviderAutoScalingGroupProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagedScaling(value: CapacityProviderAutoScalingGroupProviderManagedScaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagedTerminationProtection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedTerminationProtection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

