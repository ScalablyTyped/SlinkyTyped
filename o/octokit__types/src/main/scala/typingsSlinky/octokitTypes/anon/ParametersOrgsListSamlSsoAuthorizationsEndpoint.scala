package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListSamlSsoAuthorizationsEndpoint extends StObject {
  
  var parameters: OrgsListSamlSsoAuthorizationsEndpoint = js.native
  
  var request: OrgsListSamlSsoAuthorizationsRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData] = js.native
}
object ParametersOrgsListSamlSsoAuthorizationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListSamlSsoAuthorizationsEndpoint,
    request: OrgsListSamlSsoAuthorizationsRequestOptions,
    response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]
  ): ParametersOrgsListSamlSsoAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListSamlSsoAuthorizationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListSamlSsoAuthorizationsEndpointMutableBuilder[Self <: ParametersOrgsListSamlSsoAuthorizationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListSamlSsoAuthorizationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListSamlSsoAuthorizationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
