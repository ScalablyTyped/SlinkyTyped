package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.AnonChildren
import typingsSlinky.oracleOraclejet.AnonClass
import typingsSlinky.oracleOraclejet.AnonConverterHint
import typingsSlinky.oracleOraclejet.AnonDefinition
import typingsSlinky.oracleOraclejet.AnonFilterFurther
import typingsSlinky.oracleOraclejet.AnonInstruction
import typingsSlinky.oracleOraclejet.AnonLabelValue
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxOneSettableProperties[K, D]
  extends editableValueSettableProperties[js.Any, js.Any, String] {
  var asyncValidators: js.Array[AsyncValidator[_]]
  var converter: Converter[_] | RegisteredConverter | Null
  var filterOnOpen: none | typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue
  var minLength: Double
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.undefined
  var options: (js.Array[
    typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null
  var optionsKeys: AnonChildren
  var pickerAttributes: AnonClass
  var placeholder: String | Null
  val rawValue: String | Null
  var readOnly: Boolean
  var required: Boolean
  @JSName("translations")
  var translations_ojComboboxOneSettableProperties: AnonFilterFurther
  var validators: (js.Array[Validator[_] | RegisteredValidator]) | Null
  var valueOption: AnonLabelValue
}

object ojComboboxOneSettableProperties {
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[AsyncValidator[_]],
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    filterOnOpen: none | rawValue,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minLength: Double,
    optionsKeys: AnonChildren,
    pickerAttributes: AnonClass,
    readOnly: Boolean,
    required: Boolean,
    translations: AnonFilterFurther,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    valueOption: AnonLabelValue,
    converter: Converter[_] | RegisteredConverter = null,
    describedBy: String = null,
    optionRenderer: /* param0 */ OptionContext => Element = null,
    options: (js.Array[
      typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D]) = null,
    placeholder: String = null,
    rawValue: String = null,
    validators: js.Array[Validator[_] | RegisteredValidator] = null
  ): ojComboboxOneSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], filterOnOpen = filterOnOpen.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueOption = valueOption.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojComboboxOneSettableProperties[K, D]]
  }
}

