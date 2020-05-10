package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySecurityGroupsToLoadBalancerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The IDs of the security groups to associate with the load balancer. Note that you cannot specify the name of the security group.
    */
  var SecurityGroups: typingsSlinky.awsSdk.elbMod.SecurityGroups = js.native
}

object ApplySecurityGroupsToLoadBalancerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, SecurityGroups: SecurityGroups): ApplySecurityGroupsToLoadBalancerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerInput]
  }
  @scala.inline
  implicit class ApplySecurityGroupsToLoadBalancerInputOps[Self <: ApplySecurityGroupsToLoadBalancerInput] (val x: Self) extends AnyVal {
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
    def withSecurityGroups(value: SecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

