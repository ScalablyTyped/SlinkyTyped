package typingsSlinky.ejWebAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeDrillDown extends js.Object {
  /** After choosing the time, the popup will close automatically if we set it as true, otherwise we focus out the DateTimePicker or choose timeNow button for closing the popup.
    */
  var autoClose: js.UndefOr[Boolean] = js.native
  /** This is the field to show/hide the timeDrillDown in DateTimePicker.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Sets the interval time of minutes on selected date.
    */
  var interval: js.UndefOr[Double] = js.native
  /** Allows the user to show or hide the meridian with time in DateTimePicker.
    */
  var showMeridian: js.UndefOr[Boolean] = js.native
}

object TimeDrillDown {
  @scala.inline
  def apply(): TimeDrillDown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeDrillDown]
  }
  @scala.inline
  implicit class TimeDrillDownOps[Self <: TimeDrillDown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMeridian(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeridian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMeridian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeridian")(js.undefined)
        ret
    }
  }
  
}

