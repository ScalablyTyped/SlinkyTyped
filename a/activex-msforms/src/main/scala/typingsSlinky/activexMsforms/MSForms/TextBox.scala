package typingsSlinky.activexMsforms.MSForms

import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBox extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoTab: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: Double = js.native
  var BackStyle: fmBackStyle = js.native
  var BorderColor: Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  var BordersSuppress: Boolean = js.native
  val CanPaste: Boolean = js.native
  var CurLine: Double = js.native
  val CurTargetX: Double = js.native
  val CurTargetY: Double = js.native
  var CurX: Double = js.native
  var CurY: Double = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var DragBehavior: fmDragBehavior = js.native
  var DropButtonStyle: fmDropButtonStyle = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: fmEnterFieldBehavior = js.native
  var EnterKeyBehavior: Boolean = js.native
  var Font: NewFont = js.native
  var FontBold: Boolean = js.native
  var FontItalic: Boolean = js.native
  var FontName: String = js.native
  var FontSize: Double = js.native
  var FontStrikethru: Boolean = js.native
  var FontUnderline: Boolean = js.native
  var FontWeight: Double = js.native
  var ForeColor: Double = js.native
  var HideSelection: Boolean = js.native
  var IMEMode: fmIMEMode = js.native
  var IntegralHeight: Boolean = js.native
  val LineCount: Double = js.native
  var Locked: Boolean = js.native
  @JSName("MSForms.TextBox_typekey")
  var MSFormsDotTextBox_typekey: TextBox = js.native
  var MaxLength: Double = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var MultiLine: Boolean = js.native
  var PasswordChar: String = js.native
  var ScrollBars: fmScrollBars = js.native
  var SelLength: Double = js.native
  var SelStart: Double = js.native
  var SelText: String = js.native
  var SelectionMargin: Boolean = js.native
  var ShowDropButtonWhen: fmShowDropButtonWhen = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var TabKeyBehavior: Boolean = js.native
  var Text: String = js.native
  var TextAlign: fmTextAlign = js.native
  val TextLength: Double = js.native
  val Valid: Boolean = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
  val _Font_Reserved: NewFont = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Paste(): Unit = js.native
}

object TextBox {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoTab: Boolean,
    AutoWordSelect: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BorderColor: Double,
    BorderStyle: fmBorderStyle,
    BordersSuppress: Boolean,
    CanPaste: Boolean,
    Copy: () => Unit,
    CurLine: Double,
    CurTargetX: Double,
    CurTargetY: Double,
    CurX: Double,
    CurY: Double,
    Cut: () => Unit,
    DisplayStyle: fmDisplayStyle,
    DragBehavior: fmDragBehavior,
    DropButtonStyle: fmDropButtonStyle,
    Enabled: Boolean,
    EnterFieldBehavior: fmEnterFieldBehavior,
    EnterKeyBehavior: Boolean,
    Font: NewFont,
    FontBold: Boolean,
    FontItalic: Boolean,
    FontName: String,
    FontSize: Double,
    FontStrikethru: Boolean,
    FontUnderline: Boolean,
    FontWeight: Double,
    ForeColor: Double,
    HideSelection: Boolean,
    IMEMode: fmIMEMode,
    IntegralHeight: Boolean,
    LineCount: Double,
    Locked: Boolean,
    MSFormsDotTextBox_typekey: TextBox,
    MaxLength: Double,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    MultiLine: Boolean,
    PasswordChar: String,
    Paste: () => Unit,
    ScrollBars: fmScrollBars,
    SelLength: Double,
    SelStart: Double,
    SelText: String,
    SelectionMargin: Boolean,
    ShowDropButtonWhen: fmShowDropButtonWhen,
    SpecialEffect: fmSpecialEffect,
    TabKeyBehavior: Boolean,
    Text: String,
    TextAlign: fmTextAlign,
    TextLength: Double,
    Valid: Boolean,
    Value: js.Any,
    WordWrap: Boolean,
    _Font_Reserved: NewFont
  ): TextBox = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoTab = AutoTab.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], BordersSuppress = BordersSuppress.asInstanceOf[js.Any], CanPaste = CanPaste.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), CurLine = CurLine.asInstanceOf[js.Any], CurTargetX = CurTargetX.asInstanceOf[js.Any], CurTargetY = CurTargetY.asInstanceOf[js.Any], CurX = CurX.asInstanceOf[js.Any], CurY = CurY.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), DisplayStyle = DisplayStyle.asInstanceOf[js.Any], DragBehavior = DragBehavior.asInstanceOf[js.Any], DropButtonStyle = DropButtonStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], EnterKeyBehavior = EnterKeyBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], IntegralHeight = IntegralHeight.asInstanceOf[js.Any], LineCount = LineCount.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], PasswordChar = PasswordChar.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), ScrollBars = ScrollBars.asInstanceOf[js.Any], SelLength = SelLength.asInstanceOf[js.Any], SelStart = SelStart.asInstanceOf[js.Any], SelText = SelText.asInstanceOf[js.Any], SelectionMargin = SelectionMargin.asInstanceOf[js.Any], ShowDropButtonWhen = ShowDropButtonWhen.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TabKeyBehavior = TabKeyBehavior.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], TextLength = TextLength.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.TextBox_typekey")(MSFormsDotTextBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBox]
  }
  @scala.inline
  implicit class TextBoxOps[Self <: TextBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoWordSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoWordSelect")(value.asInstanceOf[js.Any])
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
    def withBorderColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderStyle(value: fmBorderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBordersSuppress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BordersSuppress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurTargetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurTargetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurTargetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurTargetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayStyle(value: fmDisplayStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragBehavior(value: fmDragBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DragBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropButtonStyle(value: fmDropButtonStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterFieldBehavior(value: fmEnterFieldBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnterFieldBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterKeyBehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnterKeyBehavior")(value.asInstanceOf[js.Any])
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
    def withHideSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIMEMode(value: fmIMEMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMEMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegralHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegralHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotTextBox_typekey(value: TextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.TextBox_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLength")(value.asInstanceOf[js.Any])
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
    def withMultiLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaste(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Paste")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollBars(value: fmScrollBars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScrollBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDropButtonWhen(value: fmShowDropButtonWhen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowDropButtonWhen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialEffect(value: fmSpecialEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecialEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabKeyBehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabKeyBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: fmTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextLength")(value.asInstanceOf[js.Any])
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

