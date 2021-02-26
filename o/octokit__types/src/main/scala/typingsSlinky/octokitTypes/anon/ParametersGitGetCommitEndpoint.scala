package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitGetCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitGetCommitRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitGetCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetCommitEndpoint extends StObject {
  
  var parameters: GitGetCommitEndpoint = js.native
  
  var request: GitGetCommitRequestOptions = js.native
  
  var response: OctokitResponse[GitGetCommitResponseData] = js.native
}
object ParametersGitGetCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetCommitEndpoint,
    request: GitGetCommitRequestOptions,
    response: OctokitResponse[GitGetCommitResponseData]
  ): ParametersGitGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetCommitEndpointMutableBuilder[Self <: ParametersGitGetCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitGetCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
