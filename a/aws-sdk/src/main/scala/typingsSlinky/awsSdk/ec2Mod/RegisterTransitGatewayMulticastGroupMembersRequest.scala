package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTransitGatewayMulticastGroupMembersRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  /**
    * The group members' network interface IDs to register with the transit gateway multicast group.
    */
  var NetworkInterfaceIds: js.UndefOr[TransitGatewayNetworkInterfaceIdList] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayMulticastDomainId] = js.native
}

object RegisterTransitGatewayMulticastGroupMembersRequest {
  @scala.inline
  def apply(): RegisterTransitGatewayMulticastGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupMembersRequest]
  }
  @scala.inline
  implicit class RegisterTransitGatewayMulticastGroupMembersRequestOps[Self <: RegisterTransitGatewayMulticastGroupMembersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGroupIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceIds(value: TransitGatewayNetworkInterfaceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayMulticastDomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayMulticastDomainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayMulticastDomainId")(js.undefined)
        ret
    }
  }
  
}

