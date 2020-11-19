package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponse200Data
import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListStargazersForRepoEndpoint extends js.Object {
  
  var parameters: ActivityListStargazersForRepoEndpoint = js.native
  
  var response: OctokitResponse[
    ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
  ] = js.native
}
object ParametersActivityListStargazersForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListStargazersForRepoEndpoint,
    response: OctokitResponse[
      ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
    ]
  ): ParametersActivityListStargazersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListStargazersForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListStargazersForRepoEndpointOps[Self <: ParametersActivityListStargazersForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityListStargazersForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
        ]
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
