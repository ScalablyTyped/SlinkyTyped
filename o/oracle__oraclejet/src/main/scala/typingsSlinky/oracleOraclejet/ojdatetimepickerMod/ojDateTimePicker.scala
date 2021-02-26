package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.jet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDateTimePicker extends ojInputDateTime[ojDateTimePickerSettableProperties] {
  
  @JSName("keyboardEdit")
  var keyboardEdit_ojDateTimePicker: disabled = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojDateTimePicker: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojDateTimePicker: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("renderMode")
  var renderMode_ojDateTimePicker: jet = js.native
  
  def setProperties(properties: ojDateTimePickerSettablePropertiesLenient): Unit = js.native
}
object ojDateTimePicker {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
