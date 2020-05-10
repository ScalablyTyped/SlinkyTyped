package typingsSlinky.imagemagickNative.mod

import typingsSlinky.imagemagickNative.AnonHeight
import typingsSlinky.imagemagickNative.AnonOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIdentifyResult extends js.Object {
  var density: AnonHeight = js.native
  var depth: Double = js.native
  var exif: AnonOrientation = js.native
  var format: String = js.native
  var height: Double = js.native
  var width: Double = js.native
}

object IIdentifyResult {
  @scala.inline
  def apply(
    density: AnonHeight,
    depth: Double,
    exif: AnonOrientation,
    format: String,
    height: Double,
    width: Double
  ): IIdentifyResult = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdentifyResult]
  }
  @scala.inline
  implicit class IIdentifyResultOps[Self <: IIdentifyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDensity(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExif(value: AnonOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

