package typingsSlinky.reactDnd.interfacesMod

import typingsSlinky.reactDnd.monitorsMod.DragSourceMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragSourceSpec[Props, DragObject] extends js.Object {
  /**
    * Optional.
    * Use it to specify whether the dragging is currently allowed. If you want to always allow it, just omit this method.
    * Specifying it is handy if you'd like to disable dragging based on some predicate over props. Note: You may not call
    * monitor.canDrag() inside this method.
    */
  var canDrag: js.UndefOr[js.Function2[/* props */ Props, /* monitor */ DragSourceMonitor, Boolean]] = js.native
  /**
    * Optional.
    * When the dragging stops, endDrag is called. For every beginDrag call, a corresponding endDrag call is guaranteed.
    * You may call monitor.didDrop() to check whether or not the drop was handled by a compatible drop target. If it was handled,
    * and the drop target specified a drop result by returning a plain object from its drop() method, it will be available as
    * monitor.getDropResult(). This method is a good place to fire a Flux action. Note: If the component is unmounted while dragging,
    * component parameter is set to be null.
    */
  var endDrag: js.UndefOr[
    js.Function3[/* props */ Props, /* monitor */ DragSourceMonitor, /* component */ js.Any, Unit]
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
  var isDragging: js.UndefOr[js.Function2[/* props */ Props, /* monitor */ DragSourceMonitor, Boolean]] = js.native
  /**
    * Required.
    * When the dragging starts, beginDrag is called. You must return a plain JavaScript object describing the
    * data being dragged. What you return is the only information available to the drop targets about the drag
    * source so it's important to pick the minimal data they need to know. You may be tempted to put a reference
    * to the component into it, but you should try very hard to avoid doing this because it couples the drag
    * sources and drop targets. It's a good idea to return something like { id: props.id } from this method.
    */
  def beginDrag(props: Props, monitor: DragSourceMonitor, component: js.Any): DragObject = js.native
}

object DragSourceSpec {
  @scala.inline
  def apply[Props, DragObject](beginDrag: (Props, DragSourceMonitor, js.Any) => DragObject): DragSourceSpec[Props, DragObject] = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction3(beginDrag))
    __obj.asInstanceOf[DragSourceSpec[Props, DragObject]]
  }
  @scala.inline
  implicit class DragSourceSpecOps[Self[props, dragobject] <: DragSourceSpec[props, dragobject], Props, DragObject] (val x: Self[Props, DragObject]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, DragObject] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, DragObject]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, DragObject]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, DragObject]) with Other]
    @scala.inline
    def withBeginDrag(value: (Props, DragSourceMonitor, js.Any) => DragObject): Self[Props, DragObject] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginDrag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCanDrag(value: (/* props */ Props, /* monitor */ DragSourceMonitor) => Boolean): Self[Props, DragObject] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCanDrag: Self[Props, DragObject] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDrag(value: (/* props */ Props, /* monitor */ DragSourceMonitor, /* component */ js.Any) => Unit): Self[Props, DragObject] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDrag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEndDrag: Self[Props, DragObject] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDragging(value: (/* props */ Props, /* monitor */ DragSourceMonitor) => Boolean): Self[Props, DragObject] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsDragging: Self[Props, DragObject] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.undefined)
        ret
    }
  }
  
}

