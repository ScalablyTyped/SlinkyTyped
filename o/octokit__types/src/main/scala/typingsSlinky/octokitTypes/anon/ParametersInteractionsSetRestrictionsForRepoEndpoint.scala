package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsSetRestrictionsForRepoEndpoint extends StObject {
  
  var parameters: InteractionsSetRestrictionsForRepoEndpoint = js.native
  
  var request: InteractionsSetRestrictionsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData] = js.native
}
object ParametersInteractionsSetRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsSetRestrictionsForRepoEndpoint,
    request: InteractionsSetRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]
  ): ParametersInteractionsSetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsSetRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsSetRestrictionsForRepoEndpointMutableBuilder[Self <: ParametersInteractionsSetRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: InteractionsSetRestrictionsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsSetRestrictionsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
