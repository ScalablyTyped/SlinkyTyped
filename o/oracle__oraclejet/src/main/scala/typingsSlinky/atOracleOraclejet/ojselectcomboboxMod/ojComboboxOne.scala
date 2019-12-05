package typingsSlinky.atOracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.Anon_ChildKeysChildren
import typingsSlinky.atOracleOraclejet.Anon_Class
import typingsSlinky.atOracleOraclejet.Anon_FilterFurther
import typingsSlinky.atOracleOraclejet.Anon_LabelValue
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asyncValidators
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.asyncValidatorsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.converter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.converterChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.filterOnOpen
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.filterOnOpenChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.minLength
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.minLengthChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojValueUpdated
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.optionRenderer
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.optionRendererChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.options
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.optionsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.optionsKeys
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.optionsKeysChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pickerAttributes
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pickerAttributesChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.placeholder
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.placeholderChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValueChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.readOnly
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.readOnlyChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.required
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.requiredChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.validators
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.validatorsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueOption
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueOptionChanged
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredConverter
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredValidator
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojComboboxOne[K, D]
  extends ojCombobox[js.Any, ojComboboxOneSettableProperties[K, D], js.Any, String] {
  var asyncValidators: js.Array[AsyncValidator[_]] = js.native
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  var filterOnOpen: none | typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValue = js.native
  var minLength: Double = js.native
  var onAsyncValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFilterOnOpenChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinLengthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojComboboxOne: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojComboboxOne: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjValueUpdated: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionsKeysChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRawValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReadOnlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueOptionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  var options: (js.Array[
    typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  var optionsKeys: Anon_ChildKeysChildren = js.native
  var pickerAttributes: Anon_Class = js.native
  var placeholder: String | Null = js.native
  val rawValue: String | Null = js.native
  var readOnly: Boolean = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojComboboxOne: Anon_FilterFurther = js.native
  var validators: (js.Array[Validator[_] | RegisteredValidator]) | Null = js.native
  var valueOption: Anon_LabelValue = js.native
  def addEventListener(
    `type`: filterOnOpenChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValue], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: filterOnOpenChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValue], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojComboboxOne<K, D>['value'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojComboboxOne<K, D>['value'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: minLengthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: minLengthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojValueUpdated(
    `type`: ojValueUpdated,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojValueUpdated(
    `type`: ojValueUpdated,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: readOnlyChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: readOnlyChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionChanged(
    `type`: valueOptionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionChanged(
    `type`: valueOptionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[_]] = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_filterOnOpen(property: filterOnOpen): none | typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValue = js.native
  @JSName("getProperty")
  def getProperty_minLength(property: minLength): Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (js.Array[
    typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): Anon_ChildKeysChildren = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): Anon_Class = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValue): String | Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: readOnly): Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): (js.Array[Validator[_] | RegisteredValidator]) | Null = js.native
  @JSName("getProperty")
  def getProperty_valueOption(property: valueOption): Anon_LabelValue = js.native
  def setProperties(properties: ojComboboxOneSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: filterOnOpen, value: none): Unit = js.native
  def setProperty(property: filterOnOpen, value: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[_]]): Unit = js.native
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
      typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: Anon_ChildKeysChildren): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: Anon_Class): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_FilterFurther): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[_] | RegisteredValidator]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOption(property: valueOption, value: Anon_LabelValue): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojselectcombobox", "ojComboboxOne")
@js.native
object ojComboboxOne extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
  type ojValueUpdated = CustomEvent
}

