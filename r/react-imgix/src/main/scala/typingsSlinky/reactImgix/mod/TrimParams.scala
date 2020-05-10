package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrimParams extends js.Object {
  var trim: js.UndefOr[ImgixParamType] = js.native
  var `trim-color`: js.UndefOr[ImgixParamType] = js.native
  var `trim-md`: js.UndefOr[ImgixParamType] = js.native
  var `trim-sd`: js.UndefOr[ImgixParamType] = js.native
  var `trim-tol`: js.UndefOr[ImgixParamType] = js.native
}

object TrimParams {
  @scala.inline
  def apply(): TrimParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimParams]
  }
  @scala.inline
  implicit class TrimParamsOps[Self <: TrimParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrim(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def `withTrim-color`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTrim-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withTrim-md`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim-md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTrim-md`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim-md")(js.undefined)
        ret
    }
    @scala.inline
    def `withTrim-sd`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim-sd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTrim-sd`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim-sd")(js.undefined)
        ret
    }
    @scala.inline
    def `withTrim-tol`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim-tol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTrim-tol`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim-tol")(js.undefined)
        ret
    }
  }
  
}

