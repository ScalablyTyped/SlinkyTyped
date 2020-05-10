package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeSecurityGroupEgressRequest extends js.Object {
  /**
    * Not supported. Use a set of IP permissions to specify the CIDR.
    */
  var CidrIp: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The ID of the security group.
    */
  var GroupId: SecurityGroupId = js.native
  /**
    * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the protocol name or number.
    */
  var IpProtocol: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}

object RevokeSecurityGroupEgressRequest {
  @scala.inline
  def apply(GroupId: SecurityGroupId): RevokeSecurityGroupEgressRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSecurityGroupEgressRequest]
  }
  @scala.inline
  implicit class RevokeSecurityGroupEgressRequestOps[Self <: RevokeSecurityGroupEgressRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: SecurityGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrIp")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withFromPort(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromPort")(js.undefined)
        ret
    }
    @scala.inline
    def withIpPermissions(value: IpPermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withIpProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSecurityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSecurityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSecurityGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSecurityGroupOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSecurityGroupOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSecurityGroupOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceSecurityGroupOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withToPort(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToPort")(js.undefined)
        ret
    }
  }
  
}

