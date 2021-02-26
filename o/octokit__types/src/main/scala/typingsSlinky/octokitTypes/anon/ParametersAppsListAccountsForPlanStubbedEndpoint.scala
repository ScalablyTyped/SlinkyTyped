package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListAccountsForPlanStubbedEndpoint extends StObject {
  
  var parameters: AppsListAccountsForPlanStubbedEndpoint = js.native
  
  var request: AppsListAccountsForPlanStubbedRequestOptions = js.native
  
  var response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData] = js.native
}
object ParametersAppsListAccountsForPlanStubbedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListAccountsForPlanStubbedEndpoint,
    request: AppsListAccountsForPlanStubbedRequestOptions,
    response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
  ): ParametersAppsListAccountsForPlanStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListAccountsForPlanStubbedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListAccountsForPlanStubbedEndpointMutableBuilder[Self <: ParametersAppsListAccountsForPlanStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListAccountsForPlanStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListAccountsForPlanStubbedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
