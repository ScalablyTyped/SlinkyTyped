package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustmentParams extends js.Object {
  var bri: js.UndefOr[ImgixParamType] = js.native
  var con: js.UndefOr[ImgixParamType] = js.native
  var exp: js.UndefOr[ImgixParamType] = js.native
  var gam: js.UndefOr[ImgixParamType] = js.native
  var high: js.UndefOr[ImgixParamType] = js.native
  var hue: js.UndefOr[ImgixParamType] = js.native
  var invert: js.UndefOr[ImgixParamType] = js.native
  var sat: js.UndefOr[ImgixParamType] = js.native
  var shad: js.UndefOr[ImgixParamType] = js.native
  var sharp: js.UndefOr[ImgixParamType] = js.native
  var usm: js.UndefOr[ImgixParamType] = js.native
  var usmrad: js.UndefOr[ImgixParamType] = js.native
  var vib: js.UndefOr[ImgixParamType] = js.native
}

object AdjustmentParams {
  @scala.inline
  def apply(): AdjustmentParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustmentParams]
  }
  @scala.inline
  implicit class AdjustmentParamsOps[Self <: AdjustmentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBri(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bri")(js.undefined)
        ret
    }
    @scala.inline
    def withCon(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("con")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("con")(js.undefined)
        ret
    }
    @scala.inline
    def withExp(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.undefined)
        ret
    }
    @scala.inline
    def withGam(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gam")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withHue(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(js.undefined)
        ret
    }
    @scala.inline
    def withInvert(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.undefined)
        ret
    }
    @scala.inline
    def withSat(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sat")(js.undefined)
        ret
    }
    @scala.inline
    def withShad(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shad")(js.undefined)
        ret
    }
    @scala.inline
    def withSharp(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharp")(js.undefined)
        ret
    }
    @scala.inline
    def withUsm(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usm")(js.undefined)
        ret
    }
    @scala.inline
    def withUsmrad(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usmrad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsmrad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usmrad")(js.undefined)
        ret
    }
    @scala.inline
    def withVib(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vib")(js.undefined)
        ret
    }
  }
  
}

