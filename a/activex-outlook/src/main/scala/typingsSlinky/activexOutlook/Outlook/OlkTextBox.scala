package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.OLE_COLOR
import typingsSlinky.activexStdole.stdole.StdFont
import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Outlook TextBox */
@js.native
trait OlkTextBox extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoTab: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BorderStyle: OlBorderStyle = js.native
  var DragBehavior: OlDragBehavior = js.native
  var EnableRichText: Boolean = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  var EnterKeyBehavior: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var HideSelection: Boolean = js.native
  var IntegralHeight: Boolean = js.native
  var Locked: Boolean = js.native
  var MaxLength: Double = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  var MultiLine: Boolean = js.native
  @JSName("Outlook.OlkTextBox_typekey")
  var OutlookDotOlkTextBox_typekey: OlkTextBox = js.native
  var PasswordChar: String = js.native
  var Scrollbars: OlScrollBars = js.native
  var SelLength: Double = js.native
  var SelStart: Double = js.native
  val SelText: String = js.native
  var SelectionMargin: Boolean = js.native
  var TabKeyBehavior: Boolean = js.native
  var Text: String = js.native
  var TextAlign: OlTextAlign = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
  def Clear(): Unit = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Paste(): Unit = js.native
}

object OlkTextBox {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoTab: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BorderStyle: OlBorderStyle,
    Clear: () => Unit,
    Copy: () => Unit,
    Cut: () => Unit,
    DragBehavior: OlDragBehavior,
    EnableRichText: Boolean,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    EnterKeyBehavior: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    IntegralHeight: Boolean,
    Locked: Boolean,
    MaxLength: Double,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    MultiLine: Boolean,
    OutlookDotOlkTextBox_typekey: OlkTextBox,
    PasswordChar: String,
    Paste: () => Unit,
    Scrollbars: OlScrollBars,
    SelLength: Double,
    SelStart: Double,
    SelText: String,
    SelectionMargin: Boolean,
    TabKeyBehavior: Boolean,
    Text: String,
    TextAlign: OlTextAlign,
    Value: js.Any,
    WordWrap: Boolean
  ): OlkTextBox = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoTab = AutoTab.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), DragBehavior = DragBehavior.asInstanceOf[js.Any], EnableRichText = EnableRichText.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], EnterKeyBehavior = EnterKeyBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IntegralHeight = IntegralHeight.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], PasswordChar = PasswordChar.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), Scrollbars = Scrollbars.asInstanceOf[js.Any], SelLength = SelLength.asInstanceOf[js.Any], SelStart = SelStart.asInstanceOf[js.Any], SelText = SelText.asInstanceOf[js.Any], SelectionMargin = SelectionMargin.asInstanceOf[js.Any], TabKeyBehavior = TabKeyBehavior.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTextBox_typekey")(OutlookDotOlkTextBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTextBox]
  }
  @scala.inline
  implicit class OlkTextBoxOps[Self <: OlkTextBox] (val x: Self) extends AnyVal {
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
    def withBackColor(value: OLE_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderStyle(value: OlBorderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDragBehavior(value: OlDragBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DragBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableRichText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableRichText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterFieldBehavior(value: OlEnterFieldBehavior): Self = {
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
    def withFont(value: StdFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeColor(value: OLE_COLOR): Self = {
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
    def withIntegralHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegralHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
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
    def withMousePointer(value: OlMousePointer): Self = {
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
    def withOutlookDotOlkTextBox_typekey(value: OlkTextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkTextBox_typekey")(value.asInstanceOf[js.Any])
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
    def withScrollbars(value: OlScrollBars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scrollbars")(value.asInstanceOf[js.Any])
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
    def withTextAlign(value: OlTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextAlign")(value.asInstanceOf[js.Any])
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
  }
  
}

