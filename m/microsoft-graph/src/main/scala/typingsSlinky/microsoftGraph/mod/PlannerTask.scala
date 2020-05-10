package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerTask extends Entity {
  // Number of checklist items with value set to false, representing incomplete items.
  var activeChecklistItemCount: js.UndefOr[Double] = js.native
  // The categories to which the task has been applied. See applied Categories for possible values.
  var appliedCategories: js.UndefOr[PlannerAppliedCategories] = js.native
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
  var assignedToTaskBoardFormat: js.UndefOr[PlannerAssignedToTaskBoardTaskFormat] = js.native
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var assigneePriority: js.UndefOr[String] = js.native
  // The set of assignees the task is assigned to.
  var assignments: js.UndefOr[PlannerAssignments] = js.native
  /**
    * Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long
    * and case-sensitive. Format validation is done on the service.
    */
  var bucketId: js.UndefOr[String] = js.native
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
  var bucketTaskBoardFormat: js.UndefOr[PlannerBucketTaskBoardTaskFormat] = js.native
  // Number of checklist items that are present on the task.
  var checklistItemCount: js.UndefOr[Double] = js.native
  // Identity of the user that completed the task.
  var completedBy: js.UndefOr[IdentitySet] = js.native
  /**
    * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'
    */
  var completedDateTime: js.UndefOr[String] = js.native
  // Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
  var conversationThreadId: js.UndefOr[String] = js.native
  // Identity of the user that created the task.
  var createdBy: js.UndefOr[IdentitySet] = js.native
  /**
    * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[String] = js.native
  // Read-only. Nullable. Additional details about the task.
  var details: js.UndefOr[PlannerTaskDetails] = js.native
  /**
    * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var dueDateTime: js.UndefOr[String] = js.native
  // Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
  var hasDescription: js.UndefOr[Boolean] = js.native
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.native
  // Percentage of task completion. When set to 100, the task is considered completed.
  var percentComplete: js.UndefOr[Double] = js.native
  // Plan ID to which the task belongs.
  var planId: js.UndefOr[String] = js.native
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist,
    * description, reference.
    */
  var previewType: js.UndefOr[PlannerPreviewType] = js.native
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
  var progressTaskBoardFormat: js.UndefOr[PlannerProgressTaskBoardTaskFormat] = js.native
  // Number of external references that exist on the task.
  var referenceCount: js.UndefOr[Double] = js.native
  /**
    * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[String] = js.native
  // Title of the task.
  var title: js.UndefOr[String] = js.native
}

object PlannerTask {
  @scala.inline
  def apply(): PlannerTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerTask]
  }
  @scala.inline
  implicit class PlannerTaskOps[Self <: PlannerTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveChecklistItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeChecklistItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveChecklistItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeChecklistItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedCategories(value: PlannerAppliedCategories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignedToTaskBoardFormat(value: PlannerAssignedToTaskBoardTaskFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedToTaskBoardFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedToTaskBoardFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedToTaskBoardFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAssigneePriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigneePriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssigneePriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigneePriority")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignments(value: PlannerAssignments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketId")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketTaskBoardFormat(value: PlannerBucketTaskBoardTaskFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketTaskBoardFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketTaskBoardFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketTaskBoardFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withChecklistItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checklistItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecklistItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checklistItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedBy(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withConversationThreadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationThreadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversationThreadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationThreadId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: PlannerTaskDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withDueDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewType(value: PlannerPreviewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewType")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressTaskBoardFormat(value: PlannerProgressTaskBoardTaskFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTaskBoardFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressTaskBoardFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTaskBoardFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(js.undefined)
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

