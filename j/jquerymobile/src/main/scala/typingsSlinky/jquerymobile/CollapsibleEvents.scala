package typingsSlinky.jquerymobile

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleEvents extends js.Object {
  var collapse: js.UndefOr[JQueryMobileEvent] = js.native
  var create: js.UndefOr[JQueryMobileEvent] = js.native
  var expand: js.UndefOr[JQueryMobileEvent] = js.native
}

object CollapsibleEvents {
  @scala.inline
  def apply(): CollapsibleEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleEvents]
  }
  @scala.inline
  implicit class CollapsibleEventsOps[Self <: CollapsibleEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = {
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
    def withExpand(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
  }
  
}

