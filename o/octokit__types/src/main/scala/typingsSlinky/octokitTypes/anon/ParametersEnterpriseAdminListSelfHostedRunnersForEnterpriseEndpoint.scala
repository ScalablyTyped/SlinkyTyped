package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersForEnterpriseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint,
    request: EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersForEnterpriseResponseData]
  ): ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListSelfHostedRunnersForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
