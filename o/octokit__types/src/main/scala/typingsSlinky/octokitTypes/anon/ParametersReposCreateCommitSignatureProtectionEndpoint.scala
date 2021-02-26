package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateCommitSignatureProtectionEndpoint extends StObject {
  
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
  implicit class ParametersReposCreateCommitSignatureProtectionEndpointMutableBuilder[Self <: ParametersReposCreateCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateCommitSignatureProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateCommitSignatureProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
