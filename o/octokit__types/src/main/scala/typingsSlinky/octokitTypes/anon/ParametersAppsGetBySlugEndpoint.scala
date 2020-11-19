package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsGetBySlugEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetBySlugRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsGetBySlugResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetBySlugEndpoint extends js.Object {
  
  var parameters: AppsGetBySlugEndpoint = js.native
  
  var request: AppsGetBySlugRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetBySlugResponseData] = js.native
}
object ParametersAppsGetBySlugEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetBySlugEndpoint,
    request: AppsGetBySlugRequestOptions,
    response: OctokitResponse[AppsGetBySlugResponseData]
  ): ParametersAppsGetBySlugEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetBySlugEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetBySlugEndpointOps[Self <: ParametersAppsGetBySlugEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsGetBySlugEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetBySlugRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetBySlugResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
