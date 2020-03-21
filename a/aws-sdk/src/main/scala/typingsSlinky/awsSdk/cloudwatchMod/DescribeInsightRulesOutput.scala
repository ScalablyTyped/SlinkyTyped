package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInsightRulesOutput extends js.Object {
  /**
    * The rules returned by the operation.
    */
  var InsightRules: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.InsightRules] = js.native
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeInsightRulesOutput {
  @scala.inline
  def apply(InsightRules: InsightRules = null, NextToken: NextToken = null): DescribeInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    if (InsightRules != null) __obj.updateDynamic("InsightRules")(InsightRules.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInsightRulesOutput]
  }
}

