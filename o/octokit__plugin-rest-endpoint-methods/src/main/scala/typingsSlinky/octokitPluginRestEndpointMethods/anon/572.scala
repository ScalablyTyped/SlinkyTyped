package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowUsageEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowUsageResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `572` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetWorkflowUsageEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowUsageResponseData] = js.native
}
object `572` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetWorkflowUsageEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
  ): `572` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`572`]
  }
  
  @scala.inline
  implicit class `572MutableBuilder`[Self <: `572`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsGetWorkflowUsageEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowUsageResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
