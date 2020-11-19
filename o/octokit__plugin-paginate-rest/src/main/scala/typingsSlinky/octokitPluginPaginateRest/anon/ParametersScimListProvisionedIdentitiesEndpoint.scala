package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimListProvisionedIdentitiesEndpoint extends js.Object {
  
  var parameters: ScimListProvisionedIdentitiesEndpoint = js.native
  
  var response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] with `12` = js.native
}
object ParametersScimListProvisionedIdentitiesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimListProvisionedIdentitiesEndpoint,
    response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] with `12`
  ): ParametersScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimListProvisionedIdentitiesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimListProvisionedIdentitiesEndpointOps[Self <: ParametersScimListProvisionedIdentitiesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: ScimListProvisionedIdentitiesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimListProvisionedIdentitiesResponseData] with `12`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
