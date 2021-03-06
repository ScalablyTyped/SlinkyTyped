package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForIssueEndpoint extends StObject {
  
  var parameters: ReactionsListForIssueEndpoint = js.native
  
  var request: ReactionsListForIssueRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsListForIssueResponseData] = js.native
}
object ParametersReactionsListForIssueEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForIssueEndpoint,
    request: ReactionsListForIssueRequestOptions,
    response: OctokitResponse[ReactionsListForIssueResponseData]
  ): ParametersReactionsListForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForIssueEndpointMutableBuilder[Self <: ParametersReactionsListForIssueEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForIssueEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsListForIssueRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
