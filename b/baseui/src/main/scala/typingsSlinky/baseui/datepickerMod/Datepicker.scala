package typingsSlinky.baseui.datepickerMod

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.baseui.AnonDate
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "Datepicker")
@js.native
class Datepicker ()
  extends Component[DatepickerProps, DatepickerState, js.Any] {
  def close(): Unit = js.native
  def focusCalendar(): Unit = js.native
  def formatDate(date: js.Array[js.Date], formatString: String): String | js.Array[String] = js.native
  def formatDate(date: js.Date, formatString: String): String | js.Array[String] = js.native
  def formatDisplayValue(date: js.Array[js.Date]): String = js.native
  def formatDisplayValue(date: js.Date): String = js.native
  def handleEsc(): Unit = js.native
  def handleInputBlur(): Unit = js.native
  def handleKeyDown(event: KeyboardEvent): Unit = js.native
  def onChange(data: AnonDate): Unit = js.native
  def open(): Unit = js.native
}

