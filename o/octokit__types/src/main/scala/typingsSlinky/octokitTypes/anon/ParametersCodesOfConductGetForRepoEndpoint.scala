package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.CodesOfConductGetForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodesOfConductGetForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.CodesOfConductGetForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodesOfConductGetForRepoEndpoint extends js.Object {
  
  var parameters: CodesOfConductGetForRepoEndpoint = js.native
  
  var request: CodesOfConductGetForRepoRequestOptions = js.native
  
  var response: OctokitResponse[CodesOfConductGetForRepoResponseData] = js.native
}
object ParametersCodesOfConductGetForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodesOfConductGetForRepoEndpoint,
    request: CodesOfConductGetForRepoRequestOptions,
    response: OctokitResponse[CodesOfConductGetForRepoResponseData]
  ): ParametersCodesOfConductGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodesOfConductGetForRepoEndpointOps[Self <: ParametersCodesOfConductGetForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: CodesOfConductGetForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodesOfConductGetForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
