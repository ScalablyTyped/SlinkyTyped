package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Milestone extends js.Object {
  var assignee: Type = js.native
  var assignees: Type = js.native
  var body: Type = js.native
  var issue_number: Required = js.native
  var labels: Type = js.native
  var milestone: AllowNull = js.native
  var number: Alias = js.native
  var owner: Required = js.native
  var repo: Required = js.native
  var state: Enum = js.native
  var title: Type = js.native
}

object Milestone {
  @scala.inline
  def apply(
    assignee: Type,
    assignees: Type,
    body: Type,
    issue_number: Required,
    labels: Type,
    milestone: AllowNull,
    number: Alias,
    owner: Required,
    repo: Required,
    state: Enum,
    title: Type
  ): Milestone = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milestone]
  }
  @scala.inline
  implicit class MilestoneOps[Self <: Milestone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignee(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignees(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue_number(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestone(value: AllowNull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

