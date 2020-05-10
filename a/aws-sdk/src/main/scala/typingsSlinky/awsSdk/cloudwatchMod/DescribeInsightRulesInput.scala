package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInsightRulesInput extends js.Object {
  /**
    * This parameter is not currently used. Reserved for future use. If it is used in the future, the maximum value may be different.
    */
  var MaxResults: js.UndefOr[InsightRuleMaxResults] = js.native
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeInsightRulesInput {
  @scala.inline
  def apply(): DescribeInsightRulesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInsightRulesInput]
  }
  @scala.inline
  implicit class DescribeInsightRulesInputOps[Self <: DescribeInsightRulesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: InsightRuleMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

