package typingsSlinky.dojo.dojox.date.hebrew

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/hebrew/numerals.html
  *
  *
  */
@js.native
trait numerals extends js.Object {
  /**
    * converts an integer to a String representing the number in Hebrew numerals.
    * Can be formatted with or without geresh ×³
    *
    * @param day
    * @param nogrsh               Optional
    */
  def getDayHebrewLetters(day: js.Any, nogrsh: Boolean): Unit = js.native
  /**
    * converts an integer representing a  month to a String written in Hebrew numerals
    *
    * @param month
    */
  def getMonthHebrewLetters(month: Double): Unit = js.native
  /**
    * converts the year from an integer to Hebrew numerals.
    *
    * @param year
    */
  def getYearHebrewLetters(year: Double): Unit = js.native
  /**
    * converts the string containing a Hebrew numeral to an integer
    *
    * @param day
    */
  def parseDayHebrewLetters(day: String): Unit = js.native
  /**
    * converts a Hebrew numeral string representing
    * a month to an integer.  The returned value
    * is indexed in the month name array.  To use it for
    * setMonth, do correction for leap year
    *
    * @param monthStr
    */
  def parseMonthHebrewLetters(monthStr: String): Unit = js.native
  /**
    * converts the year written in Hebrew numerals to an integer
    *
    * @param year
    */
  def parseYearHebrewLetters(year: String): Unit = js.native
}

object numerals {
  @scala.inline
  def apply(
    getDayHebrewLetters: (js.Any, Boolean) => Unit,
    getMonthHebrewLetters: Double => Unit,
    getYearHebrewLetters: Double => Unit,
    parseDayHebrewLetters: String => Unit,
    parseMonthHebrewLetters: String => Unit,
    parseYearHebrewLetters: String => Unit
  ): numerals = {
    val __obj = js.Dynamic.literal(getDayHebrewLetters = js.Any.fromFunction2(getDayHebrewLetters), getMonthHebrewLetters = js.Any.fromFunction1(getMonthHebrewLetters), getYearHebrewLetters = js.Any.fromFunction1(getYearHebrewLetters), parseDayHebrewLetters = js.Any.fromFunction1(parseDayHebrewLetters), parseMonthHebrewLetters = js.Any.fromFunction1(parseMonthHebrewLetters), parseYearHebrewLetters = js.Any.fromFunction1(parseYearHebrewLetters))
    __obj.asInstanceOf[numerals]
  }
  @scala.inline
  implicit class numeralsOps[Self <: numerals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDayHebrewLetters(value: (js.Any, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayHebrewLetters")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetMonthHebrewLetters(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonthHebrewLetters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetYearHebrewLetters(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYearHebrewLetters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseDayHebrewLetters(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDayHebrewLetters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseMonthHebrewLetters(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseMonthHebrewLetters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseYearHebrewLetters(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseYearHebrewLetters")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

