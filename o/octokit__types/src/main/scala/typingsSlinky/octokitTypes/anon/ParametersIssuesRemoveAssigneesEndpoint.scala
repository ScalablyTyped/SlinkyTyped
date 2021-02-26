package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesRemoveAssigneesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesRemoveAssigneesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesRemoveAssigneesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesRemoveAssigneesEndpoint extends StObject {
  
  var parameters: IssuesRemoveAssigneesEndpoint = js.native
  
  var request: IssuesRemoveAssigneesRequestOptions = js.native
  
  var response: OctokitResponse[IssuesRemoveAssigneesResponseData] = js.native
}
object ParametersIssuesRemoveAssigneesEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesRemoveAssigneesEndpoint,
    request: IssuesRemoveAssigneesRequestOptions,
    response: OctokitResponse[IssuesRemoveAssigneesResponseData]
  ): ParametersIssuesRemoveAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveAssigneesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesRemoveAssigneesEndpointMutableBuilder[Self <: ParametersIssuesRemoveAssigneesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesRemoveAssigneesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesRemoveAssigneesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesRemoveAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
