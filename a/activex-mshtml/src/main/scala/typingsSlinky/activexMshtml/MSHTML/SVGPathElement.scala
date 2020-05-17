package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathElement extends js.Object {
  @JSName("MSHTML.SVGPathElement_typekey")
  var MSHTMLDotSVGPathElement_typekey: SVGPathElement = js.native
  var animatedNormalizedPathSegList: SVGPathSegList = js.native
  var animatedPathSegList: SVGPathSegList = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  val nearestViewportElement: ISVGElement = js.native
  var normalizedPathSegList: SVGPathSegList = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var pathLength: SVGAnimatedNumber = js.native
  var pathSegList: SVGPathSegList = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  val systemLanguage: SVGStringList = js.native
  val transform: SVGAnimatedTransformList = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
  def createSVGPathSegArcAbs(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: Boolean,
    sweepFlag: Boolean
  ): ISVGPathSegArcAbs = js.native
  def createSVGPathSegArcRel(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: Boolean,
    sweepFlag: Boolean
  ): ISVGPathSegArcRel = js.native
  def createSVGPathSegClosePath(): ISVGPathSegClosePath = js.native
  def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicAbs = js.native
  def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicRel = js.native
  def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicSmoothAbs = js.native
  def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicSmoothRel = js.native
  def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double, y1: Double): ISVGPathSegCurvetoQuadraticAbs = js.native
  def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double, y1: Double): ISVGPathSegCurvetoQuadraticRel = js.native
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double, y: Double): ISVGPathSegCurvetoQuadraticSmoothAbs = js.native
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double, y: Double): ISVGPathSegCurvetoQuadraticSmoothRel = js.native
  def createSVGPathSegLinetoAbs(x: Double, y: Double): ISVGPathSegLinetoAbs = js.native
  def createSVGPathSegLinetoHorizontalAbs(x: Double): ISVGPathSegLinetoHorizontalAbs = js.native
  def createSVGPathSegLinetoHorizontalRel(x: Double): ISVGPathSegLinetoHorizontalRel = js.native
  def createSVGPathSegLinetoRel(x: Double, y: Double): ISVGPathSegLinetoRel = js.native
  def createSVGPathSegLinetoVerticalAbs(y: Double): ISVGPathSegLinetoVerticalAbs = js.native
  def createSVGPathSegLinetoVerticalRel(y: Double): ISVGPathSegLinetoVerticalRel = js.native
  def createSVGPathSegMovetoAbs(x: Double, y: Double): ISVGPathSegMovetoAbs = js.native
  def createSVGPathSegMovetoRel(x: Double, y: Double): ISVGPathSegMovetoRel = js.native
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getPathSegAtLength(fltdistance: Double): Double = js.native
  def getPointAtLength(fltdistance: Double): SVGPoint = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTotalLength(): Double = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: String): Boolean = js.native
}

object SVGPathElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGPathElement_typekey: SVGPathElement,
    animatedNormalizedPathSegList: SVGPathSegList,
    animatedPathSegList: SVGPathSegList,
    createSVGPathSegArcAbs: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcAbs,
    createSVGPathSegArcRel: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcRel,
    createSVGPathSegClosePath: () => ISVGPathSegClosePath,
    createSVGPathSegCurvetoCubicAbs: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicAbs,
    createSVGPathSegCurvetoCubicRel: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicRel,
    createSVGPathSegCurvetoCubicSmoothAbs: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothAbs,
    createSVGPathSegCurvetoCubicSmoothRel: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothRel,
    createSVGPathSegCurvetoQuadraticAbs: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticAbs,
    createSVGPathSegCurvetoQuadraticRel: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticRel,
    createSVGPathSegCurvetoQuadraticSmoothAbs: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothAbs,
    createSVGPathSegCurvetoQuadraticSmoothRel: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothRel,
    createSVGPathSegLinetoAbs: (Double, Double) => ISVGPathSegLinetoAbs,
    createSVGPathSegLinetoHorizontalAbs: Double => ISVGPathSegLinetoHorizontalAbs,
    createSVGPathSegLinetoHorizontalRel: Double => ISVGPathSegLinetoHorizontalRel,
    createSVGPathSegLinetoRel: (Double, Double) => ISVGPathSegLinetoRel,
    createSVGPathSegLinetoVerticalAbs: Double => ISVGPathSegLinetoVerticalAbs,
    createSVGPathSegLinetoVerticalRel: Double => ISVGPathSegLinetoVerticalRel,
    createSVGPathSegMovetoAbs: (Double, Double) => ISVGPathSegMovetoAbs,
    createSVGPathSegMovetoRel: (Double, Double) => ISVGPathSegMovetoRel,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getPathSegAtLength: Double => Double,
    getPointAtLength: Double => SVGPoint,
    getScreenCTM: () => SVGMatrix,
    getTotalLength: () => Double,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    nearestViewportElement: ISVGElement,
    normalizedPathSegList: SVGPathSegList,
    ownerSVGElement: ISVGSVGElement,
    pathLength: SVGAnimatedNumber,
    pathSegList: SVGPathSegList,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGPathElement = {
    val __obj = js.Dynamic.literal(animatedNormalizedPathSegList = animatedNormalizedPathSegList.asInstanceOf[js.Any], animatedPathSegList = animatedPathSegList.asInstanceOf[js.Any], createSVGPathSegArcAbs = js.Any.fromFunction7(createSVGPathSegArcAbs), createSVGPathSegArcRel = js.Any.fromFunction7(createSVGPathSegArcRel), createSVGPathSegClosePath = js.Any.fromFunction0(createSVGPathSegClosePath), createSVGPathSegCurvetoCubicAbs = js.Any.fromFunction6(createSVGPathSegCurvetoCubicAbs), createSVGPathSegCurvetoCubicRel = js.Any.fromFunction6(createSVGPathSegCurvetoCubicRel), createSVGPathSegCurvetoCubicSmoothAbs = js.Any.fromFunction4(createSVGPathSegCurvetoCubicSmoothAbs), createSVGPathSegCurvetoCubicSmoothRel = js.Any.fromFunction4(createSVGPathSegCurvetoCubicSmoothRel), createSVGPathSegCurvetoQuadraticAbs = js.Any.fromFunction4(createSVGPathSegCurvetoQuadraticAbs), createSVGPathSegCurvetoQuadraticRel = js.Any.fromFunction4(createSVGPathSegCurvetoQuadraticRel), createSVGPathSegCurvetoQuadraticSmoothAbs = js.Any.fromFunction2(createSVGPathSegCurvetoQuadraticSmoothAbs), createSVGPathSegCurvetoQuadraticSmoothRel = js.Any.fromFunction2(createSVGPathSegCurvetoQuadraticSmoothRel), createSVGPathSegLinetoAbs = js.Any.fromFunction2(createSVGPathSegLinetoAbs), createSVGPathSegLinetoHorizontalAbs = js.Any.fromFunction1(createSVGPathSegLinetoHorizontalAbs), createSVGPathSegLinetoHorizontalRel = js.Any.fromFunction1(createSVGPathSegLinetoHorizontalRel), createSVGPathSegLinetoRel = js.Any.fromFunction2(createSVGPathSegLinetoRel), createSVGPathSegLinetoVerticalAbs = js.Any.fromFunction1(createSVGPathSegLinetoVerticalAbs), createSVGPathSegLinetoVerticalRel = js.Any.fromFunction1(createSVGPathSegLinetoVerticalRel), createSVGPathSegMovetoAbs = js.Any.fromFunction2(createSVGPathSegMovetoAbs), createSVGPathSegMovetoRel = js.Any.fromFunction2(createSVGPathSegMovetoRel), farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getPathSegAtLength = js.Any.fromFunction1(getPathSegAtLength), getPointAtLength = js.Any.fromFunction1(getPointAtLength), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTotalLength = js.Any.fromFunction0(getTotalLength), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], normalizedPathSegList = normalizedPathSegList.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any], pathSegList = pathSegList.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathElement_typekey")(MSHTMLDotSVGPathElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathElement]
  }
  @scala.inline
  implicit class SVGPathElementOps[Self <: SVGPathElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPathElement_typekey(value: SVGPathElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPathElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimatedNormalizedPathSegList(value: SVGPathSegList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedNormalizedPathSegList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimatedPathSegList(value: SVGPathSegList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedPathSegList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSVGPathSegArcAbs(value: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegArcAbs")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegArcRel(value: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegArcRel")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegClosePath(value: () => ISVGPathSegClosePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegClosePath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegCurvetoCubicAbs(value: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegCurvetoCubicAbs")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegCurvetoCubicRel(value: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegCurvetoCubicRel")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegCurvetoCubicSmoothAbs(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegCurvetoCubicSmoothAbs")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegCurvetoCubicSmoothRel(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegCurvetoCubicSmoothRel")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegCurvetoQuadraticAbs(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegCurvetoQuadraticAbs")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegCurvetoQuadraticRel(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegCurvetoQuadraticRel")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegCurvetoQuadraticSmoothAbs(value: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegCurvetoQuadraticSmoothAbs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegCurvetoQuadraticSmoothRel(value: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegCurvetoQuadraticSmoothRel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegLinetoAbs(value: (Double, Double) => ISVGPathSegLinetoAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegLinetoAbs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegLinetoHorizontalAbs(value: Double => ISVGPathSegLinetoHorizontalAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegLinetoHorizontalAbs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegLinetoHorizontalRel(value: Double => ISVGPathSegLinetoHorizontalRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegLinetoHorizontalRel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegLinetoRel(value: (Double, Double) => ISVGPathSegLinetoRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegLinetoRel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegLinetoVerticalAbs(value: Double => ISVGPathSegLinetoVerticalAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegLinetoVerticalAbs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegLinetoVerticalRel(value: Double => ISVGPathSegLinetoVerticalRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegLinetoVerticalRel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegMovetoAbs(value: (Double, Double) => ISVGPathSegMovetoAbs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegMovetoAbs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateSVGPathSegMovetoRel(value: (Double, Double) => ISVGPathSegMovetoRel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPathSegMovetoRel")(js.Any.fromFunction2(value))
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
    def withGetPathSegAtLength(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPathSegAtLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPointAtLength(value: Double => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPointAtLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScreenCTM(value: () => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreenCTM")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTotalLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalLength")(js.Any.fromFunction0(value))
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
    def withNearestViewportElement(value: ISVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearestViewportElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizedPathSegList(value: SVGPathSegList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedPathSegList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerSVGElement(value: ISVGSVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerSVGElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathLength(value: SVGAnimatedNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathSegList(value: SVGPathSegList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSegList")(value.asInstanceOf[js.Any])
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

