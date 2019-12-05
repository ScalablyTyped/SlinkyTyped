package typingsSlinky.atOracleOraclejet.ojinputnumberMod

import typingsSlinky.atOracleOraclejet.Anon_ConverterHint
import typingsSlinky.atOracleOraclejet.Anon_Definition
import typingsSlinky.atOracleOraclejet.Anon_Instruction
import typingsSlinky.atOracleOraclejet.Anon_NumberRange
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.number
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.text
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid
import typingsSlinky.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.atOracleOraclejet.ojmessagingMod.^
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredConverter
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredValidator
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputNumberSettableProperties extends editableValueSettableProperties[Double | Null, Double | Null, String] {
  var asyncValidators: js.Array[AsyncValidator[Double]]
  var autocomplete: on | off | String
  var autofocus: Boolean
  var converter: Converter[Double] | RegisteredConverter
  var max: Double | Null
  var min: Double | Null
  var placeholder: String | Null
  val rawValue: String
  var readonly: Boolean | Null
  var required: Boolean
  var step: Double | Null
  @JSName("translations")
  var translations_ojInputNumberSettableProperties: Anon_NumberRange
  var validators: js.Array[Validator[Double] | RegisteredValidator]
  var virtualKeyboard: auto | number | text
}

object ojInputNumberSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[Double]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[Double] | RegisteredConverter,
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    rawValue: String,
    required: Boolean,
    translations: Anon_NumberRange,
    valid: valid | pending | invalidHidden | invalidShown,
    validators: js.Array[Validator[Double] | RegisteredValidator],
    virtualKeyboard: auto | number | text,
    describedBy: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    value: Int | Double = null
  ): ojInputNumberSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputNumberSettableProperties]
  }
}

