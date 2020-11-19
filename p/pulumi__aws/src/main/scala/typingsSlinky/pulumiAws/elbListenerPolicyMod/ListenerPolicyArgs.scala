package typingsSlinky.pulumiAws.elbListenerPolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerPolicyArgs extends js.Object {
  
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: Input[String] = js.native
  
  /**
    * The load balancer listener port to apply the policy to.
    */
  val loadBalancerPort: Input[Double] = js.native
  
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ListenerPolicyArgs {
  
  @scala.inline
  def apply(loadBalancerName: Input[String], loadBalancerPort: Input[Double]): ListenerPolicyArgs = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], loadBalancerPort = loadBalancerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerPolicyArgs]
  }
  
  @scala.inline
  implicit class ListenerPolicyArgsOps[Self <: ListenerPolicyArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadBalancerName(value: Input[String]): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerPort(value: Input[Double]): Self = this.set("loadBalancerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNamesVarargs(value: Input[String]*): Self = this.set("policyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = this.set("policyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNames: Self = this.set("policyNames", js.undefined)
  }
}
