package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateLabelEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateLabelRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateLabelResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesCreateLabelEndpoint extends StObject {
  
  var parameters: IssuesCreateLabelEndpoint = js.native
  
  var request: IssuesCreateLabelRequestOptions = js.native
  
  var response: OctokitResponse[IssuesCreateLabelResponseData] = js.native
}
object ParametersIssuesCreateLabelEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesCreateLabelEndpoint,
    request: IssuesCreateLabelRequestOptions,
    response: OctokitResponse[IssuesCreateLabelResponseData]
  ): ParametersIssuesCreateLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateLabelEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesCreateLabelEndpointMutableBuilder[Self <: ParametersIssuesCreateLabelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesCreateLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCreateLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
