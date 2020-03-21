package typingsSlinky.oracleOraclejet.ojcolorpaletteMod

import typingsSlinky.oracleOraclejet.AnonConverterHint
import typingsSlinky.oracleOraclejet.AnonDefinition
import typingsSlinky.oracleOraclejet.AnonInstruction
import typingsSlinky.oracleOraclejet.AnonLabel
import typingsSlinky.oracleOraclejet.AnonLabelNone
import typingsSlinky.oracleOraclejet.ojcolorMod.^
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.grid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lg
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.list
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sm
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojColorPaletteSettableProperties extends editableValueSettableProperties[^, ^, ^] {
  var labelDisplay: auto | off
  var labelledBy: String | Null
  var layout: grid | list
  var palette: js.Array[AnonLabel]
  var swatchSize: xs | sm | lg
  @JSName("translations")
  var translations_ojColorPaletteSettableProperties: AnonLabelNone
}

object ojColorPaletteSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelDisplay: auto | off,
    labelHint: String,
    layout: grid | list,
    messagesCustom: js.Array[typingsSlinky.oracleOraclejet.ojmessagingMod.^],
    palette: js.Array[AnonLabel],
    swatchSize: xs | sm | lg,
    translations: AnonLabelNone,
    valid: valid | pending | invalidHidden | invalidShown,
    value: ^,
    describedBy: String = null,
    labelledBy: String = null
  ): ojColorPaletteSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], swatchSize = swatchSize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojColorPaletteSettableProperties]
  }
}

