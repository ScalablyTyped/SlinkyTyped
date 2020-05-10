package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMilestone extends js.Object {
  var assignee: AnonType = js.native
  var assignees: AnonType = js.native
  var body: AnonType = js.native
  var issue_number: AnonRequired = js.native
  var labels: AnonType = js.native
  var milestone: AnonAllowNull = js.native
  var number: AnonAlias = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var state: AnonEnum = js.native
  var title: AnonType = js.native
}

object AnonMilestone {
  @scala.inline
  def apply(
    assignee: AnonType,
    assignees: AnonType,
    body: AnonType,
    issue_number: AnonRequired,
    labels: AnonType,
    milestone: AnonAllowNull,
    number: AnonAlias,
    owner: AnonRequired,
    repo: AnonRequired,
    state: AnonEnum,
    title: AnonType
  ): AnonMilestone = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMilestone]
  }
  @scala.inline
  implicit class AnonMilestoneOps[Self <: AnonMilestone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignee(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignees(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue_number(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestone(value: AnonAllowNull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: AnonAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

