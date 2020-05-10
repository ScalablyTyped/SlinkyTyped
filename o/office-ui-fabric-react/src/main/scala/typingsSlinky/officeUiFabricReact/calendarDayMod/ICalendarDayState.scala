package typingsSlinky.officeUiFabricReact.calendarDayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarDayState extends js.Object {
  var activeDescendantId: js.UndefOr[String] = js.native
  var weeks: js.UndefOr[js.Array[js.Array[IDayInfo]]] = js.native
}

object ICalendarDayState {
  @scala.inline
  def apply(): ICalendarDayState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarDayState]
  }
  @scala.inline
  implicit class ICalendarDayStateOps[Self <: ICalendarDayState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDescendantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDescendantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDescendantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDescendantId")(js.undefined)
        ret
    }
    @scala.inline
    def withWeeks(value: js.Array[js.Array[IDayInfo]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(js.undefined)
        ret
    }
  }
  
}

