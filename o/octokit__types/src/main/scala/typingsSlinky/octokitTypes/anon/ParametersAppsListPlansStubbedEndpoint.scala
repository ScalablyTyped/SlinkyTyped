package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansStubbedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansStubbedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansStubbedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListPlansStubbedEndpoint extends StObject {
  
  var parameters: AppsListPlansStubbedEndpoint = js.native
  
  var request: AppsListPlansStubbedRequestOptions = js.native
  
  var response: OctokitResponse[AppsListPlansStubbedResponseData] = js.native
}
object ParametersAppsListPlansStubbedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListPlansStubbedEndpoint,
    request: AppsListPlansStubbedRequestOptions,
    response: OctokitResponse[AppsListPlansStubbedResponseData]
  ): ParametersAppsListPlansStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansStubbedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListPlansStubbedEndpointMutableBuilder[Self <: ParametersAppsListPlansStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListPlansStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListPlansStubbedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListPlansStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
