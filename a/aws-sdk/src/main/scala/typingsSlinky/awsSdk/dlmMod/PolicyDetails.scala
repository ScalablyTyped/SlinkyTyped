package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDetails extends js.Object {
  /**
    * A set of optional parameters for the policy. 
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.dlmMod.Parameters] = js.native
  /**
    * The valid target resource types and actions a policy can manage. The default is EBS_SNAPSHOT_MANAGEMENT.
    */
  var PolicyType: js.UndefOr[PolicyTypeValues] = js.native
  /**
    * The resource type.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.native
  /**
    * The schedule of policy-defined actions.
    */
  var Schedules: js.UndefOr[ScheduleList] = js.native
  /**
    * The single tag that identifies targeted resources for this policy.
    */
  var TargetTags: js.UndefOr[TargetTagList] = js.native
}

object PolicyDetails {
  @scala.inline
  def apply(): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetails]
  }
  @scala.inline
  implicit class PolicyDetailsOps[Self <: PolicyDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyType(value: PolicyTypeValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTypes(value: ResourceTypeValuesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedules(value: ScheduleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedules")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTags(value: TargetTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTags")(js.undefined)
        ret
    }
  }
  
}

