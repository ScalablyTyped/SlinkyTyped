package typingsSlinky.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightRuleContributorDatapoint extends StObject {
  
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
  implicit class InsightRuleContributorDatapointMutableBuilder[Self <: InsightRuleContributorDatapoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproximateValue(value: InsightRuleUnboundDouble): Self = StObject.set(x, "ApproximateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
