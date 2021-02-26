package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `780` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsStartForOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsStartForOrgResponseData] = js.native
}
object `780` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsStartForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsStartForOrgResponseData]
  ): `780` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`780`]
  }
  
  @scala.inline
  implicit class `780MutableBuilder`[Self <: `780`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[MigrationsStartForOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
