package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `878` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReactionsCreateForTeamDiscussionInOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData] = js.native
}
object `878` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsCreateForTeamDiscussionInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]
  ): `878` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`878`]
  }
  
  @scala.inline
  implicit class `878MutableBuilder`[Self <: `878`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReactionsCreateForTeamDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
