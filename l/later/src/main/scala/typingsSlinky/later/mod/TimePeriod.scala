package typingsSlinky.later.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePeriod extends js.Object {
  
  /**
    * The last second in which the value is the same as the value of the specified date.
    * For example, the end of an hour would be the hour with 59 minutes and 59 seconds.
    *
    * @param date - The given date.
    */
  def end(date: js.Date): js.Date = js.native
  
  /**
    * The minimum and maximum valid values for the time period for the specified date.
    * If the minimum value is not 0, 0 can be specified in schedules to indicate the maximum value.
    * This makes working with non - constant extents(like days in a month) easier.
    *
    * @param [date] - The given date.
    */
  def extent(): js.Array[Double] = js.native
  def extent(date: js.Date): js.Array[Double] = js.native
  
  /**
    * True if the specified value is valid for the specified date, false otherwise.
    *
    * @param date - The given date.
    * @param value - The value to test for the date.
    */
  def isValid(date: js.Date, value: js.Any): Boolean = js.native
  
  /**
    * The name of the time period information provider.
    */
  var name: String = js.native
  
  /**
    * Returns the next date where the value is the value specified.
    * Sets the value to 1 if value specified is greater than the max allowed value.
    *
    * @param date - The given date.
    * @param value - The value to test for the date.
    */
  def next(date: js.Date, value: js.Any): js.Date = js.native
  
  /**
    * Returns the previous date where the value is the value specified.
    * Sets the value to the max allowed value if the value specified is greater than the max allowed value.
    *
    * @param date - The given date.
    * @param value - The value to test for the date.
    */
  def prev(date: js.Date, value: js.Any): js.Date = js.native
  
  /**
    * The rough number of seconds that are covered when moving from one instance of this time period to the next instance.
    */
  var range: Double = js.native
  
  /**
    * The first second in which the value is the same as the value of the specified date.
    *  For example, the start of an hour would be the hour with 0 minutes and 0 seconds.
    *
    * @param date - The given date.
    */
  def start(date: js.Date): js.Date = js.native
  
  /**
    * The value of this time period for the date specified.
    *
    * @param date - The given date.
    */
  def `val`(date: js.Date): Double = js.native
}
