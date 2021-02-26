package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListInstallationsEndpoint extends StObject {
  
  var parameters: AppsListInstallationsEndpoint = js.native
  
  var request: AppsListInstallationsRequestOptions = js.native
  
  var response: OctokitResponse[AppsListInstallationsResponseData] = js.native
}
object ParametersAppsListInstallationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListInstallationsEndpoint,
    request: AppsListInstallationsRequestOptions,
    response: OctokitResponse[AppsListInstallationsResponseData]
  ): ParametersAppsListInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListInstallationsEndpointMutableBuilder[Self <: ParametersAppsListInstallationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListInstallationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListInstallationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
