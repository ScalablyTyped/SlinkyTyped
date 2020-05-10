package typingsSlinky.pica

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PicaResizeBufferOptions extends js.Object {
  // use alpha channel. Default = false.
  var alpha: js.UndefOr[Boolean] = js.native
  // Optional. Output buffer to write data, if you don't wish pica to create new one.
  var dest: js.UndefOr[String] = js.native
  // src image height.
  var height: Double = js.native
  // 0..3. Default = 3 (lanczos, win=3).
  var quality: js.UndefOr[Double] = js.native
  // Uint8Array with source data.
  var src: js.Array[Double] = js.native
  // output height, >=0, in pixels.
  var toHeigh: Double = js.native
  // output width, >=0, in pixels.
  var toWidth: Double = js.native
  // >=0, in percents. Default = 0 (off). Usually between 50 to 100 is good.
  var unsharpAmount: js.UndefOr[Double] = js.native
  // 0.5..2.0. Radius of Gaussian blur.
  // If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
  var unsharpRadius: js.UndefOr[Double] = js.native
  // 0..255. Default = 0. Threshold for applying unsharp mask.
  var unsharpThreshold: js.UndefOr[Double] = js.native
  // src image width.
  var width: Double = js.native
}

object PicaResizeBufferOptions {
  @scala.inline
  def apply(height: Double, src: js.Array[Double], toHeigh: Double, toWidth: Double, width: Double): PicaResizeBufferOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], toHeigh = toHeigh.asInstanceOf[js.Any], toWidth = toWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicaResizeBufferOptions]
  }
  @scala.inline
  implicit class PicaResizeBufferOptionsOps[Self <: PicaResizeBufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToHeigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHeigh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsharpAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsharpAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsharpAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsharpAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsharpRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsharpRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsharpRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsharpRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsharpThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsharpThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsharpThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsharpThreshold")(js.undefined)
        ret
    }
  }
  
}

