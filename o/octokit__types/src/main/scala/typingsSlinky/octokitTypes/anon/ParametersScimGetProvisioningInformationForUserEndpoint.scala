package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimGetProvisioningInformationForUserEndpoint extends StObject {
  
  var parameters: ScimGetProvisioningInformationForUserEndpoint = js.native
  
  var request: ScimGetProvisioningInformationForUserRequestOptions = js.native
  
  var response: OctokitResponse[ScimGetProvisioningInformationForUserResponseData] = js.native
}
object ParametersScimGetProvisioningInformationForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimGetProvisioningInformationForUserEndpoint,
    request: ScimGetProvisioningInformationForUserRequestOptions,
    response: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]
  ): ParametersScimGetProvisioningInformationForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimGetProvisioningInformationForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimGetProvisioningInformationForUserEndpointMutableBuilder[Self <: ParametersScimGetProvisioningInformationForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimGetProvisioningInformationForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimGetProvisioningInformationForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
