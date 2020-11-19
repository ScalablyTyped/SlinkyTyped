package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsGetByNameEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsGetByNameRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsGetByNameResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetByNameEndpoint extends js.Object {
  
  var parameters: TeamsGetByNameEndpoint = js.native
  
  var request: TeamsGetByNameRequestOptions = js.native
  
  var response: OctokitResponse[TeamsGetByNameResponseData] = js.native
}
object ParametersTeamsGetByNameEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetByNameEndpoint,
    request: TeamsGetByNameRequestOptions,
    response: OctokitResponse[TeamsGetByNameResponseData]
  ): ParametersTeamsGetByNameEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetByNameEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetByNameEndpointOps[Self <: ParametersTeamsGetByNameEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsGetByNameEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetByNameRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetByNameResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
