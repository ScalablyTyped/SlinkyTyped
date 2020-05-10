package typingsSlinky.gitlab.mergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMergeRequestOptions extends js.Object {
  var allow_collaboration: js.UndefOr[Boolean] = js.native
  var allow_maintainer_to_push: js.UndefOr[Boolean] = js.native
  var assignee_id: js.UndefOr[Double] = js.native
  var description: js.UndefOr[String] = js.native
  var discussion_locked: js.UndefOr[Boolean] = js.native
  var labels: js.UndefOr[String] = js.native
  var milestone_id: js.UndefOr[Double] = js.native
  var remove_source_branch: js.UndefOr[Boolean] = js.native
  var squash: js.UndefOr[Boolean] = js.native
  var state_event: js.UndefOr[String] = js.native
  var target_branch: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
}

object UpdateMergeRequestOptions {
  @scala.inline
  def apply(): UpdateMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMergeRequestOptions]
  }
  @scala.inline
  implicit class UpdateMergeRequestOptionsOps[Self <: UpdateMergeRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_collaboration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_collaboration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_collaboration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_collaboration")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_maintainer_to_push(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_maintainer_to_push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_maintainer_to_push: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_maintainer_to_push")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignee_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignee_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscussion_locked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discussion_locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscussion_locked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discussion_locked")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMilestone_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilestone_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone_id")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove_source_branch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_source_branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove_source_branch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_source_branch")(js.undefined)
        ret
    }
    @scala.inline
    def withSquash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squash")(js.undefined)
        ret
    }
    @scala.inline
    def withState_event(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state_event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState_event: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state_event")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_branch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_branch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_branch")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

