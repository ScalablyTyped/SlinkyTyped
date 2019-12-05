package typingsSlinky.cesium

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.cesium.cesiumMod.Camera
import typingsSlinky.cesium.cesiumMod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Camera extends js.Object {
  var camera: js.UndefOr[Camera] = js.undefined
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
}

object Anon_Camera {
  @scala.inline
  def apply(camera: Camera = null, canvas: HTMLCanvasElement = null, ellipsoid: Ellipsoid = null): Anon_Camera = {
    val __obj = js.Dynamic.literal()
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Camera]
  }
}

