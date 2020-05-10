package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo extends js.Object {
  var label: js.UndefOr[String] = js.native
  var temperature: js.UndefOr[Double] = js.native
}

object ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo {
  @scala.inline
  def apply(): ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo]
  }
  @scala.inline
  implicit class ChromeOsDeviceCpuStatusReportsCpuTemperatureInfoOps[Self <: ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withTemperature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemperature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temperature")(js.undefined)
        ret
    }
  }
  
}

