package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListInstallationReposForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: AppsListInstallationReposForAuthenticatedUserEndpoint = js.native
  
  var request: AppsListInstallationReposForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData] = js.native
}
object ParametersAppsListInstallationReposForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListInstallationReposForAuthenticatedUserEndpoint,
    request: AppsListInstallationReposForAuthenticatedUserRequestOptions,
    response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]
  ): ParametersAppsListInstallationReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationReposForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListInstallationReposForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersAppsListInstallationReposForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListInstallationReposForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListInstallationReposForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
