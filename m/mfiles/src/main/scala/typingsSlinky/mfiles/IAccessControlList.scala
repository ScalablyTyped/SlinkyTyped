package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlList extends js.Object {
  val AutomaticComponents: IAccessControlListComponentContainer = js.native
  val CheckedOutToUserID: Double = js.native
  var CustomComponent: IAccessControlListComponent = js.native
  val HasCheckedOutToUserID: Boolean = js.native
  var IsFullyAuthoritative: Boolean = js.native
  def Clone(): IAccessControlList = js.native
  def CloneFrom(AccessControlList: IAccessControlList): Unit = js.native
  def EqualTo(AccessControlList: IAccessControlList): Boolean = js.native
  def HasIdenticalPermissions(AccessControlList: IAccessControlList): Boolean = js.native
}

object IAccessControlList {
  @scala.inline
  def apply(
    AutomaticComponents: IAccessControlListComponentContainer,
    CheckedOutToUserID: Double,
    Clone: () => IAccessControlList,
    CloneFrom: IAccessControlList => Unit,
    CustomComponent: IAccessControlListComponent,
    EqualTo: IAccessControlList => Boolean,
    HasCheckedOutToUserID: Boolean,
    HasIdenticalPermissions: IAccessControlList => Boolean,
    IsFullyAuthoritative: Boolean
  ): IAccessControlList = {
    val __obj = js.Dynamic.literal(AutomaticComponents = AutomaticComponents.asInstanceOf[js.Any], CheckedOutToUserID = CheckedOutToUserID.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), CustomComponent = CustomComponent.asInstanceOf[js.Any], EqualTo = js.Any.fromFunction1(EqualTo), HasCheckedOutToUserID = HasCheckedOutToUserID.asInstanceOf[js.Any], HasIdenticalPermissions = js.Any.fromFunction1(HasIdenticalPermissions), IsFullyAuthoritative = IsFullyAuthoritative.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlList]
  }
  @scala.inline
  implicit class IAccessControlListOps[Self <: IAccessControlList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticComponents(value: IAccessControlListComponentContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedOutToUserID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedOutToUserID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IAccessControlList => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomComponent(value: IAccessControlListComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEqualTo(value: IAccessControlList => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasCheckedOutToUserID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCheckedOutToUserID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasIdenticalPermissions(value: IAccessControlList => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasIdenticalPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFullyAuthoritative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFullyAuthoritative")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

