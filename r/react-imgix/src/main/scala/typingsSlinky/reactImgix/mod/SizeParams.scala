package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeParams extends js.Object {
  var ar: js.UndefOr[ImgixParamType] = js.native
  var crop: js.UndefOr[ImgixParamType] = js.native
  var fit: js.UndefOr[ImgixParamType] = js.native
  var h: js.UndefOr[ImgixParamType] = js.native
  var `max-h`: js.UndefOr[ImgixParamType] = js.native
  var `max-w`: js.UndefOr[ImgixParamType] = js.native
  var `min-h`: js.UndefOr[ImgixParamType] = js.native
  var `min-w`: js.UndefOr[ImgixParamType] = js.native
  var rect: js.UndefOr[ImgixParamType] = js.native
  var w: js.UndefOr[ImgixParamType] = js.native
}

object SizeParams {
  @scala.inline
  def apply(): SizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeParams]
  }
  @scala.inline
  implicit class SizeParamsOps[Self <: SizeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAr(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ar")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: ImgixParamType): Self = {
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
    def withFit(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withH(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-h`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-h`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-h")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-w`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-w`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-w")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-h`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-h`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-h")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-w`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-w`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-w")(js.undefined)
        ret
    }
    @scala.inline
    def withRect(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(js.undefined)
        ret
    }
    @scala.inline
    def withW(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.undefined)
        ret
    }
  }
  
}

