package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.OLE_COLOR
import typingsSlinky.activexStdole.stdole.StdFont
import typingsSlinky.activexStdole.stdole.StdPicture
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkDateControl extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BackStyle: OlBackStyle = js.native
  var Date: VarDate = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var HideSelection: Boolean = js.native
  var Locked: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkDateControl_typekey")
  var OutlookDotOlkDateControl_typekey: OlkDateControl = js.native
  var ShowNoneButton: Boolean = js.native
  var Text: String = js.native
  var TextAlign: OlTextAlign = js.native
  var Value: js.Any = js.native
  def DropDown(): Unit = js.native
}

object OlkDateControl {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    Date: VarDate,
    DropDown: () => Unit,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkDateControl_typekey: OlkDateControl,
    ShowNoneButton: Boolean,
    Text: String,
    TextAlign: OlTextAlign,
    Value: js.Any
  ): OlkDateControl = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], DropDown = js.Any.fromFunction0(DropDown), Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], ShowNoneButton = ShowNoneButton.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkDateControl_typekey")(OutlookDotOlkDateControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkDateControl]
  }
  @scala.inline
  implicit class OlkDateControlOps[Self <: OlkDateControl] (val x: Self) extends AnyVal {
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
    def withBackStyle(value: OlBackStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropDown")(js.Any.fromFunction0(value))
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
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
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
    def withOutlookDotOlkDateControl_typekey(value: OlkDateControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkDateControl_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNoneButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNoneButton")(value.asInstanceOf[js.Any])
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
  }
  
}

