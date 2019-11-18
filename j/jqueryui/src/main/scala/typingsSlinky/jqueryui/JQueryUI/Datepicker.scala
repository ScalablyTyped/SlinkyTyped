package typingsSlinky.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datepicker
  extends Widget
     with DatepickerOptions {
  var regional: StringDictionary[js.Any] = js.native
  def formatDate(format: String, date: Date): String = js.native
  def formatDate(format: String, date: Date, settings: DatepickerFormatDateOptions): String = js.native
  def iso8601Week(date: js.Date): Double = js.native
  def noWeekends(date: js.Date): js.Array[_] = js.native
  def parseDate(format: String, date: String): js.Date = js.native
  def parseDate(format: String, date: String, settings: DatepickerFormatDateOptions): js.Date = js.native
  def setDefaults(defaults: DatepickerOptions): Unit = js.native
}

