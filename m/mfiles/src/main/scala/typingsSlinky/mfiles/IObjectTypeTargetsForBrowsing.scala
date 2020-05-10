package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectTypeTargetsForBrowsing extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing): Unit = js.native
  def Clone(): IObjectTypeTargetsForBrowsing = js.native
  def Item(Index: Double): IObjectTypeTargetForBrowsing = js.native
  def Remove(Index: Double): Unit = js.native
}

object IObjectTypeTargetsForBrowsing {
  @scala.inline
  def apply(
    Add: (Double, IObjectTypeTargetForBrowsing) => Unit,
    Clone: () => IObjectTypeTargetsForBrowsing,
    Count: Double,
    Item: Double => IObjectTypeTargetForBrowsing,
    Remove: Double => Unit
  ): IObjectTypeTargetsForBrowsing = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectTypeTargetsForBrowsing]
  }
  @scala.inline
  implicit class IObjectTypeTargetsForBrowsingOps[Self <: IObjectTypeTargetsForBrowsing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, IObjectTypeTargetForBrowsing) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IObjectTypeTargetsForBrowsing): Self = {
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
    def withItem(value: Double => IObjectTypeTargetForBrowsing): Self = {
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

