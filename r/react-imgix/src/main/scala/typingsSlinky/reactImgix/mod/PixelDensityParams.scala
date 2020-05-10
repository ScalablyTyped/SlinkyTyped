package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelDensityParams extends js.Object {
  var dpr: js.UndefOr[ImgixParamType] = js.native
}

object PixelDensityParams {
  @scala.inline
  def apply(): PixelDensityParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelDensityParams]
  }
  @scala.inline
  implicit class PixelDensityParamsOps[Self <: PixelDensityParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDpr(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpr")(js.undefined)
        ret
    }
  }
  
}

