package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.ChangeMonth
import typingsSlinky.oracleOraclejet.anon.Class
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.CurrentText
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Disabled
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typingsSlinky.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.jet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatetimepicker.ojDatePickerSettableProperties> */
@js.native
trait ojDatePickerSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[String]]] = js.native
  var autocomplete: js.UndefOr[on | off | String] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var converter: js.UndefOr[Converter[String] | RegisteredConverter] = js.native
  var datePicker: js.UndefOr[ChangeMonth] = js.native
  var dayFormatter: js.UndefOr[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]] = js.native
  var dayMetaData: js.UndefOr[StringDictionary[StringDictionary[StringDictionary[Disabled]]]] = js.native
  var describedBy: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  var help: js.UndefOr[Instruction] = js.native
  var helpHints: js.UndefOr[Definition] = js.native
  var keyboardEdit: js.UndefOr[disabled] = js.native
  var labelHint: js.UndefOr[String] = js.native
  var max: js.UndefOr[String] = js.native
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  var min: js.UndefOr[String] = js.native
  var pickerAttributes: js.UndefOr[Class] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var rawValue: js.UndefOr[String] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var renderMode: js.UndefOr[jet] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[CurrentText] = js.native
  var valid: js.UndefOr[
    typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  var validators: js.UndefOr[js.Array[Validator[String] | RegisteredValidator]] = js.native
  var value: js.UndefOr[String] = js.native
}

object ojDatePickerSettablePropertiesLenient {
  @scala.inline
  def apply(): ojDatePickerSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDatePickerSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojDatePickerSettablePropertiesLenientOps[Self <: ojDatePickerSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncValidators(value: js.Array[AsyncValidator[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocomplete(value: on | off | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withConverter(value: Converter[String] | RegisteredConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePicker(value: ChangeMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withDayFormatter(value: /* param */ DayFormatterInput => Null | all | DayFormatterOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDayFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withDayMetaData(value: StringDictionary[StringDictionary[StringDictionary[Disabled]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayMetaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayMetaData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayMetaData")(js.undefined)
        ret
    }
    @scala.inline
    def withDescribedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayOptions(value: ConverterHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHelp(value: Instruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpHints(value: Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardEdit(value: disabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesCustom(value: js.Array[^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerAttributes(value: Class): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withRawValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMode(value: jet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: CurrentText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: valid | pending | invalidHidden | invalidShown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[Validator[String] | RegisteredValidator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

