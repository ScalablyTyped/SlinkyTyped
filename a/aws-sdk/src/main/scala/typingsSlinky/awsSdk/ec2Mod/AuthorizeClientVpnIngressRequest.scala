package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeClientVpnIngressRequest extends js.Object {
  /**
    * The ID of the Active Directory group to grant access.
    */
  var AccessGroupId: js.UndefOr[String] = js.native
  /**
    * Indicates whether to grant access to all clients. Use true to grant all clients who successfully establish a VPN connection access to the network.
    */
  var AuthorizeAllGroups: js.UndefOr[Boolean] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * A brief description of the authorization rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
    */
  var TargetNetworkCidr: String = js.native
}

object AuthorizeClientVpnIngressRequest {
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, TargetNetworkCidr: String): AuthorizeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClientVpnIngressRequest]
  }
  @scala.inline
  implicit class AuthorizeClientVpnIngressRequestOps[Self <: AuthorizeClientVpnIngressRequest] (val x: Self) extends AnyVal {
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
    def withAuthorizeAllGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizeAllGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizeAllGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizeAllGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
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
  }
  
}

