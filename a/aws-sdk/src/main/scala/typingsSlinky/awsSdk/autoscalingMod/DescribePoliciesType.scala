package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePoliciesType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  /**
    * The maximum number of items to be returned with each call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MaxRecords] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  /**
    * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown policy name, it is ignored with no error.
    */
  var PolicyNames: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.PolicyNames] = js.native
  /**
    * One or more policy types. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling.
    */
  var PolicyTypes: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.PolicyTypes] = js.native
}

object DescribePoliciesType {
  @scala.inline
  def apply(): DescribePoliciesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePoliciesType]
  }
  @scala.inline
  implicit class DescribePoliciesTypeOps[Self <: DescribePoliciesType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecords(value: MaxRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyNames(value: PolicyNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyTypes(value: PolicyTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypes")(js.undefined)
        ret
    }
  }
  
}

