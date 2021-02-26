package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subnetwork extends StObject {
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is to disable flow
    * logging. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
    */
  var enableFlowLogs: js.UndefOr[Boolean] = js.native
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An
    * up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet.
    *
    * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /** [Output Only] The gateway address for default routes to reach destination addresses outside this subnetwork. */
  var gatewayAddress: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be
    * unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. This may be a RFC 1918 IP range, or a privately routed, non-RFC
    * 1918 IP range, not belonging to Google. The range can be expanded after creation using expandIpCidrRange.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /** [Output Only] The range of internal IPv6 addresses that are owned by this subnetwork. */
  var ipv6CidrRange: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources. */
  var kind: js.UndefOr[String] = js.native
  
  /** This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging. */
  var logConfig: js.UndefOr[SubnetworkLogConfig] = js.native
  
  /**
    * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be
    * 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. Only networks that are in the distributed mode can have
    * subnetworks. This field can be set only at resource creation time.
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using
    * setPrivateIpGoogleAccess.
    */
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take
    * priority.
    *
    * This field can be both set at resource creation time and updated using patch.
    */
  var privateIpv6GoogleAccess: js.UndefOr[String] = js.native
  
  /**
    * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a
    * user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with
    * the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
    */
  var purpose: js.UndefOr[String] = js.native
  
  /** URL of the region where the Subnetwork resides. This field can be set only at resource creation time. */
  var region: js.UndefOr[String] = js.native
  
  /**
    * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is
    * currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with
    * a patch request.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork.
    * The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SubnetworkSecondaryRange]] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The state of the subnetwork, which can be one of READY or DRAINING. A subnetwork that is READY is ready to be used. The state of DRAINING is only applicable to
    * subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be
    * used or modified until it reaches a status of READY.
    */
  var state: js.UndefOr[String] = js.native
}
object Subnetwork {
  
  @scala.inline
  def apply(): Subnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnetwork]
  }
  
  @scala.inline
  implicit class SubnetworkMutableBuilder[Self <: Subnetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnableFlowLogs(value: Boolean): Self = StObject.set(x, "enableFlowLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFlowLogsUndefined: Self = StObject.set(x, "enableFlowLogs", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setGatewayAddress(value: String): Self = StObject.set(x, "gatewayAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayAddressUndefined: Self = StObject.set(x, "gatewayAddress", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setIpv6CidrRange(value: String): Self = StObject.set(x, "ipv6CidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrRangeUndefined: Self = StObject.set(x, "ipv6CidrRange", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLogConfig(value: SubnetworkLogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setPrivateIpGoogleAccess(value: Boolean): Self = StObject.set(x, "privateIpGoogleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpGoogleAccessUndefined: Self = StObject.set(x, "privateIpGoogleAccess", js.undefined)
    
    @scala.inline
    def setPrivateIpv6GoogleAccess(value: String): Self = StObject.set(x, "privateIpv6GoogleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpv6GoogleAccessUndefined: Self = StObject.set(x, "privateIpv6GoogleAccess", js.undefined)
    
    @scala.inline
    def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSecondaryIpRanges(value: js.Array[SubnetworkSecondaryRange]): Self = StObject.set(x, "secondaryIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryIpRangesUndefined: Self = StObject.set(x, "secondaryIpRanges", js.undefined)
    
    @scala.inline
    def setSecondaryIpRangesVarargs(value: SubnetworkSecondaryRange*): Self = StObject.set(x, "secondaryIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
