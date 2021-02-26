package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `743` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesListLabelsForMilestoneEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesListLabelsForMilestoneResponseData] = js.native
}
object `743` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListLabelsForMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListLabelsForMilestoneResponseData]
  ): `743` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`743`]
  }
  
  @scala.inline
  implicit class `743MutableBuilder`[Self <: `743`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[IssuesListLabelsForMilestoneEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListLabelsForMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
