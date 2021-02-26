package typingsSlinky.reactBigCalendar.anon

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactBigCalendar.mod.DayPropGetter
import typingsSlinky.reactBigCalendar.mod.EventPropGetter
import typingsSlinky.reactBigCalendar.mod.SlotPropGetter
import typingsSlinky.reactBigCalendar.mod.stringOrDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayProp[TEvent /* <: js.Object */] extends StObject {
  
  var dayProp: js.UndefOr[DayPropGetter] = js.native
  
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.native
  
  var slotProp: js.UndefOr[SlotPropGetter] = js.native
}
object DayProp {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): DayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayProp[TEvent]]
  }
  
  @scala.inline
  implicit class DayPropMutableBuilder[Self <: DayProp[_], TEvent /* <: js.Object */] (val x: Self with DayProp[TEvent]) extends AnyVal {
    
    @scala.inline
    def setDayProp(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "dayProp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDayPropUndefined: Self = StObject.set(x, "dayProp", js.undefined)
    
    @scala.inline
    def setEventProp(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "eventProp", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEventPropUndefined: Self = StObject.set(x, "eventProp", js.undefined)
    
    @scala.inline
    def setSlotProp(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "slotProp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSlotPropUndefined: Self = StObject.set(x, "slotProp", js.undefined)
  }
}
