package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Router resource.
  */
@js.native
trait SchemaRouter extends StObject {
  
  /**
    * BGP information specific to this router.
    */
  var bgp: js.UndefOr[SchemaRouterBgp] = js.native
  
  /**
    * BGP information that needs to be configured into the routing stack to
    * establish the BGP peering. It must specify peer ASN and either interface
    * name, IP, or peer IP. Please refer to RFC4273.
    */
  var bgpPeers: js.UndefOr[js.Array[SchemaRouterBgpPeer]] = js.native
  
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
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Router interfaces. Each interface requires either one linked resource
    * (e.g. linkedVpnTunnel), or IP address and IP address range (e.g.
    * ipRange), or both.
    */
  var interfaces: js.UndefOr[js.Array[SchemaRouterInterface]] = js.native
  
  /**
    * [Output Only] Type of resource. Always compute#router for routers.
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
    * A list of Nat services created in this router.
    */
  var nats: js.UndefOr[js.Array[SchemaRouterNat]] = js.native
  
  /**
    * URI of the network to which this router belongs.
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] URI of the region where the router resides. You must
    * specify this field as part of the HTTP request URL. It is not settable as
    * a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaRouter {
  
  @scala.inline
  def apply(): SchemaRouter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouter]
  }
  
  @scala.inline
  implicit class SchemaRouterMutableBuilder[Self <: SchemaRouter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgp(value: SchemaRouterBgp): Self = StObject.set(x, "bgp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpPeers(value: js.Array[SchemaRouterBgpPeer]): Self = StObject.set(x, "bgpPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpPeersUndefined: Self = StObject.set(x, "bgpPeers", js.undefined)
    
    @scala.inline
    def setBgpPeersVarargs(value: SchemaRouterBgpPeer*): Self = StObject.set(x, "bgpPeers", js.Array(value :_*))
    
    @scala.inline
    def setBgpUndefined: Self = StObject.set(x, "bgp", js.undefined)
    
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
    def setInterfaces(value: js.Array[SchemaRouterInterface]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
    
    @scala.inline
    def setInterfacesVarargs(value: SchemaRouterInterface*): Self = StObject.set(x, "interfaces", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNats(value: js.Array[SchemaRouterNat]): Self = StObject.set(x, "nats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatsUndefined: Self = StObject.set(x, "nats", js.undefined)
    
    @scala.inline
    def setNatsVarargs(value: SchemaRouterNat*): Self = StObject.set(x, "nats", js.Array(value :_*))
    
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
  }
}
