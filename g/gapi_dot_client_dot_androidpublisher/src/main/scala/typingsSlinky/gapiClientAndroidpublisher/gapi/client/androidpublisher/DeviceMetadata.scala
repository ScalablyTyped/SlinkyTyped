package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMetadata extends js.Object {
  /** Device CPU make e.g. "Qualcomm" */
  var cpuMake: js.UndefOr[String] = js.native
  /** Device CPU model e.g. "MSM8974" */
  var cpuModel: js.UndefOr[String] = js.native
  /** Device class (e.g. tablet) */
  var deviceClass: js.UndefOr[String] = js.native
  /** OpenGL version */
  var glEsVersion: js.UndefOr[Double] = js.native
  /** Device manufacturer (e.g. Motorola) */
  var manufacturer: js.UndefOr[String] = js.native
  /** Comma separated list of native platforms (e.g. "arm", "arm7") */
  var nativePlatform: js.UndefOr[String] = js.native
  /** Device model name (e.g. Droid) */
  var productName: js.UndefOr[String] = js.native
  /** Device RAM in Megabytes e.g. "2048" */
  var ramMb: js.UndefOr[Double] = js.native
  /** Screen density in DPI */
  var screenDensityDpi: js.UndefOr[Double] = js.native
  /** Screen height in pixels */
  var screenHeightPx: js.UndefOr[Double] = js.native
  /** Screen width in pixels */
  var screenWidthPx: js.UndefOr[Double] = js.native
}

object DeviceMetadata {
  @scala.inline
  def apply(): DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetadata]
  }
  @scala.inline
  implicit class DeviceMetadataOps[Self <: DeviceMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuMake(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuMake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuMake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuMake")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuModel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGlEsVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glEsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlEsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glEsVersion")(js.undefined)
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
    def withNativePlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativePlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativePlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativePlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(js.undefined)
        ret
    }
    @scala.inline
    def withRamMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramMb")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenDensityDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenDensityDpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenDensityDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenDensityDpi")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenHeightPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenHeightPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenHeightPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenHeightPx")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenWidthPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenWidthPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenWidthPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenWidthPx")(js.undefined)
        ret
    }
  }
  
}

