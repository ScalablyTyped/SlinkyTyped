package typingsSlinky.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostPullRequestParams extends js.Object {
  var assigneeId: js.UndefOr[Double] = js.native
  var attachmentId: js.UndefOr[js.Array[Double]] = js.native
  var base: String = js.native
  var branch: String = js.native
  var description: String = js.native
  var issueId: js.UndefOr[Double] = js.native
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
  var summary: String = js.native
}

object PostPullRequestParams {
  @scala.inline
  def apply(base: String, branch: String, description: String, summary: String): PostPullRequestParams = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPullRequestParams]
  }
  @scala.inline
  implicit class PostPullRequestParamsOps[Self <: PostPullRequestParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssigneeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigneeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssigneeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigneeId")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueId")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifiedUserId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifiedUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifiedUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifiedUserId")(js.undefined)
        ret
    }
  }
  
}

