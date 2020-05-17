package typingsSlinky.qiniuJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.ImageMogr2Options> */
@js.native
trait PartialImageMogr2Options extends js.Object {
  var `auto-orient`: js.UndefOr[Boolean] = js.native
  var blur: js.UndefOr[String] = js.native
  var crop: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var gravity: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var strip: js.UndefOr[Boolean] = js.native
  var thumbnail: js.UndefOr[String] = js.native
}

object PartialImageMogr2Options {
  @scala.inline
  def apply(): PartialImageMogr2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialImageMogr2Options]
  }
  @scala.inline
  implicit class PartialImageMogr2OptionsOps[Self <: PartialImageMogr2Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAuto-orient`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto-orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAuto-orient`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto-orient")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGravity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(js.undefined)
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
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withStrip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
  }
  
}

