package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddThingToBillingGroupRequest extends StObject {
  
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  
  /**
    * The ARN of the thing to be added to the billing group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  
  /**
    * The name of the thing to be added to the billing group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}
object AddThingToBillingGroupRequest {
  
  @scala.inline
  def apply(): AddThingToBillingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddThingToBillingGroupRequest]
  }
  
  @scala.inline
  implicit class AddThingToBillingGroupRequestMutableBuilder[Self <: AddThingToBillingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "billingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupArnUndefined: Self = StObject.set(x, "billingGroupArn", js.undefined)
    
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupNameUndefined: Self = StObject.set(x, "billingGroupName", js.undefined)
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
