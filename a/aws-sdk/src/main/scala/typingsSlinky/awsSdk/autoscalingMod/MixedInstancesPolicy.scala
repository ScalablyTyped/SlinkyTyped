package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixedInstancesPolicy extends js.Object {
  /**
    * The instances distribution to use. If you leave this parameter unspecified, the value for each parameter in InstancesDistribution uses a default value.
    */
  var InstancesDistribution: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.InstancesDistribution] = js.native
  /**
    * The launch template and instance types (overrides). This parameter must be specified when creating a mixed instances policy.
    */
  var LaunchTemplate: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.LaunchTemplate] = js.native
}

object MixedInstancesPolicy {
  @scala.inline
  def apply(): MixedInstancesPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedInstancesPolicy]
  }
  @scala.inline
  implicit class MixedInstancesPolicyOps[Self <: MixedInstancesPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstancesDistribution(value: InstancesDistribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesDistribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesDistribution")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplate(value: LaunchTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplate")(js.undefined)
        ret
    }
  }
  
}

