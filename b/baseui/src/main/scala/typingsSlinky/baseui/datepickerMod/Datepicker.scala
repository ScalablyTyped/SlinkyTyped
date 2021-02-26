package typingsSlinky.baseui.datepickerMod

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.baseui.anon.Date
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/datepicker", "Datepicker")
@js.native
class Datepicker protected ()
  extends Component[DatepickerProps, DatepickerState, js.Any] {
  def this(props: DatepickerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: DatepickerProps, context: js.Any) = this()
  
  def close(): Unit = js.native
  
  def focusCalendar(): Unit = js.native
  
  def formatDate(date: js.Array[js.Date], formatString: String): String | js.Array[String] = js.native
  def formatDate(date: js.Date, formatString: String): String | js.Array[String] = js.native
  
  def formatDisplayValue(date: js.Array[js.Date]): String = js.native
  def formatDisplayValue(date: js.Date): String = js.native
  
  def handleEsc(): Unit = js.native
  
  def handleInputBlur(): Unit = js.native
  
  def handleKeyDown(event: KeyboardEvent): Unit = js.native
  
  def onChange(data: Date): Unit = js.native
  
  def open(): Unit = js.native
}
