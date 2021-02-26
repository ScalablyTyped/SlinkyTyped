package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `571` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetWorkflowRunUsageEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData] = js.native
}
object `571` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetWorkflowRunUsageEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
  ): `571` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`571`]
  }
  
  @scala.inline
  implicit class `571MutableBuilder`[Self <: `571`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsGetWorkflowRunUsageEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
