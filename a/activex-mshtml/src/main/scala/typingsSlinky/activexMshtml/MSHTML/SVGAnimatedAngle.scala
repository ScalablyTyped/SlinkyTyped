package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedAngle extends js.Object {
  @JSName("MSHTML.SVGAnimatedAngle_typekey")
  var MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle = js.native
  var animVal: SVGAngle = js.native
  var baseVal: SVGAngle = js.native
}

object SVGAnimatedAngle {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle, animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedAngle_typekey")(MSHTMLDotSVGAnimatedAngle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  @scala.inline
  implicit class SVGAnimatedAngleOps[Self <: SVGAnimatedAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGAnimatedAngle_typekey(value: SVGAnimatedAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGAnimatedAngle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimVal(value: SVGAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVal(value: SVGAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

