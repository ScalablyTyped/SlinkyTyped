package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsForTimelineEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsForTimelineResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `739` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesListEventsForTimelineEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesListEventsForTimelineResponseData] = js.native
}
object `739` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListEventsForTimelineEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListEventsForTimelineResponseData]
  ): `739` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`739`]
  }
  
  @scala.inline
  implicit class `739MutableBuilder`[Self <: `739`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[IssuesListEventsForTimelineEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsForTimelineResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
