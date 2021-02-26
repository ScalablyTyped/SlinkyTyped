package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint extends StObject {
  
  var parameters: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint = js.native
  
  var request: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData] = js.native
}
object ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint,
    request: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpointMutableBuilder[Self <: ParametersEnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminUpdateAttributeForEnterpriseGroupEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminUpdateAttributeForEnterpriseGroupRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
