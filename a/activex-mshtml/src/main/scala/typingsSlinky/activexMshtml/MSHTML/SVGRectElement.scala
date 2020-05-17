package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGRectElement extends js.Object {
  @JSName("MSHTML.SVGRectElement_typekey")
  var MSHTMLDotSVGRectElement_typekey: SVGRectElement = js.native
  val className: SVGAnimatedString = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var height: SVGAnimatedLength = js.native
  val nearestViewportElement: ISVGElement = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  var rx: SVGAnimatedLength = js.native
  var ry: SVGAnimatedLength = js.native
  val systemLanguage: SVGStringList = js.native
  val transform: SVGAnimatedTransformList = js.native
  var viewportElement: ISVGElement = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
  var y: SVGAnimatedLength = js.native
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: String): Boolean = js.native
}

object SVGRectElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGRectElement_typekey: SVGRectElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    rx: SVGAnimatedLength,
    ry: SVGAnimatedLength,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength
  ): SVGRectElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGRectElement_typekey")(MSHTMLDotSVGRectElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRectElement]
  }
  @scala.inline
  implicit class SVGRectElementOps[Self <: SVGRectElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGRectElement_typekey(value: SVGRectElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGRectElement_typekey")(value.asInstanceOf[js.Any])
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
    def withFarthestViewportElement(value: ISVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farthestViewportElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusable(value: SVGAnimatedEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBBox(value: () => SVGRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCTM(value: () => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCTM")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScreenCTM(value: () => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreenCTM")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTransformToElement(value: ISVGElement => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransformToElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasExtension(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasExtension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNearestViewportElement(value: ISVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearestViewportElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerSVGElement(value: ISVGSVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerSVGElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredExtensions(value: SVGStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredFeatures(value: SVGStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemLanguage(value: SVGStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: SVGAnimatedTransformList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportElement(value: ISVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportElement")(value.asInstanceOf[js.Any])
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
    def withXmlbase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlbase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmllang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmllang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlspace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlspace")(value.asInstanceOf[js.Any])
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

