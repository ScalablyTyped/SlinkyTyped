package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeClientVpnIngressRequest extends js.Object {
  /**
    * The ID of the Active Directory group for which to revoke access. 
    */
  var AccessGroupId: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether access should be revoked for all clients.
    */
  var RevokeAllGroups: js.UndefOr[Boolean] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
    */
  var TargetNetworkCidr: String = js.native
}

object RevokeClientVpnIngressRequest {
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, TargetNetworkCidr: String): RevokeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClientVpnIngressRequest]
  }
  @scala.inline
  implicit class RevokeClientVpnIngressRequestOps[Self <: RevokeClientVpnIngressRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientVpnEndpointId(value: ClientVpnEndpointId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetNetworkCidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetNetworkCidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessGroupId")(js.undefined)
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
    def withRevokeAllGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevokeAllGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokeAllGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevokeAllGroups")(js.undefined)
        ret
    }
  }
  
}

