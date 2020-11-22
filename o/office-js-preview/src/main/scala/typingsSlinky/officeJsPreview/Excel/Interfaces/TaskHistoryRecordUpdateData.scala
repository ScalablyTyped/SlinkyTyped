package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.TaskHistoryRecordType
import typingsSlinky.officeJsPreview.Excel.User
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Assign
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Create
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Delete
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Priority
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Progress
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Schedule
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SetTitle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unassign
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.UnassignAll
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Undelete
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Undo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TaskHistoryRecord object, for use in `taskHistoryRecord.set({ ... })`. */
@js.native
trait TaskHistoryRecordUpdateData extends js.Object {
  
  /**
    *
    * Represents the ID of the object to which the task is anchored (e.g., commentId for tasks attached to comments).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var anchorId: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the user assigned to the task for an "Assign" history record type, or the user to unassign from the task for an "Unassign" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var assignee: js.UndefOr[User] = js.native
  
  /**
    *
    * Represents the user who created or changed the task.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var attributionUser: js.UndefOr[User] = js.native
  
  /**
    *
    * Represents the task's due date. It is used for "Schedule" history record type.
    It is in UTC time zone. Can be set to `null` to remove the due date. It should be set together with `startDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDate: js.UndefOr[js.Date] = js.native
  
  /**
    *
    * Represents creation date of the task history record. All dates are in UTC.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var historyRecordCreatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    *
    * ID for the history record.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the task's completion percentage. It is used for the "Progress" history record type.
    This is a value between 0 and 100, where 100 represents a completed task. Changing this value to 100 also completes the associated comment. Changing the completion from 100 to a lower value reactivates the associated comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the task's priority. It is used for the "Priority" history record type.
    This is a value between 0 and 10 with 5 being the default priority if not set, where 0 represents the highest priority.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the task's start date. It is used for the "Schedule" history record type.
    It is in UTC time zone. Can be set to `null` to remove the start date. It should be set together with `dueDate` to avoid conflicts.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDate: js.UndefOr[js.Date] = js.native
  
  /**
    *
    * Represents the task's title. It is used for "Title" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents task history record's type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[
    TaskHistoryRecordType | Unknown_ | Create | Assign | Unassign | UnassignAll | Schedule | Progress | Priority | Delete | Undelete | SetTitle | Undo
  ] = js.native
  
  /**
    *
    * Represents the TaskHistoryRecord.id property that was undone for the "Undo" history record type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var undoHistoryId: js.UndefOr[String] = js.native
}
object TaskHistoryRecordUpdateData {
  
  @scala.inline
  def apply(): TaskHistoryRecordUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskHistoryRecordUpdateData]
  }
  
  @scala.inline
  implicit class TaskHistoryRecordUpdateDataOps[Self <: TaskHistoryRecordUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchorId(value: String): Self = this.set("anchorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorId: Self = this.set("anchorId", js.undefined)
    
    @scala.inline
    def setAssignee(value: User): Self = this.set("assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignee: Self = this.set("assignee", js.undefined)
    
    @scala.inline
    def setAttributionUser(value: User): Self = this.set("attributionUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributionUser: Self = this.set("attributionUser", js.undefined)
    
    @scala.inline
    def setDueDate(value: js.Date): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueDate: Self = this.set("dueDate", js.undefined)
    
    @scala.inline
    def setHistoryRecordCreatedDate(value: js.Date): Self = this.set("historyRecordCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryRecordCreatedDate: Self = this.set("historyRecordCreatedDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(
      value: TaskHistoryRecordType | Unknown_ | Create | Assign | Unassign | UnassignAll | Schedule | Progress | Priority | Delete | Undelete | SetTitle | Undo
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUndoHistoryId(value: String): Self = this.set("undoHistoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndoHistoryId: Self = this.set("undoHistoryId", js.undefined)
  }
}
