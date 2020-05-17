package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnimatedTransformList extends js.Object {
  @JSName("MSHTML.SVGAnimatedTransformList_typekey")
  var MSHTMLDotSVGAnimatedTransformList_typekey: SVGAnimatedTransformList = js.native
  var animVal: SVGTransformList = js.native
  var baseVal: SVGTransformList = js.native
}

object SVGAnimatedTransformList {
  @scala.inline
  def apply(
    MSHTMLDotSVGAnimatedTransformList_typekey: SVGAnimatedTransformList,
    animVal: SVGTransformList,
    baseVal: SVGTransformList
  ): SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedTransformList_typekey")(MSHTMLDotSVGAnimatedTransformList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedTransformList]
  }
  @scala.inline
  implicit class SVGAnimatedTransformListOps[Self <: SVGAnimatedTransformList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGAnimatedTransformList_typekey(value: SVGAnimatedTransformList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGAnimatedTransformList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimVal(value: SVGTransformList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVal(value: SVGTransformList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

