package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylizeParams extends js.Object {
  var blur: js.UndefOr[ImgixParamType] = js.native
  var duotone: js.UndefOr[ImgixParamType] = js.native
  var `duotone-alpha`: js.UndefOr[ImgixParamType] = js.native
  var htn: js.UndefOr[ImgixParamType] = js.native
  var monochrome: js.UndefOr[ImgixParamType] = js.native
  var px: js.UndefOr[ImgixParamType] = js.native
  var sepia: js.UndefOr[ImgixParamType] = js.native
}

object StylizeParams {
  @scala.inline
  def apply(): StylizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylizeParams]
  }
  @scala.inline
  implicit class StylizeParamsOps[Self <: StylizeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: ImgixParamType): Self = {
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
    def withDuotone(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duotone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuotone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duotone")(js.undefined)
        ret
    }
    @scala.inline
    def `withDuotone-alpha`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duotone-alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDuotone-alpha`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duotone-alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withHtn(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htn")(js.undefined)
        ret
    }
    @scala.inline
    def withMonochrome(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(js.undefined)
        ret
    }
    @scala.inline
    def withPx(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(js.undefined)
        ret
    }
    @scala.inline
    def withSepia(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSepia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepia")(js.undefined)
        ret
    }
  }
  
}

