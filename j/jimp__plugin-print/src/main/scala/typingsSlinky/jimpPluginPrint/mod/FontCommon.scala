package typingsSlinky.jimpPluginPrint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontCommon extends js.Object {
  var alphaChnl: Double = js.native
  var base: Double = js.native
  var blueChnl: Double = js.native
  var greenChnl: Double = js.native
  var lineHeight: Double = js.native
  var packed: Double = js.native
  var pages: Double = js.native
  var redChnl: Double = js.native
  var scaleH: Double = js.native
  var scaleW: Double = js.native
}

object FontCommon {
  @scala.inline
  def apply(
    alphaChnl: Double,
    base: Double,
    blueChnl: Double,
    greenChnl: Double,
    lineHeight: Double,
    packed: Double,
    pages: Double,
    redChnl: Double,
    scaleH: Double,
    scaleW: Double
  ): FontCommon = {
    val __obj = js.Dynamic.literal(alphaChnl = alphaChnl.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], blueChnl = blueChnl.asInstanceOf[js.Any], greenChnl = greenChnl.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], redChnl = redChnl.asInstanceOf[js.Any], scaleH = scaleH.asInstanceOf[js.Any], scaleW = scaleW.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontCommon]
  }
  @scala.inline
  implicit class FontCommonOps[Self <: FontCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaChnl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaChnl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlueChnl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueChnl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreenChnl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenChnl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedChnl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redChnl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

