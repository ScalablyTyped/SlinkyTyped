package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersResponseOctokitResponse extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsCreateRegistrationTokenForOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData] = js.native
}
object ParametersResponseOctokitResponse {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsCreateRegistrationTokenForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData]
  ): ParametersResponseOctokitResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponseOctokitResponse]
  }
  
  @scala.inline
  implicit class ParametersResponseOctokitResponseMutableBuilder[Self <: ParametersResponseOctokitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsCreateRegistrationTokenForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
