package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.available
import typingsSlinky.electron.electronStrings.unavailable
import typingsSlinky.electron.electronStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/display
  /**
    * Can be available, unavailable, unknown.
    */
  var accelerometerSupport: available | unavailable | unknown_ = js.native
  var bounds: Rectangle = js.native
  /**
    * The number of bits per pixel.
    */
  var colorDepth: Double = js.native
  /**
    * represent a color space (three-dimensional object which contains all realizable
    * color combinations) for the purpose of color conversions
    */
  var colorSpace: String = js.native
  /**
    * The number of bits per color component.
    */
  var depthPerComponent: Double = js.native
  /**
    * Unique identifier associated with the display.
    */
  var id: Double = js.native
  /**
    * true for an internal display and false for an external display
    */
  var internal: Boolean = js.native
  /**
    * Whether or not the display is a monochrome display.
    */
  var monochrome: Boolean = js.native
  /**
    * Can be 0, 90, 180, 270, represents screen rotation in clock-wise degrees.
    */
  var rotation: Double = js.native
  /**
    * Output device's pixel scale factor.
    */
  var scaleFactor: Double = js.native
  var size: Size = js.native
  /**
    * Can be available, unavailable, unknown.
    */
  var touchSupport: available | unavailable | unknown_ = js.native
  var workArea: Rectangle = js.native
  var workAreaSize: Size = js.native
}

object Display {
  @scala.inline
  def apply(
    accelerometerSupport: available | unavailable | unknown_,
    bounds: Rectangle,
    colorDepth: Double,
    colorSpace: String,
    depthPerComponent: Double,
    id: Double,
    internal: Boolean,
    monochrome: Boolean,
    rotation: Double,
    scaleFactor: Double,
    size: Size,
    touchSupport: available | unavailable | unknown_,
    workArea: Rectangle,
    workAreaSize: Size
  ): Display = {
    val __obj = js.Dynamic.literal(accelerometerSupport = accelerometerSupport.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], depthPerComponent = depthPerComponent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], touchSupport = touchSupport.asInstanceOf[js.Any], workArea = workArea.asInstanceOf[js.Any], workAreaSize = workAreaSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  @scala.inline
  implicit class DisplayOps[Self <: Display] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerometerSupport(value: available | unavailable | unknown_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerometerSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthPerComponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthPerComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonochrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchSupport(value: available | unavailable | unknown_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkArea(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkAreaSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAreaSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

