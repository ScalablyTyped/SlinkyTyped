package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSecurityGroupsOutput extends js.Object {
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroups] = js.native
}

object SetSecurityGroupsOutput {
  @scala.inline
  def apply(): SetSecurityGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSecurityGroupsOutput]
  }
  @scala.inline
  implicit class SetSecurityGroupsOutputOps[Self <: SetSecurityGroupsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupIds(value: SecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

