package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserOrUserGroupIDEx extends js.Object {
  val IndirectProperty: IIndirectPropertyID = js.native
  val UserOrGroupID: Double = js.native
  val UserOrGroupType: MFUserOrUserGroupType = js.native
  val WorkflowState: Double = js.native
  def Clone(): IUserOrUserGroupIDEx = js.native
  def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit = js.native
  def SetUserAccount(UserAccount: Double): Unit = js.native
  def SetUserGroup(UserGroup: Double): Unit = js.native
  def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit = js.native
}

object IUserOrUserGroupIDEx {
  @scala.inline
  def apply(
    Clone: () => IUserOrUserGroupIDEx,
    IndirectProperty: IIndirectPropertyID,
    SetIndirectPropertyPseudoUser: IIndirectPropertyID => Unit,
    SetUserAccount: Double => Unit,
    SetUserGroup: Double => Unit,
    SetWorkflowStatePseudoUser: Double => Unit,
    UserOrGroupID: Double,
    UserOrGroupType: MFUserOrUserGroupType,
    WorkflowState: Double
  ): IUserOrUserGroupIDEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IndirectProperty = IndirectProperty.asInstanceOf[js.Any], SetIndirectPropertyPseudoUser = js.Any.fromFunction1(SetIndirectPropertyPseudoUser), SetUserAccount = js.Any.fromFunction1(SetUserAccount), SetUserGroup = js.Any.fromFunction1(SetUserGroup), SetWorkflowStatePseudoUser = js.Any.fromFunction1(SetWorkflowStatePseudoUser), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any], WorkflowState = WorkflowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserOrUserGroupIDEx]
  }
  @scala.inline
  implicit class IUserOrUserGroupIDExOps[Self <: IUserOrUserGroupIDEx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IUserOrUserGroupIDEx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndirectProperty(value: IIndirectPropertyID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndirectProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetIndirectPropertyPseudoUser(value: IIndirectPropertyID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIndirectPropertyPseudoUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUserAccount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetUserAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUserGroup(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetUserGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWorkflowStatePseudoUser(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWorkflowStatePseudoUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUserOrGroupID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserOrGroupID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserOrGroupType(value: MFUserOrUserGroupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserOrGroupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

