package typingsSlinky.oracleOraclejet.ojcheckboxsetMod

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.Required
import typingsSlinky.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionContext
import typingsSlinky.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionsKeys
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCheckboxsetSettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any], js.Array[js.Any], js.Array[js.Any]] {
  var labelledBy: String | Null
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
  var options: (DataProvider[K, D]) | Null
  var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
  var required: Boolean
  @JSName("translations")
  var translations_ojCheckboxsetSettableProperties: Required
  @JSName("value")
  var value_ojCheckboxsetSettableProperties: js.Array[_]
}

object ojCheckboxsetSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    required: Boolean,
    translations: Required,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Array[_],
    describedBy: String = null,
    labelledBy: String = null,
    optionRenderer: js.UndefOr[Null | (/* param0 */ OptionContext[D] => Element)] = js.undefined,
    options: DataProvider[K, D] = null,
    optionsKeys: OptionsKeys = null
  ): ojCheckboxsetSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], labelledBy = labelledBy.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(optionRenderer)) __obj.updateDynamic("optionRenderer")(if (optionRenderer != null) js.Any.fromFunction1(optionRenderer.asInstanceOf[/* param0 */ OptionContext[D] => Element]) else null)
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojCheckboxsetSettableProperties[K, D]]
  }
}

