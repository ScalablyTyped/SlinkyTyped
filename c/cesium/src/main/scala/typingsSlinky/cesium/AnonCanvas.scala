package typingsSlinky.cesium

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.cesium.mod.Camera
import typingsSlinky.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanvas extends js.Object {
  var camera: Camera = js.native
  var canvas: HTMLCanvasElement = js.native
  var clampToGround: js.UndefOr[Boolean] = js.native
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var sourceUri: js.UndefOr[String] = js.native
}

object AnonCanvas {
  @scala.inline
  def apply(camera: Camera, canvas: HTMLCanvasElement): AnonCanvas = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvas]
  }
  @scala.inline
  implicit class AnonCanvasOps[Self <: AnonCanvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera(value: Camera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvas(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClampToGround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClampToGround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(js.undefined)
        ret
    }
  }
  
}

