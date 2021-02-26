package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsGetRepoInstallationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetRepoInstallationRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsGetRepoInstallationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetRepoInstallationEndpoint extends StObject {
  
  var parameters: AppsGetRepoInstallationEndpoint = js.native
  
  var request: AppsGetRepoInstallationRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetRepoInstallationResponseData] = js.native
}
object ParametersAppsGetRepoInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetRepoInstallationEndpoint,
    request: AppsGetRepoInstallationRequestOptions,
    response: OctokitResponse[AppsGetRepoInstallationResponseData]
  ): ParametersAppsGetRepoInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetRepoInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetRepoInstallationEndpointMutableBuilder[Self <: ParametersAppsGetRepoInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsGetRepoInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetRepoInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetRepoInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
