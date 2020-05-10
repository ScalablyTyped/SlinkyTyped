package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddIpRoutesRequest extends js.Object {
  /**
    * Identifier (ID) of the directory to which to add the address block.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the DNS server used for your on-premises domain.
    */
  var IpRoutes: typingsSlinky.awsSdk.directoryserviceMod.IpRoutes = js.native
  /**
    * If set to true, updates the inbound and outbound rules of the security group that has the description: "AWS created security group for directory ID directory controllers." Following are the new rules:  Inbound:   Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0   Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0   Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0   Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0   Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0    Outbound:   Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0   These security rules impact an internal network interface that is not exposed publicly.
    */
  var UpdateSecurityGroupForDirectoryControllers: js.UndefOr[
    typingsSlinky.awsSdk.directoryserviceMod.UpdateSecurityGroupForDirectoryControllers
  ] = js.native
}

object AddIpRoutesRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, IpRoutes: IpRoutes): AddIpRoutesRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], IpRoutes = IpRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIpRoutesRequest]
  }
  @scala.inline
  implicit class AddIpRoutesRequestOps[Self <: AddIpRoutesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpRoutes(value: IpRoutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateSecurityGroupForDirectoryControllers(value: UpdateSecurityGroupForDirectoryControllers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateSecurityGroupForDirectoryControllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSecurityGroupForDirectoryControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateSecurityGroupForDirectoryControllers")(js.undefined)
        ret
    }
  }
  
}

