package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachInstancesFromLoadBalancerRequest extends js.Object {
  /**
    * An array of strings containing the names of the instances you want to detach from the load balancer.
    */
  var instanceNames: ResourceNameList = js.native
  /**
    * The name of the Lightsail load balancer.
    */
  var loadBalancerName: ResourceName = js.native
}

object DetachInstancesFromLoadBalancerRequest {
  @scala.inline
  def apply(instanceNames: ResourceNameList, loadBalancerName: ResourceName): DetachInstancesFromLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachInstancesFromLoadBalancerRequest]
  }
  @scala.inline
  implicit class DetachInstancesFromLoadBalancerRequestOps[Self <: DetachInstancesFromLoadBalancerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceNames(value: ResourceNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

