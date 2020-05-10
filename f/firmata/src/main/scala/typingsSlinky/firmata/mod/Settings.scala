package typingsSlinky.firmata.mod

import typingsSlinky.firmata.AnonBaudRate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var reportVersionTimeout: Double = js.native
  var samplingInterval: Double = js.native
  var serialport: AnonBaudRate = js.native
}

object Settings {
  @scala.inline
  def apply(reportVersionTimeout: Double, samplingInterval: Double, serialport: AnonBaudRate): Settings = {
    val __obj = js.Dynamic.literal(reportVersionTimeout = reportVersionTimeout.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any], serialport = serialport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportVersionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportVersionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamplingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialport(value: AnonBaudRate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

