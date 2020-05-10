package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleapis.AnonIPProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Firewall resource.
  */
@js.native
trait SchemaFirewall extends js.Object {
  /**
    * The list of ALLOW rules specified by this firewall. Each rule specifies a
    * protocol and port-range tuple that describes a permitted connection.
    */
  var allowed: js.UndefOr[js.Array[AnonIPProtocol]] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * The list of DENY rules specified by this firewall. Each rule specifies a
    * protocol and port-range tuple that describes a denied connection.
    */
  var denied: js.UndefOr[js.Array[AnonIPProtocol]] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If destination ranges are specified, the firewall will apply only to
    * traffic that has destination IP address in these ranges. These ranges
    * must be expressed in CIDR format. Only IPv4 is supported.
    */
  var destinationRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * Direction of traffic to which this firewall applies; default is INGRESS.
    * Note: For INGRESS traffic, it is NOT supported to specify
    * destinationRanges; For EGRESS traffic, it is NOT supported to specify
    * sourceRanges OR sourceTags.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * Denotes whether the firewall rule is disabled, i.e not applied to the
    * network it is associated with. When set to true, the firewall rule is not
    * enforced and the network behaves as if it did not exist. If this is
    * unspecified, the firewall rule will be enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated in favor of enable in LogConfig. This field denotes whether to
    * enable logging for a particular firewall rule. If logging is enabled,
    * logs will be exported to Stackdriver.
    */
  var enableLogging: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#firewall for firewall
    * rules.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This field denotes the logging options for a particular firewall rule. If
    * logging is enabled, logs will be exported to Stackdriver.
    */
  var logConfig: js.UndefOr[SchemaFirewallLogConfig] = js.native
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * URL of the network resource for this firewall rule. If not specified when
    * creating a firewall rule, the default network is used:
    * global/networks/default If you choose to specify this property, you can
    * specify the network as a full or partial URL. For example, the following
    * are all valid URLs:   -
    * https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
    * - projects/myproject/global/networks/my-network  -
    * global/networks/default
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Priority for this rule. This is an integer between 0 and 65535, both
    * inclusive. When not specified, the value assumed is 1000. Relative
    * priorities determine precedence of conflicting rules. Lower value of
    * priority implies higher precedence (eg, a rule with priority 0 has higher
    * precedence than a rule with priority 1). DENY rules take precedence over
    * ALLOW rules having equal priority.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * If source ranges are specified, the firewall will apply only to traffic
    * that has source IP address in these ranges. These ranges must be
    * expressed in CIDR format. One or both of sourceRanges and sourceTags may
    * be set. If both properties are set, the firewall will apply to traffic
    * that has source IP address within sourceRanges OR the source IP that
    * belongs to a tag listed in the sourceTags property. The connection does
    * not need to match both properties for the firewall to apply. Only IPv4 is
    * supported.
    */
  var sourceRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * If source service accounts are specified, the firewall will apply only to
    * traffic originating from an instance with a service account in this list.
    * Source service accounts cannot be used to control traffic to an
    * instance&#39;s external IP address because service accounts are
    * associated with an instance, not an IP address. sourceRanges can be set
    * at the same time as sourceServiceAccounts. If both are set, the firewall
    * will apply to traffic that has source IP address within sourceRanges OR
    * the source IP belongs to an instance with service account listed in
    * sourceServiceAccount. The connection does not need to match both
    * properties for the firewall to apply. sourceServiceAccounts cannot be
    * used at the same time as sourceTags or targetTags.
    */
  var sourceServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * If source tags are specified, the firewall rule applies only to traffic
    * with source IPs that match the primary network interfaces of VM instances
    * that have the tag and are in the same VPC network. Source tags cannot be
    * used to control traffic to an instance&#39;s external IP address, it only
    * applies to traffic between instances in the same virtual network. Because
    * tags are associated with instances, not IP addresses. One or both of
    * sourceRanges and sourceTags may be set. If both properties are set, the
    * firewall will apply to traffic that has source IP address within
    * sourceRanges OR the source IP that belongs to a tag listed in the
    * sourceTags property. The connection does not need to match both
    * properties for the firewall to apply.
    */
  var sourceTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of service accounts indicating sets of instances located in the
    * network that may make network connections as specified in allowed[].
    * targetServiceAccounts cannot be used at the same time as targetTags or
    * sourceTags. If neither targetServiceAccounts nor targetTags are
    * specified, the firewall rule applies to all instances on the specified
    * network.
    */
  var targetServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of tags that controls which instances the firewall rule applies
    * to. If targetTags are specified, then the firewall rule applies only to
    * instances in the VPC network that have one of those tags. If no
    * targetTags are specified, the firewall rule applies to all instances on
    * the specified network.
    */
  var targetTags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFirewall {
  @scala.inline
  def apply(): SchemaFirewall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewall]
  }
  @scala.inline
  implicit class SchemaFirewallOps[Self <: SchemaFirewall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: js.Array[AnonIPProtocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(js.undefined)
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
    def withDenied(value: js.Array[AnonIPProtocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDenied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denied")(js.undefined)
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
    def withDestinationRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(js.undefined)
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
    def withLogConfig(value: SchemaFirewallLogConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfig")(js.undefined)
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
    def withSourceRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceServiceAccounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceServiceAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceServiceAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceServiceAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTags")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetServiceAccounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetServiceAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetServiceAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetServiceAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTags")(js.undefined)
        ret
    }
  }
  
}

