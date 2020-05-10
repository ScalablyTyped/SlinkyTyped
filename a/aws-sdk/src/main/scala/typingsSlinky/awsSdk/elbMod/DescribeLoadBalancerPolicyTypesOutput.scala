package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerPolicyTypesOutput extends js.Object {
  /**
    * Information about the policy types.
    */
  var PolicyTypeDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyTypeDescriptions] = js.native
}

object DescribeLoadBalancerPolicyTypesOutput {
  @scala.inline
  def apply(): DescribeLoadBalancerPolicyTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
  }
  @scala.inline
  implicit class DescribeLoadBalancerPolicyTypesOutputOps[Self <: DescribeLoadBalancerPolicyTypesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyTypeDescriptions(value: PolicyTypeDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypeDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyTypeDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypeDescriptions")(js.undefined)
        ret
    }
  }
  
}

