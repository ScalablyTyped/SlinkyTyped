package typingsSlinky.pulumiAws.elbLoadBalancerBackendServerPolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerBackendServerPolicyState extends js.Object {
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: js.UndefOr[Input[Double]] = js.native
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: js.UndefOr[Input[String]] = js.native
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object LoadBalancerBackendServerPolicyState {
  @scala.inline
  def apply(): LoadBalancerBackendServerPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerBackendServerPolicyState]
  }
  @scala.inline
  implicit class LoadBalancerBackendServerPolicyStateOps[Self <: LoadBalancerBackendServerPolicyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstancePort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePort")(js.undefined)
        ret
    }
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
    def withPolicyNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyNames")(js.undefined)
        ret
    }
  }
  
}

