package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListInstallationsEndpoint extends js.Object {
  
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
  implicit class ParametersAppsListInstallationsEndpointOps[Self <: ParametersAppsListInstallationsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsListInstallationsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListInstallationsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
