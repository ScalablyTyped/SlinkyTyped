package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `576` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsListRepoSecretsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsListRepoSecretsResponseData] = js.native
}
object `576` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListRepoSecretsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListRepoSecretsResponseData]
  ): `576` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`576`]
  }
  
  @scala.inline
  implicit class `576MutableBuilder`[Self <: `576`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsListRepoSecretsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoSecretsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
