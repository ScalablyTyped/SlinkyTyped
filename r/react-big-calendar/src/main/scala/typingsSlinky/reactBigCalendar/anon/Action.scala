package typingsSlinky.reactBigCalendar.anon

import typingsSlinky.reactBigCalendar.mod.stringOrDate
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.click
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.doubleClick
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  var action: select | click | doubleClick = js.native
  var end: stringOrDate = js.native
  var slots: js.Array[js.Date | String] = js.native
  var start: stringOrDate = js.native
}

object Action {
  @scala.inline
  def apply(
    action: select | click | doubleClick,
    end: stringOrDate,
    slots: js.Array[js.Date | String],
    start: stringOrDate
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: select | click | doubleClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: stringOrDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlots(value: js.Array[js.Date | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: stringOrDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

