package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionOptions extends StObject {
  
  /**
    * Indicates whether acceleration is enabled for the VPN connection.
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.native
  
  /**
    * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
    */
  var LocalIpv4NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
    */
  var LocalIpv6NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 CIDR on the AWS side of the VPN connection.
    */
  var RemoteIpv4NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR on the AWS side of the VPN connection.
    */
  var RemoteIpv6NetworkCidr: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't support BGP.
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the VPN tunnels process IPv4 or IPv6 traffic.
    */
  var TunnelInsideIpVersion: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TunnelInsideIpVersion] = js.native
  
  /**
    * Indicates the VPN tunnel options.
    */
  var TunnelOptions: js.UndefOr[TunnelOptionsList] = js.native
}
object VpnConnectionOptions {
  
  @scala.inline
  def apply(): VpnConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionOptions]
  }
  
  @scala.inline
  implicit class VpnConnectionOptionsMutableBuilder[Self <: VpnConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableAcceleration(value: Boolean): Self = StObject.set(x, "EnableAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAccelerationUndefined: Self = StObject.set(x, "EnableAcceleration", js.undefined)
    
    @scala.inline
    def setLocalIpv4NetworkCidr(value: String): Self = StObject.set(x, "LocalIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIpv4NetworkCidrUndefined: Self = StObject.set(x, "LocalIpv4NetworkCidr", js.undefined)
    
    @scala.inline
    def setLocalIpv6NetworkCidr(value: String): Self = StObject.set(x, "LocalIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIpv6NetworkCidrUndefined: Self = StObject.set(x, "LocalIpv6NetworkCidr", js.undefined)
    
    @scala.inline
    def setRemoteIpv4NetworkCidr(value: String): Self = StObject.set(x, "RemoteIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpv4NetworkCidrUndefined: Self = StObject.set(x, "RemoteIpv4NetworkCidr", js.undefined)
    
    @scala.inline
    def setRemoteIpv6NetworkCidr(value: String): Self = StObject.set(x, "RemoteIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpv6NetworkCidrUndefined: Self = StObject.set(x, "RemoteIpv6NetworkCidr", js.undefined)
    
    @scala.inline
    def setStaticRoutesOnly(value: Boolean): Self = StObject.set(x, "StaticRoutesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticRoutesOnlyUndefined: Self = StObject.set(x, "StaticRoutesOnly", js.undefined)
    
    @scala.inline
    def setTunnelInsideIpVersion(value: TunnelInsideIpVersion): Self = StObject.set(x, "TunnelInsideIpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelInsideIpVersionUndefined: Self = StObject.set(x, "TunnelInsideIpVersion", js.undefined)
    
    @scala.inline
    def setTunnelOptions(value: TunnelOptionsList): Self = StObject.set(x, "TunnelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelOptionsUndefined: Self = StObject.set(x, "TunnelOptions", js.undefined)
    
    @scala.inline
    def setTunnelOptionsVarargs(value: TunnelOption*): Self = StObject.set(x, "TunnelOptions", js.Array(value :_*))
  }
}
