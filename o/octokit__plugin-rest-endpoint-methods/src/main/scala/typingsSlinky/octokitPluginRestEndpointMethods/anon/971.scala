package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `971` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetTeamsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData] = js.native
}
object `971` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetTeamsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
  ): `971` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`971`]
  }
  
  @scala.inline
  implicit class `971MutableBuilder`[Self <: `971`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetTeamsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
