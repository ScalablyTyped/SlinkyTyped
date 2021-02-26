package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `902` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposCreateCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData] = js.native
}
object `902` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
  ): `902` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`902`]
  }
  
  @scala.inline
  implicit class `902MutableBuilder`[Self <: `902`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposCreateCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
