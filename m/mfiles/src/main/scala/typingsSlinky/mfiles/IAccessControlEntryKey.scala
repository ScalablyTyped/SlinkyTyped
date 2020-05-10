package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlEntryKey extends js.Object {
  val HasConcreteUserOrGroupID: Boolean = js.native
  val IsGroup: Boolean = js.native
  val IsPseudoUser: Boolean = js.native
  var PseudoUserID: IIndirectPropertyID = js.native
  val UserOrGroupID: Double = js.native
  def Clone(): IAccessControlEntryKey = js.native
  def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs = js.native
  def ResetResolvedPseudoUserOrGroupIDs(): Unit = js.native
  def SetUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): Unit = js.native
}

object IAccessControlEntryKey {
  @scala.inline
  def apply(
    Clone: () => IAccessControlEntryKey,
    GetResolvedPseudoUserOrGroupIDs: () => IUserOrUserGroupIDs,
    HasConcreteUserOrGroupID: Boolean,
    IsGroup: Boolean,
    IsPseudoUser: Boolean,
    PseudoUserID: IIndirectPropertyID,
    ResetResolvedPseudoUserOrGroupIDs: () => Unit,
    SetUserOrGroupID: (Double, Boolean) => Unit,
    UserOrGroupID: Double
  ): IAccessControlEntryKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetResolvedPseudoUserOrGroupIDs = js.Any.fromFunction0(GetResolvedPseudoUserOrGroupIDs), HasConcreteUserOrGroupID = HasConcreteUserOrGroupID.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], IsPseudoUser = IsPseudoUser.asInstanceOf[js.Any], PseudoUserID = PseudoUserID.asInstanceOf[js.Any], ResetResolvedPseudoUserOrGroupIDs = js.Any.fromFunction0(ResetResolvedPseudoUserOrGroupIDs), SetUserOrGroupID = js.Any.fromFunction2(SetUserOrGroupID), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlEntryKey]
  }
  @scala.inline
  implicit class IAccessControlEntryKeyOps[Self <: IAccessControlEntryKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IAccessControlEntryKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResolvedPseudoUserOrGroupIDs(value: () => IUserOrUserGroupIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetResolvedPseudoUserOrGroupIDs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasConcreteUserOrGroupID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasConcreteUserOrGroupID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPseudoUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPseudoUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPseudoUserID(value: IIndirectPropertyID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PseudoUserID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetResolvedPseudoUserOrGroupIDs(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetResolvedPseudoUserOrGroupIDs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetUserOrGroupID(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetUserOrGroupID")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUserOrGroupID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserOrGroupID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

