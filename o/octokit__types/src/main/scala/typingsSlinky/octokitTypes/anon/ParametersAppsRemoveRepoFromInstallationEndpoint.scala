package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsRemoveRepoFromInstallationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsRemoveRepoFromInstallationRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsRemoveRepoFromInstallationEndpoint extends StObject {
  
  var parameters: AppsRemoveRepoFromInstallationEndpoint = js.native
  
  var request: AppsRemoveRepoFromInstallationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersAppsRemoveRepoFromInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsRemoveRepoFromInstallationEndpoint,
    request: AppsRemoveRepoFromInstallationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsRemoveRepoFromInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsRemoveRepoFromInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsRemoveRepoFromInstallationEndpointMutableBuilder[Self <: ParametersAppsRemoveRepoFromInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsRemoveRepoFromInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsRemoveRepoFromInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
