package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint,
    request: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData]
  ): ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
