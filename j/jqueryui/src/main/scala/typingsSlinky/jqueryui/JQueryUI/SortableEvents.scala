package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableEvents extends js.Object {
  var activate: js.UndefOr[SortableEvent] = js.native
  var beforeStop: js.UndefOr[SortableEvent] = js.native
  var change: js.UndefOr[SortableEvent] = js.native
  var deactivate: js.UndefOr[SortableEvent] = js.native
  var out: js.UndefOr[SortableEvent] = js.native
  var over: js.UndefOr[SortableEvent] = js.native
  var receive: js.UndefOr[SortableEvent] = js.native
  var remove: js.UndefOr[SortableEvent] = js.native
  var sort: js.UndefOr[SortableEvent] = js.native
  var start: js.UndefOr[SortableEvent] = js.native
  var stop: js.UndefOr[SortableEvent] = js.native
  var update: js.UndefOr[SortableEvent] = js.native
}

object SortableEvents {
  @scala.inline
  def apply(): SortableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableEvents]
  }
  @scala.inline
  implicit class SortableEventsOps[Self <: SortableEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeStop(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withOver(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(js.undefined)
        ret
    }
    @scala.inline
    def withReceive(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReceive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

