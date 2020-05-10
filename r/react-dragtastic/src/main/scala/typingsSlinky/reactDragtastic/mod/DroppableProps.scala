package typingsSlinky.reactDragtastic.mod

import slinky.core.TagMod
import typingsSlinky.reactDragtastic.StateisOverbooleanwillAcc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableProps extends js.Object {
  /** A string type corresponding to the type property of the <Draggable/> zone for which this <Droppable/> should accept drop events. */
  var accepts: js.UndefOr[Accepts] = js.native
  /** An id which will be used in the draggable zone's target <DragComponent/> */
  var id: js.UndefOr[Id] = js.native
  /**
    * A function which will be called when the user's cursor enters the <Droppable/> while dragging.
    * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
    */
  var onDragEnter: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function which will be called when the user's cursor leaves the <Droppable/> while dragging.
    * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
    */
  var onDragLeave: js.UndefOr[js.Function0[Unit]] = js.native
  /** A function which will be called when a user drops a <DragComponent/> on this <Droppable/> with an accepted type. */
  var onDrop: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  def children(arg: StateisOverbooleanwillAcc): TagMod[Any] = js.native
}

object DroppableProps {
  @scala.inline
  def apply(children: StateisOverbooleanwillAcc => TagMod[Any]): DroppableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DroppableProps]
  }
  @scala.inline
  implicit class DroppablePropsOps[Self <: DroppableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: StateisOverbooleanwillAcc => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAccepts(value: Accepts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(js.undefined)
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
    def withOnDragEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
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
  }
  
}

