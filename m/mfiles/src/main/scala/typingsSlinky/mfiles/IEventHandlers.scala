package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventHandlers extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, EventHandler: IEventHandler): Unit = js.native
  def Clone(): IEventHandlers = js.native
  def GetIndexByGUID(EventHandlerGUID: String): Double = js.native
  def Item(Index: Double): IEventHandler = js.native
  def Remove(Index: Double): Unit = js.native
}

object IEventHandlers {
  @scala.inline
  def apply(
    Add: (Double, IEventHandler) => Unit,
    Clone: () => IEventHandlers,
    Count: Double,
    GetIndexByGUID: String => Double,
    Item: Double => IEventHandler,
    Remove: Double => Unit
  ): IEventHandlers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetIndexByGUID = js.Any.fromFunction1(GetIndexByGUID), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IEventHandlers]
  }
  @scala.inline
  implicit class IEventHandlersOps[Self <: IEventHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, IEventHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IEventHandlers): Self = {
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
    def withGetIndexByGUID(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIndexByGUID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IEventHandler): Self = {
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

