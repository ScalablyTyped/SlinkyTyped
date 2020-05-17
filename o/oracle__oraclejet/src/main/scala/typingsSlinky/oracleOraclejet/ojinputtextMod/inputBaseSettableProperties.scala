package typingsSlinky.oracleOraclejet.ojinputtextMod

import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.Regexp
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait inputBaseSettableProperties[V, SV, RV] extends editableValueSettableProperties[V, SV, RV] {
  var asyncValidators: js.Array[AsyncValidator[V]] = js.native
  var autocomplete: on | off | String = js.native
  var autofocus: Boolean = js.native
  var placeholder: String = js.native
  val rawValue: RV = js.native
  var readonly: Boolean = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_inputBaseSettableProperties: Regexp = js.native
  var validators: (js.Array[Validator[V] | RegisteredValidator]) | Null = js.native
}

object inputBaseSettableProperties {
  @scala.inline
  def apply[V, SV, RV](
    asyncValidators: js.Array[AsyncValidator[V]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    rawValue: RV,
    readonly: Boolean,
    required: Boolean,
    translations: Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    value: SV
  ): inputBaseSettableProperties[V, SV, RV] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[inputBaseSettableProperties[V, SV, RV]]
  }
  @scala.inline
  implicit class inputBaseSettablePropertiesOps[Self[v, sv, rv] <: inputBaseSettableProperties[v, sv, rv], V, SV, RV] (val x: Self[V, SV, RV]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, SV, RV] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, SV, RV]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, SV, RV]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, SV, RV]) with Other]
    @scala.inline
    def withAsyncValidators(value: js.Array[AsyncValidator[V]]): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutocomplete(value: on | off | String): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawValue(value: RV): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: Regexp): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[Validator[V] | RegisteredValidator]): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatorsNull: Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(null)
        ret
    }
  }
  
}

