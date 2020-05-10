package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryui.AnonSelected
import typingsSlinky.jqueryui.AnonSelecting
import typingsSlinky.jqueryui.AnonUnselected
import typingsSlinky.jqueryui.AnonUnselecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectableEvents extends js.Object {
  var selected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ AnonSelected, Unit]] = js.native
  var selecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ AnonSelecting, Unit]] = js.native
  var start: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.native
  var stop: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.native
  var unselected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ AnonUnselected, Unit]] = js.native
  var unselecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ AnonUnselecting, Unit]] = js.native
}

object SelectableEvents {
  @scala.inline
  def apply(): SelectableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableEvents]
  }
  @scala.inline
  implicit class SelectableEventsOps[Self <: SelectableEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelected(value: (/* event */ JQueryEventObject, /* ui */ AnonSelected) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelecting(value: (/* event */ JQueryEventObject, /* ui */ AnonSelecting) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selecting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selecting")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit): Self = {
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
    def withStop(value: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit): Self = {
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
    def withUnselected(value: (/* event */ JQueryEventObject, /* ui */ AnonUnselected) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUnselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselected")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselecting(value: (/* event */ JQueryEventObject, /* ui */ AnonUnselecting) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselecting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUnselecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselecting")(js.undefined)
        ret
    }
  }
  
}

