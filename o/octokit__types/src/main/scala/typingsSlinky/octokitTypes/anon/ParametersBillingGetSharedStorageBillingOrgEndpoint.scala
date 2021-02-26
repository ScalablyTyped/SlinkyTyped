package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.BillingGetSharedStorageBillingOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.BillingGetSharedStorageBillingOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.BillingGetSharedStorageBillingOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersBillingGetSharedStorageBillingOrgEndpoint extends StObject {
  
  var parameters: BillingGetSharedStorageBillingOrgEndpoint = js.native
  
  var request: BillingGetSharedStorageBillingOrgRequestOptions = js.native
  
  var response: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData] = js.native
}
object ParametersBillingGetSharedStorageBillingOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: BillingGetSharedStorageBillingOrgEndpoint,
    request: BillingGetSharedStorageBillingOrgRequestOptions,
    response: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData]
  ): ParametersBillingGetSharedStorageBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetSharedStorageBillingOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersBillingGetSharedStorageBillingOrgEndpointMutableBuilder[Self <: ParametersBillingGetSharedStorageBillingOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: BillingGetSharedStorageBillingOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: BillingGetSharedStorageBillingOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
