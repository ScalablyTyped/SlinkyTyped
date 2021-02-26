package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `574` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsListJobsForWorkflowRunEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] = js.native
}
object `574` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListJobsForWorkflowRunEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
  ): `574` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`574`]
  }
  
  @scala.inline
  implicit class `574MutableBuilder`[Self <: `574`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsListJobsForWorkflowRunEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
