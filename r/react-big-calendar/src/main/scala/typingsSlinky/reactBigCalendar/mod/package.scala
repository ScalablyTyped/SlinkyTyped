package typingsSlinky.reactBigCalendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  type DayLayoutFunction[TEvent /* <: js.Object */] = js.Function1[
    /* _ */ typingsSlinky.reactBigCalendar.anon.Accessors[TEvent], 
    js.Array[typingsSlinky.reactBigCalendar.anon.Event[TEvent]]
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
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type SlotGroupPropGetter = js.Function0[typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]]
  
  type SlotPropGetter = js.Function2[
    /* date */ js.Date, 
    /* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
    typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]
  ]
  
  type ViewsProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] = js.Array[typingsSlinky.reactBigCalendar.mod.View] | typingsSlinky.reactBigCalendar.anon.Agenda
  
  @scala.inline
  def dateFnsLocalizer(config: js.Object): typingsSlinky.reactBigCalendar.mod.DateLocalizer = typingsSlinky.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dateFnsLocalizer")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactBigCalendar.mod.DateLocalizer]
  
  @scala.inline
  def globalizeLocalizer(globalizeInstance: js.Object): typingsSlinky.reactBigCalendar.mod.DateLocalizer = typingsSlinky.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("globalizeLocalizer")(globalizeInstance.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactBigCalendar.mod.DateLocalizer]
  
  @scala.inline
  def momentLocalizer(momentInstance: js.Object): typingsSlinky.reactBigCalendar.mod.DateLocalizer = typingsSlinky.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("momentLocalizer")(momentInstance.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactBigCalendar.mod.DateLocalizer]
  
  @scala.inline
  def move(
    View: typingsSlinky.reactBigCalendar.mod.ViewKey,
    options: typingsSlinky.reactBigCalendar.mod.MoveOptions
  ): js.Date = (typingsSlinky.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(View.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  @scala.inline
  def move(
    View: typingsSlinky.reactBigCalendar.mod.ViewStatic,
    options: typingsSlinky.reactBigCalendar.mod.MoveOptions
  ): js.Date = (typingsSlinky.reactBigCalendar.mod.^.asInstanceOf[js.Dynamic].applyDynamic("move")(View.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  type stringOrDate = java.lang.String | js.Date
}
