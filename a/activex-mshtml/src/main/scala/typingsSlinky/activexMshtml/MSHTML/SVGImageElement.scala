package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGImageElement extends js.Object {
  @JSName("MSHTML.SVGImageElement_typekey")
  var MSHTMLDotSVGImageElement_typekey: SVGImageElement = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var height: SVGAnimatedLength = js.native
  val href: SVGAnimatedString = js.native
  val nearestViewportElement: ISVGElement = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  val systemLanguage: SVGStringList = js.native
  val transform: SVGAnimatedTransformList = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewportElement: ISVGElement = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var xmlbase: String = js.native
  var y: SVGAnimatedLength = js.native
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: String): Boolean = js.native
}

object SVGImageElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGImageElement_typekey: SVGImageElement,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    href: SVGAnimatedString,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    y: SVGAnimatedLength
  ): SVGImageElement = {
    val __obj = js.Dynamic.literal(farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGImageElement_typekey")(MSHTMLDotSVGImageElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGImageElement]
  }
  @scala.inline
  implicit class SVGImageElementOps[Self <: SVGImageElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGImageElement_typekey(value: SVGImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGImageElement_typekey")(value.asInstanceOf[js.Any])
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
    def withHref(value: SVGAnimatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
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
    def withPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(value.asInstanceOf[js.Any])
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
    def withViewBox(value: SVGAnimatedRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(value.asInstanceOf[js.Any])
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
    def withY(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

