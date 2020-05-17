package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  @JSName("Office.TextEffectFormat_typekey")
  var OfficeDotTextEffectFormat_typekey: TextEffectFormat = js.native
  val Parent: js.Any = js.native
  var PresetShape: MsoPresetTextEffectShape = js.native
  var PresetTextEffect: MsoPresetTextEffect = js.native
  var RotatedChars: MsoTriState = js.native
  var Text: String = js.native
  var Tracking: Double = js.native
  def ToggleVerticalText(): Unit = js.native
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
  implicit class TextEffectFormatOps[Self <: TextEffectFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: MsoTextEffectAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontBold(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontItalic(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernedPairs(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernedPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizedHeight(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NormalizedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotTextEffectFormat_typekey(value: TextEffectFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.TextEffectFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetShape(value: MsoPresetTextEffectShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetTextEffect(value: MsoPresetTextEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetTextEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotatedChars(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotatedChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleVerticalText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToggleVerticalText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTracking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tracking")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

