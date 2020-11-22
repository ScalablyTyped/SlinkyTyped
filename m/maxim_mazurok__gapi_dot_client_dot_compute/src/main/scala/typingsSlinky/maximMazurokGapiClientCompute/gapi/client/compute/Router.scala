package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends js.Object {
  
  /** BGP information specific to this router. */
  var bgp: js.UndefOr[RouterBgp] = js.native
  
  /**
    * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or
    * peer IP address. Please refer to RFC4273.
    */
  var bgpPeers: js.UndefOr[js.Array[RouterBgpPeer]] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both. */
  var interfaces: js.UndefOr[js.Array[RouterInterface]] = js.native
  
  /** [Output Only] Type of resource. Always compute#router for routers. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** A list of NAT services created in this router. */
  var nats: js.UndefOr[js.Array[RouterNat]] = js.native
  
  /** URI of the network to which this router belongs. */
  var network: js.UndefOr[String] = js.native
  
  /** [Output Only] URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body. */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
}
object Router {
  
  @scala.inline
  def apply(): Router = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Router]
  }
  
  @scala.inline
  implicit class RouterOps[Self <: Router] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBgp(value: RouterBgp): Self = this.set("bgp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgp: Self = this.set("bgp", js.undefined)
    
    @scala.inline
    def setBgpPeersVarargs(value: RouterBgpPeer*): Self = this.set("bgpPeers", js.Array(value :_*))
    
    @scala.inline
    def setBgpPeers(value: js.Array[RouterBgpPeer]): Self = this.set("bgpPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgpPeers: Self = this.set("bgpPeers", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInterfacesVarargs(value: RouterInterface*): Self = this.set("interfaces", js.Array(value :_*))
    
    @scala.inline
    def setInterfaces(value: js.Array[RouterInterface]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaces: Self = this.set("interfaces", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNatsVarargs(value: RouterNat*): Self = this.set("nats", js.Array(value :_*))
    
    @scala.inline
    def setNats(value: js.Array[RouterNat]): Self = this.set("nats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNats: Self = this.set("nats", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
