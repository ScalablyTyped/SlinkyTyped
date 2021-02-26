package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.Children
import typingsSlinky.oracleOraclejet.anon.Class
import typingsSlinky.oracleOraclejet.anon.FilterFurther
import typingsSlinky.oracleOraclejet.anon.LabelValue
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asyncValidators
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asyncValidatorsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minLength
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minLengthChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.optionRenderer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.optionRendererChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.options
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.optionsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.optionsKeys
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.optionsKeysChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pickerAttributes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pickerAttributesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.placeholder
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readOnlyChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.required
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.validators
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.validatorsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueOptions
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueOptionsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojComboboxMany[K, D]
  extends ojCombobox[
      js.Array[js.Any] | Null, 
      ojComboboxManySettableProperties[K, D], 
      js.Array[js.Any] | Null, 
      String
    ] {
  
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(`type`: asyncValidatorsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
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
  def addEventListener_minLengthChanged(`type`: minLengthChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: minLengthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(`type`: optionRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(`type`: optionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(`type`: optionsKeysChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
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
  def addEventListener_placeholderChanged(`type`: placeholderChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(`type`: rawValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(`type`: readOnlyChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: readOnlyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(`type`: requiredChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(`type`: validatorsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionsChanged(`type`: valueOptionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionsChanged(
    `type`: valueOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var asyncValidators: js.Array[AsyncValidator[js.Array[_]]] = js.native
  
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[js.Array[_]]] = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_minLength(property: minLength): Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (js.Array[
    typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): Children = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): Class = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue): String | Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: readOnly): Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): (js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null = js.native
  @JSName("getProperty")
  def getProperty_valueOptions(property: valueOptions): js.Array[LabelValue] | Null = js.native
  
  var minLength: Double = js.native
  
  var onAsyncValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMinLengthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojComboboxMany: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojComboboxMany: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOptionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOptionsKeysChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPickerAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPlaceholderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRawValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onReadOnlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onValueChanged")
  var onValueChanged_ojComboboxMany: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onValueOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  
  var options: (js.Array[
    typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  
  var optionsKeys: Children = js.native
  
  var pickerAttributes: Class = js.native
  
  var placeholder: String | Null = js.native
  
  val rawValue: String | Null = js.native
  
  var readOnly: Boolean = js.native
  
  var required: Boolean = js.native
  
  def setProperties(properties: ojComboboxManySettablePropertiesLenient[K, D]): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[js.Array[_]]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_minLength(property: minLength, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer, value: js.Function1[/* param0 */ OptionContext, Element]): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(
    property: options,
    value: js.Array[
      typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: Children): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: Class): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: FilterFurther): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[js.Array[_]] | RegisteredValidator]): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: js.Array[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: valueOptions): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: valueOptions, value: js.Array[LabelValue]): Unit = js.native
  
  @JSName("translations")
  var translations_ojComboboxMany: FilterFurther = js.native
  
  var validators: (js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null = js.native
  
  var valueOptions: js.Array[LabelValue] | Null = js.native
  
  @JSName("value")
  var value_ojComboboxMany: js.Array[_] | Null = js.native
}
object ojComboboxMany {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
