package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetTemplateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetTemplateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetTemplateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitignoreGetTemplateEndpoint extends StObject {
  
  var parameters: GitignoreGetTemplateEndpoint = js.native
  
  var request: GitignoreGetTemplateRequestOptions = js.native
  
  var response: OctokitResponse[GitignoreGetTemplateResponseData] = js.native
}
object ParametersGitignoreGetTemplateEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitignoreGetTemplateEndpoint,
    request: GitignoreGetTemplateRequestOptions,
    response: OctokitResponse[GitignoreGetTemplateResponseData]
  ): ParametersGitignoreGetTemplateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitignoreGetTemplateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitignoreGetTemplateEndpointMutableBuilder[Self <: ParametersGitignoreGetTemplateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitignoreGetTemplateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitignoreGetTemplateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitignoreGetTemplateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
