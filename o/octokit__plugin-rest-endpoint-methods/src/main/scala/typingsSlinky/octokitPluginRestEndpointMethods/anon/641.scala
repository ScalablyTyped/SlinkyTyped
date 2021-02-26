package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `641` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsListPlansEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsListPlansResponseData] = js.native
}
object `641` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListPlansEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListPlansResponseData]
  ): `641` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`641`]
  }
  
  @scala.inline
  implicit class `641MutableBuilder`[Self <: `641`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[AppsListPlansEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListPlansResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
