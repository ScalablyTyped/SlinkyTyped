package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `673` extends StObject {
  
  var parameters: RequestParameters with (Omit[CodesOfConductGetAllCodesOfConductEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData] = js.native
}
object `673` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[CodesOfConductGetAllCodesOfConductEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]
  ): `673` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`673`]
  }
  
  @scala.inline
  implicit class `673MutableBuilder`[Self <: `673`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[CodesOfConductGetAllCodesOfConductEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
