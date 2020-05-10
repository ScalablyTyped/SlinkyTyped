package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFAdditionalClassInfoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdditionalClassInfo extends js.Object {
  var AssignmentClassInfo: IAssignmentClassInfo = js.native
  val InfoType: MFAdditionalClassInfoType = js.native
  def Clear(): Unit = js.native
  def Clone(): IAdditionalClassInfo = js.native
}

object IAdditionalClassInfo {
  @scala.inline
  def apply(
    AssignmentClassInfo: IAssignmentClassInfo,
    Clear: () => Unit,
    Clone: () => IAdditionalClassInfo,
    InfoType: MFAdditionalClassInfoType
  ): IAdditionalClassInfo = {
    val __obj = js.Dynamic.literal(AssignmentClassInfo = AssignmentClassInfo.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone), InfoType = InfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdditionalClassInfo]
  }
  @scala.inline
  implicit class IAdditionalClassInfoOps[Self <: IAdditionalClassInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentClassInfo(value: IAssignmentClassInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentClassInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IAdditionalClassInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInfoType(value: MFAdditionalClassInfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

