package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCommitEndpoint extends js.Object {
  
  var parameters: ReposGetCommitEndpoint = js.native
  
  var request: ReposGetCommitRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCommitResponseData] = js.native
}
object ParametersReposGetCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCommitEndpoint,
    request: ReposGetCommitRequestOptions,
    response: OctokitResponse[ReposGetCommitResponseData]
  ): ParametersReposGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCommitEndpointOps[Self <: ParametersReposGetCommitEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetCommitEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCommitRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
