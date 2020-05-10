package typingsSlinky.pulumiAws.loadBalancerPolicyMod

import typingsSlinky.pulumiAws.inputMod.elasticloadbalancing.LoadBalancerPolicyPolicyAttribute
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerPolicyState extends js.Object {
  /**
    * The load balancer on which the policy is defined.
    */
  val loadBalancerName: js.UndefOr[Input[String]] = js.native
  /**
    * Policy attribute to apply to the policy.
    */
  val policyAttributes: js.UndefOr[Input[js.Array[Input[LoadBalancerPolicyPolicyAttribute]]]] = js.native
  /**
    * The name of the load balancer policy.
    */
  val policyName: js.UndefOr[Input[String]] = js.native
  /**
    * The policy type.
    */
  val policyTypeName: js.UndefOr[Input[String]] = js.native
}

object LoadBalancerPolicyState {
  @scala.inline
  def apply(): LoadBalancerPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerPolicyState]
  }
  @scala.inline
  implicit class LoadBalancerPolicyStateOps[Self <: LoadBalancerPolicyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerName")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyAttributes(value: Input[js.Array[Input[LoadBalancerPolicyPolicyAttribute]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyTypeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyTypeName")(js.undefined)
        ret
    }
  }
  
}

