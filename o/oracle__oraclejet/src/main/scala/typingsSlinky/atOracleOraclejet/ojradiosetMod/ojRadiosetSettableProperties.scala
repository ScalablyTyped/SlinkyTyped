package typingsSlinky.atOracleOraclejet.ojradiosetMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atOracleOraclejet.Anon_ConverterHint
import typingsSlinky.atOracleOraclejet.Anon_Definition
import typingsSlinky.atOracleOraclejet.Anon_Instruction
import typingsSlinky.atOracleOraclejet.Anon_Required
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.atOracleOraclejet.ojmessagingMod.^
import typingsSlinky.atOracleOraclejet.ojradiosetMod.ojRadioset.OptionContext
import typingsSlinky.atOracleOraclejet.ojradiosetMod.ojRadioset.OptionsKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRadiosetSettableProperties[K, D]
  extends editableValueSettableProperties[js.Any, js.Any, js.Any] {
  var labelledBy: String | Null
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
  var options: (DataProvider[K, D]) | Null
  var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
  var required: Boolean
  @JSName("translations")
  var translations_ojRadiosetSettableProperties: Anon_Required
}

object ojRadiosetSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    required: Boolean,
    translations: Anon_Required,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    describedBy: String = null,
    labelledBy: String = null,
    optionRenderer: /* param0 */ OptionContext[D] => Element = null,
    options: DataProvider[K, D] = null,
    optionsKeys: OptionsKeys = null
  ): ojRadiosetSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRadiosetSettableProperties[K, D]]
  }
}

