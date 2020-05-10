package typingsSlinky.jquerymobile

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxRadioEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.native
}

object CheckboxRadioEvents {
  @scala.inline
  def apply(): CheckboxRadioEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxRadioEvents]
  }
  @scala.inline
  implicit class CheckboxRadioEventsOps[Self <: CheckboxRadioEvents] (val x: Self) extends AnyVal {
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

