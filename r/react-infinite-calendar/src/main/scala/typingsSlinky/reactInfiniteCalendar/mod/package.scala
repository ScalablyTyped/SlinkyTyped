package typingsSlinky.reactInfiniteCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CalendarClass = slinky.core.ReactComponentClass[typingsSlinky.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps]
  
  type DateSelectFunction = js.Function1[/* date */ js.Date, scala.Unit]
  
  type DateType = js.Date | java.lang.String | scala.Double
  
  type RangedSelectFunction = js.Function1[
    /* rangedDate */ typingsSlinky.reactInfiniteCalendar.mod.RangedSelection, 
    scala.Unit
  ]
  
  type ReactInfiniteCalendar = slinky.core.ReactComponentClass[typingsSlinky.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps]
}
