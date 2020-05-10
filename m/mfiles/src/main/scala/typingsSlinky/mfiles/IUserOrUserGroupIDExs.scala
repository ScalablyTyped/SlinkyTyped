package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserOrUserGroupIDExs extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): Unit = js.native
  def Clone(): IUserOrUserGroupIDExs = js.native
  def GetUserOrUserGroupIDEx(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupIDEx = js.native
  def GetUserOrUserGroupIDExIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double = js.native
  def Item(Index: Double): IUserOrUserGroupIDEx = js.native
  def Remove(Index: Double): Unit = js.native
}

object IUserOrUserGroupIDExs {
  @scala.inline
  def apply(
    Add: (Double, IUserOrUserGroupIDEx) => Unit,
    Clone: () => IUserOrUserGroupIDExs,
    Count: Double,
    GetUserOrUserGroupIDEx: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx,
    GetUserOrUserGroupIDExIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupIDEx,
    Remove: Double => Unit
  ): IUserOrUserGroupIDExs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupIDEx = js.Any.fromFunction2(GetUserOrUserGroupIDEx), GetUserOrUserGroupIDExIndex = js.Any.fromFunction2(GetUserOrUserGroupIDExIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IUserOrUserGroupIDExs]
  }
  @scala.inline
  implicit class IUserOrUserGroupIDExsOps[Self <: IUserOrUserGroupIDExs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, IUserOrUserGroupIDEx) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IUserOrUserGroupIDExs): Self = {
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
    def withGetUserOrUserGroupIDEx(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserOrUserGroupIDEx")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetUserOrUserGroupIDExIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserOrUserGroupIDExIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IUserOrUserGroupIDEx): Self = {
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

