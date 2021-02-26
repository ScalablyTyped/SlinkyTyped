package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponse201Data
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `911` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposCreateOrUpdateFileContentsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[
    ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
  ] = js.native
}
object `911` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateOrUpdateFileContentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
    ]
  ): `911` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`911`]
  }
  
  @scala.inline
  implicit class `911MutableBuilder`[Self <: `911`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposCreateOrUpdateFileContentsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
