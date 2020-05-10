package typingsSlinky.pica

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PicaResizeOptions extends js.Object {
  // use alpha channel. Default = false.
  var alpha: js.UndefOr[Boolean] = js.native
  // Promise instance. If defined, current operation will be terminated on rejection.
  var cancelToken: js.UndefOr[String] = js.native
  // 0..3. Default = 3 (lanczos, win=3).
  var quality: js.UndefOr[Double] = js.native
  // >=0, in percents. Default = 0 (off). Usually between 50 to 100 is good.
  var unsharpAmount: js.UndefOr[Double] = js.native
  //  0.5..2.0. By default it's not set. Radius of Gaussian blur.
  // If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
  var unsharpRadius: js.UndefOr[Double] = js.native
  // 0..255. Default = 0. Threshold for applying unsharp mask.
  var unsharpThreshold: js.UndefOr[Double] = js.native
}

object PicaResizeOptions {
  @scala.inline
  def apply(): PicaResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PicaResizeOptions]
  }
  @scala.inline
  implicit class PicaResizeOptionsOps[Self <: PicaResizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCancelToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelToken")(js.undefined)
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

