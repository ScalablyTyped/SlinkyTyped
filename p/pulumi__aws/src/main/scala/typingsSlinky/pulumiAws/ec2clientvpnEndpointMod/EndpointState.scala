package typingsSlinky.pulumiAws.ec2clientvpnEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOptions
import typingsSlinky.pulumiAws.inputMod.ec2clientvpn.EndpointConnectionLogOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointState extends js.Object {
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  val authenticationOptions: js.UndefOr[Input[EndpointAuthenticationOptions]] = js.native
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  val clientCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the client connection logging options.
    */
  val connectionLogOptions: js.UndefOr[Input[EndpointConnectionLogOptions]] = js.native
  /**
    * Name of the repository.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
    */
  val dnsServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of the ACM server certificate.
    */
  val serverCertificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
    */
  val splitTunnel: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The current state of the Client VPN endpoint.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The transport protocol to be used by the VPN session. Default value is `udp`.
    */
  val transportProtocol: js.UndefOr[Input[String]] = js.native
}

object EndpointState {
  @scala.inline
  def apply(): EndpointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointState]
  }
  @scala.inline
  implicit class EndpointStateOps[Self <: EndpointState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationOptions(value: Input[EndpointAuthenticationOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionLogOptions(value: Input[EndpointConnectionLogOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionLogOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionLogOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionLogOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsServers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsServers")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCertificateArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitTunnel(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitTunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitTunnel")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportProtocol")(js.undefined)
        ret
    }
  }
  
}

