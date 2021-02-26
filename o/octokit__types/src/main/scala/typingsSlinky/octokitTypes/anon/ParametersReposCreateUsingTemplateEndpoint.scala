package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCreateUsingTemplateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateUsingTemplateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateUsingTemplateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateUsingTemplateEndpoint extends StObject {
  
  var parameters: ReposCreateUsingTemplateEndpoint = js.native
  
  var request: ReposCreateUsingTemplateRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateUsingTemplateResponseData] = js.native
}
object ParametersReposCreateUsingTemplateEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateUsingTemplateEndpoint,
    request: ReposCreateUsingTemplateRequestOptions,
    response: OctokitResponse[ReposCreateUsingTemplateResponseData]
  ): ParametersReposCreateUsingTemplateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateUsingTemplateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateUsingTemplateEndpointMutableBuilder[Self <: ParametersReposCreateUsingTemplateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateUsingTemplateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateUsingTemplateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateUsingTemplateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
