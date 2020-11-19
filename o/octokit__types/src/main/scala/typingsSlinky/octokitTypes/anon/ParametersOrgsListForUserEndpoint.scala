package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListForUserEndpoint extends js.Object {
  
  var parameters: OrgsListForUserEndpoint = js.native
  
  var request: OrgsListForUserRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListForUserResponseData] = js.native
}
object ParametersOrgsListForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListForUserEndpoint,
    request: OrgsListForUserRequestOptions,
    response: OctokitResponse[OrgsListForUserResponseData]
  ): ParametersOrgsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListForUserEndpointOps[Self <: ParametersOrgsListForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsListForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
