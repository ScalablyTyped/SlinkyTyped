package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFAssignmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAssignmentClassInfo extends js.Object {
  var ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo = js.native
  val AssignmentType: MFAssignmentType = js.native
  var TaskAssignmentClassInfo: ITaskAssignmentClassInfo = js.native
  def Clone(): IAssignmentClassInfo = js.native
}

object IAssignmentClassInfo {
  @scala.inline
  def apply(
    ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo,
    AssignmentType: MFAssignmentType,
    Clone: () => IAssignmentClassInfo,
    TaskAssignmentClassInfo: ITaskAssignmentClassInfo
  ): IAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(ApprovalAssignmentClassInfo = ApprovalAssignmentClassInfo.asInstanceOf[js.Any], AssignmentType = AssignmentType.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), TaskAssignmentClassInfo = TaskAssignmentClassInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssignmentClassInfo]
  }
  @scala.inline
  implicit class IAssignmentClassInfoOps[Self <: IAssignmentClassInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalAssignmentClassInfo(value: IApprovalAssignmentClassInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovalAssignmentClassInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignmentType(value: MFAssignmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IAssignmentClassInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTaskAssignmentClassInfo(value: ITaskAssignmentClassInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskAssignmentClassInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

