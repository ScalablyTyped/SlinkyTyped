package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitCreateTagEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitCreateTagRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitCreateTagResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitCreateTagEndpoint extends js.Object {
  
  var parameters: GitCreateTagEndpoint = js.native
  
  var request: GitCreateTagRequestOptions = js.native
  
  var response: OctokitResponse[GitCreateTagResponseData] = js.native
}
object ParametersGitCreateTagEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitCreateTagEndpoint,
    request: GitCreateTagRequestOptions,
    response: OctokitResponse[GitCreateTagResponseData]
  ): ParametersGitCreateTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateTagEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitCreateTagEndpointOps[Self <: ParametersGitCreateTagEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitCreateTagEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitCreateTagRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateTagResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
