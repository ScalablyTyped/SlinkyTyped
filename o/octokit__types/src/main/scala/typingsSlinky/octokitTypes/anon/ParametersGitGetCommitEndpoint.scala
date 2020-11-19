package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitGetCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitGetCommitRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitGetCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetCommitEndpoint extends js.Object {
  
  var parameters: GitGetCommitEndpoint = js.native
  
  var request: GitGetCommitRequestOptions = js.native
  
  var response: OctokitResponse[GitGetCommitResponseData] = js.native
}
object ParametersGitGetCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetCommitEndpoint,
    request: GitGetCommitRequestOptions,
    response: OctokitResponse[GitGetCommitResponseData]
  ): ParametersGitGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetCommitEndpointOps[Self <: ParametersGitGetCommitEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitGetCommitEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetCommitRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetCommitResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
