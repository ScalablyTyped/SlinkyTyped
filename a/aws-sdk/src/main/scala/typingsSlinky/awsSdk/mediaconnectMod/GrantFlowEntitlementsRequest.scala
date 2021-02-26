package typingsSlinky.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantFlowEntitlementsRequest extends StObject {
  
  /**
    * The list of entitlements that you want to grant.
    */
  var Entitlements: listOfGrantEntitlementRequest = js.native
  
  /**
    * The flow that you want to grant entitlements on.
    */
  var FlowArn: string = js.native
}
object GrantFlowEntitlementsRequest {
  
  @scala.inline
  def apply(Entitlements: listOfGrantEntitlementRequest, FlowArn: string): GrantFlowEntitlementsRequest = {
    val __obj = js.Dynamic.literal(Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantFlowEntitlementsRequest]
  }
  
  @scala.inline
  implicit class GrantFlowEntitlementsRequestMutableBuilder[Self <: GrantFlowEntitlementsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitlements(value: listOfGrantEntitlementRequest): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementsVarargs(value: GrantEntitlementRequest*): Self = StObject.set(x, "Entitlements", js.Array(value :_*))
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
  }
}
