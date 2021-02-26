package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `547` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsCreateRegistrationTokenForRepoEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData] = js.native
}
object `547` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsCreateRegistrationTokenForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
  ): `547` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`547`]
  }
  
  @scala.inline
  implicit class `547MutableBuilder`[Self <: `547`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsCreateRegistrationTokenForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
