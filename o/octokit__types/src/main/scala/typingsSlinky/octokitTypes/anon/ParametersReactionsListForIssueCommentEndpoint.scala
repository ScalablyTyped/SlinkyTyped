package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForIssueCommentEndpoint extends StObject {
  
  var parameters: ReactionsListForIssueCommentEndpoint = js.native
  
  var request: ReactionsListForIssueCommentRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsListForIssueCommentResponseData] = js.native
}
object ParametersReactionsListForIssueCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForIssueCommentEndpoint,
    request: ReactionsListForIssueCommentRequestOptions,
    response: OctokitResponse[ReactionsListForIssueCommentResponseData]
  ): ParametersReactionsListForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForIssueCommentEndpointMutableBuilder[Self <: ParametersReactionsListForIssueCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForIssueCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsListForIssueCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForIssueCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
