package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsDeleteInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsDeleteInOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsDeleteInOrgEndpoint extends StObject {
  
  var parameters: TeamsDeleteInOrgEndpoint = js.native
  
  var request: TeamsDeleteInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsDeleteInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteInOrgEndpoint,
    request: TeamsDeleteInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteInOrgEndpointMutableBuilder[Self <: ParametersTeamsDeleteInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsDeleteInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
