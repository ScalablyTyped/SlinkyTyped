package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerTask extends Entity {
  
  // Number of checklist items with value set to false, representing incomplete items.
  var activeChecklistItemCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The categories to which the task has been applied. See applied Categories for possible values.
  var appliedCategories: js.UndefOr[NullableOption[PlannerAppliedCategories]] = js.native
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
  var assignedToTaskBoardFormat: js.UndefOr[NullableOption[PlannerAssignedToTaskBoardTaskFormat]] = js.native
  
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var assigneePriority: js.UndefOr[NullableOption[String]] = js.native
  
  // The set of assignees the task is assigned to.
  var assignments: js.UndefOr[NullableOption[PlannerAssignments]] = js.native
  
  /**
    * Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long
    * and case-sensitive. Format validation is done on the service.
    */
  var bucketId: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
  var bucketTaskBoardFormat: js.UndefOr[NullableOption[PlannerBucketTaskBoardTaskFormat]] = js.native
  
  // Number of checklist items that are present on the task.
  var checklistItemCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Identity of the user that completed the task.
  var completedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  /**
    * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'
    */
  var completedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
  var conversationThreadId: js.UndefOr[NullableOption[String]] = js.native
  
  // Identity of the user that created the task.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  /**
    * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable. Additional details about the task.
  var details: js.UndefOr[NullableOption[PlannerTaskDetails]] = js.native
  
  /**
    * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var dueDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
  var hasDescription: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Hint used to order items of this type in a list view. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.native
  
  // Percentage of task completion. When set to 100, the task is considered completed.
  var percentComplete: js.UndefOr[NullableOption[Double]] = js.native
  
  // Plan ID to which the task belongs.
  var planId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist,
    * description, reference.
    */
  var previewType: js.UndefOr[NullableOption[PlannerPreviewType]] = js.native
  
  // Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
  var progressTaskBoardFormat: js.UndefOr[NullableOption[PlannerProgressTaskBoardTaskFormat]] = js.native
  
  // Number of external references that exist on the task.
  var referenceCount: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.native
  
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
  implicit class PlannerTaskMutableBuilder[Self <: PlannerTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveChecklistItemCount(value: NullableOption[Double]): Self = StObject.set(x, "activeChecklistItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveChecklistItemCountNull: Self = StObject.set(x, "activeChecklistItemCount", null)
    
    @scala.inline
    def setActiveChecklistItemCountUndefined: Self = StObject.set(x, "activeChecklistItemCount", js.undefined)
    
    @scala.inline
    def setAppliedCategories(value: NullableOption[PlannerAppliedCategories]): Self = StObject.set(x, "appliedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedCategoriesNull: Self = StObject.set(x, "appliedCategories", null)
    
    @scala.inline
    def setAppliedCategoriesUndefined: Self = StObject.set(x, "appliedCategories", js.undefined)
    
    @scala.inline
    def setAssignedToTaskBoardFormat(value: NullableOption[PlannerAssignedToTaskBoardTaskFormat]): Self = StObject.set(x, "assignedToTaskBoardFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedToTaskBoardFormatNull: Self = StObject.set(x, "assignedToTaskBoardFormat", null)
    
    @scala.inline
    def setAssignedToTaskBoardFormatUndefined: Self = StObject.set(x, "assignedToTaskBoardFormat", js.undefined)
    
    @scala.inline
    def setAssigneePriority(value: NullableOption[String]): Self = StObject.set(x, "assigneePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneePriorityNull: Self = StObject.set(x, "assigneePriority", null)
    
    @scala.inline
    def setAssigneePriorityUndefined: Self = StObject.set(x, "assigneePriority", js.undefined)
    
    @scala.inline
    def setAssignments(value: NullableOption[PlannerAssignments]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setBucketId(value: NullableOption[String]): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketIdNull: Self = StObject.set(x, "bucketId", null)
    
    @scala.inline
    def setBucketIdUndefined: Self = StObject.set(x, "bucketId", js.undefined)
    
    @scala.inline
    def setBucketTaskBoardFormat(value: NullableOption[PlannerBucketTaskBoardTaskFormat]): Self = StObject.set(x, "bucketTaskBoardFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketTaskBoardFormatNull: Self = StObject.set(x, "bucketTaskBoardFormat", null)
    
    @scala.inline
    def setBucketTaskBoardFormatUndefined: Self = StObject.set(x, "bucketTaskBoardFormat", js.undefined)
    
    @scala.inline
    def setChecklistItemCount(value: NullableOption[Double]): Self = StObject.set(x, "checklistItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecklistItemCountNull: Self = StObject.set(x, "checklistItemCount", null)
    
    @scala.inline
    def setChecklistItemCountUndefined: Self = StObject.set(x, "checklistItemCount", js.undefined)
    
    @scala.inline
    def setCompletedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "completedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedByNull: Self = StObject.set(x, "completedBy", null)
    
    @scala.inline
    def setCompletedByUndefined: Self = StObject.set(x, "completedBy", js.undefined)
    
    @scala.inline
    def setCompletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    @scala.inline
    def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    @scala.inline
    def setConversationThreadId(value: NullableOption[String]): Self = StObject.set(x, "conversationThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationThreadIdNull: Self = StObject.set(x, "conversationThreadId", null)
    
    @scala.inline
    def setConversationThreadIdUndefined: Self = StObject.set(x, "conversationThreadId", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDetails(value: NullableOption[PlannerTaskDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsNull: Self = StObject.set(x, "details", null)
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDueDateTime(value: NullableOption[String]): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDateTimeNull: Self = StObject.set(x, "dueDateTime", null)
    
    @scala.inline
    def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    @scala.inline
    def setHasDescription(value: NullableOption[Boolean]): Self = StObject.set(x, "hasDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDescriptionNull: Self = StObject.set(x, "hasDescription", null)
    
    @scala.inline
    def setHasDescriptionUndefined: Self = StObject.set(x, "hasDescription", js.undefined)
    
    @scala.inline
    def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    @scala.inline
    def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: NullableOption[Double]): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentCompleteNull: Self = StObject.set(x, "percentComplete", null)
    
    @scala.inline
    def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    @scala.inline
    def setPlanId(value: NullableOption[String]): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdNull: Self = StObject.set(x, "planId", null)
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    @scala.inline
    def setPreviewType(value: NullableOption[PlannerPreviewType]): Self = StObject.set(x, "previewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewTypeNull: Self = StObject.set(x, "previewType", null)
    
    @scala.inline
    def setPreviewTypeUndefined: Self = StObject.set(x, "previewType", js.undefined)
    
    @scala.inline
    def setProgressTaskBoardFormat(value: NullableOption[PlannerProgressTaskBoardTaskFormat]): Self = StObject.set(x, "progressTaskBoardFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressTaskBoardFormatNull: Self = StObject.set(x, "progressTaskBoardFormat", null)
    
    @scala.inline
    def setProgressTaskBoardFormatUndefined: Self = StObject.set(x, "progressTaskBoardFormat", js.undefined)
    
    @scala.inline
    def setReferenceCount(value: NullableOption[Double]): Self = StObject.set(x, "referenceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceCountNull: Self = StObject.set(x, "referenceCount", null)
    
    @scala.inline
    def setReferenceCountUndefined: Self = StObject.set(x, "referenceCount", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
