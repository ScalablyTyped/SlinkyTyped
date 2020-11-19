package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnTunnel extends js.Object {
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] Detailed status message for the VPN tunnel. */
  var detailedStatus: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** IKE protocol version to use when establishing the VPN tunnel with peer VPN gateway. Acceptable IKE versions are 1 or 2. Default version is 2. */
  var ikeVersion: js.UndefOr[Double] = js.native
  
  /** [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Local traffic selector to use when establishing the VPN tunnel with peer VPN gateway. The value should be a CIDR formatted string, for example:
    * 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
    */
  var localTrafficSelector: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** IP address of the peer VPN gateway. Only IPv4 is supported. */
  var peerIp: js.UndefOr[String] = js.native
  
  /** [Output Only] URL of the region where the VPN tunnel resides. */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Remote traffic selectors to use when establishing the VPN tunnel with peer VPN gateway. The value should be a CIDR formatted string, for example:
    * 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
    */
  var remoteTrafficSelector: js.UndefOr[js.Array[String]] = js.native
  
  /** URL of router resource to be used for dynamic routing. */
  var router: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway. */
  var sharedSecret: js.UndefOr[String] = js.native
  
  /** Hash of the shared secret. */
  var sharedSecretHash: js.UndefOr[String] = js.native
  
  /** [Output Only] The status of the VPN tunnel. */
  var status: js.UndefOr[String] = js.native
  
  /** URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. */
  var targetVpnGateway: js.UndefOr[String] = js.native
}
object VpnTunnel {
  
  @scala.inline
  def apply(): VpnTunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnel]
  }
  
  @scala.inline
  implicit class VpnTunnelOps[Self <: VpnTunnel] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetailedStatus(value: String): Self = this.set("detailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedStatus: Self = this.set("detailedStatus", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIkeVersion(value: Double): Self = this.set("ikeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIkeVersion: Self = this.set("ikeVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocalTrafficSelectorVarargs(value: String*): Self = this.set("localTrafficSelector", js.Array(value :_*))
    
    @scala.inline
    def setLocalTrafficSelector(value: js.Array[String]): Self = this.set("localTrafficSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalTrafficSelector: Self = this.set("localTrafficSelector", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPeerIp(value: String): Self = this.set("peerIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerIp: Self = this.set("peerIp", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRemoteTrafficSelectorVarargs(value: String*): Self = this.set("remoteTrafficSelector", js.Array(value :_*))
    
    @scala.inline
    def setRemoteTrafficSelector(value: js.Array[String]): Self = this.set("remoteTrafficSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteTrafficSelector: Self = this.set("remoteTrafficSelector", js.undefined)
    
    @scala.inline
    def setRouter(value: String): Self = this.set("router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSharedSecret(value: String): Self = this.set("sharedSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedSecret: Self = this.set("sharedSecret", js.undefined)
    
    @scala.inline
    def setSharedSecretHash(value: String): Self = this.set("sharedSecretHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedSecretHash: Self = this.set("sharedSecretHash", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTargetVpnGateway(value: String): Self = this.set("targetVpnGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVpnGateway: Self = this.set("targetVpnGateway", js.undefined)
  }
}
