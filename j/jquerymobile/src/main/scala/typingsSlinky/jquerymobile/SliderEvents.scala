package typingsSlinky.jquerymobile

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.native
  var slidestart: js.UndefOr[JQueryMobileEvent] = js.native
  var slidestop: js.UndefOr[JQueryMobileEvent] = js.native
}

object SliderEvents {
  @scala.inline
  def apply(): SliderEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderEvents]
  }
  @scala.inline
  implicit class SliderEventsOps[Self <: SliderEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (/* event */ Event_, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidestart(value: (/* event */ Event_, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidestart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSlidestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidestart")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidestop(value: (/* event */ Event_, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidestop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSlidestop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidestop")(js.undefined)
        ret
    }
  }
  
}

