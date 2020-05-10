package typingsSlinky.backlogJs.mod.Option.Issue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchIssueParams
  extends /* customField_ */ StringDictionary[js.Any] {
  var actualHours: js.UndefOr[Double] = js.native
  var assigneeId: js.UndefOr[Double] = js.native
  var attachmentId: js.UndefOr[js.Array[Double]] = js.native
  var categoryId: js.UndefOr[js.Array[Double]] = js.native
  var comment: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var dueDate: js.UndefOr[String] = js.native
  var estimatedHours: js.UndefOr[Double] = js.native
  var issueTypeId: js.UndefOr[Double] = js.native
  var milestoneId: js.UndefOr[js.Array[Double]] = js.native
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
  var parentIssueId: js.UndefOr[Double] = js.native
  var priorityId: js.UndefOr[Double] = js.native
  var resolutionId: js.UndefOr[Double] = js.native
  var startDate: js.UndefOr[String] = js.native
  var statusId: js.UndefOr[Double] = js.native
  var summary: js.UndefOr[String] = js.native
  var versionId: js.UndefOr[js.Array[Double]] = js.native
}

object PatchIssueParams {
  @scala.inline
  def apply(): PatchIssueParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchIssueParams]
  }
  @scala.inline
  implicit class PatchIssueParamsOps[Self <: PatchIssueParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualHours")(js.undefined)
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
    def withCategoryId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
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
    def withDueDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedHours")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueTypeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withMilestoneId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilestoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneId")(js.undefined)
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
    def withParentIssueId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIssueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIssueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIssueId")(js.undefined)
        ret
    }
    @scala.inline
    def withPriorityId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriorityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityId")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusId(value: Double): Self = {
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
    @scala.inline
    def withVersionId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
  }
  
}

