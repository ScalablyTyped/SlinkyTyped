package typingsSlinky.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicy extends js.Object {
  /**
    * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
    */
  var instancesDistribution: js.UndefOr[GroupMixedInstancesPolicyInstancesDistribution] = js.native
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  var launchTemplate: GroupMixedInstancesPolicyLaunchTemplate = js.native
}

object GroupMixedInstancesPolicy {
  @scala.inline
  def apply(launchTemplate: GroupMixedInstancesPolicyLaunchTemplate): GroupMixedInstancesPolicy = {
    val __obj = js.Dynamic.literal(launchTemplate = launchTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicy]
  }
  @scala.inline
  implicit class GroupMixedInstancesPolicyOps[Self <: GroupMixedInstancesPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplate(value: GroupMixedInstancesPolicyLaunchTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstancesDistribution(value: GroupMixedInstancesPolicyInstancesDistribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancesDistribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancesDistribution")(js.undefined)
        ret
    }
  }
  
}

