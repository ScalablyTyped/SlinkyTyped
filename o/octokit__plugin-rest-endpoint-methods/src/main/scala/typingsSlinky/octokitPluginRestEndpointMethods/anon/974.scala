package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `974` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetUsersWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData] = js.native
}
object `974` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetUsersWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]
  ): `974` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`974`]
  }
  
  @scala.inline
  implicit class `974MutableBuilder`[Self <: `974`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetUsersWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
