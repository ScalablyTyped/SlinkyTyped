package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySecurityGroupsToLoadBalancerOutput extends js.Object {
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.elbMod.SecurityGroups] = js.native
}

object ApplySecurityGroupsToLoadBalancerOutput {
  @scala.inline
  def apply(): ApplySecurityGroupsToLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerOutput]
  }
  @scala.inline
  implicit class ApplySecurityGroupsToLoadBalancerOutputOps[Self <: ApplySecurityGroupsToLoadBalancerOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroups(value: SecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
  }
  
}

