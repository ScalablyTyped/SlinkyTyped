package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateClientVpnConnectionsResult extends StObject {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  
  /**
    * The current state of the client connections.
    */
  var ConnectionStatuses: js.UndefOr[TerminateConnectionStatusSet] = js.native
  
  /**
    * The user who established the terminated client connections.
    */
  var Username: js.UndefOr[String] = js.native
}
object TerminateClientVpnConnectionsResult {
  
  @scala.inline
  def apply(): TerminateClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateClientVpnConnectionsResult]
  }
  
  @scala.inline
  implicit class TerminateClientVpnConnectionsResultMutableBuilder[Self <: TerminateClientVpnConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setConnectionStatuses(value: TerminateConnectionStatusSet): Self = StObject.set(x, "ConnectionStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStatusesUndefined: Self = StObject.set(x, "ConnectionStatuses", js.undefined)
    
    @scala.inline
    def setConnectionStatusesVarargs(value: TerminateConnectionStatus*): Self = StObject.set(x, "ConnectionStatuses", js.Array(value :_*))
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
