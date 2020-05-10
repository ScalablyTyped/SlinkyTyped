package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerState extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * One of the following load balancer states:    Adding - The instances in the group are being registered with the load balancer.    Added - All instances in the group are registered with the load balancer.    InService - At least one instance in the group passed an ELB health check.    Removing - The instances in the group are being deregistered from the load balancer. If connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the instances.    Removed - All instances in the group are deregistered from the load balancer.  
    */
  var State: js.UndefOr[XmlStringMaxLen255] = js.native
}

object LoadBalancerState {
  @scala.inline
  def apply(): LoadBalancerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerState]
  }
  @scala.inline
  implicit class LoadBalancerStateOps[Self <: LoadBalancerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

