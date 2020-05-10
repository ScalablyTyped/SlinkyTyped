package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipEvents extends js.Object {
  var close: js.UndefOr[TooltipEvent] = js.native
  var open: js.UndefOr[TooltipEvent] = js.native
}

object TooltipEvents {
  @scala.inline
  def apply(): TooltipEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipEvents]
  }
  @scala.inline
  implicit class TooltipEventsOps[Self <: TooltipEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
  }
  
}

