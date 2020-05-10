package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoadBalancerListenerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The client port numbers of the listeners.
    */
  var LoadBalancerPorts: Ports = js.native
}

object DeleteLoadBalancerListenerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, LoadBalancerPorts: Ports): DeleteLoadBalancerListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPorts = LoadBalancerPorts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerListenerInput]
  }
  @scala.inline
  implicit class DeleteLoadBalancerListenerInputOps[Self <: DeleteLoadBalancerListenerInput] (val x: Self) extends AnyVal {
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
    def withLoadBalancerPorts(value: Ports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerPorts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

