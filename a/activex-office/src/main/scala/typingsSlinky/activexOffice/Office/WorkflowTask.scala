package typingsSlinky.activexOffice.Office

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTask extends js.Object {
  val Application: js.Any = js.native
  val AssignedTo: String = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  val DueDate: VarDate = js.native
  val Id: String = js.native
  val ListID: String = js.native
  val Name: String = js.native
  @JSName("Office.WorkflowTask_typekey")
  var OfficeDotWorkflowTask_typekey: WorkflowTask = js.native
  val WorkflowID: String = js.native
  def Show(): Double = js.native
}

object WorkflowTask {
  @scala.inline
  def apply(
    Application: js.Any,
    AssignedTo: String,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Description: String,
    DueDate: VarDate,
    Id: String,
    ListID: String,
    Name: String,
    OfficeDotWorkflowTask_typekey: WorkflowTask,
    Show: () => Double,
    WorkflowID: String
  ): WorkflowTask = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AssignedTo = AssignedTo.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DueDate = DueDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ListID = ListID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show), WorkflowID = WorkflowID.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.WorkflowTask_typekey")(OfficeDotWorkflowTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTask]
  }
  @scala.inline
  implicit class WorkflowTaskOps[Self <: WorkflowTask] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotWorkflowTask_typekey(value: WorkflowTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.WorkflowTask_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWorkflowID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

