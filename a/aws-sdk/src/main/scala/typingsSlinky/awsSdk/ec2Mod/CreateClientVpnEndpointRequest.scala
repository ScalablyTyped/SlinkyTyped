package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientVpnEndpointRequest extends js.Object {
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  var AuthenticationOptions: ClientVpnAuthenticationRequestList = js.native
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  var ClientCidrBlock: String = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: typingsSlinky.awsSdk.ec2Mod.ConnectionLogOptions = js.native
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address configured on the device is used for the DNS server.
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of one or more security groups to apply to the target network. You must also specify the ID of the VPC that contains the security groups.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
  /**
    * The ARN of the server certificate. For more information, see the AWS Certificate Manager User Guide.
    */
  var ServerCertificateArn: String = js.native
  /**
    * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. By default, split-tunnel on a VPN endpoint is disabled. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.native
  /**
    * The tags to apply to the Client VPN endpoint during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The transport protocol to be used by the VPN session. Default value: udp 
    */
  var TransportProtocol: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransportProtocol] = js.native
  /**
    * The ID of the VPC to associate with the Client VPN endpoint. If no security group IDs are specified in the request, the default security group for the VPC is applied.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcId] = js.native
  /**
    * The port number to assign to the Client VPN endpoint for TCP and UDP traffic. Valid Values: 443 | 1194  Default Value: 443 
    */
  var VpnPort: js.UndefOr[Integer] = js.native
}

object CreateClientVpnEndpointRequest {
  @scala.inline
  def apply(
    AuthenticationOptions: ClientVpnAuthenticationRequestList,
    ClientCidrBlock: String,
    ConnectionLogOptions: ConnectionLogOptions,
    ServerCertificateArn: String
  ): CreateClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(AuthenticationOptions = AuthenticationOptions.asInstanceOf[js.Any], ClientCidrBlock = ClientCidrBlock.asInstanceOf[js.Any], ConnectionLogOptions = ConnectionLogOptions.asInstanceOf[js.Any], ServerCertificateArn = ServerCertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientVpnEndpointRequest]
  }
  @scala.inline
  implicit class CreateClientVpnEndpointRequestOps[Self <: CreateClientVpnEndpointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationOptions(value: ClientVpnAuthenticationRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionLogOptions(value: ConnectionLogOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionLogOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertificateArn")(value.asInstanceOf[js.Any])
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
    def withTagSpecifications(value: TagSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(js.undefined)
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
  }
  
}

