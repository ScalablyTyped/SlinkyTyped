package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGRadialGradientElement extends js.Object {
  @JSName("MSHTML.SVGRadialGradientElement_typekey")
  var MSHTMLDotSVGRadialGradientElement_typekey: SVGRadialGradientElement = js.native
  val className: SVGAnimatedString = js.native
  var cx: SVGAnimatedLength = js.native
  var cy: SVGAnimatedLength = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var fx: SVGAnimatedLength = js.native
  var fy: SVGAnimatedLength = js.native
  var gradientTransform: SVGAnimatedTransformList = js.native
  var gradientUnits: SVGAnimatedEnumeration = js.native
  val href: SVGAnimatedString = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var r: SVGAnimatedLength = js.native
  var spreadMethod: SVGAnimatedEnumeration = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
}

object SVGRadialGradientElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGRadialGradientElement_typekey: SVGRadialGradientElement,
    className: SVGAnimatedString,
    cx: SVGAnimatedLength,
    cy: SVGAnimatedLength,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    fx: SVGAnimatedLength,
    fy: SVGAnimatedLength,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    r: SVGAnimatedLength,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGRadialGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGRadialGradientElement_typekey")(MSHTMLDotSVGRadialGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRadialGradientElement]
  }
  @scala.inline
  implicit class SVGRadialGradientElementOps[Self <: SVGRadialGradientElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGRadialGradientElement_typekey(value: SVGRadialGradientElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGRadialGradientElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: SVGAnimatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCx(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCy(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
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
    def withFx(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFy(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fy")(value.asInstanceOf[js.Any])
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
    def withR(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
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
    def withXmlbase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlbase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

