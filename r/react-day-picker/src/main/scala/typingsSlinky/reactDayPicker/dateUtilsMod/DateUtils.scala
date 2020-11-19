package typingsSlinky.reactDayPicker.dateUtilsMod

import typingsSlinky.reactDayPicker.modifiersMod.RangeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateUtils extends js.Object {
  
  def addDayToRange(day: js.Date, range: RangeModifier): RangeModifier = js.native
  
  def addMonths(d: js.Date, n: Double): js.Date = js.native
  
  def clone(d: js.Date): js.Date = js.native
  
  def isDate(d: js.Date): Boolean = js.native
  
  def isDayAfter(day1: js.Date, day2: js.Date): Boolean = js.native
  
  def isDayBefore(day1: js.Date, day2: js.Date): Boolean = js.native
  
  def isDayBetween(day: js.Date, begin: js.Date, end: js.Date): Boolean = js.native
  
  def isDayInRange(day: js.Date, range: RangeModifier): Boolean = js.native
  
  def isFutureDay(day: js.Date): Boolean = js.native
  
  def isPastDay(day: js.Date): Boolean = js.native
  
  def isSameDay(day1: js.Date, day2: js.Date): Boolean = js.native
  
  def isSameMonth(day1: js.Date, day2: js.Date): Boolean = js.native
}
@JSImport("react-day-picker/types/DateUtils", "DateUtils")
@js.native
object DateUtils extends js.Object {
  
  def addDayToRange(day: js.Date, range: RangeModifier): RangeModifier = js.native
  
  def addMonths(d: js.Date, n: Double): js.Date = js.native
  
  def clone(d: js.Date): js.Date = js.native
  
  def isDate(d: js.Date): Boolean = js.native
  
  def isDayAfter(day1: js.Date, day2: js.Date): Boolean = js.native
  
  def isDayBefore(day1: js.Date, day2: js.Date): Boolean = js.native
  
  def isDayBetween(day: js.Date, begin: js.Date, end: js.Date): Boolean = js.native
  
  def isDayInRange(day: js.Date, range: RangeModifier): Boolean = js.native
  
  def isFutureDay(day: js.Date): Boolean = js.native
  
  def isPastDay(day: js.Date): Boolean = js.native
  
  def isSameDay(day1: js.Date, day2: js.Date): Boolean = js.native
  
  def isSameMonth(day1: js.Date, day2: js.Date): Boolean = js.native
}
