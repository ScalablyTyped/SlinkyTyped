package typingsSlinky.reactDashBigDashCalendar

import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod.DayPropGetter
import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod.EventPropGetter
import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod.SlotPropGetter
import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayProp[TEvent /* <: js.Object */] extends js.Object {
  var dayProp: js.UndefOr[DayPropGetter] = js.undefined
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var slotProp: js.UndefOr[SlotPropGetter] = js.undefined
}

object Anon_DayProp {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    dayProp: /* date */ js.Date => Anon_ClassName = null,
    eventProp: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => Anon_ClassName = null,
    slotProp: /* date */ js.Date => Anon_ClassName = null
  ): Anon_DayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (dayProp != null) __obj.updateDynamic("dayProp")(js.Any.fromFunction1(dayProp))
    if (eventProp != null) __obj.updateDynamic("eventProp")(js.Any.fromFunction4(eventProp))
    if (slotProp != null) __obj.updateDynamic("slotProp")(js.Any.fromFunction1(slotProp))
    __obj.asInstanceOf[Anon_DayProp[TEvent]]
  }
}

