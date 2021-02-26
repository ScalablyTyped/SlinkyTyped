package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1038` extends StObject {
  
  var parameters: RequestParameters with (Omit[TeamsAddOrUpdateMembershipForUserInOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
  ] = js.native
}
object `1038` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsAddOrUpdateMembershipForUserInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
    ]
  ): `1038` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1038`]
  }
  
  @scala.inline
  implicit class `1038MutableBuilder`[Self <: `1038`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[TeamsAddOrUpdateMembershipForUserInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
