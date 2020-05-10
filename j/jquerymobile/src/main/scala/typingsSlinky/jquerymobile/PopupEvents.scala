package typingsSlinky.jquerymobile

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupEvents extends js.Object {
  var popupafterclose: js.UndefOr[JQueryMobileEvent] = js.native
  var popupafteropen: js.UndefOr[JQueryMobileEvent] = js.native
  var popupbeforeposition: js.UndefOr[JQueryMobileEvent] = js.native
}

object PopupEvents {
  @scala.inline
  def apply(): PopupEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupEvents]
  }
  @scala.inline
  implicit class PopupEventsOps[Self <: PopupEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopupafterclose(value: (/* event */ Event_, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupafterclose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPopupafterclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupafterclose")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupafteropen(value: (/* event */ Event_, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupafteropen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPopupafteropen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupafteropen")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupbeforeposition(value: (/* event */ Event_, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupbeforeposition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPopupbeforeposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupbeforeposition")(js.undefined)
        ret
    }
  }
  
}

