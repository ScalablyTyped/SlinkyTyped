package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `580` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsListSelectedReposForOrgSecretEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] = js.native
}
object `580` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListSelectedReposForOrgSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
  ): `580` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`580`]
  }
  
  @scala.inline
  implicit class `580MutableBuilder`[Self <: `580`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsListSelectedReposForOrgSecretEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
