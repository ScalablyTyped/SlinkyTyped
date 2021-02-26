package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsDeleteForPullRequestCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsDeleteForPullRequestCommentRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsDeleteForPullRequestCommentEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForPullRequestCommentEndpoint = js.native
  
  var request: ReactionsDeleteForPullRequestCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReactionsDeleteForPullRequestCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForPullRequestCommentEndpoint,
    request: ReactionsDeleteForPullRequestCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForPullRequestCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForPullRequestCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteForPullRequestCommentEndpointMutableBuilder[Self <: ParametersReactionsDeleteForPullRequestCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsDeleteForPullRequestCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteForPullRequestCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
