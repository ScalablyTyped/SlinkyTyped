package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposRemoveUserAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveUserAccessRestrictionsEndpoint = js.native
  var request: ReposRemoveUserAccessRestrictionsRequestOptions = js.native
  var response: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData] = js.native
}

object ParametersReposRemoveUserAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveUserAccessRestrictionsEndpoint,
    request: ReposRemoveUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData]
  ): ParametersReposRemoveUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveUserAccessRestrictionsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposRemoveUserAccessRestrictionsEndpointOps[Self <: ParametersReposRemoveUserAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposRemoveUserAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposRemoveUserAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

