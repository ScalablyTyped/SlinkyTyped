package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGSVGElement extends js.Object {
  @JSName("MSHTML.SVGSVGElement_typekey")
  var MSHTMLDotSVGSVGElement_typekey: SVGSVGElement = js.native
  val className: SVGAnimatedString = js.native
  var contentScriptType: String = js.native
  var contentStyleType: String = js.native
  var currentScale: Double = js.native
  var currentTranslate: SVGPoint = js.native
  var currentView: ISVGViewSpec = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var height: SVGAnimatedLength = js.native
  val nearestViewportElement: ISVGElement = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var pixelUnitToMillimeterX: Double = js.native
  var pixelUnitToMillimeterY: Double = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  var screenPixelToMillimeterX: Double = js.native
  var screenPixelToMillimeterY: Double = js.native
  val systemLanguage: SVGStringList = js.native
  var useCurrentView: Boolean = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewport: SVGRect = js.native
  var viewportElement: ISVGElement = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
  var y: SVGAnimatedLength = js.native
  val zoomAndPan: Double = js.native
  def animationsPaused(): Boolean = js.native
  def checkEnclosure(element: ISVGElement, rect: SVGRect): Boolean = js.native
  def checkIntersection(element: ISVGElement, rect: SVGRect): Boolean = js.native
  def createSVGAngle(): SVGAngle = js.native
  def createSVGLength(): SVGLength = js.native
  def createSVGMatrix(): SVGMatrix = js.native
  def createSVGNumber(): SVGNumber = js.native
  def createSVGPoint(): SVGPoint = js.native
  def createSVGRect(): SVGRect = js.native
  def createSVGTransform(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  def deselectAll(): Unit = js.native
  def forceRedraw(): Unit = js.native
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getCurrentTime(): Double = js.native
  def getElementById(elementId: String): IHTMLElement = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: String): Boolean = js.native
  def pauseAnimations(): Unit = js.native
  def setCurrentTime(seconds: Double): Unit = js.native
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  def unpauseAnimations(): Unit = js.native
  def unsuspendRedraw(suspendHandeID: Double): Unit = js.native
  def unsuspendRedrawAll(): Unit = js.native
}

object SVGSVGElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGSVGElement_typekey: SVGSVGElement,
    animationsPaused: () => Boolean,
    checkEnclosure: (ISVGElement, SVGRect) => Boolean,
    checkIntersection: (ISVGElement, SVGRect) => Boolean,
    className: SVGAnimatedString,
    contentScriptType: String,
    contentStyleType: String,
    createSVGAngle: () => SVGAngle,
    createSVGLength: () => SVGLength,
    createSVGMatrix: () => SVGMatrix,
    createSVGNumber: () => SVGNumber,
    createSVGPoint: () => SVGPoint,
    createSVGRect: () => SVGRect,
    createSVGTransform: () => SVGTransform,
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    currentScale: Double,
    currentTranslate: SVGPoint,
    currentView: ISVGViewSpec,
    deselectAll: () => Unit,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    forceRedraw: () => Unit,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getCurrentTime: () => Double,
    getElementById: String => IHTMLElement,
    getEnclosureList: (SVGRect, ISVGElement) => js.Any,
    getIntersectionList: (SVGRect, ISVGElement) => js.Any,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    pauseAnimations: () => Unit,
    pixelUnitToMillimeterX: Double,
    pixelUnitToMillimeterY: Double,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    screenPixelToMillimeterX: Double,
    screenPixelToMillimeterY: Double,
    setCurrentTime: Double => Unit,
    suspendRedraw: Double => Double,
    systemLanguage: SVGStringList,
    unpauseAnimations: () => Unit,
    unsuspendRedraw: Double => Unit,
    unsuspendRedrawAll: () => Unit,
    useCurrentView: Boolean,
    viewBox: SVGAnimatedRect,
    viewport: SVGRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength,
    zoomAndPan: Double
  ): SVGSVGElement = {
    val __obj = js.Dynamic.literal(animationsPaused = js.Any.fromFunction0(animationsPaused), checkEnclosure = js.Any.fromFunction2(checkEnclosure), checkIntersection = js.Any.fromFunction2(checkIntersection), className = className.asInstanceOf[js.Any], contentScriptType = contentScriptType.asInstanceOf[js.Any], contentStyleType = contentStyleType.asInstanceOf[js.Any], createSVGAngle = js.Any.fromFunction0(createSVGAngle), createSVGLength = js.Any.fromFunction0(createSVGLength), createSVGMatrix = js.Any.fromFunction0(createSVGMatrix), createSVGNumber = js.Any.fromFunction0(createSVGNumber), createSVGPoint = js.Any.fromFunction0(createSVGPoint), createSVGRect = js.Any.fromFunction0(createSVGRect), createSVGTransform = js.Any.fromFunction0(createSVGTransform), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), currentScale = currentScale.asInstanceOf[js.Any], currentTranslate = currentTranslate.asInstanceOf[js.Any], currentView = currentView.asInstanceOf[js.Any], deselectAll = js.Any.fromFunction0(deselectAll), externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], forceRedraw = js.Any.fromFunction0(forceRedraw), getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getCurrentTime = js.Any.fromFunction0(getCurrentTime), getElementById = js.Any.fromFunction1(getElementById), getEnclosureList = js.Any.fromFunction2(getEnclosureList), getIntersectionList = js.Any.fromFunction2(getIntersectionList), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], pauseAnimations = js.Any.fromFunction0(pauseAnimations), pixelUnitToMillimeterX = pixelUnitToMillimeterX.asInstanceOf[js.Any], pixelUnitToMillimeterY = pixelUnitToMillimeterY.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], screenPixelToMillimeterX = screenPixelToMillimeterX.asInstanceOf[js.Any], screenPixelToMillimeterY = screenPixelToMillimeterY.asInstanceOf[js.Any], setCurrentTime = js.Any.fromFunction1(setCurrentTime), suspendRedraw = js.Any.fromFunction1(suspendRedraw), systemLanguage = systemLanguage.asInstanceOf[js.Any], unpauseAnimations = js.Any.fromFunction0(unpauseAnimations), unsuspendRedraw = js.Any.fromFunction1(unsuspendRedraw), unsuspendRedrawAll = js.Any.fromFunction0(unsuspendRedrawAll), useCurrentView = useCurrentView.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGSVGElement_typekey")(MSHTMLDotSVGSVGElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGSVGElement]
  }
  @scala.inline
  implicit class SVGSVGElementOps[Self <: SVGSVGElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGSVGElement_typekey(value: SVGSVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGSVGElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationsPaused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationsPaused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckEnclosure(value: (ISVGElement, SVGRect) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkEnclosure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckIntersection(value: (ISVGElement, SVGRect) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIntersection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClassName(value: SVGAnimatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentScriptType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentStyleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSVGAngle(value: () => SVGAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGAngle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGLength(value: () => SVGLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGMatrix(value: () => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGMatrix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGNumber(value: () => SVGNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGPoint(value: () => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGRect(value: () => SVGRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGTransform(value: () => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSVGTransformFromMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTranslate(value: SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTranslate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentView(value: ISVGViewSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeselectAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAll")(js.Any.fromFunction0(value))
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
    def withForceRedraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRedraw")(js.Any.fromFunction0(value))
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
    def withGetCurrentTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElementById(value: String => IHTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEnclosureList(value: (SVGRect, ISVGElement) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnclosureList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetIntersectionList(value: (SVGRect, ISVGElement) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIntersectionList")(js.Any.fromFunction2(value))
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
    def withPauseAnimations(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseAnimations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPixelUnitToMillimeterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelUnitToMillimeterX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelUnitToMillimeterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelUnitToMillimeterY")(value.asInstanceOf[js.Any])
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
    def withScreenPixelToMillimeterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenPixelToMillimeterX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenPixelToMillimeterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenPixelToMillimeterY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCurrentTime(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuspendRedraw(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendRedraw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSystemLanguage(value: SVGStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpauseAnimations(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpauseAnimations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnsuspendRedraw(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsuspendRedraw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsuspendRedrawAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsuspendRedrawAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseCurrentView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCurrentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewBox(value: SVGAnimatedRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: SVGRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withZoomAndPan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAndPan")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

