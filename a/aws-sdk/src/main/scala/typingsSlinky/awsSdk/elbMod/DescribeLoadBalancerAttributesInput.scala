package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerAttributesInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object DescribeLoadBalancerAttributesInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName): DescribeLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerAttributesInput]
  }
  @scala.inline
  implicit class DescribeLoadBalancerAttributesInputOps[Self <: DescribeLoadBalancerAttributesInput] (val x: Self) extends AnyVal {
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
  }
  
}

