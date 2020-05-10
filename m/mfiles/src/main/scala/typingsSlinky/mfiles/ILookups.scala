package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILookups extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, Lookup: ILookup): Unit = js.native
  def Clone(): ILookups = js.native
  def CloneFrom(Lookups: ILookups): Unit = js.native
  def GetLookupByItem(Item: Double): ILookup = js.native
  def GetLookupIndexByItem(Item: Double): Double = js.native
  def Item(Index: Double): ILookup = js.native
  def Remove(Index: Double): Unit = js.native
}

object ILookups {
  @scala.inline
  def apply(
    Add: (Double, ILookup) => Unit,
    Clone: () => ILookups,
    CloneFrom: ILookups => Unit,
    Count: Double,
    GetLookupByItem: Double => ILookup,
    GetLookupIndexByItem: Double => Double,
    Item: Double => ILookup,
    Remove: Double => Unit
  ): ILookups = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Count = Count.asInstanceOf[js.Any], GetLookupByItem = js.Any.fromFunction1(GetLookupByItem), GetLookupIndexByItem = js.Any.fromFunction1(GetLookupIndexByItem), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[ILookups]
  }
  @scala.inline
  implicit class ILookupsOps[Self <: ILookups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, ILookup) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => ILookups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: ILookups => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLookupByItem(value: Double => ILookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLookupByItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLookupIndexByItem(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLookupIndexByItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => ILookup): Self = {
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

