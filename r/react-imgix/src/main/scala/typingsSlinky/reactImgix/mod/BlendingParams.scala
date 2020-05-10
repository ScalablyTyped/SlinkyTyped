package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlendingParams extends js.Object {
  var blend: js.UndefOr[ImgixParamType] = js.native
  var `blend-align`: js.UndefOr[ImgixParamType] = js.native
  var `blend-alpha`: js.UndefOr[ImgixParamType] = js.native
  var `blend-crop`: js.UndefOr[ImgixParamType] = js.native
  var `blend-fit`: js.UndefOr[ImgixParamType] = js.native
  var `blend-mode`: js.UndefOr[ImgixParamType] = js.native
  var `blend-pad`: js.UndefOr[ImgixParamType] = js.native
  var `blend-size`: js.UndefOr[ImgixParamType] = js.native
  var `blend-x`: js.UndefOr[ImgixParamType] = js.native
  var `blend-y`: js.UndefOr[ImgixParamType] = js.native
}

object BlendingParams {
  @scala.inline
  def apply(): BlendingParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlendingParams]
  }
  @scala.inline
  implicit class BlendingParamsOps[Self <: BlendingParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlend(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-align`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-align`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-align")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-alpha`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-alpha`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-alpha")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-crop`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-crop`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-crop")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-fit`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-fit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-fit")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-mode`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-mode`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-pad`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-pad`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-pad")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-size`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-x`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlend-y`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlend-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend-y")(js.undefined)
        ret
    }
  }
  
}

