package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `584` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsListWorkflowRunsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsListWorkflowRunsResponseData] = js.native
}
object `584` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListWorkflowRunsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListWorkflowRunsResponseData]
  ): `584` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`584`]
  }
  
  @scala.inline
  implicit class `584MutableBuilder`[Self <: `584`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsListWorkflowRunsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
