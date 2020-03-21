package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.jet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDatePicker extends ojInputDate[ojDatePickerSettableProperties] {
  @JSName("keyboardEdit")
  var keyboardEdit_ojDatePicker: disabled = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojDatePicker: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojDatePicker: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("renderMode")
  var renderMode_ojDatePicker: jet = js.native
  def setProperties(properties: ojDatePickerSettablePropertiesLenient): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojdatetimepicker", "ojDatePicker")
@js.native
object ojDatePicker extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

