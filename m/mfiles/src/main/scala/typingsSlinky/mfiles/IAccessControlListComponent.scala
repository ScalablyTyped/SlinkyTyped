package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlListComponent extends js.Object {
  var AccessControlEntries: IAccessControlEntryContainer = js.native
  var CanDeactivate: Boolean = js.native
  val CurrentUserBinding: Double = js.native
  val HasCurrentUser: Boolean = js.native
  val HasCurrentUserBinding: Boolean = js.native
  val HasNamedACLLink: Boolean = js.native
  val HasPseudoUsers: Boolean = js.native
  var IsActive: Boolean = js.native
  val NamedACLLink: Double = js.native
  def Clone(): IAccessControlListComponent = js.native
  def GetACEByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryData = js.native
  def GetACEKeyByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryKey = js.native
  def ResetCurrentUserBinding(): Unit = js.native
  def ResetNamedACLLink(): Unit = js.native
}

object IAccessControlListComponent {
  @scala.inline
  def apply(
    AccessControlEntries: IAccessControlEntryContainer,
    CanDeactivate: Boolean,
    Clone: () => IAccessControlListComponent,
    CurrentUserBinding: Double,
    GetACEByUserOrGroupID: (Double, Boolean) => IAccessControlEntryData,
    GetACEKeyByUserOrGroupID: (Double, Boolean) => IAccessControlEntryKey,
    HasCurrentUser: Boolean,
    HasCurrentUserBinding: Boolean,
    HasNamedACLLink: Boolean,
    HasPseudoUsers: Boolean,
    IsActive: Boolean,
    NamedACLLink: Double,
    ResetCurrentUserBinding: () => Unit,
    ResetNamedACLLink: () => Unit
  ): IAccessControlListComponent = {
    val __obj = js.Dynamic.literal(AccessControlEntries = AccessControlEntries.asInstanceOf[js.Any], CanDeactivate = CanDeactivate.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CurrentUserBinding = CurrentUserBinding.asInstanceOf[js.Any], GetACEByUserOrGroupID = js.Any.fromFunction2(GetACEByUserOrGroupID), GetACEKeyByUserOrGroupID = js.Any.fromFunction2(GetACEKeyByUserOrGroupID), HasCurrentUser = HasCurrentUser.asInstanceOf[js.Any], HasCurrentUserBinding = HasCurrentUserBinding.asInstanceOf[js.Any], HasNamedACLLink = HasNamedACLLink.asInstanceOf[js.Any], HasPseudoUsers = HasPseudoUsers.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], NamedACLLink = NamedACLLink.asInstanceOf[js.Any], ResetCurrentUserBinding = js.Any.fromFunction0(ResetCurrentUserBinding), ResetNamedACLLink = js.Any.fromFunction0(ResetNamedACLLink))
    __obj.asInstanceOf[IAccessControlListComponent]
  }
  @scala.inline
  implicit class IAccessControlListComponentOps[Self <: IAccessControlListComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlEntries(value: IAccessControlEntryContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDeactivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanDeactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IAccessControlListComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentUserBinding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentUserBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetACEByUserOrGroupID(value: (Double, Boolean) => IAccessControlEntryData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetACEByUserOrGroupID")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetACEKeyByUserOrGroupID(value: (Double, Boolean) => IAccessControlEntryKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetACEKeyByUserOrGroupID")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasCurrentUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCurrentUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasCurrentUserBinding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCurrentUserBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNamedACLLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasNamedACLLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPseudoUsers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasPseudoUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedACLLink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedACLLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetCurrentUserBinding(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetCurrentUserBinding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetNamedACLLink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetNamedACLLink")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

