package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDeviceActiveTimeRanges extends js.Object {
  var activeTime: js.UndefOr[Double] = js.native
  var date: js.UndefOr[String] = js.native
}

object ChromeOsDeviceActiveTimeRanges {
  @scala.inline
  def apply(): ChromeOsDeviceActiveTimeRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceActiveTimeRanges]
  }
  @scala.inline
  implicit class ChromeOsDeviceActiveTimeRangesOps[Self <: ChromeOsDeviceActiveTimeRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
  }
  
}

