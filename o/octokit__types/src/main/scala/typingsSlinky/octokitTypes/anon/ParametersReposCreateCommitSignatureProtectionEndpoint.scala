package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateCommitSignatureProtectionEndpoint extends js.Object {
  
  var parameters: ReposCreateCommitSignatureProtectionEndpoint = js.native
  
  var request: ReposCreateCommitSignatureProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData] = js.native
}
object ParametersReposCreateCommitSignatureProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateCommitSignatureProtectionEndpoint,
    request: ReposCreateCommitSignatureProtectionRequestOptions,
    response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
  ): ParametersReposCreateCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateCommitSignatureProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateCommitSignatureProtectionEndpointOps[Self <: ParametersReposCreateCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposCreateCommitSignatureProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateCommitSignatureProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
