package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventProvider extends js.Object {
  var colToMove: IColumn = js.native
  var groupToMove: js.Any = js.native
  def assignEvents(): Unit = js.native
  def assignGridEventHandlers(): Unit = js.native
  def dragOver(event: js.Any): Unit = js.native
  def dragStart(event: js.Any): Unit = js.native
  def onGroupDrop(event: js.Any): Unit = js.native
  def onGroupMouseDown(event: js.Any): Unit = js.native
  def onHeaderDrop(event: js.Any): Unit = js.native
  def onHeaderMouseDown(event: js.Any): Unit = js.native
  def setDraggables(): Unit = js.native
}

object IEventProvider {
  @scala.inline
  def apply(
    assignEvents: () => Unit,
    assignGridEventHandlers: () => Unit,
    colToMove: IColumn,
    dragOver: js.Any => Unit,
    dragStart: js.Any => Unit,
    groupToMove: js.Any,
    onGroupDrop: js.Any => Unit,
    onGroupMouseDown: js.Any => Unit,
    onHeaderDrop: js.Any => Unit,
    onHeaderMouseDown: js.Any => Unit,
    setDraggables: () => Unit
  ): IEventProvider = {
    val __obj = js.Dynamic.literal(assignEvents = js.Any.fromFunction0(assignEvents), assignGridEventHandlers = js.Any.fromFunction0(assignGridEventHandlers), colToMove = colToMove.asInstanceOf[js.Any], dragOver = js.Any.fromFunction1(dragOver), dragStart = js.Any.fromFunction1(dragStart), groupToMove = groupToMove.asInstanceOf[js.Any], onGroupDrop = js.Any.fromFunction1(onGroupDrop), onGroupMouseDown = js.Any.fromFunction1(onGroupMouseDown), onHeaderDrop = js.Any.fromFunction1(onHeaderDrop), onHeaderMouseDown = js.Any.fromFunction1(onHeaderMouseDown), setDraggables = js.Any.fromFunction0(setDraggables))
    __obj.asInstanceOf[IEventProvider]
  }
  @scala.inline
  implicit class IEventProviderOps[Self <: IEventProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAssignGridEventHandlers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignGridEventHandlers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColToMove(value: IColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colToMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOver(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDragStart(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupToMove(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupToMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnGroupDrop(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnGroupMouseDown(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnHeaderDrop(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnHeaderMouseDown(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDraggables(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDraggables")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

