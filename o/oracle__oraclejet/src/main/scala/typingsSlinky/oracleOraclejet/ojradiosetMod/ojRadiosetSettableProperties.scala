package typingsSlinky.oracleOraclejet.ojradiosetMod

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.AnonConverterHint
import typingsSlinky.oracleOraclejet.AnonDefinition
import typingsSlinky.oracleOraclejet.AnonInstruction
import typingsSlinky.oracleOraclejet.AnonRequired
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojradiosetMod.ojRadioset.OptionContext
import typingsSlinky.oracleOraclejet.ojradiosetMod.ojRadioset.OptionsKeys
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
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
  var translations_ojRadiosetSettableProperties: AnonRequired
}

object ojRadiosetSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    required: Boolean,
    translations: AnonRequired,
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

