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
import typingsSlinky.oracleOraclejet.ojinputtextMod.inputBaseSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.jet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.native
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputDateSettableProperties extends inputBaseSettableProperties[String, String, String] {
  var converter: Converter[String] | RegisteredConverter = js.native
  var datePicker: ChangeMonth = js.native
  var dayMetaData: StringDictionary[StringDictionary[StringDictionary[Disabled]]] = js.native
  var keyboardEdit: enabled | disabled = js.native
  var max: String | Null = js.native
  var min: String | Null = js.native
  var pickerAttributes: Class = js.native
  var renderMode: jet | native = js.native
  @JSName("translations")
  var translations_ojInputDateSettableProperties: CurrentText = js.native
  def dayFormatter(param: DayFormatterInput): Null | all | DayFormatterOutput = js.native
}

object ojInputDateSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[String]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[String] | RegisteredConverter,
    datePicker: ChangeMonth,
    dayFormatter: DayFormatterInput => Null | all | DayFormatterOutput,
    dayMetaData: StringDictionary[StringDictionary[StringDictionary[Disabled]]],
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    keyboardEdit: enabled | disabled,
    labelHint: String,
    messagesCustom: js.Array[^],
    pickerAttributes: Class,
    placeholder: String,
    rawValue: String,
    readonly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    translations: CurrentText,
    valid: valid | pending | invalidHidden | invalidShown,
    value: String
  ): ojInputDateSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], datePicker = datePicker.asInstanceOf[js.Any], dayFormatter = js.Any.fromFunction1(dayFormatter), dayMetaData = dayMetaData.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], keyboardEdit = keyboardEdit.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputDateSettableProperties]
  }
  @scala.inline
  implicit class ojInputDateSettablePropertiesOps[Self <: ojInputDateSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverter(value: Converter[String] | RegisteredConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatePicker(value: ChangeMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayFormatter(value: DayFormatterInput => Null | all | DayFormatterOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDayMetaData(value: StringDictionary[StringDictionary[StringDictionary[Disabled]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayMetaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardEdit(value: enabled | disabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickerAttributes(value: Class): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderMode(value: jet | native): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: CurrentText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(null)
        ret
    }
    @scala.inline
    def withMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(null)
        ret
    }
  }
  
}

