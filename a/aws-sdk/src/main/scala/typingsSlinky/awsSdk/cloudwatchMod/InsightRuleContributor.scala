package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightRuleContributor extends js.Object {
  /**
    * An approximation of the aggregate value that comes from this contributor.
    */
  var ApproximateAggregateValue: InsightRuleUnboundDouble = js.native
  /**
    * An array of the data points where this contributor is present. Only the data points when this contributor appeared are included in the array.
    */
  var Datapoints: InsightRuleContributorDatapoints = js.native
  /**
    * One of the log entry field keywords that is used to define contributors for this rule.
    */
  var Keys: InsightRuleContributorKeys = js.native
}

object InsightRuleContributor {
  @scala.inline
  def apply(
    ApproximateAggregateValue: InsightRuleUnboundDouble,
    Datapoints: InsightRuleContributorDatapoints,
    Keys: InsightRuleContributorKeys
  ): InsightRuleContributor = {
    val __obj = js.Dynamic.literal(ApproximateAggregateValue = ApproximateAggregateValue.asInstanceOf[js.Any], Datapoints = Datapoints.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleContributor]
  }
  @scala.inline
  implicit class InsightRuleContributorOps[Self <: InsightRuleContributor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateAggregateValue(value: InsightRuleUnboundDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApproximateAggregateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatapoints(value: InsightRuleContributorDatapoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datapoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: InsightRuleContributorKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

