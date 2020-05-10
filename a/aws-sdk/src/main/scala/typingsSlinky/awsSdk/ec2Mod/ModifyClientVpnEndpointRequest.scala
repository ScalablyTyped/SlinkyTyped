package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClientVpnEndpointRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint to modify.
    */
  var ClientVpnEndpointId: typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ConnectionLogOptions] = js.native
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two DNS servers.
    */
  var DnsServers: js.UndefOr[DnsServersOptionsModifyStructure] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of one or more security groups to apply to the target network.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
  /**
    * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate Manager (ACM).
    */
  var ServerCertificateArn: js.UndefOr[String] = js.native
  /**
    * Indicates whether the VPN is split-tunnel. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC to associate with the Client VPN endpoint.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcId] = js.native
  /**
    * The port number to assign to the Client VPN endpoint for TCP and UDP traffic. Valid Values: 443 | 1194  Default Value: 443 
    */
  var VpnPort: js.UndefOr[Integer] = js.native
}

object ModifyClientVpnEndpointRequest {
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId): ModifyClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClientVpnEndpointRequest]
  }
  @scala.inline
  implicit class ModifyClientVpnEndpointRequestOps[Self <: ModifyClientVpnEndpointRequest] (val x: Self) extends AnyVal {
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
    def withConnectionLogOptions(value: ConnectionLogOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionLogOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionLogOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionLogOptions")(js.undefined)
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
    def withDnsServers(value: DnsServersOptionsModifyStructure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsServers")(js.undefined)
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
    @scala.inline
    def withServerCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitTunnel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitTunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitTunnel")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnPort(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnPort")(js.undefined)
        ret
    }
  }
  
}

