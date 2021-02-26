package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesAddLabelsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesAddLabelsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesAddLabelsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesAddLabelsEndpoint extends StObject {
  
  var parameters: IssuesAddLabelsEndpoint = js.native
  
  var request: IssuesAddLabelsRequestOptions = js.native
  
  var response: OctokitResponse[IssuesAddLabelsResponseData] = js.native
}
object ParametersIssuesAddLabelsEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesAddLabelsEndpoint,
    request: IssuesAddLabelsRequestOptions,
    response: OctokitResponse[IssuesAddLabelsResponseData]
  ): ParametersIssuesAddLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesAddLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesAddLabelsEndpointMutableBuilder[Self <: ParametersIssuesAddLabelsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesAddLabelsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesAddLabelsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesAddLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
