package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListOutsideCollaboratorsEndpoint extends js.Object {
  
  var parameters: OrgsListOutsideCollaboratorsEndpoint = js.native
  
  var request: OrgsListOutsideCollaboratorsRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData] = js.native
}
object ParametersOrgsListOutsideCollaboratorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListOutsideCollaboratorsEndpoint,
    request: OrgsListOutsideCollaboratorsRequestOptions,
    response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]
  ): ParametersOrgsListOutsideCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListOutsideCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListOutsideCollaboratorsEndpointOps[Self <: ParametersOrgsListOutsideCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsListOutsideCollaboratorsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListOutsideCollaboratorsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
