package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerToSubnetsOutput extends js.Object {
  /**
    * The IDs of the subnets attached to the load balancer.
    */
  var Subnets: js.UndefOr[typingsSlinky.awsSdk.elbMod.Subnets] = js.native
}

object AttachLoadBalancerToSubnetsOutput {
  @scala.inline
  def apply(): AttachLoadBalancerToSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachLoadBalancerToSubnetsOutput]
  }
  @scala.inline
  implicit class AttachLoadBalancerToSubnetsOutputOps[Self <: AttachLoadBalancerToSubnetsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnets(value: Subnets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(js.undefined)
        ret
    }
  }
  
}

