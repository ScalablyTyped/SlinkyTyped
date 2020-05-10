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

@js.native
trait AnonDayProp[TEvent /* <: js.Object */] extends js.Object {
  var dayProp: js.UndefOr[DayPropGetter] = js.native
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.native
  var slotProp: js.UndefOr[SlotPropGetter] = js.native
}

object AnonDayProp {
  @scala.inline
  def apply[TEvent](): AnonDayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDayProp[TEvent]]
  }
  @scala.inline
  implicit class AnonDayPropOps[Self[tevent] <: AnonDayProp[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withDayProp(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayProp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDayProp: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayProp")(js.undefined)
        ret
    }
    @scala.inline
    def withEventProp(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventProp")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEventProp: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventProp")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotProp(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotProp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSlotProp: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotProp")(js.undefined)
        ret
    }
  }
  
}

