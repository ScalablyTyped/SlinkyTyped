package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMatchmakingRuleSetInput extends js.Object {
  /**
    * A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it uses by this name value. Note that the rule set name is different from the optional name field in the rule set body.
    */
  var Name: MatchmakingIdStringModel = js.native
  /**
    * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most elements support a description field.
    */
  var RuleSetBody: typingsSlinky.awsSdk.gameliftMod.RuleSetBody = js.native
  /**
    * A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateMatchmakingRuleSetInput {
  @scala.inline
  def apply(Name: MatchmakingIdStringModel, RuleSetBody: RuleSetBody): CreateMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleSetBody = RuleSetBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMatchmakingRuleSetInput]
  }
  @scala.inline
  implicit class CreateMatchmakingRuleSetInputOps[Self <: CreateMatchmakingRuleSetInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: MatchmakingIdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleSetBody(value: RuleSetBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSetBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

