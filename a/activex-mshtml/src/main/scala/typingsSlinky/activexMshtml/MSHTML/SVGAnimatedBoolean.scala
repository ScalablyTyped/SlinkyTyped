package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedBoolean extends js.Object {
  @JSName("MSHTML.SVGAnimatedBoolean_typekey")
  var MSHTMLDotSVGAnimatedBoolean_typekey: SVGAnimatedBoolean = js.native
  var animVal: Boolean = js.native
  var baseVal: Boolean = js.native
}

object SVGAnimatedBoolean {
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedBoolean_typekey: SVGAnimatedBoolean, animVal: Boolean, baseVal: Boolean): SVGAnimatedBoolean = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedBoolean_typekey")(MSHTMLDotSVGAnimatedBoolean_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedBoolean]
  }
  @scala.inline
  implicit class SVGAnimatedBooleanOps[Self <: SVGAnimatedBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGAnimatedBoolean_typekey(value: SVGAnimatedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGAnimatedBoolean_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimVal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

