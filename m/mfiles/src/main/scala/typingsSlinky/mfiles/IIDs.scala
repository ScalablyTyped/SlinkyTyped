package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIDs extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ID: Double): Unit = js.native
  def Clone(): IIDs = js.native
  def IndexOf(ID: Double): Double = js.native
  def Item(Index: Double): Double = js.native
  def Remove(Index: Double): Unit = js.native
  def RemoveAll(ID: Double): Double = js.native
}

object IIDs {
  @scala.inline
  def apply(
    Add: (Double, Double) => Unit,
    Clone: () => IIDs,
    Count: Double,
    IndexOf: Double => Double,
    Item: Double => Double,
    Remove: Double => Unit,
    RemoveAll: Double => Double
  ): IIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], IndexOf = js.Any.fromFunction1(IndexOf), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction1(RemoveAll))
    __obj.asInstanceOf[IIDs]
  }
  @scala.inline
  implicit class IIDsOps[Self <: IIDs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IIDs): Self = {
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
    def withIndexOf(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => Double): Self = {
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
    @scala.inline
    def withRemoveAll(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveAll")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

