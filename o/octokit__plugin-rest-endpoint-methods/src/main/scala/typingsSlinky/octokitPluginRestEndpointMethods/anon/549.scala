package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `549` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsCreateRemoveTokenForRepoEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData] = js.native
}
object `549` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsCreateRemoveTokenForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]
  ): `549` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`549`]
  }
  
  @scala.inline
  implicit class `549MutableBuilder`[Self <: `549`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsCreateRemoveTokenForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
