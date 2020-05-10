package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaleIpPermission extends js.Object {
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The IP protocol name (for tcp, udp, and icmp) or number (see Protocol Numbers).
    */
  var IpProtocol: js.UndefOr[String] = js.native
  /**
    * The IP ranges. Not applicable for stale security group rules.
    */
  var IpRanges: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.IpRanges] = js.native
  /**
    * The prefix list IDs for an AWS service. Not applicable for stale security group rules.
    */
  var PrefixListIds: js.UndefOr[PrefixListIdSet] = js.native
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var ToPort: js.UndefOr[Integer] = js.native
  /**
    * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the VPC peering connection.
    */
  var UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet] = js.native
}

object StaleIpPermission {
  @scala.inline
  def apply(): StaleIpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaleIpPermission]
  }
  @scala.inline
  implicit class StaleIpPermissionOps[Self <: StaleIpPermission] (val x: Self) extends AnyVal {
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
    def withIpRanges(value: IpRanges): Self = {
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
    def withPrefixListIds(value: PrefixListIdSet): Self = {
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
    def withUserIdGroupPairs(value: UserIdGroupPairSet): Self = {
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

