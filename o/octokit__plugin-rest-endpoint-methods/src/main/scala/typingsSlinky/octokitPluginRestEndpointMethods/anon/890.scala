package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `890` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReactionsListForTeamDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData] = js.native
}
object `890` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsListForTeamDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]
  ): `890` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`890`]
  }
  
  @scala.inline
  implicit class `890MutableBuilder`[Self <: `890`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReactionsListForTeamDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
