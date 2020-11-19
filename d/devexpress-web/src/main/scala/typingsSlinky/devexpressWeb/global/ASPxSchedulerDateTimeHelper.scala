package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes static methods that simplify working with JavaScript DateTime values.
  */
@JSGlobal("ASPxSchedulerDateTimeHelper")
@js.native
class ASPxSchedulerDateTimeHelper ()
  extends typingsSlinky.devexpressWeb.ASPxSchedulerDateTimeHelper
/* static members */
@JSGlobal("ASPxSchedulerDateTimeHelper")
@js.native
object ASPxSchedulerDateTimeHelper extends js.Object {
  
  /**
    * Adds the specified number of days to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add days.
    * @param dayCount The number of days to add.
    */
  def AddDays(date: js.Date, dayCount: Double): js.Date = js.native
  
  /**
    * Adds the specified timespan to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add a timespan.
    * @param timeSpan A TimeSpan object specifying the timespan to add.
    */
  def AddTimeSpan(date: js.Date, timeSpan: js.Any): js.Date = js.native
  
  /**
    * Rounds a DateTime value up to the nearest interval. A DateTime object containing the rounded value.
    * @param date A DateTime object containing a value to round.
    * @param spanInMs A TimeSpan object specifying an interval to which to round.
    */
  def CeilDateTime(date: js.Date, spanInMs: js.Any): js.Date = js.native
  
  /**
    * Returns the day time part of the specified DateTime value. A TimeSpan object containing the day time.
    * @param date A DateTime object from which to extract the day time.
    */
  def ToDayTime(date: js.Date): js.Any = js.native
  
  /**
    * Returns the date part of the specified DateTime value. A DateTime object containing a date.
    * @param date A DateTime object from which to extract the date.
    */
  def TruncToDate(date: js.Date): js.Date = js.native
}
