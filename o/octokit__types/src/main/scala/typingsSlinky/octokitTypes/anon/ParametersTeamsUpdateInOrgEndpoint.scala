package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsUpdateInOrgEndpoint extends StObject {
  
  var parameters: TeamsUpdateInOrgEndpoint = js.native
  
  var request: TeamsUpdateInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsUpdateInOrgResponseData] = js.native
}
object ParametersTeamsUpdateInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsUpdateInOrgEndpoint,
    request: TeamsUpdateInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateInOrgResponseData]
  ): ParametersTeamsUpdateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsUpdateInOrgEndpointMutableBuilder[Self <: ParametersTeamsUpdateInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsUpdateInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsUpdateInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
