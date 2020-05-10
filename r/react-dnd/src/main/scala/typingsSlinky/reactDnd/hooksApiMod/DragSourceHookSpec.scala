package typingsSlinky.reactDnd.hooksApiMod

import typingsSlinky.reactDnd.monitorsMod.DragSourceMonitor
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import typingsSlinky.reactDnd.optionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragSourceHookSpec[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps] extends js.Object {
  /**
    * When the dragging starts, beginDrag is called. If an object is returned from this function it will overide the default dragItem
    */
  var begin: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, js.UndefOr[DragObject | Unit]]] = js.native
  /**
    * Optional.
    * Use it to specify whether the dragging is currently allowed. If you want to always allow it, just omit this method.
    * Specifying it is handy if you'd like to disable dragging based on some predicate over props. Note: You may not call
    * monitor.canDrag() inside this method.
    */
  var canDrag: js.UndefOr[Boolean | (js.Function1[/* monitor */ DragSourceMonitor, Boolean])] = js.native
  /**
    * A function to collect rendering properties
    */
  var collect: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, CollectedProps]] = js.native
  /**
    * Optional.
    * When the dragging stops, endDrag is called. For every beginDrag call, a corresponding endDrag call is guaranteed.
    * You may call monitor.didDrop() to check whether or not the drop was handled by a compatible drop target. If it was handled,
    * and the drop target specified a drop result by returning a plain object from its drop() method, it will be available as
    * monitor.getDropResult(). This method is a good place to fire a Flux action. Note: If the component is unmounted while dragging,
    * component parameter is set to be null.
    */
  var end: js.UndefOr[
    js.Function2[/* dropResult */ js.UndefOr[DropResult], /* monitor */ DragSourceMonitor, Unit]
  ] = js.native
  /**
    * Optional.
    * By default, only the drag source that initiated the drag operation is considered to be dragging. You can
    * override this behavior by defining a custom isDragging method. It might return something like props.id === monitor.getItem().id.
    * Do this if the original component may be unmounted during the dragging and later “resurrected” with a different parent.
    * For example, when moving a card across the lists in a Kanban board, you want it to retain the dragged appearance—even though
    * technically, the component gets unmounted and a different one gets mounted every time you move it to another list.
    *
    * Note: You may not call monitor.isDragging() inside this method.
    */
  var isDragging: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, Boolean]] = js.native
  /**
    * A plain javascript item describing the data being dragged.
    * This is the only information available to the drop targets about the drag
    * source so it's important to pick the minimal data they need to know.
    *
    * You may be tempted to put a reference to the component or complex object here,
    * but you shouldx try very hard to avoid doing this because it couples the
    * drag sources and drop targets. It's a good idea to use something like
    * { id: props.id }
    *
    */
  var item: DragObject = js.native
  /**
    * The drag source options
    */
  var options: js.UndefOr[DragSourceOptions] = js.native
  /**
    * DragPreview options
    */
  var previewOptions: js.UndefOr[DragPreviewOptions] = js.native
}

object DragSourceHookSpec {
  @scala.inline
  def apply[DragObject, DropResult, CollectedProps](item: DragObject): DragSourceHookSpec[DragObject, DropResult, CollectedProps] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSourceHookSpec[DragObject, DropResult, CollectedProps]]
  }
  @scala.inline
  implicit class DragSourceHookSpecOps[Self[dragobject, dropresult, collectedprops] <: DragSourceHookSpec[dragobject, dropresult, collectedprops], DragObject, DropResult, CollectedProps] (val x: Self[DragObject, DropResult, CollectedProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DragObject, DropResult, CollectedProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DragObject, DropResult, CollectedProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[DragObject, DropResult, CollectedProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[DragObject, DropResult, CollectedProps]) with Other]
    @scala.inline
    def withItem(value: DragObject): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBegin(value: /* monitor */ DragSourceMonitor => js.UndefOr[DragObject | Unit]): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBegin: Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withCanDragFunction1(value: /* monitor */ DragSourceMonitor => Boolean): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanDrag(value: Boolean | (js.Function1[/* monitor */ DragSourceMonitor, Boolean])): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDrag: Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withCollect(value: /* monitor */ DragSourceMonitor => CollectedProps): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollect: Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collect")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: (/* dropResult */ js.UndefOr[DropResult], /* monitor */ DragSourceMonitor) => Unit): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEnd: Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDragging(value: /* monitor */ DragSourceMonitor => Boolean): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsDragging: Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: DragSourceOptions): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewOptions(value: DragPreviewOptions): Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewOptions: Self[DragObject, DropResult, CollectedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewOptions")(js.undefined)
        ret
    }
  }
  
}

