package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.AnonChildrenLabel
import typingsSlinky.oracleOraclejet.AnonClass
import typingsSlinky.oracleOraclejet.AnonLabelValue
import typingsSlinky.oracleOraclejet.AnonMoreMatchesFound
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.jet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minimumResultsForSearch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minimumResultsForSearchChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.native
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
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readOnlyChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.renderMode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.renderModeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.required
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueOptions
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueOptionsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSelectMany[K, D]
  extends ojSelect[
      js.Array[js.Any] | Null, 
      ojSelectManySettableProperties[K, D], 
      js.Array[js.Any] | Null
    ] {
  var minimumResultsForSearch: Double = js.native
  var onMinimumResultsForSearchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelectMany: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelectMany: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionsKeysChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReadOnlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRenderModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onValueChanged")
  var onValueChanged_ojSelectMany: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  var options: (js.Array[
    typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  var optionsKeys: AnonChildrenLabel = js.native
  var pickerAttributes: AnonClass = js.native
  var placeholder: String | Null = js.native
  var readOnly: Boolean = js.native
  var renderMode: jet | native = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojSelectMany: AnonMoreMatchesFound = js.native
  var valueOptions: js.Array[AnonLabelValue] | Null = js.native
  @JSName("value")
  var value_ojSelectMany: js.Array[_] | Null = js.native
  def addEventListener(`type`: renderModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minimumResultsForSearchChanged(
    `type`: minimumResultsForSearchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minimumResultsForSearchChanged(
    `type`: minimumResultsForSearchChanged,
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
  def addEventListener_valueOptionsChanged(`type`: valueOptionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionsChanged(
    `type`: valueOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_minimumResultsForSearch(property: minimumResultsForSearch): Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (js.Array[
    typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): AnonChildrenLabel = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): AnonClass = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: readOnly): Boolean = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_valueOptions(property: valueOptions): js.Array[AnonLabelValue] | Null = js.native
  def setProperties(properties: ojSelectManySettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
  def setProperty(property: renderMode, value: native): Unit = js.native
  @JSName("setProperty")
  def setProperty_minimumResultsForSearch(property: minimumResultsForSearch, value: Double): Unit = js.native
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
      typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: AnonChildrenLabel): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: AnonClass): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonMoreMatchesFound): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: js.Array[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: valueOptions): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOptions(property: valueOptions, value: js.Array[AnonLabelValue]): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojselectcombobox", "ojSelectMany")
@js.native
object ojSelectMany extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

