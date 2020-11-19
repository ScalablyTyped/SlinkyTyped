package typingsSlinky.oracleOraclejet.ojinputnumberMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.NumberRange
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asyncValidators
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asyncValidatorsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.autocomplete
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.autocompleteChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.autofocus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.autofocusChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.max
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.placeholder
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readonly_
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.required
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.step
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.text
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.validators
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.validatorsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.virtualKeyboard
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.virtualKeyboardChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputNumber extends editableValue[Double | Null, ojInputNumberSettableProperties, Double | Null, String] {
  
  def addEventListener(`type`: autocompleteChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: autocompleteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: virtualKeyboardChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: virtualKeyboardChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(`type`: asyncValidatorsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(`type`: autofocusChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(
    `type`: autofocusChanged,
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
  def addEventListener_readonlyChanged(`type`: readonlyChanged_, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
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
  def addEventListener_stepChanged(`type`: stepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(
    `type`: stepChanged,
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
  
  var asyncValidators: js.Array[AsyncValidator[Double]] = js.native
  
  var autocomplete: on | off | String = js.native
  
  var converter: Converter[Double] | RegisteredConverter = js.native
  
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[Double]] = js.native
  @JSName("getProperty")
  def getProperty_autocomplete(property: autocomplete): on | off | String = js.native
  @JSName("getProperty")
  def getProperty_autofocus(property: autofocus): Boolean = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[Double] | RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue): String = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean | Null = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): js.Array[Validator[Double] | RegisteredValidator] = js.native
  @JSName("getProperty")
  def getProperty_virtualKeyboard(property: virtualKeyboard): auto | number | text = js.native
  
  var max: Double | Null = js.native
  
  var min: Double | Null = js.native
  
  var onAsyncValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAutocompleteChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onAutofocusChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputNumber: (js.Function1[CustomEvent, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputNumber: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onPlaceholderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRawValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onReadonlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onStepChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onVirtualKeyboardChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var placeholder: String | Null = js.native
  
  val rawValue: String = js.native
  
  var readonly: Boolean | Null = js.native
  
  var required: Boolean = js.native
  
  def setProperties(properties: ojInputNumberSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: autocomplete, value: off): Unit = js.native
  def setProperty(property: autocomplete, value: on): Unit = js.native
  def setProperty(property: virtualKeyboard, value: auto): Unit = js.native
  def setProperty(property: virtualKeyboard, value: number): Unit = js.native
  def setProperty(property: virtualKeyboard, value: text): Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[Double]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_autocomplete(property: autocomplete, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_autofocus(property: autofocus, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[Double]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: NumberRange): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[Double] | RegisteredValidator]): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
  
  var step: Double | Null = js.native
  
  def stepDown(): Unit = js.native
  def stepDown(steps: Double): Unit = js.native
  
  def stepUp(): Unit = js.native
  def stepUp(steps: Double): Unit = js.native
  
  @JSName("translations")
  var translations_ojInputNumber: NumberRange = js.native
  
  def validate(): js.Promise[String] = js.native
  
  var validators: js.Array[Validator[Double] | RegisteredValidator] = js.native
  
  var virtualKeyboard: auto | number | text = js.native
}
@JSImport("@oracle/oraclejet/ojinputnumber", "ojInputNumber")
@js.native
object ojInputNumber extends js.Object {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
