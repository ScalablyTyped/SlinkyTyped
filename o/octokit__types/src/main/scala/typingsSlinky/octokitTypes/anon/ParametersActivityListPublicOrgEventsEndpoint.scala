package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListPublicOrgEventsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListPublicOrgEventsRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListPublicOrgEventsEndpoint extends StObject {
  
  var parameters: ActivityListPublicOrgEventsEndpoint = js.native
  
  var request: ActivityListPublicOrgEventsRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListPublicOrgEventsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListPublicOrgEventsEndpoint,
    request: ActivityListPublicOrgEventsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicOrgEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicOrgEventsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListPublicOrgEventsEndpointMutableBuilder[Self <: ParametersActivityListPublicOrgEventsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListPublicOrgEventsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListPublicOrgEventsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
