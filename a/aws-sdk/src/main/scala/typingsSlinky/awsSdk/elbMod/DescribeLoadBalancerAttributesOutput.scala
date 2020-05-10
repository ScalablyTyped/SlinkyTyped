package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerAttributesOutput extends js.Object {
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[typingsSlinky.awsSdk.elbMod.LoadBalancerAttributes] = js.native
}

object DescribeLoadBalancerAttributesOutput {
  @scala.inline
  def apply(): DescribeLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
  }
  @scala.inline
  implicit class DescribeLoadBalancerAttributesOutputOps[Self <: DescribeLoadBalancerAttributesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerAttributes(value: LoadBalancerAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerAttributes")(js.undefined)
        ret
    }
  }
  
}

