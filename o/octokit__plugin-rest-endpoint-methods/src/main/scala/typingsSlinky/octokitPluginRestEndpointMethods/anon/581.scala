package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `581` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsListSelfHostedRunnersForOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] = js.native
}
object `581` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListSelfHostedRunnersForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
  ): `581` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`581`]
  }
  
  @scala.inline
  implicit class `581MutableBuilder`[Self <: `581`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsListSelfHostedRunnersForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
