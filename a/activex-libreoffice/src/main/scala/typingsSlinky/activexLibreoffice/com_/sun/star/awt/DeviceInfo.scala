package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains information about a device. */
@js.native
trait DeviceInfo extends js.Object {
  /** contains the color-depth of the device. */
  var BitsPerPixel: Double = js.native
  /** contains the inset from the bottom. */
  var BottomInset: Double = js.native
  /**
    * specifies special operations which are possible on the device.
    * @see DeviceCapability
    */
  var Capabilities: Double = js.native
  /** contains the height of the device in pixels. */
  var Height: Double = js.native
  /** contains the inset from the left. */
  var LeftInset: Double = js.native
  /** contains the X-axis resolution of the device in pixel/meter. */
  var PixelPerMeterX: Double = js.native
  /** contains the Y-axis resolution of the device in pixel/meter. */
  var PixelPerMeterY: Double = js.native
  /** contains the inset from the right. */
  var RightInset: Double = js.native
  /** contains the inset from the top. */
  var TopInset: Double = js.native
  /** contains the width of the device in pixels. */
  var Width: Double = js.native
}

object DeviceInfo {
  @scala.inline
  def apply(
    BitsPerPixel: Double,
    BottomInset: Double,
    Capabilities: Double,
    Height: Double,
    LeftInset: Double,
    PixelPerMeterX: Double,
    PixelPerMeterY: Double,
    RightInset: Double,
    TopInset: Double,
    Width: Double
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(BitsPerPixel = BitsPerPixel.asInstanceOf[js.Any], BottomInset = BottomInset.asInstanceOf[js.Any], Capabilities = Capabilities.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], LeftInset = LeftInset.asInstanceOf[js.Any], PixelPerMeterX = PixelPerMeterX.asInstanceOf[js.Any], PixelPerMeterY = PixelPerMeterY.asInstanceOf[js.Any], RightInset = RightInset.asInstanceOf[js.Any], TopInset = TopInset.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  @scala.inline
  implicit class DeviceInfoOps[Self <: DeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitsPerPixel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitsPerPixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapabilities(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelPerMeterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PixelPerMeterX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelPerMeterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PixelPerMeterY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopInset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

