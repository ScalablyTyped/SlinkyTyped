package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.SearchUsersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchUsersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchUsersEndpoint extends js.Object {
  
  var parameters: SearchUsersEndpoint = js.native
  
  var response: OctokitResponse[SearchUsersResponseData] with `23` = js.native
}
object ParametersSearchUsersEndpoint {
  
  @scala.inline
  def apply(parameters: SearchUsersEndpoint, response: OctokitResponse[SearchUsersResponseData] with `23`): ParametersSearchUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchUsersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchUsersEndpointOps[Self <: ParametersSearchUsersEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: SearchUsersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchUsersResponseData] with `23`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
