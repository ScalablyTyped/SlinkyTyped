package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskImageParams extends js.Object {
  var `corner-radius`: js.UndefOr[ImgixParamType] = js.native
  var mask: js.UndefOr[ImgixParamType] = js.native
}

object MaskImageParams {
  @scala.inline
  def apply(): MaskImageParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskImageParams]
  }
  @scala.inline
  implicit class MaskImageParamsOps[Self <: MaskImageParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCorner-radius`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCorner-radius`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner-radius")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
  }
  
}

