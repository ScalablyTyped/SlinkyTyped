package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerPolicyTypesInput extends js.Object {
  /**
    * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load Balancing.
    */
  var PolicyTypeNames: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyTypeNames] = js.native
}

object DescribeLoadBalancerPolicyTypesInput {
  @scala.inline
  def apply(): DescribeLoadBalancerPolicyTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesInput]
  }
  @scala.inline
  implicit class DescribeLoadBalancerPolicyTypesInputOps[Self <: DescribeLoadBalancerPolicyTypesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyTypeNames(value: PolicyTypeNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyTypeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypeNames")(js.undefined)
        ret
    }
  }
  
}

