package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponse201Data
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateOrUpdateFileContentsEndpoint extends StObject {
  
  var parameters: ReposCreateOrUpdateFileContentsEndpoint = js.native
  
  var request: ReposCreateOrUpdateFileContentsRequestOptions = js.native
  
  var response: OctokitResponse[
    ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
  ] = js.native
}
object ParametersReposCreateOrUpdateFileContentsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateOrUpdateFileContentsEndpoint,
    request: ReposCreateOrUpdateFileContentsRequestOptions,
    response: OctokitResponse[
      ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
    ]
  ): ParametersReposCreateOrUpdateFileContentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateOrUpdateFileContentsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateOrUpdateFileContentsEndpointMutableBuilder[Self <: ParametersReposCreateOrUpdateFileContentsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateOrUpdateFileContentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateOrUpdateFileContentsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
