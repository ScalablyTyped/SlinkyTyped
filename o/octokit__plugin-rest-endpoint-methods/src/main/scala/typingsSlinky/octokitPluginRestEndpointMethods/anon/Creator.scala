package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Creator extends js.Object {
  var assignee: Type = js.native
  var creator: Type = js.native
  var direction: Enum = js.native
  var labels: Type = js.native
  var mentioned: Type = js.native
  var milestone: Type = js.native
  var owner: Required = js.native
  var page: Type = js.native
  var per_page: Type = js.native
  var repo: Required = js.native
  var since: Type = js.native
  var sort: Enum = js.native
  var state: Enum = js.native
}

object Creator {
  @scala.inline
  def apply(
    assignee: Type,
    creator: Type,
    direction: Enum,
    labels: Type,
    mentioned: Type,
    milestone: Type,
    owner: Required,
    page: Type,
    per_page: Type,
    repo: Required,
    since: Type,
    sort: Enum,
    state: Enum
  ): Creator = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], mentioned = mentioned.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Creator]
  }
  @scala.inline
  implicit class CreatorOps[Self <: Creator] (val x: Self) extends AnyVal {
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
    def withCreator(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMentioned(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentioned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestone(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSince(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

