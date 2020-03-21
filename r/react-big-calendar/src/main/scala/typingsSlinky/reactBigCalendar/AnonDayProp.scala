package typingsSlinky.reactBigCalendar

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactBigCalendar.mod.DayPropGetter
import typingsSlinky.reactBigCalendar.mod.EventPropGetter
import typingsSlinky.reactBigCalendar.mod.SlotPropGetter
import typingsSlinky.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDayProp[TEvent /* <: js.Object */] extends js.Object {
  var dayProp: js.UndefOr[DayPropGetter] = js.undefined
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var slotProp: js.UndefOr[SlotPropGetter] = js.undefined
}

object AnonDayProp {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    dayProp: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement] = null,
    eventProp: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement] = null,
    slotProp: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement] = null
  ): AnonDayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (dayProp != null) __obj.updateDynamic("dayProp")(js.Any.fromFunction2(dayProp))
    if (eventProp != null) __obj.updateDynamic("eventProp")(js.Any.fromFunction4(eventProp))
    if (slotProp != null) __obj.updateDynamic("slotProp")(js.Any.fromFunction2(slotProp))
    __obj.asInstanceOf[AnonDayProp[TEvent]]
  }
}

