package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForCommitCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForCommitCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForCommitCommentEndpoint extends StObject {
  
  var parameters: ReactionsListForCommitCommentEndpoint = js.native
  
  var response: OctokitResponse[ReactionsListForCommitCommentResponseData] = js.native
}
object ParametersReactionsListForCommitCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForCommitCommentEndpoint,
    response: OctokitResponse[ReactionsListForCommitCommentResponseData]
  ): ParametersReactionsListForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForCommitCommentEndpointMutableBuilder[Self <: ParametersReactionsListForCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForCommitCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
