package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `805` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsListOutsideCollaboratorsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData] = js.native
}
object `805` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsListOutsideCollaboratorsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]
  ): `805` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`805`]
  }
  
  @scala.inline
  implicit class `805MutableBuilder`[Self <: `805`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[OrgsListOutsideCollaboratorsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
