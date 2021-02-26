package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitUpdateRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitUpdateRefRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitUpdateRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitUpdateRefEndpoint extends StObject {
  
  var parameters: GitUpdateRefEndpoint = js.native
  
  var request: GitUpdateRefRequestOptions = js.native
  
  var response: OctokitResponse[GitUpdateRefResponseData] = js.native
}
object ParametersGitUpdateRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitUpdateRefEndpoint,
    request: GitUpdateRefRequestOptions,
    response: OctokitResponse[GitUpdateRefResponseData]
  ): ParametersGitUpdateRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitUpdateRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitUpdateRefEndpointMutableBuilder[Self <: ParametersGitUpdateRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitUpdateRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitUpdateRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitUpdateRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
