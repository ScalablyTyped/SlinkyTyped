package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMatchmakingRuleSetsOutput extends js.Object {
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A collection of requested matchmaking rule set objects. 
    */
  var RuleSets: MatchmakingRuleSetList = js.native
}

object DescribeMatchmakingRuleSetsOutput {
  @scala.inline
  def apply(RuleSets: MatchmakingRuleSetList): DescribeMatchmakingRuleSetsOutput = {
    val __obj = js.Dynamic.literal(RuleSets = RuleSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingRuleSetsOutput]
  }
  @scala.inline
  implicit class DescribeMatchmakingRuleSetsOutputOps[Self <: DescribeMatchmakingRuleSetsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleSets(value: MatchmakingRuleSetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NonZeroAndMaxString): Self = {
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

