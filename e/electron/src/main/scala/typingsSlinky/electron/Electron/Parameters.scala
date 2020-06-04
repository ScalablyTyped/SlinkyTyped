package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.desktop
import typingsSlinky.electron.electronStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  /**
    * Set the device scale factor (if zero defaults to original device scale factor)
    * (default: 0).
    */
  var deviceScaleFactor: Double
  /**
    * Scale of emulated view inside available space (not in fit to view mode)
    * (default: 1).
    */
  var scale: Double
  /**
    * Specify the screen type to emulate (default: desktop):
    */
  var screenPosition: desktop | mobile
  /**
    * Set the emulated screen size (screenPosition == mobile).
    */
  var screenSize: Size
  /**
    * Position the view on the screen (screenPosition == mobile) (default: { x: 0, y:
    * 0 }).
    */
  var viewPosition: Point
  /**
    * Set the emulated view size (empty means no override)
    */
  var viewSize: Size
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceScaleFactor(value: Double): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenPosition(value: desktop | mobile): Self = this.set("screenPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenSize(value: Size): Self = this.set("screenSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewPosition(value: Point): Self = this.set("viewPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewSize(value: Size): Self = this.set("viewSize", value.asInstanceOf[js.Any])
  }
  
}

