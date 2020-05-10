package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocalPointCropParams extends js.Object {
  var `fp-debug`: js.UndefOr[ImgixParamType] = js.native
  var `fp-x`: js.UndefOr[ImgixParamType] = js.native
  var `fp-y`: js.UndefOr[ImgixParamType] = js.native
  var `fp-z`: js.UndefOr[ImgixParamType] = js.native
}

object FocalPointCropParams {
  @scala.inline
  def apply(): FocalPointCropParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocalPointCropParams]
  }
  @scala.inline
  implicit class FocalPointCropParamsOps[Self <: FocalPointCropParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFp-debug`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp-debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFp-debug`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp-debug")(js.undefined)
        ret
    }
    @scala.inline
    def `withFp-x`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFp-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withFp-y`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFp-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withFp-z`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp-z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFp-z`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fp-z")(js.undefined)
        ret
    }
  }
  
}

