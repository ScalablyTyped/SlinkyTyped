package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.Children
import typingsSlinky.oracleOraclejet.anon.Class
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.FilterFurther
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.LabelValue
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
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojComboboxManySettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any] | Null, js.Array[js.Any] | Null, String] {
  var asyncValidators: js.Array[AsyncValidator[js.Array[_]]] = js.native
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  var minLength: Double = js.native
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
  @JSName("translations")
  var translations_ojComboboxManySettableProperties: FilterFurther = js.native
  var validators: (js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null = js.native
  var valueOptions: js.Array[LabelValue] | Null = js.native
  @JSName("value")
  var value_ojComboboxManySettableProperties: js.Array[_] | Null = js.native
}

object ojComboboxManySettableProperties {
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[AsyncValidator[js.Array[_]]],
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minLength: Double,
    optionsKeys: Children,
    pickerAttributes: Class,
    readOnly: Boolean,
    required: Boolean,
    translations: FilterFurther,
    valid: valid | pending | invalidHidden | invalidShown
  ): ojComboboxManySettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojComboboxManySettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojComboboxManySettablePropertiesOps[Self[k, d] <: ojComboboxManySettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAsyncValidators(value: js.Array[AsyncValidator[js.Array[_]]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsKeys(value: Children): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickerAttributes(value: Class): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: FilterFurther): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConverter(value: Converter[_] | RegisteredConverter): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConverterNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(null)
        ret
    }
    @scala.inline
    def withOptionRenderer(value: /* param0 */ OptionContext => Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOptionRenderer: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionRendererNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionRenderer")(null)
        ret
    }
    @scala.inline
    def withOptions(
      value: (js.Array[
          typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
        ]) | (DataProvider[K, D])
    ): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(null)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(null)
        ret
    }
    @scala.inline
    def withRawValue(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawValueNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(null)
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[Validator[js.Array[_]] | RegisteredValidator]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatorsNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(null)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[_]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
    @scala.inline
    def withValueOptions(value: js.Array[LabelValue]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueOptionsNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOptions")(null)
        ret
    }
  }
  
}

