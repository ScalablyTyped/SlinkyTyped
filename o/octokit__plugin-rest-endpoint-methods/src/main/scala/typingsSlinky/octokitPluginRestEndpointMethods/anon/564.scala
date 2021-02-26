package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetOrgSecretEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetOrgSecretResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `564` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetOrgSecretResponseData] = js.native
}
object `564` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetOrgSecretResponseData]
  ): `564` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`564`]
  }
  
  @scala.inline
  implicit class `564MutableBuilder`[Self <: `564`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetOrgSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
