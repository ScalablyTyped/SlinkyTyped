package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListAccountsForPlanEndpoint extends StObject {
  
  var parameters: AppsListAccountsForPlanEndpoint = js.native
  
  var response: OctokitResponse[AppsListAccountsForPlanResponseData] = js.native
}
object ParametersAppsListAccountsForPlanEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListAccountsForPlanEndpoint,
    response: OctokitResponse[AppsListAccountsForPlanResponseData]
  ): ParametersAppsListAccountsForPlanEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListAccountsForPlanEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListAccountsForPlanEndpointMutableBuilder[Self <: ParametersAppsListAccountsForPlanEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListAccountsForPlanEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListAccountsForPlanResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
