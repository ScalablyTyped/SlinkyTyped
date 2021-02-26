package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAddTeamAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposAddTeamAccessRestrictionsEndpoint = js.native
  
  var request: ReposAddTeamAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposAddTeamAccessRestrictionsResponseData] = js.native
}
object ParametersReposAddTeamAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAddTeamAccessRestrictionsEndpoint,
    request: ReposAddTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddTeamAccessRestrictionsResponseData]
  ): ParametersReposAddTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddTeamAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAddTeamAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposAddTeamAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposAddTeamAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAddTeamAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddTeamAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
