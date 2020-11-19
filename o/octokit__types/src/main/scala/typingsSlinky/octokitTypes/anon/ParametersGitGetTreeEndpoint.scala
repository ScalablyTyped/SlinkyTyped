package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitGetTreeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitGetTreeRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitGetTreeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetTreeEndpoint extends js.Object {
  
  var parameters: GitGetTreeEndpoint = js.native
  
  var request: GitGetTreeRequestOptions = js.native
  
  var response: OctokitResponse[GitGetTreeResponseData] = js.native
}
object ParametersGitGetTreeEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetTreeEndpoint,
    request: GitGetTreeRequestOptions,
    response: OctokitResponse[GitGetTreeResponseData]
  ): ParametersGitGetTreeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetTreeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetTreeEndpointOps[Self <: ParametersGitGetTreeEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitGetTreeEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetTreeRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetTreeResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
