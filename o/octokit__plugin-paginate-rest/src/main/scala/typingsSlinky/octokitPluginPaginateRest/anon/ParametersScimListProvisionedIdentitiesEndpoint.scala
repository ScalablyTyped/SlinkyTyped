package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimListProvisionedIdentitiesEndpoint extends StObject {
  
  var parameters: ScimListProvisionedIdentitiesEndpoint = js.native
  
  var response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] with `16` = js.native
}
object ParametersScimListProvisionedIdentitiesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimListProvisionedIdentitiesEndpoint,
    response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] with `16`
  ): ParametersScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimListProvisionedIdentitiesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimListProvisionedIdentitiesEndpointMutableBuilder[Self <: ParametersScimListProvisionedIdentitiesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimListProvisionedIdentitiesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimListProvisionedIdentitiesResponseData] with `16`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
