package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNetworkEndpointGroupsListEndpointsRequest extends StObject {
  
  /**
    * Optional query parameter for showing the health status of each network
    * endpoint. Valid options are SKIP or SHOW. If you don&#39;t specifiy this
    * parameter, the health status of network endpoints will not be provided.
    */
  var healthStatus: js.UndefOr[String] = js.native
}
object SchemaNetworkEndpointGroupsListEndpointsRequest {
  
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsListEndpointsRequest]
  }
  
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsListEndpointsRequestMutableBuilder[Self <: SchemaNetworkEndpointGroupsListEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthStatus(value: String): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
  }
}
