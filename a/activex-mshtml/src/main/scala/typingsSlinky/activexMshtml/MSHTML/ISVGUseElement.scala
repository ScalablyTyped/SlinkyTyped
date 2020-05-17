package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGUseElement extends js.Object {
  @JSName("MSHTML.ISVGUseElement_typekey")
  var MSHTMLDotISVGUseElement_typekey: ISVGUseElement = js.native
  var animatedInstanceRoot: ISVGElementInstance = js.native
  var height: SVGAnimatedLength = js.native
  var instanceRoot: ISVGElementInstance = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var y: SVGAnimatedLength = js.native
}

object ISVGUseElement {
  @scala.inline
  def apply(
    MSHTMLDotISVGUseElement_typekey: ISVGUseElement,
    animatedInstanceRoot: ISVGElementInstance,
    height: SVGAnimatedLength,
    instanceRoot: ISVGElementInstance,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    y: SVGAnimatedLength
  ): ISVGUseElement = {
    val __obj = js.Dynamic.literal(animatedInstanceRoot = animatedInstanceRoot.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], instanceRoot = instanceRoot.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGUseElement_typekey")(MSHTMLDotISVGUseElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGUseElement]
  }
  @scala.inline
  implicit class ISVGUseElementOps[Self <: ISVGUseElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotISVGUseElement_typekey(value: ISVGUseElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ISVGUseElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimatedInstanceRoot(value: ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedInstanceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceRoot(value: ISVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

