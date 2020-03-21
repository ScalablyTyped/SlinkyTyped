package typingsSlinky.materialUi.MaterialUI.propTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait utils extends js.Object {
  def addDays(date: js.Date, days: Double): js.Date
  def addMonths(date: js.Date, months: Double): js.Date
  def addYears(date: js.Date, years: Double): js.Date
  def getFirstDayOfMonth(date: js.Date): js.Date
  def getWeekArray(date: js.Date, firstDayOfWeek: Double): js.Array[js.Array[js.Date | Null]]
  def getYear(date: js.Date): Double
  def monthDiff(date1: js.Date, date2: js.Date): Double
  def setYear(date: js.Date, year: Double): js.Date
}

object utils {
  @scala.inline
  def apply(
    addDays: (js.Date, Double) => js.Date,
    addMonths: (js.Date, Double) => js.Date,
    addYears: (js.Date, Double) => js.Date,
    getFirstDayOfMonth: js.Date => js.Date,
    getWeekArray: (js.Date, Double) => js.Array[js.Array[js.Date | Null]],
    getYear: js.Date => Double,
    monthDiff: (js.Date, js.Date) => Double,
    setYear: (js.Date, Double) => js.Date
  ): utils = {
    val __obj = js.Dynamic.literal(addDays = js.Any.fromFunction2(addDays), addMonths = js.Any.fromFunction2(addMonths), addYears = js.Any.fromFunction2(addYears), getFirstDayOfMonth = js.Any.fromFunction1(getFirstDayOfMonth), getWeekArray = js.Any.fromFunction2(getWeekArray), getYear = js.Any.fromFunction1(getYear), monthDiff = js.Any.fromFunction2(monthDiff), setYear = js.Any.fromFunction2(setYear))
  
    __obj.asInstanceOf[utils]
  }
}

