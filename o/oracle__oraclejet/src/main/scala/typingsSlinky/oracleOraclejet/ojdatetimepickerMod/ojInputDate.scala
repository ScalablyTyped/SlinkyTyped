package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.ChangeMonth
import typingsSlinky.oracleOraclejet.anon.Class
import typingsSlinky.oracleOraclejet.anon.CurrentText
import typingsSlinky.oracleOraclejet.anon.Disabled
import typingsSlinky.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typingsSlinky.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typingsSlinky.oracleOraclejet.ojinputtextMod.inputBase
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.datePicker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.datePickerChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dayFormatterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dayMetaData
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dayMetaDataChanged
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
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputDate[SP /* <: ojInputDateSettableProperties */] extends inputBase[String, SP, String, String] {
  
  def addEventListener(`type`: dayFormatterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: dayFormatterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
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
  def addEventListener_datePickerChanged(`type`: datePickerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datePickerChanged(
    `type`: datePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(`type`: dayMetaDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(
    `type`: dayMetaDataChanged,
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
  
  var converter: Converter[String] | RegisteredConverter = js.native
  
  var datePicker: ChangeMonth = js.native
  
  def dayFormatter(param: DayFormatterInput): Null | all | DayFormatterOutput = js.native
  
  var dayMetaData: StringDictionary[StringDictionary[StringDictionary[Disabled]]] = js.native
  
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[String] | RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_datePicker(property: datePicker): ChangeMonth = js.native
  @JSName("getProperty")
  def getProperty_dayMetaData(property: dayMetaData): StringDictionary[StringDictionary[StringDictionary[Disabled]]] = js.native
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
  
  def hide(): Unit = js.native
  
  var keyboardEdit: enabled | disabled = js.native
  
  var max: String | Null = js.native
  
  var min: String | Null = js.native
  
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDatePickerChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDayFormatterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onDayMetaDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onKeyboardEditChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDate: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDate: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPickerAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRenderModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var pickerAttributes: Class = js.native
  
  var renderMode: jet | native = js.native
  
  def setProperties(properties: ojInputDateSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: keyboardEdit, value: disabled): Unit = js.native
  def setProperty(property: keyboardEdit, value: enabled): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
  def setProperty(property: renderMode, value: native): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_datePicker(property: datePicker, value: ChangeMonth): Unit = js.native
  @JSName("setProperty")
  def setProperty_dayMetaData(property: dayMetaData, value: StringDictionary[StringDictionary[StringDictionary[Disabled]]]): Unit = js.native
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
  def setProperty_translations(property: translations, value: CurrentText): Unit = js.native
  
  def show(): Unit = js.native
  
  @JSName("translations")
  var translations_ojInputDate: CurrentText = js.native
}
object ojInputDate {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait DayFormatterInput extends StObject {
    
    var date: Double = js.native
    
    var fullYear: Double = js.native
    
    var month: Double = js.native
  }
  object DayFormatterInput {
    
    @scala.inline
    def apply(date: Double, fullYear: Double, month: Double): DayFormatterInput = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], fullYear = fullYear.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayFormatterInput]
    }
    
    @scala.inline
    implicit class DayFormatterInputMutableBuilder[Self <: DayFormatterInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullYear(value: Double): Self = StObject.set(x, "fullYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait DayFormatterOutput extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var tooltip: js.UndefOr[String] = js.native
  }
  object DayFormatterOutput {
    
    @scala.inline
    def apply(): DayFormatterOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayFormatterOutput]
    }
    
    @scala.inline
    implicit class DayFormatterOutputMutableBuilder[Self <: DayFormatterOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
