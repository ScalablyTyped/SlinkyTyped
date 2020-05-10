package typingsSlinky.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicyLaunchTemplateOverride extends js.Object {
  /**
    * Override the instance type in the Launch Template.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The number of capacity units, which gives the instance type a proportional weight to other instance types.
    */
  var weightedCapacity: js.UndefOr[String] = js.native
}

object GroupMixedInstancesPolicyLaunchTemplateOverride {
  @scala.inline
  def apply(): GroupMixedInstancesPolicyLaunchTemplateOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateOverride]
  }
  @scala.inline
  implicit class GroupMixedInstancesPolicyLaunchTemplateOverrideOps[Self <: GroupMixedInstancesPolicyLaunchTemplateOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedCapacity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedCapacity")(js.undefined)
        ret
    }
  }
  
}

