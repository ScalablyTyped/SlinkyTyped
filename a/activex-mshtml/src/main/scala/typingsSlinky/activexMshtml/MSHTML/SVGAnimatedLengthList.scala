package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedLengthList extends js.Object {
  @JSName("MSHTML.SVGAnimatedLengthList_typekey")
  var MSHTMLDotSVGAnimatedLengthList_typekey: SVGAnimatedLengthList = js.native
  var animVal: SVGLengthList = js.native
  var baseVal: SVGLengthList = js.native
}

object SVGAnimatedLengthList {
  @scala.inline
  def apply(
    MSHTMLDotSVGAnimatedLengthList_typekey: SVGAnimatedLengthList,
    animVal: SVGLengthList,
    baseVal: SVGLengthList
  ): SVGAnimatedLengthList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedLengthList_typekey")(MSHTMLDotSVGAnimatedLengthList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLengthList]
  }
  @scala.inline
  implicit class SVGAnimatedLengthListOps[Self <: SVGAnimatedLengthList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGAnimatedLengthList_typekey(value: SVGAnimatedLengthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGAnimatedLengthList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimVal(value: SVGLengthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVal(value: SVGLengthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

