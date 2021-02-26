package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `970` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetStatusChecksProtectionEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetStatusChecksProtectionResponseData] = js.native
}
object `970` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetStatusChecksProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetStatusChecksProtectionResponseData]
  ): `970` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`970`]
  }
  
  @scala.inline
  implicit class `970MutableBuilder`[Self <: `970`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetStatusChecksProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetStatusChecksProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
