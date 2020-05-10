package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hardware status. Temperatures may be compared to the temperature thresholds
  * available in hardwareInfo to determine hardware health.
  */
@js.native
trait SchemaHardwareStatus extends js.Object {
  /**
    * Current battery temperatures in Celsius for each battery on the device.
    */
  var batteryTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Current CPU temperatures in Celsius for each CPU on the device.
    */
  var cpuTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * CPU usages in percentage for each core available on the device. Usage is
    * 0 for each unplugged core. Empty array implies that CPU usage is not
    * supported in the system.
    */
  var cpuUsages: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The time the measurements were taken.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Fan speeds in RPM for each fan on the device. Empty array means that
    * there are no fans or fan speed is not supported on the system.
    */
  var fanSpeeds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Current GPU temperatures in Celsius for each GPU on the device.
    */
  var gpuTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Current device skin temperatures in Celsius.
    */
  var skinTemperatures: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaHardwareStatus {
  @scala.inline
  def apply(): SchemaHardwareStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHardwareStatus]
  }
  @scala.inline
  implicit class SchemaHardwareStatusOps[Self <: SchemaHardwareStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatteryTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatteryTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuUsages(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUsages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuUsages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUsages")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFanSpeeds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fanSpeeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFanSpeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fanSpeeds")(js.undefined)
        ret
    }
    @scala.inline
    def withGpuTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpuTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withSkinTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkinTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinTemperatures")(js.undefined)
        ret
    }
  }
  
}

