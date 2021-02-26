package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `563` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetOrgPublicKeyEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetOrgPublicKeyResponseData] = js.native
}
object `563` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetOrgPublicKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
  ): `563` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`563`]
  }
  
  @scala.inline
  implicit class `563MutableBuilder`[Self <: `563`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsGetOrgPublicKeyEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetOrgPublicKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
