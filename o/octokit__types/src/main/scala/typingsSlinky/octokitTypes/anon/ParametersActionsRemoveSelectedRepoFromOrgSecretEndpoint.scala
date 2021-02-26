package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsRemoveSelectedRepoFromOrgSecretEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsRemoveSelectedRepoFromOrgSecretRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsRemoveSelectedRepoFromOrgSecretEndpoint = js.native
  
  var request: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsRemoveSelectedRepoFromOrgSecretEndpoint,
    request: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsRemoveSelectedRepoFromOrgSecretEndpointMutableBuilder[Self <: ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsRemoveSelectedRepoFromOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
