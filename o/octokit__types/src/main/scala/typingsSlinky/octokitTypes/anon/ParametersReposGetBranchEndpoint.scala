package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetBranchEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetBranchRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetBranchResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetBranchEndpoint extends StObject {
  
  var parameters: ReposGetBranchEndpoint = js.native
  
  var request: ReposGetBranchRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetBranchResponseData] = js.native
}
object ParametersReposGetBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetBranchEndpoint,
    request: ReposGetBranchRequestOptions,
    response: OctokitResponse[ReposGetBranchResponseData]
  ): ParametersReposGetBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetBranchEndpointMutableBuilder[Self <: ParametersReposGetBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetBranchEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetBranchRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
