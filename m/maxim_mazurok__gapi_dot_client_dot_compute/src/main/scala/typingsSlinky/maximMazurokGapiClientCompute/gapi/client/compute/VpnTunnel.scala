package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnTunnel extends StObject {
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] Detailed status message for the VPN tunnel. */
  var detailedStatus: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2. */
  var ikeVersion: js.UndefOr[Double] = js.native
  
  /** [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must
    * be disjoint. Only IPv4 is supported.
    */
  var localTrafficSelector: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field
    * peerGcpGateway.
    */
  var peerExternalGateway: js.UndefOr[String] = js.native
  
  /** The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. */
  var peerExternalGatewayInterface: js.UndefOr[Double] = js.native
  
  /**
    * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly
    * available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same
    * vpnGatewayInterface ID in the peer GCP VPN gateway.
    */
  var peerGcpGateway: js.UndefOr[String] = js.native
  
  /** IP address of the peer VPN gateway. Only IPv4 is supported. */
  var peerIp: js.UndefOr[String] = js.native
  
  /** [Output Only] URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body. */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges
    * should be disjoint. Only IPv4 is supported.
    */
  var remoteTrafficSelector: js.UndefOr[js.Array[String]] = js.native
  
  /** URL of the router resource to be used for dynamic routing. */
  var router: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway. */
  var sharedSecret: js.UndefOr[String] = js.native
  
  /** Hash of the shared secret. */
  var sharedSecretHash: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The status of the VPN tunnel, which can be one of the following:
    * - PROVISIONING: Resource is being allocated for the VPN tunnel.
    * - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup
    * the VPN tunnel.
    * - FIRST_HANDSHAKE: Successful first handshake with the peer VPN.
    * - ESTABLISHED: Secure session is successfully established with the peer VPN.
    * - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS
    * - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret).
    * - NEGOTIATION_FAILURE: Handshake failed.
    * - DEPROVISIONING: Resources are being deallocated for the VPN tunnel.
    * - FAILED: Tunnel creation has failed and the tunnel is not ready to be used.
    * - NO_INCOMING_PACKETS: No incoming packets from peer.
    * - REJECTED: Tunnel configuration was rejected, can be result of being blacklisted.
    * - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources.
    * - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state.
    * - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT.
    * - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
    */
  var status: js.UndefOr[String] = js.native
  
  /** URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. */
  var targetVpnGateway: js.UndefOr[String] = js.native
  
  /**
    * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High
    * Availability VPN gateway resource is created.
    */
  var vpnGateway: js.UndefOr[String] = js.native
  
  /** The interface ID of the VPN gateway with which this VPN tunnel is associated. */
  var vpnGatewayInterface: js.UndefOr[Double] = js.native
}
object VpnTunnel {
  
  @scala.inline
  def apply(): VpnTunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnel]
  }
  
  @scala.inline
  implicit class VpnTunnelMutableBuilder[Self <: VpnTunnel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetailedStatus(value: String): Self = StObject.set(x, "detailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedStatusUndefined: Self = StObject.set(x, "detailedStatus", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIkeVersion(value: Double): Self = StObject.set(x, "ikeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIkeVersionUndefined: Self = StObject.set(x, "ikeVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocalTrafficSelector(value: js.Array[String]): Self = StObject.set(x, "localTrafficSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalTrafficSelectorUndefined: Self = StObject.set(x, "localTrafficSelector", js.undefined)
    
    @scala.inline
    def setLocalTrafficSelectorVarargs(value: String*): Self = StObject.set(x, "localTrafficSelector", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPeerExternalGateway(value: String): Self = StObject.set(x, "peerExternalGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerExternalGatewayInterface(value: Double): Self = StObject.set(x, "peerExternalGatewayInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerExternalGatewayInterfaceUndefined: Self = StObject.set(x, "peerExternalGatewayInterface", js.undefined)
    
    @scala.inline
    def setPeerExternalGatewayUndefined: Self = StObject.set(x, "peerExternalGateway", js.undefined)
    
    @scala.inline
    def setPeerGcpGateway(value: String): Self = StObject.set(x, "peerGcpGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerGcpGatewayUndefined: Self = StObject.set(x, "peerGcpGateway", js.undefined)
    
    @scala.inline
    def setPeerIp(value: String): Self = StObject.set(x, "peerIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIpUndefined: Self = StObject.set(x, "peerIp", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRemoteTrafficSelector(value: js.Array[String]): Self = StObject.set(x, "remoteTrafficSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteTrafficSelectorUndefined: Self = StObject.set(x, "remoteTrafficSelector", js.undefined)
    
    @scala.inline
    def setRemoteTrafficSelectorVarargs(value: String*): Self = StObject.set(x, "remoteTrafficSelector", js.Array(value :_*))
    
    @scala.inline
    def setRouter(value: String): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSharedSecret(value: String): Self = StObject.set(x, "sharedSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedSecretHash(value: String): Self = StObject.set(x, "sharedSecretHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedSecretHashUndefined: Self = StObject.set(x, "sharedSecretHash", js.undefined)
    
    @scala.inline
    def setSharedSecretUndefined: Self = StObject.set(x, "sharedSecret", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetVpnGateway(value: String): Self = StObject.set(x, "targetVpnGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVpnGatewayUndefined: Self = StObject.set(x, "targetVpnGateway", js.undefined)
    
    @scala.inline
    def setVpnGateway(value: String): Self = StObject.set(x, "vpnGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewayInterface(value: Double): Self = StObject.set(x, "vpnGatewayInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewayInterfaceUndefined: Self = StObject.set(x, "vpnGatewayInterface", js.undefined)
    
    @scala.inline
    def setVpnGatewayUndefined: Self = StObject.set(x, "vpnGateway", js.undefined)
  }
}
