package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedNumberList extends js.Object {
  @JSName("MSHTML.SVGAnimatedNumberList_typekey")
  var MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList = js.native
  var animVal: SVGNumberList = js.native
  var baseVal: SVGNumberList = js.native
}

object SVGAnimatedNumberList {
  @scala.inline
  def apply(
    MSHTMLDotSVGAnimatedNumberList_typekey: SVGAnimatedNumberList,
    animVal: SVGNumberList,
    baseVal: SVGNumberList
  ): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedNumberList_typekey")(MSHTMLDotSVGAnimatedNumberList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
  @scala.inline
  implicit class SVGAnimatedNumberListOps[Self <: SVGAnimatedNumberList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGAnimatedNumberList_typekey(value: SVGAnimatedNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGAnimatedNumberList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimVal(value: SVGNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVal(value: SVGNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

