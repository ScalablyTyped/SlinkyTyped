package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesGetLabelEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetLabelRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetLabelResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesGetLabelEndpoint extends StObject {
  
  var parameters: IssuesGetLabelEndpoint = js.native
  
  var request: IssuesGetLabelRequestOptions = js.native
  
  var response: OctokitResponse[IssuesGetLabelResponseData] = js.native
}
object ParametersIssuesGetLabelEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesGetLabelEndpoint,
    request: IssuesGetLabelRequestOptions,
    response: OctokitResponse[IssuesGetLabelResponseData]
  ): ParametersIssuesGetLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetLabelEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesGetLabelEndpointMutableBuilder[Self <: ParametersIssuesGetLabelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesGetLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesGetLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
