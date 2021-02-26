package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an InterconnectAttachment (VLAN attachment) resource. For more
  * information, see  Creating VLAN Attachments. (== resource_for
  * beta.interconnectAttachments ==) (== resource_for
  * v1.interconnectAttachments ==)
  */
@js.native
trait SchemaInterconnectAttachment extends StObject {
  
  /**
    * Determines whether this Attachment will carry packets. Not present for
    * PARTNER_PROVIDER.
    */
  var adminEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Provisioned bandwidth capacity for the interconnectAttachment. Can be set
    * by the partner to update the customer&#39;s provisioned bandwidth. Output
    * only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED.
    */
  var bandwidth: js.UndefOr[String] = js.native
  
  /**
    * Up to 16 candidate prefixes that can be used to restrict the allocation
    * of cloudRouterIpAddress and customerRouterIpAddress for this attachment.
    * All prefixes must be within link-local address space (169.254.0.0/16) and
    * must be /29 or shorter (/28, /27, etc). Google will attempt to select an
    * unused /29 from the supplied candidate prefix(es). The request will fail
    * if all possible /29s are in use on Google?s edge. If not supplied, Google
    * will randomly select an unused /29 from all of link-local space.
    */
  var candidateSubnets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [Output Only] IPv4 address + prefix length to be configured on Cloud
    * Router Interface for this interconnect attachment.
    */
  var cloudRouterIpAddress: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] IPv4 address + prefix length to be configured on the
    * customer router subinterface for this interconnect attachment.
    */
  var customerRouterIpAddress: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Desired availability domain for the attachment. Only available for type
    * PARTNER, at creation time. For improved reliability, customers should
    * configure a pair of attachments with one per availability domain. The
    * selected availability domain will be provided to the Partner via the
    * pairing key so that the provisioned circuit will lie in the specified
    * domain. If not specified, the value will default to
    * AVAILABILITY_DOMAIN_ANY.
    */
  var edgeAvailabilityDomain: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Google reference ID, to be used when raising support
    * tickets with Google or otherwise to debug backend connectivity issues.
    */
  var googleReferenceId: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * URL of the underlying Interconnect object that this attachment&#39;s
    * traffic will traverse through.
    */
  var interconnect: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#interconnectAttachment
    * for interconnect attachments.
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
    * [Output Only] The current status of whether or not this interconnect
    * attachment is functional.
    */
  var operationalStatus: js.UndefOr[String] = js.native
  
  /**
    * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not
    * present for DEDICATED]. The opaque identifier of an PARTNER attachment
    * used to initiate provisioning with a selected partner. Of the form
    * &quot;XXXXX/region/domain&quot;
    */
  var pairingKey: js.UndefOr[String] = js.native
  
  /**
    * Optional BGP ASN for the router that should be supplied by a layer 3
    * Partner if they configured BGP on behalf of the customer. Output only for
    * PARTNER type, input only for PARTNER_PROVIDER, not available for
    * DEDICATED.
    */
  var partnerAsn: js.UndefOr[String] = js.native
  
  /**
    * Informational metadata about Partner attachments from Partners to display
    * to customers. Output only for for PARTNER type, mutable for
    * PARTNER_PROVIDER, not available for DEDICATED.
    */
  var partnerMetadata: js.UndefOr[SchemaInterconnectAttachmentPartnerMetadata] = js.native
  
  /**
    * [Output Only] Information specific to an InterconnectAttachment. This
    * property is populated if the interconnect that this is attached to is of
    * type DEDICATED.
    */
  var privateInterconnectInfo: js.UndefOr[SchemaInterconnectAttachmentPrivateInfo] = js.native
  
  /**
    * [Output Only] URL of the region where the regional interconnect
    * attachment resides. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * URL of the Cloud Router to be used for dynamic routing. This router must
    * be in the same region as this InterconnectAttachment. The
    * InterconnectAttachment will automatically connect the Interconnect to the
    * network &amp; region within which the Cloud Router is configured.
    */
  var router: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The current state of this attachment&#39;s functionality.
    */
  var state: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only
    * specified at creation time.
    */
  var vlanTag8021q: js.UndefOr[Double] = js.native
}
object SchemaInterconnectAttachment {
  
  @scala.inline
  def apply(): SchemaInterconnectAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachment]
  }
  
  @scala.inline
  implicit class SchemaInterconnectAttachmentMutableBuilder[Self <: SchemaInterconnectAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminEnabled(value: Boolean): Self = StObject.set(x, "adminEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminEnabledUndefined: Self = StObject.set(x, "adminEnabled", js.undefined)
    
    @scala.inline
    def setBandwidth(value: String): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setCandidateSubnets(value: js.Array[String]): Self = StObject.set(x, "candidateSubnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateSubnetsUndefined: Self = StObject.set(x, "candidateSubnets", js.undefined)
    
    @scala.inline
    def setCandidateSubnetsVarargs(value: String*): Self = StObject.set(x, "candidateSubnets", js.Array(value :_*))
    
    @scala.inline
    def setCloudRouterIpAddress(value: String): Self = StObject.set(x, "cloudRouterIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudRouterIpAddressUndefined: Self = StObject.set(x, "cloudRouterIpAddress", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setCustomerRouterIpAddress(value: String): Self = StObject.set(x, "customerRouterIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerRouterIpAddressUndefined: Self = StObject.set(x, "customerRouterIpAddress", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEdgeAvailabilityDomain(value: String): Self = StObject.set(x, "edgeAvailabilityDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeAvailabilityDomainUndefined: Self = StObject.set(x, "edgeAvailabilityDomain", js.undefined)
    
    @scala.inline
    def setGoogleReferenceId(value: String): Self = StObject.set(x, "googleReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleReferenceIdUndefined: Self = StObject.set(x, "googleReferenceId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInterconnect(value: String): Self = StObject.set(x, "interconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterconnectUndefined: Self = StObject.set(x, "interconnect", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationalStatus(value: String): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    @scala.inline
    def setPairingKey(value: String): Self = StObject.set(x, "pairingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPairingKeyUndefined: Self = StObject.set(x, "pairingKey", js.undefined)
    
    @scala.inline
    def setPartnerAsn(value: String): Self = StObject.set(x, "partnerAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerAsnUndefined: Self = StObject.set(x, "partnerAsn", js.undefined)
    
    @scala.inline
    def setPartnerMetadata(value: SchemaInterconnectAttachmentPartnerMetadata): Self = StObject.set(x, "partnerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerMetadataUndefined: Self = StObject.set(x, "partnerMetadata", js.undefined)
    
    @scala.inline
    def setPrivateInterconnectInfo(value: SchemaInterconnectAttachmentPrivateInfo): Self = StObject.set(x, "privateInterconnectInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateInterconnectInfoUndefined: Self = StObject.set(x, "privateInterconnectInfo", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRouter(value: String): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVlanTag8021q(value: Double): Self = StObject.set(x, "vlanTag8021q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVlanTag8021qUndefined: Self = StObject.set(x, "vlanTag8021q", js.undefined)
  }
}
