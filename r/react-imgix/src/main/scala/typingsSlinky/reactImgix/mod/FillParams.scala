package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillParams extends js.Object {
  var bg: js.UndefOr[ImgixParamType] = js.native
  var fill: js.UndefOr[ImgixParamType] = js.native
  var `fill-color`: js.UndefOr[ImgixParamType] = js.native
}

object FillParams {
  @scala.inline
  def apply(): FillParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillParams]
  }
  @scala.inline
  implicit class FillParamsOps[Self <: FillParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBg(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withFill-color`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFill-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-color")(js.undefined)
        ret
    }
  }
  
}

