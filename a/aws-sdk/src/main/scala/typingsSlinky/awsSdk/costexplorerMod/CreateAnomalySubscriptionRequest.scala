package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnomalySubscriptionRequest extends js.Object {
  
  /**
    *  The cost anomaly subscription object that you want to create. 
    */
  var AnomalySubscription: typingsSlinky.awsSdk.costexplorerMod.AnomalySubscription = js.native
}
object CreateAnomalySubscriptionRequest {
  
  @scala.inline
  def apply(AnomalySubscription: AnomalySubscription): CreateAnomalySubscriptionRequest = {
    val __obj = js.Dynamic.literal(AnomalySubscription = AnomalySubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalySubscriptionRequest]
  }
  
  @scala.inline
  implicit class CreateAnomalySubscriptionRequestOps[Self <: CreateAnomalySubscriptionRequest] (val x: Self) extends AnyVal {
    
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
    def setAnomalySubscription(value: AnomalySubscription): Self = this.set("AnomalySubscription", value.asInstanceOf[js.Any])
  }
}
