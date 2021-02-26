package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListCommentsForCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommentsForCommitRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommentsForCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListCommentsForCommitEndpoint extends StObject {
  
  var parameters: ReposListCommentsForCommitEndpoint = js.native
  
  var request: ReposListCommentsForCommitRequestOptions = js.native
  
  var response: OctokitResponse[ReposListCommentsForCommitResponseData] = js.native
}
object ParametersReposListCommentsForCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListCommentsForCommitEndpoint,
    request: ReposListCommentsForCommitRequestOptions,
    response: OctokitResponse[ReposListCommentsForCommitResponseData]
  ): ParametersReposListCommentsForCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommentsForCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListCommentsForCommitEndpointMutableBuilder[Self <: ParametersReposListCommentsForCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListCommentsForCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListCommentsForCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommentsForCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
