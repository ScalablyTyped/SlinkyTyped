package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerPolicyInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The policy attributes.
    */
  var PolicyAttributes: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyAttributes] = js.native
  /**
    * The name of the load balancer policy to be created. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typingsSlinky.awsSdk.elbMod.PolicyName = js.native
  /**
    * The name of the base policy type. To get the list of policy types, use DescribeLoadBalancerPolicyTypes.
    */
  var PolicyTypeName: typingsSlinky.awsSdk.elbMod.PolicyTypeName = js.native
}

object CreateLoadBalancerPolicyInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, PolicyName: PolicyName, PolicyTypeName: PolicyTypeName): CreateLoadBalancerPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], PolicyTypeName = PolicyTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerPolicyInput]
  }
  @scala.inline
  implicit class CreateLoadBalancerPolicyInputOps[Self <: CreateLoadBalancerPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyTypeName(value: PolicyTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyAttributes(value: PolicyAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyAttributes")(js.undefined)
        ret
    }
  }
  
}

