package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `562` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetJobForWorkflowRunEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetJobForWorkflowRunResponseData] = js.native
}
object `562` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetJobForWorkflowRunEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]
  ): `562` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`562`]
  }
  
  @scala.inline
  implicit class `562MutableBuilder`[Self <: `562`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsGetJobForWorkflowRunEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
