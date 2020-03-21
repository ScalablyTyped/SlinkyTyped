package typingsSlinky.reactBigCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Culture = java.lang.String
  type DateFormat = java.lang.String | typingsSlinky.reactBigCalendar.mod.DateFormatFunction
  type DateFormatFunction = js.Function3[
    /* date */ js.Date, 
    /* culture */ js.UndefOr[typingsSlinky.reactBigCalendar.mod.Culture], 
    /* localizer */ js.UndefOr[typingsSlinky.reactBigCalendar.mod.DateLocalizer], 
    java.lang.String
  ]
  type DateRangeFormatFunction = js.Function3[
    /* range */ typingsSlinky.reactBigCalendar.mod.DateRange, 
    /* culture */ js.UndefOr[typingsSlinky.reactBigCalendar.mod.Culture], 
    /* localizer */ js.UndefOr[typingsSlinky.reactBigCalendar.mod.DateLocalizer], 
    java.lang.String
  ]
  type DayPropGetter = js.Function2[
    /* date */ js.Date, 
    /* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
    typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]
  ]
  type EventPropGetter[T] = js.Function4[
    /* event */ T, 
    /* start */ typingsSlinky.reactBigCalendar.mod.stringOrDate, 
    /* end */ typingsSlinky.reactBigCalendar.mod.stringOrDate, 
    /* isSelected */ scala.Boolean, 
    typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]
  ]
  type FormatInput = scala.Double | java.lang.String | js.Date
  type SlotGroupPropGetter = js.Function0[typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]]
  type SlotPropGetter = js.Function2[
    /* date */ js.Date, 
    /* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
    typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]
  ]
  type ViewsProps = js.Array[typingsSlinky.reactBigCalendar.mod.View] | typingsSlinky.reactBigCalendar.AnonAgenda
  type stringOrDate = java.lang.String | js.Date
}
