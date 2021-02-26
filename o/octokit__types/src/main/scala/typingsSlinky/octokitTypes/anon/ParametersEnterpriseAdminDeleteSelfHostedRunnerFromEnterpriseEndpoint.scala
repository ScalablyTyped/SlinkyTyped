package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint,
    request: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminDeleteSelfHostedRunnerFromEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
