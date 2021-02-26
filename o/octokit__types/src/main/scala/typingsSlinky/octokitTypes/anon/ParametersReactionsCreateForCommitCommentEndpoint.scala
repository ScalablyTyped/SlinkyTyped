package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsCreateForCommitCommentEndpoint extends StObject {
  
  var parameters: ReactionsCreateForCommitCommentEndpoint = js.native
  
  var request: ReactionsCreateForCommitCommentRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsCreateForCommitCommentResponseData] = js.native
}
object ParametersReactionsCreateForCommitCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForCommitCommentEndpoint,
    request: ReactionsCreateForCommitCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForCommitCommentResponseData]
  ): ParametersReactionsCreateForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForCommitCommentEndpointMutableBuilder[Self <: ParametersReactionsCreateForCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForCommitCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
