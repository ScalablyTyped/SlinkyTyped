package typingsSlinky.backlogJs.mod.Option.Issue

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.backlogJs.mod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIssuesParams
  extends /* customField_ */ StringDictionary[js.Any] {
  var assigneeId: js.UndefOr[js.Array[Double]] = js.native
  var attachment: js.UndefOr[Boolean] = js.native
  var categoryId: js.UndefOr[js.Array[Double]] = js.native
  var count: js.UndefOr[Double] = js.native
  var createdSince: js.UndefOr[String] = js.native
  var createdUntil: js.UndefOr[String] = js.native
  var createdUserId: js.UndefOr[js.Array[Double]] = js.native
  var dueDateSince: js.UndefOr[String] = js.native
  var dueDateUntil: js.UndefOr[String] = js.native
  var id: js.UndefOr[js.Array[Double]] = js.native
  var issueTypeId: js.UndefOr[js.Array[Double]] = js.native
  var keyword: String = js.native
  var milestoneId: js.UndefOr[js.Array[Double]] = js.native
  var offset: js.UndefOr[Double] = js.native
  var order: js.UndefOr[Order] = js.native
  var parentChild: js.UndefOr[ParentChildType] = js.native
  var parentIssueId: js.UndefOr[js.Array[Double]] = js.native
  var priorityId: js.UndefOr[js.Array[Double]] = js.native
  var projectId: js.UndefOr[js.Array[Double]] = js.native
  var resolutionId: js.UndefOr[js.Array[Double]] = js.native
  var sharedFile: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[SortKey] = js.native
  var startDateSince: js.UndefOr[String] = js.native
  var startDateUntil: js.UndefOr[String] = js.native
  var statusId: js.UndefOr[js.Array[Double]] = js.native
  var updatedSince: js.UndefOr[String] = js.native
  var updatedUntil: js.UndefOr[String] = js.native
  var versionId: js.UndefOr[js.Array[Double]] = js.native
}

object GetIssuesParams {
  @scala.inline
  def apply(keyword: String): GetIssuesParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIssuesParams]
  }
  @scala.inline
  implicit class GetIssuesParamsOps[Self <: GetIssuesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAttachment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(js.undefined)
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
    def withCreatedSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdSince")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdUntil")(js.undefined)
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
    def withDueDateSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDateSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueDateSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDateSince")(js.undefined)
        ret
    }
    @scala.inline
    def withDueDateUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDateUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueDateUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDateUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueTypeId(value: js.Array[Double]): Self = {
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
    def withOrder(value: Order): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withParentChild(value: ParentChildType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentChild")(js.undefined)
        ret
    }
    @scala.inline
    def withParentIssueId(value: js.Array[Double]): Self = {
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
    def withPriorityId(value: js.Array[Double]): Self = {
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
    def withProjectId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionId(value: js.Array[Double]): Self = {
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
    def withSharedFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: SortKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateSince")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateUntil")(js.undefined)
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
    @scala.inline
    def withUpdatedSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedUntil")(js.undefined)
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

