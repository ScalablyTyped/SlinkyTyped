package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsGetRestrictionsForRepoEndpoint extends StObject {
  
  var parameters: InteractionsGetRestrictionsForRepoEndpoint = js.native
  
  var request: InteractionsGetRestrictionsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData] = js.native
}
object ParametersInteractionsGetRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsGetRestrictionsForRepoEndpoint,
    request: InteractionsGetRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
  ): ParametersInteractionsGetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsGetRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsGetRestrictionsForRepoEndpointMutableBuilder[Self <: ParametersInteractionsGetRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: InteractionsGetRestrictionsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsGetRestrictionsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
