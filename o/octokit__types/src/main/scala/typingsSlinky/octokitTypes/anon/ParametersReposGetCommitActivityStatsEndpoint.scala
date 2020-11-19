package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitActivityStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitActivityStatsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitActivityStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCommitActivityStatsEndpoint extends js.Object {
  
  var parameters: ReposGetCommitActivityStatsEndpoint = js.native
  
  var request: ReposGetCommitActivityStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCommitActivityStatsResponseData] = js.native
}
object ParametersReposGetCommitActivityStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCommitActivityStatsEndpoint,
    request: ReposGetCommitActivityStatsRequestOptions,
    response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
  ): ParametersReposGetCommitActivityStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitActivityStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCommitActivityStatsEndpointOps[Self <: ParametersReposGetCommitActivityStatsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetCommitActivityStatsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCommitActivityStatsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitActivityStatsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
