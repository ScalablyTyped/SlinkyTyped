package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjVers extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ObjVer: IObjVer): Unit = js.native
  def Clone(): IObjVers = js.native
  def GetAllDistinctObjIDs(): IObjIDs = js.native
  def Item(Index: Double): IObjVer = js.native
  def Remove(Index: Double): Unit = js.native
  def ToJSON(): String = js.native
}

object IObjVers {
  @scala.inline
  def apply(
    Add: (Double, IObjVer) => Unit,
    Clone: () => IObjVers,
    Count: Double,
    GetAllDistinctObjIDs: () => IObjIDs,
    Item: Double => IObjVer,
    Remove: Double => Unit,
    ToJSON: () => String
  ): IObjVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetAllDistinctObjIDs = js.Any.fromFunction0(GetAllDistinctObjIDs), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IObjVers]
  }
  @scala.inline
  implicit class IObjVersOps[Self <: IObjVers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, IObjVer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IObjVers): Self = {
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
    def withGetAllDistinctObjIDs(value: () => IObjIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAllDistinctObjIDs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IObjVer): Self = {
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

