package typingsSlinky.oracleOraclejet.ojinputtextMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rows
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTextArea
  extends inputBase[js.Any, ojTextAreaSettableProperties, js.Any, js.Any] {
  
  def addEventListener(`type`: rawValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(`type`: converterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(`type`: rowsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_rows(property: rows): Double = js.native
  
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojTextArea: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojTextArea: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRowsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var rows: Double = js.native
  
  def setProperties(properties: ojTextAreaSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows, value: Double): Unit = js.native
}
object ojTextArea {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
