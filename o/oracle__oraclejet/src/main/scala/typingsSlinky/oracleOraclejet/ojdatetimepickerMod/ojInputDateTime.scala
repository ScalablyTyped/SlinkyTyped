package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.Cancel
import typingsSlinky.oracleOraclejet.anon.FooterLayout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timePicker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timePickerChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputDateTime[SP /* <: ojInputDateTimeSettableProperties */] extends ojInputDate[SP] {
  
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(`type`: timePickerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSName("getProperty")
  def getProperty_timePicker(property: timePicker): FooterLayout = js.native
  
  def hideTimePicker(): Unit = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDateTime: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDateTime: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTimePickerChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  def setProperties(properties: ojInputDateTimeSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_timePicker(property: timePicker, value: FooterLayout): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Cancel): Unit = js.native
  
  def showTimePicker(): Unit = js.native
  
  var timePicker: FooterLayout = js.native
  
  @JSName("translations")
  var translations_ojInputDateTime: Cancel = js.native
}
@JSImport("@oracle/oraclejet/ojdatetimepicker", "ojInputDateTime")
@js.native
object ojInputDateTime extends js.Object {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
