package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitGetTreeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitGetTreeRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitGetTreeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetTreeEndpoint extends StObject {
  
  var parameters: GitGetTreeEndpoint = js.native
  
  var request: GitGetTreeRequestOptions = js.native
  
  var response: OctokitResponse[GitGetTreeResponseData] = js.native
}
object ParametersGitGetTreeEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetTreeEndpoint,
    request: GitGetTreeRequestOptions,
    response: OctokitResponse[GitGetTreeResponseData]
  ): ParametersGitGetTreeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetTreeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetTreeEndpointMutableBuilder[Self <: ParametersGitGetTreeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitGetTreeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetTreeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetTreeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
