package typingsSlinky.pulumiAws.proxyProtocolPolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyProtocolPolicyArgs extends js.Object {
  /**
    * List of instance ports to which the policy
    * should be applied. This can be specified if the protocol is SSL or TCP.
    */
  val instancePorts: Input[js.Array[Input[String]]] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Input[String] = js.native
}

object ProxyProtocolPolicyArgs {
  @scala.inline
  def apply(instancePorts: Input[js.Array[Input[String]]], loadBalancer: Input[String]): ProxyProtocolPolicyArgs = {
    val __obj = js.Dynamic.literal(instancePorts = instancePorts.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyProtocolPolicyArgs]
  }
  @scala.inline
  implicit class ProxyProtocolPolicyArgsOps[Self <: ProxyProtocolPolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstancePorts(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancer(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

