package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkflowAssignment extends js.Object {
  var AssignedTo_DEPRECATED: IPropertyValue = js.native
  var CompletedBy_DEPRECATED: IPropertyValue = js.native
  var Deadline_DEPRECATED: IPropertyValue = js.native
  var Description_DEPRECATED: IPropertyValue = js.native
  var MonitoredBy_DEPRECATED: IPropertyValue = js.native
  def Clone_DEPRECATED(): IWorkflowAssignment = js.native
}

object IWorkflowAssignment {
  @scala.inline
  def apply(
    AssignedTo_DEPRECATED: IPropertyValue,
    Clone_DEPRECATED: () => IWorkflowAssignment,
    CompletedBy_DEPRECATED: IPropertyValue,
    Deadline_DEPRECATED: IPropertyValue,
    Description_DEPRECATED: IPropertyValue,
    MonitoredBy_DEPRECATED: IPropertyValue
  ): IWorkflowAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo_DEPRECATED = AssignedTo_DEPRECATED.asInstanceOf[js.Any], Clone_DEPRECATED = js.Any.fromFunction0(Clone_DEPRECATED), CompletedBy_DEPRECATED = CompletedBy_DEPRECATED.asInstanceOf[js.Any], Deadline_DEPRECATED = Deadline_DEPRECATED.asInstanceOf[js.Any], Description_DEPRECATED = Description_DEPRECATED.asInstanceOf[js.Any], MonitoredBy_DEPRECATED = MonitoredBy_DEPRECATED.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflowAssignment]
  }
  @scala.inline
  implicit class IWorkflowAssignmentOps[Self <: IWorkflowAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedTo_DEPRECATED(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignedTo_DEPRECATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone_DEPRECATED(value: () => IWorkflowAssignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone_DEPRECATED")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompletedBy_DEPRECATED(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedBy_DEPRECATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadline_DEPRECATED(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deadline_DEPRECATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription_DEPRECATED(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description_DEPRECATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoredBy_DEPRECATED(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoredBy_DEPRECATED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

