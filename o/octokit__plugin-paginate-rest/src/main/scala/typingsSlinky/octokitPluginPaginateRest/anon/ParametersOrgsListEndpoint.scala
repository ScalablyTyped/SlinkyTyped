package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListEndpoint extends js.Object {
  
  var parameters: OrgsListEndpoint = js.native
  
  var response: OctokitResponse[OrgsListResponseData] = js.native
}
object ParametersOrgsListEndpoint {
  
  @scala.inline
  def apply(parameters: OrgsListEndpoint, response: OctokitResponse[OrgsListResponseData]): ParametersOrgsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListEndpointOps[Self <: ParametersOrgsListEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsListEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
