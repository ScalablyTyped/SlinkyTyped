package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `877` extends StObject {
  
  var parameters: RequestParameters with (Omit[
    ReactionsCreateForTeamDiscussionCommentInOrgEndpoint, 
    baseUrl | headers | mediaType
  ]) = js.native
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData] = js.native
}
object `877` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ReactionsCreateForTeamDiscussionCommentInOrgEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
  ): `877` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`877`]
  }
  
  @scala.inline
  implicit class `877MutableBuilder`[Self <: `877`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[
          ReactionsCreateForTeamDiscussionCommentInOrgEndpoint, 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
