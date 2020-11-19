package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ScimUpdateAttributeForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ScimUpdateAttributeForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ScimUpdateAttributeForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimUpdateAttributeForUserEndpoint extends js.Object {
  
  var parameters: ScimUpdateAttributeForUserEndpoint = js.native
  
  var request: ScimUpdateAttributeForUserRequestOptions = js.native
  
  var response: OctokitResponse[ScimUpdateAttributeForUserResponseData] = js.native
}
object ParametersScimUpdateAttributeForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimUpdateAttributeForUserEndpoint,
    request: ScimUpdateAttributeForUserRequestOptions,
    response: OctokitResponse[ScimUpdateAttributeForUserResponseData]
  ): ParametersScimUpdateAttributeForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimUpdateAttributeForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimUpdateAttributeForUserEndpointOps[Self <: ParametersScimUpdateAttributeForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ScimUpdateAttributeForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimUpdateAttributeForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimUpdateAttributeForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
