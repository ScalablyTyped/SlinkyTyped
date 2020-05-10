package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCpuTemperatureInfo extends js.Object {
  var cpuTemperatureInfo: js.UndefOr[js.Array[AnonLabel]] = js.native
  var cpuUtilizationPercentageInfo: js.UndefOr[js.Array[Double]] = js.native
  var reportTime: js.UndefOr[String] = js.native
}

object AnonCpuTemperatureInfo {
  @scala.inline
  def apply(): AnonCpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCpuTemperatureInfo]
  }
  @scala.inline
  implicit class AnonCpuTemperatureInfoOps[Self <: AnonCpuTemperatureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuTemperatureInfo(value: js.Array[AnonLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuTemperatureInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuTemperatureInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuTemperatureInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuUtilizationPercentageInfo(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUtilizationPercentageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuUtilizationPercentageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUtilizationPercentageInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withReportTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTime")(js.undefined)
        ret
    }
  }
  
}

