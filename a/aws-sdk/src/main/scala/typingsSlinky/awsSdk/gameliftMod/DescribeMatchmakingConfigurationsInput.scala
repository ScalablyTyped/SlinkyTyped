package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMatchmakingConfigurationsInput extends js.Object {
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is limited to 10.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * A unique identifier for a matchmaking configuration(s) to retrieve. You can use either the configuration name or ARN value. To request all existing configurations, leave this parameter empty.
    */
  var Names: js.UndefOr[MatchmakingConfigurationNameList] = js.native
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a matchmaking rule set. You can use either the rule set name or ARN value. Use this parameter to retrieve all matchmaking configurations that use this rule set.
    */
  var RuleSetName: js.UndefOr[MatchmakingRuleSetName] = js.native
}

object DescribeMatchmakingConfigurationsInput {
  @scala.inline
  def apply(): DescribeMatchmakingConfigurationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsInput]
  }
  @scala.inline
  implicit class DescribeMatchmakingConfigurationsInputOps[Self <: DescribeMatchmakingConfigurationsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: PositiveInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: MatchmakingConfigurationNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(js.undefined)
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
    @scala.inline
    def withRuleSetName(value: MatchmakingRuleSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetName")(js.undefined)
        ret
    }
  }
  
}

