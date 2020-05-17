package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGLinearGradientElement extends js.Object {
  @JSName("MSHTML.SVGLinearGradientElement_typekey")
  var MSHTMLDotSVGLinearGradientElement_typekey: SVGLinearGradientElement = js.native
  val className: SVGAnimatedString = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var gradientTransform: SVGAnimatedTransformList = js.native
  var gradientUnits: SVGAnimatedEnumeration = js.native
  val href: SVGAnimatedString = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var spreadMethod: SVGAnimatedEnumeration = js.native
  var viewportElement: ISVGElement = js.native
  var x1: SVGAnimatedLength = js.native
  var x2: SVGAnimatedLength = js.native
  var xmlbase: String = js.native
  var y1: SVGAnimatedLength = js.native
  var y2: SVGAnimatedLength = js.native
}

object SVGLinearGradientElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGLinearGradientElement_typekey: SVGLinearGradientElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    x1: SVGAnimatedLength,
    x2: SVGAnimatedLength,
    xmlbase: String,
    y1: SVGAnimatedLength,
    y2: SVGAnimatedLength
  ): SVGLinearGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGLinearGradientElement_typekey")(MSHTMLDotSVGLinearGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLinearGradientElement]
  }
  @scala.inline
  implicit class SVGLinearGradientElementOps[Self <: SVGLinearGradientElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGLinearGradientElement_typekey(value: SVGLinearGradientElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGLinearGradientElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: SVGAnimatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalResourcesRequired(value: SVGAnimatedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalResourcesRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusable(value: SVGAnimatedEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientTransform(value: SVGAnimatedTransformList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientUnits(value: SVGAnimatedEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: SVGAnimatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerSVGElement(value: ISVGSVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerSVGElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpreadMethod(value: SVGAnimatedEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportElement(value: ISVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX1(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlbase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlbase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY1(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

