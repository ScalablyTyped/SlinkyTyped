package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListWebhooksEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListWebhooksResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListWebhooksEndpoint extends js.Object {
  
  var parameters: ReposListWebhooksEndpoint = js.native
  
  var response: OctokitResponse[ReposListWebhooksResponseData] = js.native
}
object ParametersReposListWebhooksEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListWebhooksEndpoint, response: OctokitResponse[ReposListWebhooksResponseData]): ParametersReposListWebhooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListWebhooksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListWebhooksEndpointOps[Self <: ParametersReposListWebhooksEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposListWebhooksEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListWebhooksResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
