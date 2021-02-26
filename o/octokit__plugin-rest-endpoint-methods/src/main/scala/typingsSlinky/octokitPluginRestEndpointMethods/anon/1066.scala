package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1066` extends StObject {
  
  var parameters: RequestParameters with (Omit[TeamsUpdateDiscussionInOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData] = js.native
}
object `1066` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsUpdateDiscussionInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]
  ): `1066` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1066`]
  }
  
  @scala.inline
  implicit class `1066MutableBuilder`[Self <: `1066`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[TeamsUpdateDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
