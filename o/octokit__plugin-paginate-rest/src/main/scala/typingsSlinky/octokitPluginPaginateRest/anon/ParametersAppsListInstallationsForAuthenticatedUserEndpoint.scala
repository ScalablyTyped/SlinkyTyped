package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListInstallationsForAuthenticatedUserEndpoint extends js.Object {
  
  var parameters: AppsListInstallationsForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] with `20` = js.native
}
object ParametersAppsListInstallationsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListInstallationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] with `20`
  ): ParametersAppsListInstallationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListInstallationsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListInstallationsForAuthenticatedUserEndpointOps[Self <: ParametersAppsListInstallationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: AppsListInstallationsForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData] with `20`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
