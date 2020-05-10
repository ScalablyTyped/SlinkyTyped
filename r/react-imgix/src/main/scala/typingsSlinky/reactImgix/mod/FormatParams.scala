package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatParams extends js.Object {
  var ch: js.UndefOr[ImgixParamType] = js.native
  var chromasub: js.UndefOr[ImgixParamType] = js.native
  var colorquant: js.UndefOr[ImgixParamType] = js.native
  var cs: js.UndefOr[ImgixParamType] = js.native
  var dl: js.UndefOr[ImgixParamType] = js.native
  var dpi: js.UndefOr[ImgixParamType] = js.native
  var fm: js.UndefOr[ImgixParamType] = js.native
  var lossless: js.UndefOr[ImgixParamType] = js.native
  var q: js.UndefOr[ImgixParamType] = js.native
}

object FormatParams {
  @scala.inline
  def apply(): FormatParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatParams]
  }
  @scala.inline
  implicit class FormatParamsOps[Self <: FormatParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCh(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ch")(js.undefined)
        ret
    }
    @scala.inline
    def withChromasub(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromasub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromasub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromasub")(js.undefined)
        ret
    }
    @scala.inline
    def withColorquant(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorquant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorquant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorquant")(js.undefined)
        ret
    }
    @scala.inline
    def withCs(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cs")(js.undefined)
        ret
    }
    @scala.inline
    def withDl(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dl")(js.undefined)
        ret
    }
    @scala.inline
    def withDpi(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(js.undefined)
        ret
    }
    @scala.inline
    def withFm(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fm")(js.undefined)
        ret
    }
    @scala.inline
    def withLossless(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLossless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossless")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
  }
  
}

