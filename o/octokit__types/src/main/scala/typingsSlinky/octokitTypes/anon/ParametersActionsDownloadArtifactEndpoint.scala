package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsDownloadArtifactEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsDownloadArtifactRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDownloadArtifactEndpoint extends StObject {
  
  var parameters: ActionsDownloadArtifactEndpoint = js.native
  
  var request: ActionsDownloadArtifactRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDownloadArtifactEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDownloadArtifactEndpoint,
    request: ActionsDownloadArtifactRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDownloadArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDownloadArtifactEndpointMutableBuilder[Self <: ParametersActionsDownloadArtifactEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDownloadArtifactEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDownloadArtifactRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
