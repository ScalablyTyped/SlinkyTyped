package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsDeleteArtifactEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsDeleteArtifactRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDeleteArtifactEndpoint extends StObject {
  
  var parameters: ActionsDeleteArtifactEndpoint = js.native
  
  var request: ActionsDeleteArtifactRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDeleteArtifactEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDeleteArtifactEndpoint,
    request: ActionsDeleteArtifactRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDeleteArtifactEndpointMutableBuilder[Self <: ParametersActionsDeleteArtifactEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDeleteArtifactEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDeleteArtifactRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
