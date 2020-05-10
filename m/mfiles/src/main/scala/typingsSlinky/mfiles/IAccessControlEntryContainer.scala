package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlEntryContainer extends js.Object {
  val IsEmpty: Boolean = js.native
  def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): Unit = js.native
  def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData = js.native
  def Clear(): Unit = js.native
  def Clone(): IAccessControlEntryContainer = js.native
  def GetKeys(): IAccessControlEntryKeys = js.native
  def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys = js.native
  def HasKey(AccessControlEntryKey: IAccessControlEntryKey): Boolean = js.native
  def Remove(AccessControlEntryKey: IAccessControlEntryKey): Unit = js.native
}

object IAccessControlEntryContainer {
  @scala.inline
  def apply(
    Add: (IAccessControlEntryKey, IAccessControlEntryData) => Unit,
    At: IAccessControlEntryKey => IAccessControlEntryData,
    Clear: () => Unit,
    Clone: () => IAccessControlEntryContainer,
    GetKeys: () => IAccessControlEntryKeys,
    GetKeysWithPseudoUserDefinitions: () => IAccessControlEntryKeys,
    HasKey: IAccessControlEntryKey => Boolean,
    IsEmpty: Boolean,
    Remove: IAccessControlEntryKey => Unit
  ): IAccessControlEntryContainer = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), At = js.Any.fromFunction1(At), Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone), GetKeys = js.Any.fromFunction0(GetKeys), GetKeysWithPseudoUserDefinitions = js.Any.fromFunction0(GetKeysWithPseudoUserDefinitions), HasKey = js.Any.fromFunction1(HasKey), IsEmpty = IsEmpty.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IAccessControlEntryContainer]
  }
  @scala.inline
  implicit class IAccessControlEntryContainerOps[Self <: IAccessControlEntryContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (IAccessControlEntryKey, IAccessControlEntryData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAt(value: IAccessControlEntryKey => IAccessControlEntryData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("At")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IAccessControlEntryContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetKeys(value: () => IAccessControlEntryKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetKeysWithPseudoUserDefinitions(value: () => IAccessControlEntryKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetKeysWithPseudoUserDefinitions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasKey(value: IAccessControlEntryKey => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: IAccessControlEntryKey => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

