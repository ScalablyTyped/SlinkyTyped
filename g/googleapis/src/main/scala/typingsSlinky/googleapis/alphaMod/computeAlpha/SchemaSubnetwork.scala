package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Subnetwork resource. (== resource_for beta.subnetworks ==) (==
  * resource_for v1.subnetworks ==)
  */
@js.native
trait SchemaSubnetwork extends js.Object {
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * Toggles the aggregation interval for collecting flow logs. Increasing the
    * interval time will reduce the amount of generated flow logs for long
    * lasting connections. Default is an interval of 5 seconds per connection.
    */
  var aggregationInterval: js.UndefOr[String] = js.native
  /**
    * Whether this subnetwork can conflict with static routes. Setting this to
    * true allows this subnetwork&#39;s primary and secondary ranges to
    * conflict with routes that have already been configured on the
    * corresponding network. Static routes will take precedence over the
    * subnetwork route if the route prefix length is at least as large as the
    * subnetwork prefix length.  Also, packets destined to IPs within
    * subnetwork may contain private/sensitive data and are prevented from
    * leaving the virtual network. Setting this field to true will disable this
    * feature.  The default value is false and applies to all existing
    * subnetworks and automatically created subnetworks.  This field cannot be
    * set to true at resource creation time.
    */
  var allowSubnetCidrRoutesOverlap: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource. This field can be set only at resource creation
    * time.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether to enable flow logging for this subnetwork. If this field is not
    * explicitly set, it will not appear in get listings. If not set the
    * default behavior is to disable flow logging.
    */
  var enableFlowLogs: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated in favor of enable in PrivateIpv6GoogleAccess. Whether the VMs
    * in this subnet can directly access Google services via internal IPv6
    * addresses. This field can be both set at resource creation time and
    * updated using patch.
    */
  var enablePrivateV6Access: js.UndefOr[Boolean] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a Subnetwork. An up-to-date fingerprint must be
    * provided in order to update the Subnetwork, otherwise the request will
    * fail with error 412 conditionNotMet.  To see the latest fingerprint, make
    * a get() request to retrieve a Subnetwork.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * The value of the field must be in [0, 1]. Set the sampling rate of VPC
    * flow logs within the subnetwork where 1.0 means all collected logs are
    * reported and 0.0 means no logs are reported. Default is 0.5 which means
    * half of all collected logs are reported.
    */
  var flowSampling: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The gateway address for default routes to reach destination
    * addresses outside this subnetwork.
    */
  var gatewayAddress: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The range of internal addresses that are owned by this subnetwork.
    * Provide this property when you create the subnetwork. For
    * example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
    * non-overlapping within a network. Only IPv4 is supported. This field can
    * be set only at resource creation time.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * [Output Only] The range of internal IPv6 addresses that are owned by this
    * subnetwork.
    */
  var ipv6CidrRange: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#subnetwork for
    * Subnetwork resources.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This field denotes the logging options for the load balancer traffic
    * served by this backend service. If logging is enabled, logs will be
    * exported to Stackdriver.
    */
  var logConfig: js.UndefOr[SchemaSubnetworkLogConfig] = js.native
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * Configures whether metadata fields should be added to the reported VPC
    * flow logs. Default is INCLUDE_ALL_METADATA.
    */
  var metadata: js.UndefOr[String] = js.native
  /**
    * The name of the resource, provided by the client when initially creating
    * the resource. The name must be 1-63 characters long, and comply with
    * RFC1035. Specifically, the name must be 1-63 characters long and match
    * the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
    * character must be a lowercase letter, and all following characters must
    * be a dash, lowercase letter, or digit, except the last character, which
    * cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the network to which this subnetwork belongs, provided by the
    * client when initially creating the subnetwork. Only networks that are in
    * the distributed mode can have subnetworks. This field can be set only at
    * resource creation time.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Whether the VMs in this subnet can access Google services without
    * assigned external IP addresses. This field can be both set at resource
    * creation time and updated using setPrivateIpGoogleAccess.
    */
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
  /**
    * The private IPv6 google access type for the VMs in this subnet. This is
    * an expanded field of enablePrivateV6Access. If both fields are set,
    * privateIpv6GoogleAccess will take priority.  This field can be both set
    * at resource creation time and updated using patch.
    */
  var privateIpv6GoogleAccess: js.UndefOr[String] = js.native
  /**
    * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or
    * INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to
    * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
    * reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose
    * defaults to PRIVATE_RFC_1918.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * The type of IP CIDR range to associate with this subnetwork. The default
    * is RFC_1918. When creating a subnetwork in non-RFC 1918 range, this field
    * must be set to NON_RFC_1918.
    */
  var rangeType: js.UndefOr[String] = js.native
  /**
    * URL of the region where the Subnetwork resides. This field can be set
    * only at resource creation time.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The role of subnetwork. Currenly, this field is only used when purpose =
    * INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP.
    * An ACTIVE subnetwork is one that is currently being used for Internal
    * HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be
    * promoted to ACTIVE or is currently draining. This field can be updated
    * with a patch request.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * An array of configurations for secondary IP ranges for VM instances
    * contained in this subnetwork. The primary IP of such VM must belong to
    * the primary ipCidrRange of the subnetwork. The alias IPs may belong to
    * either primary or secondary ranges. This field can be updated with a
    * patch request.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaSubnetworkSecondaryRange]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The state of the subnetwork, which can be one of READY or
    * DRAINING. A subnetwork that is READY is ready to be used. The state of
    * DRAINING is only applicable to subnetworks that have the purpose set to
    * INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load
    * balancer are being drained. A subnetwork that is draining cannot be used
    * or modified until it reaches a status of READY.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaSubnetwork {
  @scala.inline
  def apply(): SchemaSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetwork]
  }
  @scala.inline
  implicit class SchemaSubnetworkOps[Self <: SchemaSubnetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSubnetCidrRoutesOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSubnetCidrRoutesOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSubnetCidrRoutesOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSubnetCidrRoutesOverlap")(js.undefined)
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
    def withEnableFlowLogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFlowLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFlowLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFlowLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePrivateV6Access(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateV6Access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePrivateV6Access: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateV6Access")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowSampling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowSampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowSampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowSampling")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayAddress")(js.undefined)
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
    def withIpCidrRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpCidrRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6CidrRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrRange")(js.undefined)
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
    def withLogConfig(value: SchemaSubnetworkLogConfig): Self = {
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
    def withMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
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
    def withPrivateIpGoogleAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpGoogleAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpGoogleAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpGoogleAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpv6GoogleAccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpv6GoogleAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpv6GoogleAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpv6GoogleAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withPurpose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeType")(js.undefined)
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
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryIpRanges(value: js.Array[SchemaSubnetworkSecondaryRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryIpRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryIpRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryIpRanges")(js.undefined)
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
    def withSelfLinkWithId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLinkWithId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLinkWithId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLinkWithId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

