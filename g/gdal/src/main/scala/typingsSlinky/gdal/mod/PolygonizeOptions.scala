package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonizeOptions extends js.Object {
  var connectedness: js.UndefOr[Double] = js.native
  var dst: Layer = js.native
  var mask: js.UndefOr[RasterBand] = js.native
  var pixValField: Double = js.native
  var src: RasterBand = js.native
  var useFloats: js.UndefOr[Boolean] = js.native
}

object PolygonizeOptions {
  @scala.inline
  def apply(dst: Layer, pixValField: Double, src: RasterBand): PolygonizeOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], pixValField = pixValField.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonizeOptions]
  }
  @scala.inline
  implicit class PolygonizeOptionsOps[Self <: PolygonizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDst(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixValField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixValField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: RasterBand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectedness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedness")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: RasterBand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFloats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFloats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFloats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFloats")(js.undefined)
        ret
    }
  }
  
}

