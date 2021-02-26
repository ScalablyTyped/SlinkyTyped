package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateStatusCheckPotectionEndpoint extends StObject {
  
  var parameters: ReposUpdateStatusCheckPotectionEndpoint = js.native
  
  var request: ReposUpdateStatusCheckPotectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData] = js.native
}
object ParametersReposUpdateStatusCheckPotectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateStatusCheckPotectionEndpoint,
    request: ReposUpdateStatusCheckPotectionRequestOptions,
    response: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData]
  ): ParametersReposUpdateStatusCheckPotectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateStatusCheckPotectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateStatusCheckPotectionEndpointMutableBuilder[Self <: ParametersReposUpdateStatusCheckPotectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdateStatusCheckPotectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateStatusCheckPotectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
