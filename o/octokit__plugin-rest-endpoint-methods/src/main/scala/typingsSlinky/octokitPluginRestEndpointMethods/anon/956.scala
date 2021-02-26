package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeployKeyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeployKeyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `956` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetDeployKeyEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetDeployKeyResponseData] = js.native
}
object `956` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetDeployKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetDeployKeyResponseData]
  ): `956` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`956`]
  }
  
  @scala.inline
  implicit class `956MutableBuilder`[Self <: `956`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetDeployKeyEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeployKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
