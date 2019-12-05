package typingsSlinky.atOracleOraclejet.ojcolorpaletteMod

import typingsSlinky.atOracleOraclejet.Anon_ColorLabel
import typingsSlinky.atOracleOraclejet.Anon_ConverterHint
import typingsSlinky.atOracleOraclejet.Anon_Definition
import typingsSlinky.atOracleOraclejet.Anon_Instruction
import typingsSlinky.atOracleOraclejet.Anon_LabelNone
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.grid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lg
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.list
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sm
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.xs
import typingsSlinky.atOracleOraclejet.ojcolorMod.^
import typingsSlinky.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojColorPaletteSettableProperties extends editableValueSettableProperties[^, ^, ^] {
  var labelDisplay: auto | off
  var labelledBy: String | Null
  var layout: grid | list
  var palette: js.Array[Anon_ColorLabel]
  var swatchSize: xs | sm | lg
  @JSName("translations")
  var translations_ojColorPaletteSettableProperties: Anon_LabelNone
}

object ojColorPaletteSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelDisplay: auto | off,
    labelHint: String,
    layout: grid | list,
    messagesCustom: js.Array[typingsSlinky.atOracleOraclejet.ojmessagingMod.^],
    palette: js.Array[Anon_ColorLabel],
    swatchSize: xs | sm | lg,
    translations: Anon_LabelNone,
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

