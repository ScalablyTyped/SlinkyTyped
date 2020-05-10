package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Route resource. A route specifies how certain packets should
  * be handled by the network. Routes are associated with instances by tags and
  * the set of routes for a particular instance is called its routing table.
  * For each packet leaving an instance, the system searches that
  * instance&#39;s routing table for a single best matching route. Routes match
  * packets by destination IP address, preferring smaller or more specific
  * ranges over larger ones. If there is a tie, the system selects the route
  * with the smallest priority value. If there is still a tie, it uses the
  * layer three and four packet headers to select just one of the remaining
  * matching routes. The packet is then forwarded as specified by the nextHop
  * field of the winning route - either to another instance destination, an
  * instance gateway, or a Google Compute Engine-operated gateway.  Packets
  * that do not match any route in the sending instance&#39;s routing table are
  * dropped. (== resource_for beta.routes ==) (== resource_for v1.routes ==)
  */
@js.native
trait SchemaRoute extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The destination range of outgoing packets that this route applies to.
    * Only IPv4 is supported.
    */
  var destRange: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of this resource. Always compute#routes for Route
    * resources.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Fully-qualified URL of the network that this route applies to.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The URL to a gateway that should handle matching packets. You can only
    * specify the internet gateway using a full or partial valid URL:
    * projects/&lt;project-id&gt;/global/gateways/default-internet-gateway
    */
  var nextHopGateway: js.UndefOr[String] = js.native
  /**
    * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that
    * should handle matching packets. You can only specify the forwarding rule
    * as a partial or full URL. For example, the following are all valid URLs:
    * -
    * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
    * - regions/region/forwardingRules/forwardingRule  Note that this can only
    * be used when the destination_range is a public (non-RFC 1918) IP CIDR
    * range.
    */
  var nextHopIlb: js.UndefOr[String] = js.native
  /**
    * The URL to an instance that should handle matching packets. You can
    * specify this as a full or partial URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
    */
  var nextHopInstance: js.UndefOr[String] = js.native
  /**
    * The network IP address of an instance that should handle matching
    * packets. Only IPv4 is supported.
    */
  var nextHopIp: js.UndefOr[String] = js.native
  /**
    * The URL of the local network if it should handle matching packets.
    */
  var nextHopNetwork: js.UndefOr[String] = js.native
  /**
    * [Output Only] The network peering name that should handle matching
    * packets, which should conform to RFC1035.
    */
  var nextHopPeering: js.UndefOr[String] = js.native
  /**
    * The URL to a VpnTunnel that should handle matching packets.
    */
  var nextHopVpnTunnel: js.UndefOr[String] = js.native
  /**
    * The priority of this route. Priority is used to break ties in cases where
    * there is more than one matching route of equal prefix length. In the case
    * of two routes with equal prefix length, the one with the lowest-numbered
    * priority value wins. Default value is 1000. Valid range is 0 through
    * 65535.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * A list of instance tags to which this route applies.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] If potential misconfigurations are detected for this route,
    * this field will be populated with warning messages.
    */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
}

object SchemaRoute {
  @scala.inline
  def apply(): SchemaRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoute]
  }
  @scala.inline
  implicit class SchemaRouteOps[Self <: SchemaRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDestRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destRange")(js.undefined)
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
    def withNextHopGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHopGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopGateway")(js.undefined)
        ret
    }
    @scala.inline
    def withNextHopIlb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopIlb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHopIlb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopIlb")(js.undefined)
        ret
    }
    @scala.inline
    def withNextHopInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHopInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withNextHopIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHopIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopIp")(js.undefined)
        ret
    }
    @scala.inline
    def withNextHopNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHopNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withNextHopPeering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopPeering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHopPeering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopPeering")(js.undefined)
        ret
    }
    @scala.inline
    def withNextHopVpnTunnel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopVpnTunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHopVpnTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopVpnTunnel")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
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
    def withTags(value: js.Array[String]): Self = {
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
    def withWarnings(value: js.Array[AnonCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

