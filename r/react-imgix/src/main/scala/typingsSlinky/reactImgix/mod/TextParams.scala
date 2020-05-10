package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextParams extends js.Object {
  var txt: js.UndefOr[ImgixParamType] = js.native
  var `txt-align`: js.UndefOr[ImgixParamType] = js.native
  var `txt-clip`: js.UndefOr[ImgixParamType] = js.native
  var `txt-color`: js.UndefOr[ImgixParamType] = js.native
  var `txt-fit`: js.UndefOr[ImgixParamType] = js.native
  var `txt-font`: js.UndefOr[ImgixParamType] = js.native
  var `txt-lig`: js.UndefOr[ImgixParamType] = js.native
  var `txt-line`: js.UndefOr[ImgixParamType] = js.native
  var `txt-line-color`: js.UndefOr[ImgixParamType] = js.native
  var `txt-pad`: js.UndefOr[ImgixParamType] = js.native
  var `txt-shad`: js.UndefOr[ImgixParamType] = js.native
  var `txt-size`: js.UndefOr[ImgixParamType] = js.native
  var `txt-width`: js.UndefOr[ImgixParamType] = js.native
}

object TextParams {
  @scala.inline
  def apply(): TextParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextParams]
  }
  @scala.inline
  implicit class TextParamsOps[Self <: TextParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTxt(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-align`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-align`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-align")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-clip`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-clip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-clip")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-color`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-fit`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-fit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-fit")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-font`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-font`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-font")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-lig`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-lig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-lig`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-lig")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-line`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-line`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-line")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-line-color`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-line-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-line-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-line-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-pad`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-pad`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-pad")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-shad`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-shad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-shad`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-shad")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-size`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-width`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-width")(js.undefined)
        ret
    }
  }
  
}

