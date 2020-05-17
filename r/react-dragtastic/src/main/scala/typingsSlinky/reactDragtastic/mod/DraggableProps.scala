package typingsSlinky.reactDragtastic.mod

import slinky.core.TagMod
import typingsSlinky.reactDragtastic.anon.StateisActivebooleanevent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProps extends js.Object {
  /** Data of any type which will be passed to the onDrop function of any <Droppable/> which accepts this <Draggable/>'s type. */
  var data: js.UndefOr[js.Any] = js.native
  /** An optional int representing the distance in pixels the user's pointer must travel to activate the draggable. Defaults to 8 */
  var delay: js.UndefOr[Double] = js.native
  /** An id which will be used in the draggable zone's target <DragComponent/> */
  var id: js.UndefOr[Id] = js.native
  /** A function which will be called every time the user's cursor moves while dragging. */
  var onDrag: js.UndefOr[js.Function0[Unit]] = js.native
  /** A function which will be called when the <Draggable/> zone is deactivated (The user stopped dragging). */
  var onDragEnd: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /** A function which will be called when the <Draggable/> zone is activated (The user started dragging). */
  var onDragStart: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  /** A string, or array of strings, used to limit which droppable zones will accept <DragComponent/>'s attached to this draggable. */
  var `type`: js.UndefOr[Type] = js.native
  def children(arg: StateisActivebooleanevent): TagMod[Any] = js.native
}

object DraggableProps {
  @scala.inline
  def apply(children: StateisActivebooleanevent => TagMod[Any]): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DraggableProps]
  }
  @scala.inline
  implicit class DraggablePropsOps[Self <: DraggableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: StateisActivebooleanevent => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribeTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribeToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeTo")(null)
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

