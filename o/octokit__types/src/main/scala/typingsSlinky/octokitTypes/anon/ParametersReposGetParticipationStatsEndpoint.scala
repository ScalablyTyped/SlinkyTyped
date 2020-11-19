package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetParticipationStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetParticipationStatsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetParticipationStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetParticipationStatsEndpoint extends js.Object {
  
  var parameters: ReposGetParticipationStatsEndpoint = js.native
  
  var request: ReposGetParticipationStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetParticipationStatsResponseData] = js.native
}
object ParametersReposGetParticipationStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetParticipationStatsEndpoint,
    request: ReposGetParticipationStatsRequestOptions,
    response: OctokitResponse[ReposGetParticipationStatsResponseData]
  ): ParametersReposGetParticipationStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetParticipationStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetParticipationStatsEndpointOps[Self <: ParametersReposGetParticipationStatsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetParticipationStatsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetParticipationStatsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetParticipationStatsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
