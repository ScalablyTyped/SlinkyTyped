package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContourGenerateOptions extends js.Object {
  var dst: Layer = js.native
  var elevField: js.UndefOr[Double] = js.native
  var fixedLevels: js.UndefOr[js.Array[Double]] = js.native
  var idField: js.UndefOr[Double] = js.native
  var interval: js.UndefOr[Double] = js.native
  var nodata: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var src: RasterBand = js.native
}

object ContourGenerateOptions {
  @scala.inline
  def apply(dst: Layer, src: RasterBand): ContourGenerateOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourGenerateOptions]
  }
  @scala.inline
  implicit class ContourGenerateOptionsOps[Self <: ContourGenerateOptions] (val x: Self) extends AnyVal {
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
    def withSrc(value: RasterBand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElevField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevField")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedLevels(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withIdField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idField")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withNodata(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodata")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

