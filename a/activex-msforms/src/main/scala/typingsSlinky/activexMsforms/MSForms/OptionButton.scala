package typingsSlinky.activexMsforms.MSForms

import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionButton extends js.Object {
  var Accelerator: String = js.native
  var Alignment: fmAlignment = js.native
  var AutoSize: Boolean = js.native
  var BackColor: Double = js.native
  var BackStyle: fmBackStyle = js.native
  var BordersSuppress: Boolean = js.native
  var Caption: String = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var Enabled: Boolean = js.native
  var Font: NewFont = js.native
  var FontBold: Boolean = js.native
  var FontItalic: Boolean = js.native
  var FontName: String = js.native
  var FontSize: Double = js.native
  var FontStrikethru: Boolean = js.native
  var FontUnderline: Boolean = js.native
  var FontWeight: Double = js.native
  var ForeColor: Double = js.native
  var GroupName: String = js.native
  var Locked: Boolean = js.native
  @JSName("MSForms.OptionButton_typekey")
  var MSFormsDotOptionButton_typekey: OptionButton = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var MultiSelect: fmMultiSelect = js.native
  var Picture: StdPicture = js.native
  var PicturePosition: fmPicturePosition = js.native
  var SpecialEffect: fmButtonEffect = js.native
  var TextAlign: fmTextAlign = js.native
  var TripleState: Boolean = js.native
  val Valid: Boolean = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
  val _Font_Reserved: NewFont = js.native
}

object OptionButton {
  @scala.inline
  def apply(
    Accelerator: String,
    Alignment: fmAlignment,
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BordersSuppress: Boolean,
    Caption: String,
    DisplayStyle: fmDisplayStyle,
    Enabled: Boolean,
    Font: NewFont,
    FontBold: Boolean,
    FontItalic: Boolean,
    FontName: String,
    FontSize: Double,
    FontStrikethru: Boolean,
    FontUnderline: Boolean,
    FontWeight: Double,
    ForeColor: Double,
    GroupName: String,
    Locked: Boolean,
    MSFormsDotOptionButton_typekey: OptionButton,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    MultiSelect: fmMultiSelect,
    Picture: StdPicture,
    PicturePosition: fmPicturePosition,
    SpecialEffect: fmButtonEffect,
    TextAlign: fmTextAlign,
    TripleState: Boolean,
    Valid: Boolean,
    Value: js.Any,
    WordWrap: Boolean,
    _Font_Reserved: NewFont
  ): OptionButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BordersSuppress = BordersSuppress.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PicturePosition = PicturePosition.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], TripleState = TripleState.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.OptionButton_typekey")(MSFormsDotOptionButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionButton]
  }
  @scala.inline
  implicit class OptionButtonOps[Self <: OptionButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignment(value: fmAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackStyle(value: fmBackStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBordersSuppress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BordersSuppress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayStyle(value: fmDisplayStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: NewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontItalic(value: Boolean): Self = {
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
    def withFontStrikethru(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontStrikethru")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontUnderline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontUnderline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotOptionButton_typekey(value: OptionButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.OptionButton_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseIcon(value: StdPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MouseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousePointer(value: fmMousePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MousePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSelect(value: fmMultiSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicture(value: StdPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicturePosition(value: fmPicturePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PicturePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialEffect(value: fmButtonEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecialEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: fmTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTripleState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TripleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Font_Reserved(value: NewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Font_Reserved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

