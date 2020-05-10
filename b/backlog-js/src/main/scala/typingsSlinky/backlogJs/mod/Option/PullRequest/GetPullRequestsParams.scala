package typingsSlinky.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestsParams extends js.Object {
  var assigneeId: js.UndefOr[js.Array[Double]] = js.native
  var count: js.UndefOr[Double] = js.native
  var createdUserId: js.UndefOr[js.Array[Double]] = js.native
  var issueId: js.UndefOr[js.Array[Double]] = js.native
  var offset: js.UndefOr[Double] = js.native
  var statusId: js.UndefOr[js.Array[Double]] = js.native
}

object GetPullRequestsParams {
  @scala.inline
  def apply(): GetPullRequestsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestsParams]
  }
  @scala.inline
  implicit class GetPullRequestsParamsOps[Self <: GetPullRequestsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssigneeId(value: js.Array[Double]): Self = {
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
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedUserId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueId(value: js.Array[Double]): Self = {
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
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusId")(js.undefined)
        ret
    }
  }
  
}

