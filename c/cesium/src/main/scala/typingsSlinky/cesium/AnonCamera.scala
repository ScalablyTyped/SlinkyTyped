package typingsSlinky.cesium

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.cesium.mod.Camera
import typingsSlinky.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCamera extends js.Object {
  var camera: js.UndefOr[Camera] = js.undefined
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
}

object AnonCamera {
  @scala.inline
  def apply(camera: Camera = null, canvas: HTMLCanvasElement = null, ellipsoid: Ellipsoid = null): AnonCamera = {
    val __obj = js.Dynamic.literal()
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCamera]
  }
}

