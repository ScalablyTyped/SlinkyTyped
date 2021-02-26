package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClientVpnEndpointResult extends StObject {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  var DnsName: js.UndefOr[String] = js.native
  
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.native
}
object CreateClientVpnEndpointResult {
  
  @scala.inline
  def apply(): CreateClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientVpnEndpointResult]
  }
  
  @scala.inline
  implicit class CreateClientVpnEndpointResultMutableBuilder[Self <: CreateClientVpnEndpointResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setDnsName(value: String): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    @scala.inline
    def setStatus(value: ClientVpnEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
