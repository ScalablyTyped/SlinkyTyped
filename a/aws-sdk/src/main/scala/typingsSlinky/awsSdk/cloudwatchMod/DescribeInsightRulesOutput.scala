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
  def apply(): DescribeInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInsightRulesOutput]
  }
  @scala.inline
  implicit class DescribeInsightRulesOutputOps[Self <: DescribeInsightRulesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsightRules(value: InsightRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsightRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsightRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsightRules")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

