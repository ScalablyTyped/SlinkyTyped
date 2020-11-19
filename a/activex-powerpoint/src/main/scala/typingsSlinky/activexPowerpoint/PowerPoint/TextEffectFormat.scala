package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoPresetTextEffect
import typingsSlinky.activexOffice.Office.MsoPresetTextEffectShape
import typingsSlinky.activexOffice.Office.MsoTextEffectAlignment
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEffectFormat extends js.Object {
  
  var Alignment: MsoTextEffectAlignment = js.native
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  var FontBold: MsoTriState = js.native
  
  var FontItalic: MsoTriState = js.native
  
  var FontName: String = js.native
  
  var FontSize: Double = js.native
  
  var KernedPairs: MsoTriState = js.native
  
  var NormalizedHeight: MsoTriState = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextEffectFormat_typekey")
  var PowerPointDotTextEffectFormat_typekey: TextEffectFormat = js.native
  
  var PresetShape: MsoPresetTextEffectShape = js.native
  
  var PresetTextEffect: MsoPresetTextEffect = js.native
  
  var RotatedChars: MsoTriState = js.native
  
  var Text: String = js.native
  
  def ToggleVerticalText(): Unit = js.native
  
  var Tracking: Double = js.native
}
object TextEffectFormat {
  
  @scala.inline
  def apply(
    Alignment: MsoTextEffectAlignment,
    Application: js.Any,
    Creator: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    FontName: String,
    FontSize: Double,
    KernedPairs: MsoTriState,
    NormalizedHeight: MsoTriState,
    Parent: js.Any,
    PowerPointDotTextEffectFormat_typekey: TextEffectFormat,
    PresetShape: MsoPresetTextEffectShape,
    PresetTextEffect: MsoPresetTextEffect,
    RotatedChars: MsoTriState,
    Text: String,
    ToggleVerticalText: () => Unit,
    Tracking: Double
  ): TextEffectFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], KernedPairs = KernedPairs.asInstanceOf[js.Any], NormalizedHeight = NormalizedHeight.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetShape = PresetShape.asInstanceOf[js.Any], PresetTextEffect = PresetTextEffect.asInstanceOf[js.Any], RotatedChars = RotatedChars.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], ToggleVerticalText = js.Any.fromFunction0(ToggleVerticalText), Tracking = Tracking.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextEffectFormat_typekey")(PowerPointDotTextEffectFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEffectFormat]
  }
  
  @scala.inline
  implicit class TextEffectFormatOps[Self <: TextEffectFormat] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: MsoTextEffectAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBold(value: MsoTriState): Self = this.set("FontBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontItalic(value: MsoTriState): Self = this.set("FontItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontName(value: String): Self = this.set("FontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernedPairs(value: MsoTriState): Self = this.set("KernedPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedHeight(value: MsoTriState): Self = this.set("NormalizedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextEffectFormat_typekey(value: TextEffectFormat): Self = this.set("PowerPoint.TextEffectFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetShape(value: MsoPresetTextEffectShape): Self = this.set("PresetShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetTextEffect(value: MsoPresetTextEffect): Self = this.set("PresetTextEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatedChars(value: MsoTriState): Self = this.set("RotatedChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleVerticalText(value: () => Unit): Self = this.set("ToggleVerticalText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTracking(value: Double): Self = this.set("Tracking", value.asInstanceOf[js.Any])
  }
}
