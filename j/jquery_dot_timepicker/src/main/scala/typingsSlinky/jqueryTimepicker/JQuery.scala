package typingsSlinky.jqueryTimepicker

import typingsSlinky.jqueryTimepicker.jqueryTimepickerStrings.getHour
import typingsSlinky.jqueryTimepicker.jqueryTimepickerStrings.getMinute
import typingsSlinky.jqueryTimepicker.jqueryTimepickerStrings.getTime
import typingsSlinky.jqueryTimepicker.jqueryTimepickerStrings.getTimeAsDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def timepicker(): JQuery = js.native
  def timepicker(methodName: String): js.Any = js.native
  def timepicker(methodName: String, methodParameter: js.Any): js.Any = js.native
  def timepicker(optionLiteral: String, optionName: String): js.Any = js.native
  def timepicker(options: TimePickerOptions): JQuery = js.native
  @JSName("timepicker")
  def timepicker_getHour(methodName: getHour): Double = js.native
  @JSName("timepicker")
  def timepicker_getMinute(methodName: getMinute): Double = js.native
  @JSName("timepicker")
  def timepicker_getTime(methodName: getTime): String = js.native
  @JSName("timepicker")
  def timepicker_getTimeAsDate(methodName: getTimeAsDate): js.Date = js.native
}

