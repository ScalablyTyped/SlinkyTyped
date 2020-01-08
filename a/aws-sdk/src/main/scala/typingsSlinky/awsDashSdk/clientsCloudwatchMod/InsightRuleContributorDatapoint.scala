package typingsSlinky.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

