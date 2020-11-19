package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForRepoRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsRemoveRestrictionsForRepoEndpoint extends js.Object {
  
  var parameters: InteractionsRemoveRestrictionsForRepoEndpoint = js.native
  
  var request: InteractionsRemoveRestrictionsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersInteractionsRemoveRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsRemoveRestrictionsForRepoEndpoint,
    request: InteractionsRemoveRestrictionsForRepoRequestOptions,
    response: OctokitResponse[_]
  ): ParametersInteractionsRemoveRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsRemoveRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsRemoveRestrictionsForRepoEndpointOps[Self <: ParametersInteractionsRemoveRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: InteractionsRemoveRestrictionsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsRemoveRestrictionsForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
