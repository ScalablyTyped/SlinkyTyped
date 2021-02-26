package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `583` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsListWorkflowRunArtifactsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] = js.native
}
object `583` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListWorkflowRunArtifactsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]
  ): `583` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`583`]
  }
  
  @scala.inline
  implicit class `583MutableBuilder`[Self <: `583`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsListWorkflowRunArtifactsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
