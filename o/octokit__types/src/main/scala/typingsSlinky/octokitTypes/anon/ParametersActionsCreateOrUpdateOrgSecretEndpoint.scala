package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateOrUpdateOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsCreateOrUpdateOrgSecretEndpoint = js.native
  
  var request: ActionsCreateOrUpdateOrgSecretRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsCreateOrUpdateOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateOrUpdateOrgSecretEndpoint,
    request: ActionsCreateOrUpdateOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsCreateOrUpdateOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateOrUpdateOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateOrUpdateOrgSecretEndpointMutableBuilder[Self <: ParametersActionsCreateOrUpdateOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateOrUpdateOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateOrUpdateOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
