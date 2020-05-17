package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPreserveAspectRatio extends js.Object {
  @JSName("MSHTML.SVGPreserveAspectRatio_typekey")
  var MSHTMLDotSVGPreserveAspectRatio_typekey: SVGPreserveAspectRatio = js.native
  var align: Double = js.native
  var meetOrSlice: Double = js.native
}

object SVGPreserveAspectRatio {
  @scala.inline
  def apply(
    MSHTMLDotSVGPreserveAspectRatio_typekey: SVGPreserveAspectRatio,
    align: Double,
    meetOrSlice: Double
  ): SVGPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], meetOrSlice = meetOrSlice.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPreserveAspectRatio_typekey")(MSHTMLDotSVGPreserveAspectRatio_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPreserveAspectRatio]
  }
  @scala.inline
  implicit class SVGPreserveAspectRatioOps[Self <: SVGPreserveAspectRatio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPreserveAspectRatio_typekey(value: SVGPreserveAspectRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPreserveAspectRatio_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeetOrSlice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetOrSlice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

