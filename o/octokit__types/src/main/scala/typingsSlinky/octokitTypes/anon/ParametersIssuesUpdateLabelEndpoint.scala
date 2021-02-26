package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateLabelEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateLabelRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateLabelResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesUpdateLabelEndpoint extends StObject {
  
  var parameters: IssuesUpdateLabelEndpoint = js.native
  
  var request: IssuesUpdateLabelRequestOptions = js.native
  
  var response: OctokitResponse[IssuesUpdateLabelResponseData] = js.native
}
object ParametersIssuesUpdateLabelEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesUpdateLabelEndpoint,
    request: IssuesUpdateLabelRequestOptions,
    response: OctokitResponse[IssuesUpdateLabelResponseData]
  ): ParametersIssuesUpdateLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateLabelEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesUpdateLabelEndpointMutableBuilder[Self <: ParametersIssuesUpdateLabelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesUpdateLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesUpdateLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
