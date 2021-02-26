package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksListSuitesForRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksListSuitesForRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksListSuitesForRefEndpoint extends StObject {
  
  var parameters: ChecksListSuitesForRefEndpoint = js.native
  
  var response: OctokitResponse[ChecksListSuitesForRefResponseData] with `14` = js.native
}
object ParametersChecksListSuitesForRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksListSuitesForRefEndpoint,
    response: OctokitResponse[ChecksListSuitesForRefResponseData] with `14`
  ): ParametersChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListSuitesForRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksListSuitesForRefEndpointMutableBuilder[Self <: ParametersChecksListSuitesForRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksListSuitesForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListSuitesForRefResponseData] with `14`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
