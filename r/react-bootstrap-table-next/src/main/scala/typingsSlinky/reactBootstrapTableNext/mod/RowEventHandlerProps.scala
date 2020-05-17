package typingsSlinky.reactBootstrapTableNext.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  onClick  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onDoubleClick  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseEnter  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseLeave  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onContextMenu  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>}> */
@js.native
trait RowEventHandlerProps[T] extends js.Object {
  var onClick: js.UndefOr[RowEventHandler[T]] = js.native
  var onContextMenu: js.UndefOr[RowEventHandler[T]] = js.native
  var onDoubleClick: js.UndefOr[RowEventHandler[T]] = js.native
  var onMouseEnter: js.UndefOr[RowEventHandler[T]] = js.native
  var onMouseLeave: js.UndefOr[RowEventHandler[T]] = js.native
}

object RowEventHandlerProps {
  @scala.inline
  def apply[T](): RowEventHandlerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEventHandlerProps[T]]
  }
  @scala.inline
  implicit class RowEventHandlerPropsOps[Self[t] <: RowEventHandlerProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnClick(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
  }
  
}

