package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySecurityGroupsToClientVpnTargetNetworkResult extends js.Object {
  /**
    * The IDs of the applied security groups.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
}

object ApplySecurityGroupsToClientVpnTargetNetworkResult {
  @scala.inline
  def apply(): ApplySecurityGroupsToClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkResult]
  }
  @scala.inline
  implicit class ApplySecurityGroupsToClientVpnTargetNetworkResultOps[Self <: ApplySecurityGroupsToClientVpnTargetNetworkResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = {
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

