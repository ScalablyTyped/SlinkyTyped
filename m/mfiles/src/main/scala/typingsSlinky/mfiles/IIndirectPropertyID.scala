package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndirectPropertyID extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): Unit = js.native
  def Clone(): IIndirectPropertyID = js.native
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): Boolean = js.native
  def Item(Index: Double): IIndirectPropertyIDLevel = js.native
  def Remove(Index: Double): Unit = js.native
  def ToJSON(): String = js.native
}

object IIndirectPropertyID {
  @scala.inline
  def apply(
    Add: (Double, IIndirectPropertyIDLevel) => Unit,
    Clone: () => IIndirectPropertyID,
    Count: Double,
    EqualTo: IIndirectPropertyID => Boolean,
    Item: Double => IIndirectPropertyIDLevel,
    Remove: Double => Unit,
    ToJSON: () => String
  ): IIndirectPropertyID = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], EqualTo = js.Any.fromFunction1(EqualTo), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IIndirectPropertyID]
  }
  @scala.inline
  implicit class IIndirectPropertyIDOps[Self <: IIndirectPropertyID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, IIndirectPropertyIDLevel) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IIndirectPropertyID): Self = {
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
    def withEqualTo(value: IIndirectPropertyID => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IIndirectPropertyIDLevel): Self = {
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
    def withToJSON(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

