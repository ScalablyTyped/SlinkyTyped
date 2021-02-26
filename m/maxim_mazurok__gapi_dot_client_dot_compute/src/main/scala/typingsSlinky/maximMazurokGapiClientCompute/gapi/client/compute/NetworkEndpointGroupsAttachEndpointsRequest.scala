package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpointGroupsAttachEndpointsRequest extends StObject {
  
  /** The list of network endpoints to be attached. */
  var networkEndpoints: js.UndefOr[js.Array[NetworkEndpoint]] = js.native
}
object NetworkEndpointGroupsAttachEndpointsRequest {
  
  @scala.inline
  def apply(): NetworkEndpointGroupsAttachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupsAttachEndpointsRequest]
  }
  
  @scala.inline
  implicit class NetworkEndpointGroupsAttachEndpointsRequestMutableBuilder[Self <: NetworkEndpointGroupsAttachEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkEndpoints(value: js.Array[NetworkEndpoint]): Self = StObject.set(x, "networkEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointsUndefined: Self = StObject.set(x, "networkEndpoints", js.undefined)
    
    @scala.inline
    def setNetworkEndpointsVarargs(value: NetworkEndpoint*): Self = StObject.set(x, "networkEndpoints", js.Array(value :_*))
  }
}
