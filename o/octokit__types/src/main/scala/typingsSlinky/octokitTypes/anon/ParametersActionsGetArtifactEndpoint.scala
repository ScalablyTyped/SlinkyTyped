package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsGetArtifactEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetArtifactRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetArtifactResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetArtifactEndpoint extends StObject {
  
  var parameters: ActionsGetArtifactEndpoint = js.native
  
  var request: ActionsGetArtifactRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetArtifactResponseData] = js.native
}
object ParametersActionsGetArtifactEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetArtifactEndpoint,
    request: ActionsGetArtifactRequestOptions,
    response: OctokitResponse[ActionsGetArtifactResponseData]
  ): ParametersActionsGetArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetArtifactEndpointMutableBuilder[Self <: ParametersActionsGetArtifactEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetArtifactEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetArtifactRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetArtifactResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
