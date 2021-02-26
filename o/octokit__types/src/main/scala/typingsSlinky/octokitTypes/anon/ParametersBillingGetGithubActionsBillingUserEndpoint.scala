package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersBillingGetGithubActionsBillingUserEndpoint extends StObject {
  
  var parameters: BillingGetGithubActionsBillingUserEndpoint = js.native
  
  var request: BillingGetGithubActionsBillingUserRequestOptions = js.native
  
  var response: OctokitResponse[BillingGetGithubActionsBillingUserResponseData] = js.native
}
object ParametersBillingGetGithubActionsBillingUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: BillingGetGithubActionsBillingUserEndpoint,
    request: BillingGetGithubActionsBillingUserRequestOptions,
    response: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]
  ): ParametersBillingGetGithubActionsBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubActionsBillingUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersBillingGetGithubActionsBillingUserEndpointMutableBuilder[Self <: ParametersBillingGetGithubActionsBillingUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: BillingGetGithubActionsBillingUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: BillingGetGithubActionsBillingUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
