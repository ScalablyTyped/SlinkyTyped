package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteBranchProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteBranchProtectionRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposDeleteBranchProtectionEndpoint = js.native
  
  var request: ReposDeleteBranchProtectionRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteBranchProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteBranchProtectionEndpoint,
    request: ReposDeleteBranchProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteBranchProtectionEndpointMutableBuilder[Self <: ParametersReposDeleteBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
