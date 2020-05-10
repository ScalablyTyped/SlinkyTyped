package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnEndpoint extends js.Object {
  /**
    * Information about the associated target networks. A target network is a subnet in a VPC.
    */
  var AssociatedTargetNetworks: js.UndefOr[AssociatedTargetNetworkSet] = js.native
  /**
    * Information about the authentication method used by the Client VPN endpoint.
    */
  var AuthenticationOptions: js.UndefOr[ClientVpnAuthenticationList] = js.native
  /**
    * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
    */
  var ClientCidrBlock: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * Information about the client connection logging options for the Client VPN endpoint.
    */
  var ConnectionLogOptions: js.UndefOr[ConnectionLogResponseOptions] = js.native
  /**
    * The date and time the Client VPN endpoint was created.
    */
  var CreationTime: js.UndefOr[String] = js.native
  /**
    * The date and time the Client VPN endpoint was deleted, if applicable.
    */
  var DeletionTime: js.UndefOr[String] = js.native
  /**
    * A brief description of the endpoint.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The DNS name to be used by clients when connecting to the Client VPN endpoint.
    */
  var DnsName: js.UndefOr[String] = js.native
  /**
    * Information about the DNS servers to be used for DNS resolution. 
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.native
  /**
    * The IDs of the security groups for the target network.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
  /**
    * The ARN of the server certificate.
    */
  var ServerCertificateArn: js.UndefOr[String] = js.native
  /**
    * Indicates whether split-tunnel is enabled in the AWS Client VPN endpoint. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.native
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.native
  /**
    * Any tags assigned to the Client VPN endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The transport protocol used by the Client VPN endpoint.
    */
  var TransportProtocol: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransportProtocol] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcId] = js.native
  /**
    * The port number for the Client VPN endpoint.
    */
  var VpnPort: js.UndefOr[Integer] = js.native
  /**
    * The protocol used by the VPN session.
    */
  var VpnProtocol: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpnProtocol] = js.native
}

object ClientVpnEndpoint {
  @scala.inline
  def apply(): ClientVpnEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnEndpoint]
  }
  @scala.inline
  implicit class ClientVpnEndpointOps[Self <: ClientVpnEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedTargetNetworks(value: AssociatedTargetNetworkSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedTargetNetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedTargetNetworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedTargetNetworks")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticationOptions(value: ClientVpnAuthenticationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVpnEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVpnEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionLogOptions(value: ConnectionLogResponseOptions): Self = {
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
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionTime")(js.undefined)
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
    def withDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsServers(value: ValueStringList): Self = {
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
    def withStatus(value: ClientVpnEndpointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportProtocol(value: TransportProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransportProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransportProtocol")(js.undefined)
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
    @scala.inline
    def withVpnProtocol(value: VpnProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnProtocol")(js.undefined)
        ret
    }
  }
  
}

