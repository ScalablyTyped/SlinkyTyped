package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposSetTeamAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposSetTeamAccessRestrictionsEndpoint = js.native
  
  var request: ReposSetTeamAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposSetTeamAccessRestrictionsResponseData] = js.native
}
object ParametersReposSetTeamAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposSetTeamAccessRestrictionsEndpoint,
    request: ReposSetTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetTeamAccessRestrictionsResponseData]
  ): ParametersReposSetTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetTeamAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposSetTeamAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposSetTeamAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposSetTeamAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposSetTeamAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetTeamAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
