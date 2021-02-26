package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListCommitsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListCommitsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsListCommitsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListCommitsEndpoint extends StObject {
  
  var parameters: PullsListCommitsEndpoint = js.native
  
  var request: PullsListCommitsRequestOptions = js.native
  
  var response: OctokitResponse[PullsListCommitsResponseData] = js.native
}
object ParametersPullsListCommitsEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListCommitsEndpoint,
    request: PullsListCommitsRequestOptions,
    response: OctokitResponse[PullsListCommitsResponseData]
  ): ParametersPullsListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommitsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListCommitsEndpointMutableBuilder[Self <: ParametersPullsListCommitsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListCommitsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
