package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.desktop
import typingsSlinky.electron.electronStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  /**
    * Set the device scale factor (if zero defaults to original device scale factor)
    * (default: 0).
    */
  var deviceScaleFactor: Double = js.native
  /**
    * Scale of emulated view inside available space (not in fit to view mode)
    * (default: 1).
    */
  var scale: Double = js.native
  /**
    * Specify the screen type to emulate (default: desktop):
    */
  var screenPosition: desktop | mobile = js.native
  /**
    * Set the emulated screen size (screenPosition == mobile).
    */
  var screenSize: Size = js.native
  /**
    * Position the view on the screen (screenPosition == mobile) (default: { x: 0, y:
    * 0 }).
    */
  var viewPosition: Point = js.native
  /**
    * Set the emulated view size (empty means no override)
    */
  var viewSize: Size = js.native
}

object Parameters {
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    scale: Double,
    screenPosition: desktop | mobile,
    screenSize: Size,
    viewPosition: Point,
    viewSize: Size
  ): Parameters = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screenPosition = screenPosition.asInstanceOf[js.Any], screenSize = screenSize.asInstanceOf[js.Any], viewPosition = viewPosition.asInstanceOf[js.Any], viewSize = viewSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenPosition(value: desktop | mobile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

