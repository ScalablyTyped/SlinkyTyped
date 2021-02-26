package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksListAnnotationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksListAnnotationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksListAnnotationsEndpoint extends StObject {
  
  var parameters: ChecksListAnnotationsEndpoint = js.native
  
  var response: OctokitResponse[ChecksListAnnotationsResponseData] = js.native
}
object ParametersChecksListAnnotationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksListAnnotationsEndpoint,
    response: OctokitResponse[ChecksListAnnotationsResponseData]
  ): ParametersChecksListAnnotationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListAnnotationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksListAnnotationsEndpointMutableBuilder[Self <: ParametersChecksListAnnotationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksListAnnotationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListAnnotationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
