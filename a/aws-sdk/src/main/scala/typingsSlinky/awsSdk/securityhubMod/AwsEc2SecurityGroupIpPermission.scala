package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupIpPermission extends js.Object {
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes. 
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number. [VPC only] Use -1 to specify all protocols. When authorizing security group rules, specifying -1 or a protocol number other than tcp, udp, icmp, or icmpv6 allows traffic on all ports, regardless of any port range you specify. For tcp, udp, and icmp, you must specify a port range. For icmpv6, the port range is optional. If you omit the port range, traffic for all types and codes is allowed. 
    */
  var IpProtocol: js.UndefOr[NonEmptyString] = js.native
  /**
    * The IPv4 ranges.
    */
  var IpRanges: js.UndefOr[AwsEc2SecurityGroupIpRangeList] = js.native
  /**
    * The IPv6 ranges.
    */
  var Ipv6Ranges: js.UndefOr[AwsEc2SecurityGroupIpv6RangeList] = js.native
  /**
    * [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access through a VPC endpoint from instances associated with the security group.
    */
  var PrefixListIds: js.UndefOr[AwsEc2SecurityGroupPrefixListIdList] = js.native
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var ToPort: js.UndefOr[Integer] = js.native
  /**
    * The security group and AWS account ID pairs.
    */
  var UserIdGroupPairs: js.UndefOr[AwsEc2SecurityGroupUserIdGroupPairList] = js.native
}

object AwsEc2SecurityGroupIpPermission {
  @scala.inline
  def apply(): AwsEc2SecurityGroupIpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupIpPermission]
  }
  @scala.inline
  implicit class AwsEc2SecurityGroupIpPermissionOps[Self <: AwsEc2SecurityGroupIpPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIpProtocol(value: NonEmptyString): Self = {
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
    def withIpRanges(value: AwsEc2SecurityGroupIpRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Ranges(value: AwsEc2SecurityGroupIpv6RangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Ranges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixListIds(value: AwsEc2SecurityGroupPrefixListIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefixListIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixListIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefixListIds")(js.undefined)
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
    @scala.inline
    def withUserIdGroupPairs(value: AwsEc2SecurityGroupUserIdGroupPairList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIdGroupPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIdGroupPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIdGroupPairs")(js.undefined)
        ret
    }
  }
  
}

