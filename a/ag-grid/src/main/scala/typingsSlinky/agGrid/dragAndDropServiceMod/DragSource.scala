package typingsSlinky.agGrid.dragAndDropServiceMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragSource extends js.Object {
  /** This name appears in the ghost icon when dragging */
  var dragItemName: String = js.native
  /** The drop target associated with this dragSource. So when dragging starts, this target does not get
    * onDragEnter event. */
  var dragSourceDropTarget: js.UndefOr[DropTarget] = js.native
  /** After how many pixels of dragging should the drag operation start. Default is 4px. */
  var dragStartPixels: js.UndefOr[Double] = js.native
  /** Callback for drag started */
  var dragStarted: js.UndefOr[js.Function0[Unit]] = js.native
  /** Callback for drag stopped */
  var dragStopped: js.UndefOr[js.Function0[Unit]] = js.native
  /** Element which, when dragged, will kick off the DnD process */
  var eElement: HTMLElement = js.native
  /** So the drop target knows what type of event it is, useful for columns,
    * we we re-ordering or moving dropping from toolPanel */
  var `type`: DragSourceType = js.native
  /** If eElement is dragged, then the dragItem is the object that gets passed around. */
  def dragItemCallback(): DragItem = js.native
}

object DragSource {
  @scala.inline
  def apply(
    dragItemCallback: () => DragItem,
    dragItemName: String,
    eElement: HTMLElement,
    `type`: DragSourceType
  ): DragSource = {
    val __obj = js.Dynamic.literal(dragItemCallback = js.Any.fromFunction0(dragItemCallback), dragItemName = dragItemName.asInstanceOf[js.Any], eElement = eElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSource]
  }
  @scala.inline
  implicit class DragSourceOps[Self <: DragSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragItemCallback(value: () => DragItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragItemCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDragItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DragSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragSourceDropTarget(value: DropTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSourceDropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragSourceDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSourceDropTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStartPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStartPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragStartPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStartPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDragStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStopped(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStopped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDragStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStopped")(js.undefined)
        ret
    }
  }
  
}

