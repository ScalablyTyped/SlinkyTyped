package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReductionParams extends js.Object {
  var nr: js.UndefOr[ImgixParamType] = js.native
  var nrs: js.UndefOr[ImgixParamType] = js.native
}

object NoiseReductionParams {
  @scala.inline
  def apply(): NoiseReductionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReductionParams]
  }
  @scala.inline
  implicit class NoiseReductionParamsOps[Self <: NoiseReductionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNr(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nr")(js.undefined)
        ret
    }
    @scala.inline
    def withNrs(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nrs")(js.undefined)
        ret
    }
  }
  
}

