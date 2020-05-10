package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatermarkParams extends js.Object {
  var mark: js.UndefOr[ImgixParamType] = js.native
  var `mark-align`: js.UndefOr[ImgixParamType] = js.native
  var `mark-alpha`: js.UndefOr[ImgixParamType] = js.native
  var `mark-base`: js.UndefOr[ImgixParamType] = js.native
  var `mark-fit`: js.UndefOr[ImgixParamType] = js.native
  var `mark-h`: js.UndefOr[ImgixParamType] = js.native
  var `mark-pad`: js.UndefOr[ImgixParamType] = js.native
  var `mark-scale`: js.UndefOr[ImgixParamType] = js.native
  var `mark-w`: js.UndefOr[ImgixParamType] = js.native
  var `mark-x`: js.UndefOr[ImgixParamType] = js.native
  var `mark-y`: js.UndefOr[ImgixParamType] = js.native
}

object WatermarkParams {
  @scala.inline
  def apply(): WatermarkParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatermarkParams]
  }
  @scala.inline
  implicit class WatermarkParamsOps[Self <: WatermarkParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMark(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-align`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-align`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-align")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-alpha`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-alpha`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-alpha")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-base`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-base`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-base")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-fit`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-fit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-fit")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-h`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-h`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-h")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-pad`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-pad`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-pad")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-scale`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-scale`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-scale")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-w`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-w`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-w")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-x`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withMark-y`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMark-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark-y")(js.undefined)
        ret
    }
  }
  
}

