package typingsSlinky.agGrid.bodyDropTargetMod

import typingsSlinky.agGrid.dragAndDropServiceMod.DraggingEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropListener extends js.Object {
  def getIconName(): String = js.native
  def onDragEnter(params: DraggingEvent): Unit = js.native
  def onDragLeave(params: DraggingEvent): Unit = js.native
  def onDragStop(params: DraggingEvent): Unit = js.native
  def onDragging(params: DraggingEvent): Unit = js.native
}

object DropListener {
  @scala.inline
  def apply(
    getIconName: () => String,
    onDragEnter: DraggingEvent => Unit,
    onDragLeave: DraggingEvent => Unit,
    onDragStop: DraggingEvent => Unit,
    onDragging: DraggingEvent => Unit
  ): DropListener = {
    val __obj = js.Dynamic.literal(getIconName = js.Any.fromFunction0(getIconName), onDragEnter = js.Any.fromFunction1(onDragEnter), onDragLeave = js.Any.fromFunction1(onDragLeave), onDragStop = js.Any.fromFunction1(onDragStop), onDragging = js.Any.fromFunction1(onDragging))
    __obj.asInstanceOf[DropListener]
  }
  @scala.inline
  implicit class DropListenerOps[Self <: DropListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIconName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDragEnter(value: DraggingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDragLeave(value: DraggingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDragStop(value: DraggingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDragging(value: DraggingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragging")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

