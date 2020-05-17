package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedInteger extends js.Object {
  @JSName("MSHTML.SVGAnimatedInteger_typekey")
  var MSHTMLDotSVGAnimatedInteger_typekey: SVGAnimatedInteger = js.native
  var animVal: Double = js.native
  var baseVal: Double = js.native
}

object SVGAnimatedInteger {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedInteger_typekey: SVGAnimatedInteger, animVal: Double, baseVal: Double): SVGAnimatedInteger = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedInteger_typekey")(MSHTMLDotSVGAnimatedInteger_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedInteger]
  }
  @scala.inline
  implicit class SVGAnimatedIntegerOps[Self <: SVGAnimatedInteger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGAnimatedInteger_typekey(value: SVGAnimatedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGAnimatedInteger_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

