package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsRemoveRepoLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsRemoveRepoLegacyRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsRemoveRepoLegacyEndpoint extends StObject {
  
  var parameters: TeamsRemoveRepoLegacyEndpoint = js.native
  
  var request: TeamsRemoveRepoLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsRemoveRepoLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveRepoLegacyEndpoint,
    request: TeamsRemoveRepoLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveRepoLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveRepoLegacyEndpointMutableBuilder[Self <: ParametersTeamsRemoveRepoLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveRepoLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveRepoLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
