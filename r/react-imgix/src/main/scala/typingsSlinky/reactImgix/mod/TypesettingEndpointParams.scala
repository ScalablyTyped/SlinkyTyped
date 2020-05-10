package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypesettingEndpointParams extends js.Object {
  @JSName("~text")
  var Tildetext: js.UndefOr[ImgixParamType] = js.native
  var `txt-lead`: js.UndefOr[ImgixParamType] = js.native
  var `txt-track`: js.UndefOr[ImgixParamType] = js.native
}

object TypesettingEndpointParams {
  @scala.inline
  def apply(): TypesettingEndpointParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypesettingEndpointParams]
  }
  @scala.inline
  implicit class TypesettingEndpointParamsOps[Self <: TypesettingEndpointParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTildetext(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("~text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTildetext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("~text")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-lead`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-lead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-lead`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-lead")(js.undefined)
        ret
    }
    @scala.inline
    def `withTxt-track`(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTxt-track`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt-track")(js.undefined)
        ret
    }
  }
  
}

