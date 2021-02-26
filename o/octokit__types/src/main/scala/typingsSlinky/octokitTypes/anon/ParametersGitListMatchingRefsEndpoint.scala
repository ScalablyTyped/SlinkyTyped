package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitListMatchingRefsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitListMatchingRefsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitListMatchingRefsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitListMatchingRefsEndpoint extends StObject {
  
  var parameters: GitListMatchingRefsEndpoint = js.native
  
  var request: GitListMatchingRefsRequestOptions = js.native
  
  var response: OctokitResponse[GitListMatchingRefsResponseData] = js.native
}
object ParametersGitListMatchingRefsEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitListMatchingRefsEndpoint,
    request: GitListMatchingRefsRequestOptions,
    response: OctokitResponse[GitListMatchingRefsResponseData]
  ): ParametersGitListMatchingRefsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitListMatchingRefsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitListMatchingRefsEndpointMutableBuilder[Self <: ParametersGitListMatchingRefsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitListMatchingRefsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitListMatchingRefsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitListMatchingRefsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
