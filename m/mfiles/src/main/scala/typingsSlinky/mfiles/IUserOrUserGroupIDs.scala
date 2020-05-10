package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserOrUserGroupIDs extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, UserOrUserGroupID: IUserOrUserGroupID): Unit = js.native
  def Clone(): IUserOrUserGroupIDs = js.native
  def GetUserOrUserGroupID(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = js.native
  def GetUserOrUserGroupIDIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double = js.native
  def Item(Index: Double): IUserOrUserGroupID = js.native
  def Remove(Index: Double): Unit = js.native
}

object IUserOrUserGroupIDs {
  @scala.inline
  def apply(
    Add: (Double, IUserOrUserGroupID) => Unit,
    Clone: () => IUserOrUserGroupIDs,
    Count: Double,
    GetUserOrUserGroupID: (Double, MFUserOrUserGroupType) => IUserOrUserGroupID,
    GetUserOrUserGroupIDIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupID,
    Remove: Double => Unit
  ): IUserOrUserGroupIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupID = js.Any.fromFunction2(GetUserOrUserGroupID), GetUserOrUserGroupIDIndex = js.Any.fromFunction2(GetUserOrUserGroupIDIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IUserOrUserGroupIDs]
  }
  @scala.inline
  implicit class IUserOrUserGroupIDsOps[Self <: IUserOrUserGroupIDs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, IUserOrUserGroupID) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IUserOrUserGroupIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUserOrUserGroupID(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserOrUserGroupID")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetUserOrUserGroupIDIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserOrUserGroupIDIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IUserOrUserGroupID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

