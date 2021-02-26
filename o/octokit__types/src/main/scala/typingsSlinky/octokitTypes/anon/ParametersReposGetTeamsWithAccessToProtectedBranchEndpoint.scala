package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint extends StObject {
  
  var parameters: ReposGetTeamsWithAccessToProtectedBranchEndpoint = js.native
  
  var request: ReposGetTeamsWithAccessToProtectedBranchRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData] = js.native
}
object ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetTeamsWithAccessToProtectedBranchEndpoint,
    request: ReposGetTeamsWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetTeamsWithAccessToProtectedBranchEndpointMutableBuilder[Self <: ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetTeamsWithAccessToProtectedBranchEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetTeamsWithAccessToProtectedBranchRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
