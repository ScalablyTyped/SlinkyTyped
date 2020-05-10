package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeSecurityGroupIngressRequest extends js.Object {
  /**
    * The IPv4 address range, in CIDR format. You can't specify this parameter when specifying a source security group. To specify an IPv6 address range, use a set of IP permissions. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var CidrIp: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use -1 to specify all types. If you specify all ICMP types, you must specify all codes. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
    */
  var GroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the security group name in the request.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.native
  /**
    * The sets of IP permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.native
  /**
    * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers). To specify icmpv6, use a set of IP permissions. [VPC only] Use -1 to specify all protocols. If you specify -1 or a protocol other than tcp, udp, or icmp, traffic on all ports is allowed, regardless of any ports you specify. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var IpProtocol: js.UndefOr[String] = js.native
  /**
    * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead. For EC2-VPC, the source security group must be in the same VPC.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * [nondefault VPC] The AWS account ID for the source security group, if the source security group is in a different account. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. Creates rules that grant full ICMP, UDP, and TCP access. To create a rule with a specific IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use -1 to specify all codes. If you specify all ICMP types, you must specify all codes. Alternatively, use a set of IP permissions to specify multiple rules and a description for the rule.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}

object AuthorizeSecurityGroupIngressRequest {
  @scala.inline
  def apply(): AuthorizeSecurityGroupIngressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeSecurityGroupIngressRequest]
  }
  @scala.inline
  implicit class AuthorizeSecurityGroupIngressRequestOps[Self <: AuthorizeSecurityGroupIngressRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGroupId(value: SecurityGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: SecurityGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
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

