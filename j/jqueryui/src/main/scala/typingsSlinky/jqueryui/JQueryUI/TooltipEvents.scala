package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipEvents extends js.Object {
  var close: js.UndefOr[TooltipEvent] = js.undefined
  var open: js.UndefOr[TooltipEvent] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit): Self = this.set("close", js.Any.fromFunction2(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setOpen(value: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit): Self = this.set("open", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

