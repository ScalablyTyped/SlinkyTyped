package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetUsersWithAccessToProtectedBranchEndpoint extends js.Object {
  var parameters: ReposGetUsersWithAccessToProtectedBranchEndpoint = js.native
  var request: ReposGetUsersWithAccessToProtectedBranchRequestOptions = js.native
  var response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData] = js.native
}

object ParametersReposGetUsersWithAccessToProtectedBranchEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetUsersWithAccessToProtectedBranchEndpoint,
    request: ReposGetUsersWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetUsersWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetUsersWithAccessToProtectedBranchEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetUsersWithAccessToProtectedBranchEndpointOps[Self <: ParametersReposGetUsersWithAccessToProtectedBranchEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetUsersWithAccessToProtectedBranchEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetUsersWithAccessToProtectedBranchRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

