package typingsSlinky.activexOffice.Office

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceTask extends js.Object {
  val Application: js.Any = js.native
  var AssignedTo: String = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  var Description: String = js.native
  var DueDate: VarDate = js.native
  val ModifiedBy: String = js.native
  val ModifiedDate: VarDate = js.native
  @JSName("Office.SharedWorkspaceTask_typekey")
  var OfficeDotSharedWorkspaceTask_typekey: SharedWorkspaceTask = js.native
  val Parent: js.Any = js.native
  var Priority: MsoSharedWorkspaceTaskPriority = js.native
  var Status: MsoSharedWorkspaceTaskStatus = js.native
  var Title: String = js.native
  def Delete(): Unit = js.native
  def Save(): Unit = js.native
}

object SharedWorkspaceTask {
  @scala.inline
  def apply(
    Application: js.Any,
    AssignedTo: String,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Delete: () => Unit,
    Description: String,
    DueDate: VarDate,
    ModifiedBy: String,
    ModifiedDate: VarDate,
    OfficeDotSharedWorkspaceTask_typekey: SharedWorkspaceTask,
    Parent: js.Any,
    Priority: MsoSharedWorkspaceTaskPriority,
    Save: () => Unit,
    Status: MsoSharedWorkspaceTaskStatus,
    Title: String
  ): SharedWorkspaceTask = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AssignedTo = AssignedTo.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Description = Description.asInstanceOf[js.Any], DueDate = DueDate.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), Status = Status.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceTask_typekey")(OfficeDotSharedWorkspaceTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceTask]
  }
  @scala.inline
  implicit class SharedWorkspaceTaskOps[Self <: SharedWorkspaceTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignedTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDueDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotSharedWorkspaceTask_typekey(value: SharedWorkspaceTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.SharedWorkspaceTask_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: MsoSharedWorkspaceTaskPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: MsoSharedWorkspaceTaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

