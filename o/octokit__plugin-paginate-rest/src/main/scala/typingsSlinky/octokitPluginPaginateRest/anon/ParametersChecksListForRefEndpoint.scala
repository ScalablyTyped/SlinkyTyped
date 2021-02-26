package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksListForRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksListForRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksListForRefEndpoint extends StObject {
  
  var parameters: ChecksListForRefEndpoint = js.native
  
  var response: OctokitResponse[ChecksListForRefResponseData] with `13` = js.native
}
object ParametersChecksListForRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksListForRefEndpoint,
    response: OctokitResponse[ChecksListForRefResponseData] with `13`
  ): ParametersChecksListForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksListForRefEndpointMutableBuilder[Self <: ParametersChecksListForRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksListForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListForRefResponseData] with `13`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
