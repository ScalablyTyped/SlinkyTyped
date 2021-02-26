package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEffectFormat extends StObject {
  
  var Alignment: MsoTextEffectAlignment = js.native
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  var FontBold: MsoTriState = js.native
  
  var FontItalic: MsoTriState = js.native
  
  var FontName: String = js.native
  
  var FontSize: Double = js.native
  
  var KernedPairs: MsoTriState = js.native
  
  var NormalizedHeight: MsoTriState = js.native
  
  @JSName("Office.TextEffectFormat_typekey")
  var OfficeDotTextEffectFormat_typekey: TextEffectFormat = js.native
  
  val Parent: js.Any = js.native
  
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
    OfficeDotTextEffectFormat_typekey: TextEffectFormat,
    Parent: js.Any,
    PresetShape: MsoPresetTextEffectShape,
    PresetTextEffect: MsoPresetTextEffect,
    RotatedChars: MsoTriState,
    Text: String,
    ToggleVerticalText: () => Unit,
    Tracking: Double
  ): TextEffectFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], KernedPairs = KernedPairs.asInstanceOf[js.Any], NormalizedHeight = NormalizedHeight.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetShape = PresetShape.asInstanceOf[js.Any], PresetTextEffect = PresetTextEffect.asInstanceOf[js.Any], RotatedChars = RotatedChars.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], ToggleVerticalText = js.Any.fromFunction0(ToggleVerticalText), Tracking = Tracking.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextEffectFormat_typekey")(OfficeDotTextEffectFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEffectFormat]
  }
  
  @scala.inline
  implicit class TextEffectFormatMutableBuilder[Self <: TextEffectFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: MsoTextEffectAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBold(value: MsoTriState): Self = StObject.set(x, "FontBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontItalic(value: MsoTriState): Self = StObject.set(x, "FontItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernedPairs(value: MsoTriState): Self = StObject.set(x, "KernedPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedHeight(value: MsoTriState): Self = StObject.set(x, "NormalizedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotTextEffectFormat_typekey(value: TextEffectFormat): Self = StObject.set(x, "Office.TextEffectFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetShape(value: MsoPresetTextEffectShape): Self = StObject.set(x, "PresetShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetTextEffect(value: MsoPresetTextEffect): Self = StObject.set(x, "PresetTextEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatedChars(value: MsoTriState): Self = StObject.set(x, "RotatedChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleVerticalText(value: () => Unit): Self = StObject.set(x, "ToggleVerticalText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTracking(value: Double): Self = StObject.set(x, "Tracking", value.asInstanceOf[js.Any])
  }
}
