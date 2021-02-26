package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListInstallationReposForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: AppsListInstallationReposForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData] with `3` = js.native
}
object ParametersAppsListInstallationReposForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListInstallationReposForAuthenticatedUserEndpoint,
    response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData] with `3`
  ): ParametersAppsListInstallationReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationReposForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListInstallationReposForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersAppsListInstallationReposForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListInstallationReposForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData] with `3`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
