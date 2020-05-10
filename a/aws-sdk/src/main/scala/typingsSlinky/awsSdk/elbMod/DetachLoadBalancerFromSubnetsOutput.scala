package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachLoadBalancerFromSubnetsOutput extends js.Object {
  /**
    * The IDs of the remaining subnets for the load balancer.
    */
  var Subnets: js.UndefOr[typingsSlinky.awsSdk.elbMod.Subnets] = js.native
}

object DetachLoadBalancerFromSubnetsOutput {
  @scala.inline
  def apply(): DetachLoadBalancerFromSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
  }
  @scala.inline
  implicit class DetachLoadBalancerFromSubnetsOutputOps[Self <: DetachLoadBalancerFromSubnetsOutput] (val x: Self) extends AnyVal {
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

