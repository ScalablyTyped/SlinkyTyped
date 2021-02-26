package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteCommitSignatureProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteCommitSignatureProtectionRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteCommitSignatureProtectionEndpoint extends StObject {
  
  var parameters: ReposDeleteCommitSignatureProtectionEndpoint = js.native
  
  var request: ReposDeleteCommitSignatureProtectionRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteCommitSignatureProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteCommitSignatureProtectionEndpoint,
    request: ReposDeleteCommitSignatureProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteCommitSignatureProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteCommitSignatureProtectionEndpointMutableBuilder[Self <: ParametersReposDeleteCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteCommitSignatureProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteCommitSignatureProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
