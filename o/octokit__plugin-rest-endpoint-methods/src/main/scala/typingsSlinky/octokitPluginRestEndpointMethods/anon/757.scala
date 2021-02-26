package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.LicensesGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.LicensesGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `757` extends StObject {
  
  var parameters: RequestParameters with (Omit[LicensesGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[LicensesGetResponseData] = js.native
}
object `757` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[LicensesGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[LicensesGetResponseData]
  ): `757` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`757`]
  }
  
  @scala.inline
  implicit class `757MutableBuilder`[Self <: `757`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[LicensesGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[LicensesGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
