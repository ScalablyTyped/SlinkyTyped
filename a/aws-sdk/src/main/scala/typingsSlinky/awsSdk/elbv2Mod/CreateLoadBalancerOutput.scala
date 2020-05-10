package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerOutput extends js.Object {
  /**
    * Information about the load balancer.
    */
  var LoadBalancers: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.LoadBalancers] = js.native
}

object CreateLoadBalancerOutput {
  @scala.inline
  def apply(): CreateLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLoadBalancerOutput]
  }
  @scala.inline
  implicit class CreateLoadBalancerOutputOps[Self <: CreateLoadBalancerOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancers(value: LoadBalancers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancers")(js.undefined)
        ret
    }
  }
  
}

