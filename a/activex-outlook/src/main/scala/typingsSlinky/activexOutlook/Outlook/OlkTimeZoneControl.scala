package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkTimeZoneControl extends js.Object {
  var AppointmentTimeField: OlAppointmentTimeField = js.native
  var BorderStyle: OlBorderStyle = js.native
  var Enabled: Boolean = js.native
  var Locked: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkTimeZoneControl_typekey")
  var OutlookDotOlkTimeZoneControl_typekey: OlkTimeZoneControl = js.native
  var SelectedTimeZoneIndex: Double = js.native
  var Value: js.Any = js.native
  def DropDown(): Unit = js.native
}

object OlkTimeZoneControl {
  @scala.inline
  def apply(
    AppointmentTimeField: OlAppointmentTimeField,
    BorderStyle: OlBorderStyle,
    DropDown: () => Unit,
    Enabled: Boolean,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkTimeZoneControl_typekey: OlkTimeZoneControl,
    SelectedTimeZoneIndex: Double,
    Value: js.Any
  ): OlkTimeZoneControl = {
    val __obj = js.Dynamic.literal(AppointmentTimeField = AppointmentTimeField.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], DropDown = js.Any.fromFunction0(DropDown), Enabled = Enabled.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], SelectedTimeZoneIndex = SelectedTimeZoneIndex.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTimeZoneControl_typekey")(OutlookDotOlkTimeZoneControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTimeZoneControl]
  }
  @scala.inline
  implicit class OlkTimeZoneControlOps[Self <: OlkTimeZoneControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointmentTimeField(value: OlAppointmentTimeField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppointmentTimeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderStyle(value: OlBorderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderStyle")(value.asInstanceOf[js.Any])
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
    def withOutlookDotOlkTimeZoneControl_typekey(value: OlkTimeZoneControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkTimeZoneControl_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedTimeZoneIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedTimeZoneIndex")(value.asInstanceOf[js.Any])
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

