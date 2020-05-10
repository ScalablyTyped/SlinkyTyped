package typingsSlinky.jquerymobile

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.native
}

object DialogEvents {
  @scala.inline
  def apply(): DialogEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogEvents]
  }
  @scala.inline
  implicit class DialogEventsOps[Self <: DialogEvents] (val x: Self) extends AnyVal {
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
  }
  
}

