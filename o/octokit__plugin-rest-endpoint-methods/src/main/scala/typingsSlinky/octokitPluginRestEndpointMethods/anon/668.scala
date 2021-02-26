package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningGetAlertEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningGetAlertResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `668` extends StObject {
  
  var parameters: RequestParameters with (Omit[CodeScanningGetAlertEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[CodeScanningGetAlertResponseData] = js.native
}
object `668` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[CodeScanningGetAlertEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodeScanningGetAlertResponseData]
  ): `668` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`668`]
  }
  
  @scala.inline
  implicit class `668MutableBuilder`[Self <: `668`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[CodeScanningGetAlertEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningGetAlertResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
