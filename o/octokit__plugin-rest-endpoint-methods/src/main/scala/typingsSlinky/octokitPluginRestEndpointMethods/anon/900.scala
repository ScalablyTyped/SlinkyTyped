package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentStatusEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentStatusResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `900` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateDeploymentStatusEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[ReposCreateDeploymentStatusResponseData] = js.native
}

object `900` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateDeploymentStatusEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
  ): `900` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`900`]
  }
  @scala.inline
  implicit class `900Ops`[Self <: `900`] (val x: Self) extends AnyVal {
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
    def setParameters(
      value: RequestParameters with (Omit[ReposCreateDeploymentStatusEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateDeploymentStatusResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

