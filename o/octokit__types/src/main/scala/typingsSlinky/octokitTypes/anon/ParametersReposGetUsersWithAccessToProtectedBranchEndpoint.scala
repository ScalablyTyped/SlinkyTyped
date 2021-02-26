package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetUsersWithAccessToProtectedBranchEndpoint extends StObject {
  
  var parameters: ReposGetUsersWithAccessToProtectedBranchEndpoint = js.native
  
  var request: ReposGetUsersWithAccessToProtectedBranchRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData] = js.native
}
object ParametersReposGetUsersWithAccessToProtectedBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetUsersWithAccessToProtectedBranchEndpoint,
    request: ReposGetUsersWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetUsersWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetUsersWithAccessToProtectedBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetUsersWithAccessToProtectedBranchEndpointMutableBuilder[Self <: ParametersReposGetUsersWithAccessToProtectedBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetUsersWithAccessToProtectedBranchEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetUsersWithAccessToProtectedBranchRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
