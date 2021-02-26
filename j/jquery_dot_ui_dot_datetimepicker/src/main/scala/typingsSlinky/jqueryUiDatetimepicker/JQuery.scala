package typingsSlinky.jqueryUiDatetimepicker

import typingsSlinky.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.formatTime
import typingsSlinky.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.parseDateTime
import typingsSlinky.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.parseTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def datetimepicker(): JQuery = js.native
  def datetimepicker(method: String, methodParameter: js.Any): js.Any = js.native
  def datetimepicker(options: DateTimePickerOptions): JQuery = js.native
  @JSName("datetimepicker")
  def datetimepicker_formatTime(method: formatTime, methodParameter: formatTimeOptions): String = js.native
  @JSName("datetimepicker")
  def datetimepicker_parseDateTime(method: parseDateTime, methodParameter: parseDateTimeOptions): js.Date = js.native
  @JSName("datetimepicker")
  def datetimepicker_parseTime(method: parseTime, methodParameter: parseTimeOptions): Time = js.native
}
