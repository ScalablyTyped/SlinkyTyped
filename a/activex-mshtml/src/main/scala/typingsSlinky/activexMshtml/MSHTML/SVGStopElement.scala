package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGStopElement extends js.Object {
  @JSName("MSHTML.SVGStopElement_typekey")
  var MSHTMLDotSVGStopElement_typekey: SVGStopElement = js.native
  val className: SVGAnimatedString = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var offset: SVGAnimatedNumber = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
}

object SVGStopElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGStopElement_typekey: SVGStopElement,
    className: SVGAnimatedString,
    focusable: SVGAnimatedEnumeration,
    offset: SVGAnimatedNumber,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGStopElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGStopElement_typekey")(MSHTMLDotSVGStopElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGStopElement]
  }
  @scala.inline
  implicit class SVGStopElementOps[Self <: SVGStopElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGStopElement_typekey(value: SVGStopElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGStopElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: SVGAnimatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusable(value: SVGAnimatedEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: SVGAnimatedNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerSVGElement(value: ISVGSVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerSVGElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportElement(value: ISVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlbase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlbase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

