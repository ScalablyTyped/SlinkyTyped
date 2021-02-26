package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitCreateTagEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitCreateTagRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitCreateTagResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitCreateTagEndpoint extends StObject {
  
  var parameters: GitCreateTagEndpoint = js.native
  
  var request: GitCreateTagRequestOptions = js.native
  
  var response: OctokitResponse[GitCreateTagResponseData] = js.native
}
object ParametersGitCreateTagEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitCreateTagEndpoint,
    request: GitCreateTagRequestOptions,
    response: OctokitResponse[GitCreateTagResponseData]
  ): ParametersGitCreateTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateTagEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitCreateTagEndpointMutableBuilder[Self <: ParametersGitCreateTagEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitCreateTagEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitCreateTagRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateTagResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
