package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTextPositioningElement extends js.Object {
  @JSName("MSHTML.SVGTextPositioningElement_typekey")
  var MSHTMLDotSVGTextPositioningElement_typekey: SVGTextPositioningElement = js.native
  val className: SVGAnimatedString = js.native
  var dx: SVGAnimatedLengthList = js.native
  var dy: SVGAnimatedLengthList = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var lengthAdjust: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  var rotate: SVGAnimatedNumberList = js.native
  val systemLanguage: SVGStringList = js.native
  var textLength: SVGAnimatedLength = js.native
  var viewportElement: ISVGElement = js.native
  var x: SVGAnimatedLengthList = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
  var y: SVGAnimatedLengthList = js.native
  def getCharNumAtPosition(point: SVGPoint): Double = js.native
  def getComputedTextLength(): Double = js.native
  def getEndPositionOfChar(charnum: Double): SVGPoint = js.native
  def getExtentOfChar(charnum: Double): SVGRect = js.native
  def getNumberOfChars(): Double = js.native
  def getRotationOfChar(charnum: Double): Double = js.native
  def getStartPositionOfChar(charnum: Double): SVGPoint = js.native
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  def hasExtension(extension: String): Boolean = js.native
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
}

object SVGTextPositioningElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGTextPositioningElement_typekey: SVGTextPositioningElement,
    className: SVGAnimatedString,
    dx: SVGAnimatedLengthList,
    dy: SVGAnimatedLengthList,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    getCharNumAtPosition: SVGPoint => Double,
    getComputedTextLength: () => Double,
    getEndPositionOfChar: Double => SVGPoint,
    getExtentOfChar: Double => SVGRect,
    getNumberOfChars: () => Double,
    getRotationOfChar: Double => Double,
    getStartPositionOfChar: Double => SVGPoint,
    getSubStringLength: (Double, Double) => Double,
    hasExtension: String => Boolean,
    lengthAdjust: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    rotate: SVGAnimatedNumberList,
    selectSubString: (Double, Double) => Unit,
    systemLanguage: SVGStringList,
    textLength: SVGAnimatedLength,
    viewportElement: ISVGElement,
    x: SVGAnimatedLengthList,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLengthList
  ): SVGTextPositioningElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getCharNumAtPosition = js.Any.fromFunction1(getCharNumAtPosition), getComputedTextLength = js.Any.fromFunction0(getComputedTextLength), getEndPositionOfChar = js.Any.fromFunction1(getEndPositionOfChar), getExtentOfChar = js.Any.fromFunction1(getExtentOfChar), getNumberOfChars = js.Any.fromFunction0(getNumberOfChars), getRotationOfChar = js.Any.fromFunction1(getRotationOfChar), getStartPositionOfChar = js.Any.fromFunction1(getStartPositionOfChar), getSubStringLength = js.Any.fromFunction2(getSubStringLength), hasExtension = js.Any.fromFunction1(hasExtension), lengthAdjust = lengthAdjust.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectSubString = js.Any.fromFunction2(selectSubString), systemLanguage = systemLanguage.asInstanceOf[js.Any], textLength = textLength.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTextPositioningElement_typekey")(MSHTMLDotSVGTextPositioningElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTextPositioningElement]
  }
  @scala.inline
  implicit class SVGTextPositioningElementOps[Self <: SVGTextPositioningElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGTextPositioningElement_typekey(value: SVGTextPositioningElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGTextPositioningElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: SVGAnimatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDx(value: SVGAnimatedLengthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDy(value: SVGAnimatedLengthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
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
    def withGetCharNumAtPosition(value: SVGPoint => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharNumAtPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetComputedTextLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComputedTextLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndPositionOfChar(value: Double => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndPositionOfChar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetExtentOfChar(value: Double => SVGRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtentOfChar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumberOfChars(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberOfChars")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRotationOfChar(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRotationOfChar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStartPositionOfChar(value: Double => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartPositionOfChar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSubStringLength(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubStringLength")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasExtension(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasExtension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLengthAdjust(value: SVGAnimatedEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthAdjust")(value.asInstanceOf[js.Any])
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
    def withRotate(value: SVGAnimatedNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectSubString(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSubString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSystemLanguage(value: SVGStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLength(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportElement(value: ISVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: SVGAnimatedLengthList): Self = {
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
    def withY(value: SVGAnimatedLengthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

