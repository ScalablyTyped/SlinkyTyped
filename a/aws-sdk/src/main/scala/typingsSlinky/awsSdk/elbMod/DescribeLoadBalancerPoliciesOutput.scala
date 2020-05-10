package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerPoliciesOutput extends js.Object {
  /**
    * Information about the policies.
    */
  var PolicyDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyDescriptions] = js.native
}

object DescribeLoadBalancerPoliciesOutput {
  @scala.inline
  def apply(): DescribeLoadBalancerPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesOutput]
  }
  @scala.inline
  implicit class DescribeLoadBalancerPoliciesOutputOps[Self <: DescribeLoadBalancerPoliciesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyDescriptions(value: PolicyDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDescriptions")(js.undefined)
        ret
    }
  }
  
}

