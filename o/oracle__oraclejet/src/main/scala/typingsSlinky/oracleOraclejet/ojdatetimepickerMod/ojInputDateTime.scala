package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.AnonCancel
import typingsSlinky.oracleOraclejet.AnonFooterLayout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timePicker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timePickerChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputDateTime[SP /* <: ojInputDateTimeSettableProperties */] extends ojInputDate[SP] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDateTime: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDateTime: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTimePickerChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var timePicker: AnonFooterLayout = js.native
  @JSName("translations")
  var translations_ojInputDateTime: AnonCancel = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(`type`: timePickerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_timePicker(property: timePicker): AnonFooterLayout = js.native
  def hideTimePicker(): Unit = js.native
  def setProperties(properties: ojInputDateTimeSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_timePicker(property: timePicker, value: AnonFooterLayout): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonCancel): Unit = js.native
  def showTimePicker(): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojdatetimepicker", "ojInputDateTime")
@js.native
object ojInputDateTime extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

