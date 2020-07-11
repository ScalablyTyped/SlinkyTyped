package typingsSlinky.reactBigCalendar.anon

import typingsSlinky.reactBigCalendar.mod.stringOrDate
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.click
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.doubleClick
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: select | click | doubleClick
  var end: stringOrDate
  var slots: js.Array[js.Date | String]
  var start: stringOrDate
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: select | click | doubleClick): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: stringOrDate): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotsVarargs(value: (js.Date | String)*): Self = this.set("slots", js.Array(value :_*))
    @scala.inline
    def setSlots(value: js.Array[js.Date | String]): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: stringOrDate): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

