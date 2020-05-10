package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about device hardware. The fields related to temperature
  * thresholds are only available if hardwareStatusEnabled is true in the
  * device&#39;s policy.
  */
@js.native
trait SchemaHardwareInfo extends js.Object {
  /**
    * Battery shutdown temperature thresholds in Celsius for each battery on
    * the device.
    */
  var batteryShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Battery throttling temperature thresholds in Celsius for each battery on
    * the device.
    */
  var batteryThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Brand of the device. For example, Google.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * CPU shutdown temperature thresholds in Celsius for each CPU on the
    * device.
    */
  var cpuShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * CPU throttling temperature thresholds in Celsius for each CPU on the
    * device.
    */
  var cpuThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Baseband version. For example, MDM9625_104662.22.05.34p.
    */
  var deviceBasebandVersion: js.UndefOr[String] = js.native
  /**
    * GPU shutdown temperature thresholds in Celsius for each GPU on the
    * device.
    */
  var gpuShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * GPU throttling temperature thresholds in Celsius for each GPU on the
    * device.
    */
  var gpuThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Name of the hardware. For example, Angler.
    */
  var hardware: js.UndefOr[String] = js.native
  /**
    * Manufacturer. For example, Motorola.
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * The model of the device. For example, Asus Nexus 7.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The device serial number.
    */
  var serialNumber: js.UndefOr[String] = js.native
  /**
    * Device skin shutdown temperature thresholds in Celsius.
    */
  var skinShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Device skin throttling temperature thresholds in Celsius.
    */
  var skinThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaHardwareInfo {
  @scala.inline
  def apply(): SchemaHardwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHardwareInfo]
  }
  @scala.inline
  implicit class SchemaHardwareInfoOps[Self <: SchemaHardwareInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatteryShutdownTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryShutdownTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatteryShutdownTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryShutdownTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withBatteryThrottlingTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryThrottlingTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatteryThrottlingTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryThrottlingTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuShutdownTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuShutdownTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuShutdownTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuShutdownTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuThrottlingTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuThrottlingTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuThrottlingTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuThrottlingTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceBasebandVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBasebandVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceBasebandVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBasebandVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGpuShutdownTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuShutdownTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpuShutdownTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuShutdownTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withGpuThrottlingTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuThrottlingTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpuThrottlingTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuThrottlingTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withHardware(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardware")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSkinShutdownTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinShutdownTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkinShutdownTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinShutdownTemperatures")(js.undefined)
        ret
    }
    @scala.inline
    def withSkinThrottlingTemperatures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinThrottlingTemperatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkinThrottlingTemperatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinThrottlingTemperatures")(js.undefined)
        ret
    }
  }
  
}

