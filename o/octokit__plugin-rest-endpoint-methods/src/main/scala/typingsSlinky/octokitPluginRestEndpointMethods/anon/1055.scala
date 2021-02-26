package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionCommentsInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionCommentsInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1055` extends StObject {
  
  var parameters: RequestParameters with (Omit[TeamsListDiscussionCommentsInOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData] = js.native
}
object `1055` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsListDiscussionCommentsInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]
  ): `1055` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1055`]
  }
  
  @scala.inline
  implicit class `1055MutableBuilder`[Self <: `1055`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[TeamsListDiscussionCommentsInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionCommentsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
