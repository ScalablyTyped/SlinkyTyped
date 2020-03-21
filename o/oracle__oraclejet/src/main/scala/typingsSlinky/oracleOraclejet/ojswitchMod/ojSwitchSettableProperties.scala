package typingsSlinky.oracleOraclejet.ojswitchMod

import typingsSlinky.oracleOraclejet.AnonConverterHint
import typingsSlinky.oracleOraclejet.AnonDefinition
import typingsSlinky.oracleOraclejet.AnonInstruction
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSwitchSettableProperties extends editableValueSettableProperties[Boolean, Boolean, Boolean] {
  var readonly: Boolean
}

object ojSwitchSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    readonly: Boolean,
    valid: valid | pending | invalidHidden | invalidShown,
    value: Boolean,
    describedBy: String = null,
    translations: js.Object = null
  ): ojSwitchSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSwitchSettableProperties]
  }
}

