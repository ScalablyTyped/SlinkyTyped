package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchmakingRuleSet extends js.Object {
  /**
    * The time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift matchmaking rule set resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift rule set ARN, the resource ID matches the RuleSetName value.
    */
  var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.native
  /**
    * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most elements support a description field.
    */
  var RuleSetBody: typingsSlinky.awsSdk.gameliftMod.RuleSetBody = js.native
  /**
    * A unique identifier for a matchmaking rule set
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object MatchmakingRuleSet {
  @scala.inline
  def apply(RuleSetBody: RuleSetBody): MatchmakingRuleSet = {
    val __obj = js.Dynamic.literal(RuleSetBody = RuleSetBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchmakingRuleSet]
  }
  @scala.inline
  implicit class MatchmakingRuleSetOps[Self <: MatchmakingRuleSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleSetBody(value: RuleSetBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleSetArn(value: MatchmakingRuleSetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleSetName(value: MatchmakingIdStringModel): Self = {
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

