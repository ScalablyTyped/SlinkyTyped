package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesCreateCommentEndpoint extends StObject {
  
  var parameters: IssuesCreateCommentEndpoint = js.native
  
  var request: IssuesCreateCommentRequestOptions = js.native
  
  var response: OctokitResponse[IssuesCreateCommentResponseData] = js.native
}
object ParametersIssuesCreateCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesCreateCommentEndpoint,
    request: IssuesCreateCommentRequestOptions,
    response: OctokitResponse[IssuesCreateCommentResponseData]
  ): ParametersIssuesCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesCreateCommentEndpointMutableBuilder[Self <: ParametersIssuesCreateCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesCreateCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCreateCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
