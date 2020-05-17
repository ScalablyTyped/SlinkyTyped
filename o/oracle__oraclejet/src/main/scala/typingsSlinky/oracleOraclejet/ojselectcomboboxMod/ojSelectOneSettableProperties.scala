package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.ChildrenLabel
import typingsSlinky.oracleOraclejet.anon.Class
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.LabelValue
import typingsSlinky.oracleOraclejet.anon.MoreMatchesFound
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.jet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.native
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSelectOneSettableProperties[K, D]
  extends editableValueSettableProperties[js.Any, js.Any, js.Any] {
  var minimumResultsForSearch: Double = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  var options: (js.Array[
    typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  var optionsKeys: ChildrenLabel = js.native
  var pickerAttributes: Class = js.native
  var placeholder: String | Null = js.native
  var readOnly: Boolean = js.native
  var renderMode: jet | native = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojSelectOneSettableProperties: MoreMatchesFound = js.native
  var valueOption: LabelValue = js.native
}

object ojSelectOneSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minimumResultsForSearch: Double,
    optionsKeys: ChildrenLabel,
    pickerAttributes: Class,
    readOnly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    translations: MoreMatchesFound,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    valueOption: LabelValue
  ): ojSelectOneSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minimumResultsForSearch = minimumResultsForSearch.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueOption = valueOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSelectOneSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojSelectOneSettablePropertiesOps[Self[k, d] <: ojSelectOneSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withMinimumResultsForSearch(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumResultsForSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsKeys(value: ChildrenLabel): Self[K, D] = {
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
    def withRenderMode(value: jet | native): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: MoreMatchesFound): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueOption(value: LabelValue): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOption")(value.asInstanceOf[js.Any])
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
          typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
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
  }
  
}

