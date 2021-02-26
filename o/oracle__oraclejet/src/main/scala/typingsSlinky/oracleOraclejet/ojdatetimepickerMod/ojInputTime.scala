package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.AmpmWheelLabel
import typingsSlinky.oracleOraclejet.anon.Class
import typingsSlinky.oracleOraclejet.anon.FooterLayout
import typingsSlinky.oracleOraclejet.ojinputtextMod.inputBase
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.jet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.keyboardEdit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.keyboardEditChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.max
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.native
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pickerAttributes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pickerAttributesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.renderMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.renderModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timePicker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timePickerChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputTime extends inputBase[String, ojInputTimeSettableProperties, String, String] {
  
  def addEventListener(`type`: keyboardEditChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: keyboardEditChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: renderModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: renderModeChanged,
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
  def addEventListener_maxChanged(`type`: maxChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(`type`: minChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(`type`: timePickerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var converter: Converter[String] | RegisteredConverter = js.native
  
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[String] | RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_keyboardEdit(property: keyboardEdit): enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): String | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): String | Null = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): Class = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  @JSName("getProperty")
  def getProperty_timePicker(property: timePicker): FooterLayout = js.native
  
  def hide(): Unit = js.native
  
  var keyboardEdit: enabled | disabled = js.native
  
  var max: String | Null = js.native
  
  var min: String | Null = js.native
  
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onKeyboardEditChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputTime: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputTime: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPickerAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRenderModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTimePickerChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var pickerAttributes: Class = js.native
  
  var renderMode: jet | native = js.native
  
  def setProperties(properties: ojInputTimeSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: keyboardEdit, value: disabled): Unit = js.native
  def setProperty(property: keyboardEdit, value: enabled): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
  def setProperty(property: renderMode, value: native): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: Class): Unit = js.native
  @JSName("setProperty")
  def setProperty_timePicker(property: timePicker, value: FooterLayout): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AmpmWheelLabel): Unit = js.native
  
  def show(): Unit = js.native
  
  var timePicker: FooterLayout = js.native
  
  @JSName("translations")
  var translations_ojInputTime: AmpmWheelLabel = js.native
}
object ojInputTime {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
