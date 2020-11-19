package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightRuleContributorDatapoint extends js.Object {
  
  /**
    * The approximate value that this contributor added during this timestamp.
    */
  var ApproximateValue: InsightRuleUnboundDouble = js.native
  
  /**
    * The timestamp of the data point.
    */
  var Timestamp: js.Date = js.native
}
object InsightRuleContributorDatapoint {
  
  @scala.inline
  def apply(ApproximateValue: InsightRuleUnboundDouble, Timestamp: js.Date): InsightRuleContributorDatapoint = {
    val __obj = js.Dynamic.literal(ApproximateValue = ApproximateValue.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleContributorDatapoint]
  }
  
  @scala.inline
  implicit class InsightRuleContributorDatapointOps[Self <: InsightRuleContributorDatapoint] (val x: Self) extends AnyVal {
    
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
    def setApproximateValue(value: InsightRuleUnboundDouble): Self = this.set("ApproximateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
  }
}
