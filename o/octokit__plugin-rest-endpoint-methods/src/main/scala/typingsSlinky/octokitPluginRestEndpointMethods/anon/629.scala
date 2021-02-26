package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsGetBySlugEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetBySlugResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `629` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsGetBySlugEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsGetBySlugResponseData] = js.native
}
object `629` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetBySlugEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetBySlugResponseData]
  ): `629` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`629`]
  }
  
  @scala.inline
  implicit class `629MutableBuilder`[Self <: `629`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[AppsGetBySlugEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetBySlugResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
