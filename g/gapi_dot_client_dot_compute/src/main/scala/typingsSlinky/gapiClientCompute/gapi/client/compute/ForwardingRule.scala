package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingRule extends js.Object {
  /**
    * The IP address that this forwarding rule is serving on behalf of.
    *
    * For global forwarding rules, the address must be a global IP. For regional forwarding rules, the address must live in the same region as the forwarding
    * rule. By default, this field is empty and an ephemeral IPv4 address from the same scope (global or regional) will be assigned. A regional forwarding
    * rule supports IPv4 only. A global forwarding rule supports either IPv4 or IPv6.
    *
    * When the load balancing scheme is INTERNAL, this can only be an RFC 1918 IP address belonging to the network/subnetwork configured for the forwarding
    * rule. A reserved address cannot be used. If the field is empty, the IP address will be automatically allocated from the internal IP range of the
    * subnetwork or network configured for this forwarding rule.
    */
  var IPAddress: js.UndefOr[String] = js.native
  /**
    * The IP protocol to which this rule applies. Valid options are TCP, UDP, ESP, AH, SCTP or ICMP.
    *
    * When the load balancing scheme is INTERNAL, only TCP and UDP are valid.
    */
  var IPProtocol: js.UndefOr[String] = js.native
  /**
    * This field is not used for external load balancing.
    *
    * For internal load balancing, this field identifies the BackendService resource to receive the matched traffic.
    */
  var backendService: js.UndefOr[String] = js.native
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This can only be specified for a global forwarding rule. */
  var ipVersion: js.UndefOr[String] = js.native
  /** [Output Only] Type of the resource. Always compute#forwardingRule for Forwarding Rule resources. */
  var kind: js.UndefOr[String] = js.native
  /**
    * This signifies what the ForwardingRule will be used for and can only take the following values: INTERNAL, EXTERNAL The value of INTERNAL means that
    * this will be used for Internal Network Load Balancing (TCP, UDP). The value of EXTERNAL means that this will be used for External Load Balancing
    * (HTTP(S) LB, External TCP/UDP LB, SSL Proxy)
    */
  var loadBalancingScheme: js.UndefOr[String] = js.native
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This field is not used for external load balancing.
    *
    * For internal load balancing, this field identifies the network that the load balanced IP should belong to for this Forwarding Rule. If this field is
    * not specified, the default network will be used.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * This field is used along with the target field for TargetHttpProxy, TargetHttpsProxy, TargetSslProxy, TargetTcpProxy, TargetVpnGateway, TargetPool,
    * TargetInstance.
    *
    * Applicable only when IPProtocol is TCP, UDP, or SCTP, only packets addressed to ports in the specified range will be forwarded to target. Forwarding
    * rules with the same [IPAddress, IPProtocol] pair must have disjoint port ranges.
    *
    * Some types of forwarding target have constraints on the acceptable ports:
    * - TargetHttpProxy: 80, 8080
    * - TargetHttpsProxy: 443
    * - TargetTcpProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993, 995, 1883, 5222
    * - TargetSslProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993, 995, 1883, 5222
    * - TargetVpnGateway: 500, 4500
    * -
    */
  var portRange: js.UndefOr[String] = js.native
  /**
    * This field is used along with the backend_service field for internal load balancing.
    *
    * When the load balancing scheme is INTERNAL, a single port or a comma separated list of ports can be configured. Only packets addressed to these ports
    * will be forwarded to the backends configured with this forwarding rule.
    *
    * You may specify a maximum of up to 5 ports.
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
  /** [Output Only] URL of the region where the regional forwarding rule resides. This field is not applicable to global forwarding rules. */
  var region: js.UndefOr[String] = js.native
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * This field is not used for external load balancing.
    *
    * For internal load balancing, this field identifies the subnetwork that the load balanced IP should belong to for this Forwarding Rule.
    *
    * If the network specified is in auto subnet mode, this field is optional. However, if the network is in custom subnet mode, a subnetwork must be
    * specified.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * The URL of the target resource to receive the matched traffic. For regional forwarding rules, this target must live in the same region as the
    * forwarding rule. For global forwarding rules, this target must be a global load balancing resource. The forwarded traffic must be of a type appropriate
    * to the target object.
    *
    * This field is not used for internal load balancing.
    */
  var target: js.UndefOr[String] = js.native
}

object ForwardingRule {
  @scala.inline
  def apply(): ForwardingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRule]
  }
  @scala.inline
  implicit class ForwardingRuleOps[Self <: ForwardingRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIPProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withBackendService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendService")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIpVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancingScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancingScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withPortRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portRange")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

