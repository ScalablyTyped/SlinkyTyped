package typingsSlinky.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchPullRequestParams extends js.Object {
  var assigneeId: js.UndefOr[Double] = js.native
  var comment: js.UndefOr[js.Array[String]] = js.native
  var description: js.UndefOr[String] = js.native
  var issueId: js.UndefOr[Double] = js.native
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
  var summary: js.UndefOr[String] = js.native
}

object PatchPullRequestParams {
  @scala.inline
  def apply(): PatchPullRequestParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchPullRequestParams]
  }
  @scala.inline
  implicit class PatchPullRequestParamsOps[Self <: PatchPullRequestParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withComment(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
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
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

