package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollection extends js.Object {
  val Count: Double = js.native
  val Events: IEvents = js.native
  def Clear(): Unit = js.native
  def Find(item: js.Any): Double = js.native
  def GetAt(pos: Double): js.Any = js.native
  def MoveTo(pos: Double, newPos: Double): Unit = js.native
  def NewTo(pos: Double, replace: Boolean): js.Any = js.native
  def PutTo(pos: Double, replace: Boolean, item: js.Any): Unit = js.native
  def RemoveAt(pos: Double): Unit = js.native
}

object ICollection {
  @scala.inline
  def apply(
    Clear: () => Unit,
    Count: Double,
    Events: IEvents,
    Find: js.Any => Double,
    GetAt: Double => js.Any,
    MoveTo: (Double, Double) => Unit,
    NewTo: (Double, Boolean) => js.Any,
    PutTo: (Double, Boolean, js.Any) => Unit,
    RemoveAt: Double => Unit
  ): ICollection = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Find = js.Any.fromFunction1(Find), GetAt = js.Any.fromFunction1(GetAt), MoveTo = js.Any.fromFunction2(MoveTo), NewTo = js.Any.fromFunction2(NewTo), PutTo = js.Any.fromFunction3(PutTo), RemoveAt = js.Any.fromFunction1(RemoveAt))
    __obj.asInstanceOf[ICollection]
  }
  @scala.inline
  implicit class ICollectionOps[Self <: ICollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: IEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFind(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAt(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveTo(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNewTo(value: (Double, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPutTo(value: (Double, Boolean, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PutTo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoveAt(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveAt")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

