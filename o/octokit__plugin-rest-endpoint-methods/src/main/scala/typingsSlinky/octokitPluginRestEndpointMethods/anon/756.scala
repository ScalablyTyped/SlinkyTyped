package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateMilestoneEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateMilestoneResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `756` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesUpdateMilestoneEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesUpdateMilestoneResponseData] = js.native
}
object `756` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesUpdateMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateMilestoneResponseData]
  ): `756` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`756`]
  }
  
  @scala.inline
  implicit class `756MutableBuilder`[Self <: `756`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesUpdateMilestoneEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
