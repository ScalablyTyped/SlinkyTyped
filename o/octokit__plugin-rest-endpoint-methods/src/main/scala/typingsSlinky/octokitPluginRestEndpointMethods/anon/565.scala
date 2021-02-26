package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `565` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetRepoPublicKeyEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetRepoPublicKeyResponseData] = js.native
}
object `565` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetRepoPublicKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetRepoPublicKeyResponseData]
  ): `565` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`565`]
  }
  
  @scala.inline
  implicit class `565MutableBuilder`[Self <: `565`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsGetRepoPublicKeyEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetRepoPublicKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
