package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterBandPixelsReadOptions extends js.Object {
  var buffer_height: js.UndefOr[Double] = js.native
  var buffer_width: js.UndefOr[Double] = js.native
  var data_type: js.UndefOr[String] = js.native
  var line_space: js.UndefOr[Double] = js.native
  var pixel_space: js.UndefOr[Double] = js.native
}

object RasterBandPixelsReadOptions {
  @scala.inline
  def apply(): RasterBandPixelsReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterBandPixelsReadOptions]
  }
  @scala.inline
  implicit class RasterBandPixelsReadOptionsOps[Self <: RasterBandPixelsReadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer_height")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffer_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer_width")(js.undefined)
        ret
    }
    @scala.inline
    def withData_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_type")(js.undefined)
        ret
    }
    @scala.inline
    def withLine_space(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine_space: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_space")(js.undefined)
        ret
    }
    @scala.inline
    def withPixel_space(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixel_space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixel_space: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixel_space")(js.undefined)
        ret
    }
  }
  
}

