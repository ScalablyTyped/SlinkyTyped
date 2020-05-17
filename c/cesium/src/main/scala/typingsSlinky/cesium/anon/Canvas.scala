package typingsSlinky.cesium.anon

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canvas extends js.Object {
  var camera: typingsSlinky.cesium.mod.Camera = js.native
  var canvas: HTMLCanvasElement = js.native
  var clampToGround: js.UndefOr[Boolean] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var sourceUri: js.UndefOr[String] = js.native
}

object Canvas {
  @scala.inline
  def apply(camera: typingsSlinky.cesium.mod.Camera, canvas: HTMLCanvasElement): Canvas = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  @scala.inline
  implicit class CanvasOps[Self <: Canvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera(value: typingsSlinky.cesium.mod.Camera): Self = {
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
    def withEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = {
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

