package typingsSlinky.angularUiSortable.mod.ui

import typingsSlinky.angular.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableEvents[T] extends js.Object {
  var activate: js.UndefOr[SortableEvent[T]] = js.native
  var beforeStop: js.UndefOr[SortableEvent[T]] = js.native
  var change: js.UndefOr[SortableEvent[T]] = js.native
  var deactivate: js.UndefOr[SortableEvent[T]] = js.native
  var out: js.UndefOr[SortableEvent[T]] = js.native
  var over: js.UndefOr[SortableEvent[T]] = js.native
  var receive: js.UndefOr[SortableEvent[T]] = js.native
  var remove: js.UndefOr[SortableEvent[T]] = js.native
  var sort: js.UndefOr[SortableEvent[T]] = js.native
  var start: js.UndefOr[SortableEvent[T]] = js.native
  var stop: js.UndefOr[SortableEvent[T]] = js.native
  var update: js.UndefOr[SortableEvent[T]] = js.native
}

object SortableEvents {
  @scala.inline
  def apply[T](): SortableEvents[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableEvents[T]]
  }
  @scala.inline
  implicit class SortableEventsOps[Self[t] <: SortableEvents[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActivate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeStop(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeStop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeactivate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOut: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withOver(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOver: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(js.undefined)
        ret
    }
    @scala.inline
    def withReceive(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReceive: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

