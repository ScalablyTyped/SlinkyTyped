package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConnection extends js.Object {
  // Name of the application managing the network connection (for example, Facebook, SMTP, etc.).
  var applicationName: js.UndefOr[String] = js.native
  // Destination IP address (of the network connection).
  var destinationAddress: js.UndefOr[String] = js.native
  // Destination domain portion of the destination URL. (for example 'www.contoso.com').
  var destinationDomain: js.UndefOr[String] = js.native
  // Destination port (of the network connection).
  var destinationPort: js.UndefOr[String] = js.native
  // Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
  var destinationUrl: js.UndefOr[String] = js.native
  // Network connection direction. Possible values are: unknown, inbound, outbound.
  var direction: js.UndefOr[ConnectionDirection] = js.native
  /**
    * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var domainRegisteredDateTime: js.UndefOr[String] = js.native
  /**
    * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was
    * tampered with).
    */
  var localDnsName: js.UndefOr[String] = js.native
  // Network Address Translation destination IP address.
  var natDestinationAddress: js.UndefOr[String] = js.native
  // Network Address Translation destination port.
  var natDestinationPort: js.UndefOr[String] = js.native
  // Network Address Translation source IP address.
  var natSourceAddress: js.UndefOr[String] = js.native
  // Network Address Translation source port.
  var natSourcePort: js.UndefOr[String] = js.native
  /**
    * Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader,
    * ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader,
    * ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
    */
  var protocol: js.UndefOr[SecurityNetworkProtocol] = js.native
  /**
    * Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[String] = js.native
  // Source (i.e. origin) IP address (of the network connection).
  var sourceAddress: js.UndefOr[String] = js.native
  // Source (i.e. origin) IP port (of the network connection).
  var sourcePort: js.UndefOr[String] = js.native
  // Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
  var status: js.UndefOr[ConnectionStatus] = js.native
  // Parameters (suffix) of the destination URL.
  var urlParameters: js.UndefOr[String] = js.native
}

object NetworkConnection {
  @scala.inline
  def apply(): NetworkConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnection]
  }
  @scala.inline
  implicit class NetworkConnectionOps[Self <: NetworkConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPort")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ConnectionDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainRegisteredDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainRegisteredDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainRegisteredDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainRegisteredDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withNatDestinationAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natDestinationAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatDestinationAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natDestinationAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNatDestinationPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natDestinationPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatDestinationPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natDestinationPort")(js.undefined)
        ret
    }
    @scala.inline
    def withNatSourceAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natSourceAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatSourceAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natSourceAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNatSourcePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natSourcePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatSourcePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natSourcePort")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: SecurityNetworkProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePort")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ConnectionStatus): Self = {
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
    def withUrlParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParameters")(js.undefined)
        ret
    }
  }
  
}

