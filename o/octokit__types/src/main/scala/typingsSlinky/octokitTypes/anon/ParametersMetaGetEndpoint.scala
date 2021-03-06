package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MetaGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MetaGetRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.MetaGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMetaGetEndpoint extends StObject {
  
  var parameters: MetaGetEndpoint = js.native
  
  var request: MetaGetRequestOptions = js.native
  
  var response: OctokitResponse[MetaGetResponseData] = js.native
}
object ParametersMetaGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: MetaGetEndpoint,
    request: MetaGetRequestOptions,
    response: OctokitResponse[MetaGetResponseData]
  ): ParametersMetaGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMetaGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMetaGetEndpointMutableBuilder[Self <: ParametersMetaGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MetaGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MetaGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MetaGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
