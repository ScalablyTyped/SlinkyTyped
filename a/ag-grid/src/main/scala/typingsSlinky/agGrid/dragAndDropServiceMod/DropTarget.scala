package typingsSlinky.agGrid.dragAndDropServiceMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTarget extends js.Object {
  /** Icon to show when drag is over*/
  var getIconName: js.UndefOr[js.Function0[String]] = js.native
  /** If any secondary containers. For example when moving columns in ag-Grid, we listen for drops
    * in the header as well as the body (main rows and pinned rows) of the grid. */
  var getSecondaryContainers: js.UndefOr[js.Function0[js.Array[HTMLElement]]] = js.native
  /** Callback for when drag enters */
  var onDragEnter: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.native
  /** Callback for when drag leaves */
  var onDragLeave: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.native
  /** Callback for when drag stops */
  var onDragStop: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.native
  /** Callback for when dragging */
  var onDragging: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.native
  /** The main container that will get the drop. */
  def getContainer(): HTMLElement = js.native
  def isInterestedIn(`type`: DragSourceType): Boolean = js.native
}

object DropTarget {
  @scala.inline
  def apply(getContainer: () => HTMLElement, isInterestedIn: DragSourceType => Boolean): DropTarget = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), isInterestedIn = js.Any.fromFunction1(isInterestedIn))
    __obj.asInstanceOf[DropTarget]
  }
  @scala.inline
  implicit class DropTargetOps[Self <: DropTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContainer(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInterestedIn(value: DragSourceType => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInterestedIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIconName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSecondaryContainers(value: () => js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecondaryContainers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSecondaryContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecondaryContainers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: /* params */ DraggingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: /* params */ DraggingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStop(value: /* params */ DraggingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragging(value: /* params */ DraggingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragging")(js.undefined)
        ret
    }
  }
  
}

