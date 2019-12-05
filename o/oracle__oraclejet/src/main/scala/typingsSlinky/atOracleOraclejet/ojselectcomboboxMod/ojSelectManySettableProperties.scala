package typingsSlinky.atOracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.Anon_ChildKeysChildrenLabelValue
import typingsSlinky.atOracleOraclejet.Anon_Class
import typingsSlinky.atOracleOraclejet.Anon_ConverterHint
import typingsSlinky.atOracleOraclejet.Anon_Definition
import typingsSlinky.atOracleOraclejet.Anon_FilterFurtherMoreMatchesFound
import typingsSlinky.atOracleOraclejet.Anon_Instruction
import typingsSlinky.atOracleOraclejet.Anon_LabelValue
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.jet
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.native
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.atOracleOraclejet.ojmessagingMod.^
import typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSelectManySettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any] | Null, js.Array[js.Any] | Null, js.Array[js.Any] | Null] {
  var minimumResultsForSearch: Double
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.undefined
  var options: (js.Array[
    typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null
  var optionsKeys: Anon_ChildKeysChildrenLabelValue
  var pickerAttributes: Anon_Class
  var placeholder: String | Null
  var readOnly: Boolean
  var renderMode: jet | native
  var required: Boolean
  @JSName("translations")
  var translations_ojSelectManySettableProperties: Anon_FilterFurtherMoreMatchesFound
  var valueOptions: js.Array[Anon_LabelValue] | Null
  @JSName("value")
  var value_ojSelectManySettableProperties: js.Array[_] | Null
}

object ojSelectManySettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minimumResultsForSearch: Double,
    optionsKeys: Anon_ChildKeysChildrenLabelValue,
    pickerAttributes: Anon_Class,
    readOnly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    translations: Anon_FilterFurtherMoreMatchesFound,
    valid: valid | pending | invalidHidden | invalidShown,
    describedBy: String = null,
    optionRenderer: /* param0 */ OptionContext => Element = null,
    options: (js.Array[
      typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsSlinky.atOracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]) | (DataProvider[K, D]) = null,
    placeholder: String = null,
    value: js.Array[_] = null,
    valueOptions: js.Array[Anon_LabelValue] = null
  ): ojSelectManySettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minimumResultsForSearch = minimumResultsForSearch.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueOptions != null) __obj.updateDynamic("valueOptions")(valueOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSelectManySettableProperties[K, D]]
  }
}

