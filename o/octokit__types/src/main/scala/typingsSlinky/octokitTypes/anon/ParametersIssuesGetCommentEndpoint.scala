package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesGetCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesGetCommentEndpoint extends StObject {
  
  var parameters: IssuesGetCommentEndpoint = js.native
  
  var request: IssuesGetCommentRequestOptions = js.native
  
  var response: OctokitResponse[IssuesGetCommentResponseData] = js.native
}
object ParametersIssuesGetCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesGetCommentEndpoint,
    request: IssuesGetCommentRequestOptions,
    response: OctokitResponse[IssuesGetCommentResponseData]
  ): ParametersIssuesGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesGetCommentEndpointMutableBuilder[Self <: ParametersIssuesGetCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesGetCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesGetCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
