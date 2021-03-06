package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGateway extends StObject {
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of resource. Always compute#vpnGateway for VPN gateways. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
    * Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
    * request will fail with error 412 conditionNotMet.
    *
    * To see the latest fingerprint, make a get() request to retrieve an VpnGateway.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  
  /** Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.VpnGateway with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created. */
  var network: js.UndefOr[String] = js.native
  
  /** [Output Only] URL of the region where the VPN gateway resides. */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** A list of interfaces on this VPN gateway. */
  var vpnInterfaces: js.UndefOr[js.Array[VpnGatewayVpnGatewayInterface]] = js.native
}
object VpnGateway {
  
  @scala.inline
  def apply(): VpnGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGateway]
  }
  
  @scala.inline
  implicit class VpnGatewayMutableBuilder[Self <: VpnGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.VpnGateway with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setVpnInterfaces(value: js.Array[VpnGatewayVpnGatewayInterface]): Self = StObject.set(x, "vpnInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnInterfacesUndefined: Self = StObject.set(x, "vpnInterfaces", js.undefined)
    
    @scala.inline
    def setVpnInterfacesVarargs(value: VpnGatewayVpnGatewayInterface*): Self = StObject.set(x, "vpnInterfaces", js.Array(value :_*))
  }
}
