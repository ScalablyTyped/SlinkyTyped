package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `939` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetAdminBranchProtectionResponseData] = js.native
}
object `939` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
  ): `939` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`939`]
  }
  
  @scala.inline
  implicit class `939MutableBuilder`[Self <: `939`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAdminBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
