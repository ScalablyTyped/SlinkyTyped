package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateBranchEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateBranchRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateBranchResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsUpdateBranchEndpoint extends StObject {
  
  var parameters: PullsUpdateBranchEndpoint = js.native
  
  var request: PullsUpdateBranchRequestOptions = js.native
  
  var response: OctokitResponse[PullsUpdateBranchResponseData] = js.native
}
object ParametersPullsUpdateBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsUpdateBranchEndpoint,
    request: PullsUpdateBranchRequestOptions,
    response: OctokitResponse[PullsUpdateBranchResponseData]
  ): ParametersPullsUpdateBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsUpdateBranchEndpointMutableBuilder[Self <: ParametersPullsUpdateBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsUpdateBranchEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsUpdateBranchRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
