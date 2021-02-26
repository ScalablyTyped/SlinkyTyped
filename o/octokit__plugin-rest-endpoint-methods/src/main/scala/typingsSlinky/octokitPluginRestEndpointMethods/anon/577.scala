package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoWorkflowsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoWorkflowsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `577` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsListRepoWorkflowsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsListRepoWorkflowsResponseData] = js.native
}
object `577` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListRepoWorkflowsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListRepoWorkflowsResponseData]
  ): `577` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`577`]
  }
  
  @scala.inline
  implicit class `577MutableBuilder`[Self <: `577`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsListRepoWorkflowsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoWorkflowsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
