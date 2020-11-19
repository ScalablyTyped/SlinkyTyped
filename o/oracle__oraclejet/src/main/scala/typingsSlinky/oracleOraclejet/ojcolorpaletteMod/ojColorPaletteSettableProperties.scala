package typingsSlinky.oracleOraclejet.ojcolorpaletteMod

import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.Label
import typingsSlinky.oracleOraclejet.anon.LabelNone
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojColorPaletteSettableProperties extends editableValueSettableProperties[^, ^, ^] {
  
  var labelDisplay: auto | off = js.native
  
  var labelledBy: String | Null = js.native
  
  var layout: grid | list = js.native
  
  var palette: js.Array[Label] = js.native
  
  var swatchSize: xs | sm | lg = js.native
  
  @JSName("translations")
  var translations_ojColorPaletteSettableProperties: LabelNone = js.native
}
object ojColorPaletteSettableProperties {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelDisplay: auto | off,
    labelHint: String,
    layout: grid | list,
    messagesCustom: js.Array[typingsSlinky.oracleOraclejet.ojmessagingMod.^],
    palette: js.Array[Label],
    swatchSize: xs | sm | lg,
    translations: LabelNone,
    valid: valid | pending | invalidHidden | invalidShown,
    value: ^
  ): ojColorPaletteSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], swatchSize = swatchSize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojColorPaletteSettableProperties]
  }
  
  @scala.inline
  implicit class ojColorPaletteSettablePropertiesOps[Self <: ojColorPaletteSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabelDisplay(value: auto | off): Self = this.set("labelDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: grid | list): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteVarargs(value: Label*): Self = this.set("palette", js.Array(value :_*))
    
    @scala.inline
    def setPalette(value: js.Array[Label]): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwatchSize(value: xs | sm | lg): Self = this.set("swatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: LabelNone): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelledBy(value: String): Self = this.set("labelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelledByNull: Self = this.set("labelledBy", null)
  }
}
