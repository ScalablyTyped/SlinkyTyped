package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.OLE_COLOR
import typingsSlinky.activexStdole.stdole.StdFont
import typingsSlinky.activexStdole.stdole.StdPicture
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkTimeControl extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BackStyle: OlBackStyle = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var HideSelection: Boolean = js.native
  var IntervalTime: VarDate = js.native
  var Locked: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkTimeControl_typekey")
  var OutlookDotOlkTimeControl_typekey: OlkTimeControl = js.native
  var ReferenceTime: VarDate = js.native
  var Style: OlTimeStyle = js.native
  var Text: String = js.native
  var TextAlign: OlTextAlign = js.native
  var Time: VarDate = js.native
  var Value: js.Any = js.native
  def DropDown(): Unit = js.native
}

object OlkTimeControl {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    DropDown: () => Unit,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    IntervalTime: VarDate,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkTimeControl_typekey: OlkTimeControl,
    ReferenceTime: VarDate,
    Style: OlTimeStyle,
    Text: String,
    TextAlign: OlTextAlign,
    Time: VarDate,
    Value: js.Any
  ): OlkTimeControl = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], DropDown = js.Any.fromFunction0(DropDown), Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IntervalTime = IntervalTime.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], ReferenceTime = ReferenceTime.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTimeControl_typekey")(OutlookDotOlkTimeControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTimeControl]
  }
  @scala.inline
  implicit class OlkTimeControlOps[Self <: OlkTimeControl] (val x: Self) extends AnyVal {
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
    def withIntervalTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntervalTime")(value.asInstanceOf[js.Any])
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
    def withOutlookDotOlkTimeControl_typekey(value: OlkTimeControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkTimeControl_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: OlTimeStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
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
    def withTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
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

