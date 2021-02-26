package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `569` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetWorkflowEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowResponseData] = js.native
}
object `569` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetWorkflowEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowResponseData]
  ): `569` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`569`]
  }
  
  @scala.inline
  implicit class `569MutableBuilder`[Self <: `569`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ActionsGetWorkflowEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
