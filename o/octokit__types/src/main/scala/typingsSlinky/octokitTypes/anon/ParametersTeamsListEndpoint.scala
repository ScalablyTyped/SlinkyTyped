package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListEndpoint extends StObject {
  
  var parameters: TeamsListEndpoint = js.native
  
  var request: TeamsListRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListResponseData] = js.native
}
object ParametersTeamsListEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListEndpoint,
    request: TeamsListRequestOptions,
    response: OctokitResponse[TeamsListResponseData]
  ): ParametersTeamsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListEndpointMutableBuilder[Self <: ParametersTeamsListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
