package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetStatusChecksProtectionEndpoint extends js.Object {
  
  var parameters: ReposGetStatusChecksProtectionEndpoint = js.native
  
  var request: ReposGetStatusChecksProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetStatusChecksProtectionResponseData] = js.native
}
object ParametersReposGetStatusChecksProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetStatusChecksProtectionEndpoint,
    request: ReposGetStatusChecksProtectionRequestOptions,
    response: OctokitResponse[ReposGetStatusChecksProtectionResponseData]
  ): ParametersReposGetStatusChecksProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetStatusChecksProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetStatusChecksProtectionEndpointOps[Self <: ParametersReposGetStatusChecksProtectionEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetStatusChecksProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetStatusChecksProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetStatusChecksProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
