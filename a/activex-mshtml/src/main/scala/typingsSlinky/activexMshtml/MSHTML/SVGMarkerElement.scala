package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGMarkerElement extends js.Object {
  @JSName("MSHTML.SVGMarkerElement_typekey")
  var MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement = js.native
  val className: SVGAnimatedString = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var markerHeight: SVGAnimatedLength = js.native
  var markerUnits: SVGAnimatedEnumeration = js.native
  var markerWidth: SVGAnimatedLength = js.native
  var orientAngle: SVGAnimatedAngle = js.native
  var orientType: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  var refX: SVGAnimatedLength = js.native
  var refY: SVGAnimatedLength = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
  def setOrientToAngle(pSVGAngle: SVGAngle): Unit = js.native
  def setOrientToAuto(): Unit = js.native
}

object SVGMarkerElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    markerHeight: SVGAnimatedLength,
    markerUnits: SVGAnimatedEnumeration,
    markerWidth: SVGAnimatedLength,
    orientAngle: SVGAnimatedAngle,
    orientType: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    refX: SVGAnimatedLength,
    refY: SVGAnimatedLength,
    setOrientToAngle: SVGAngle => Unit,
    setOrientToAuto: () => Unit,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGMarkerElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], markerUnits = markerUnits.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], orientAngle = orientAngle.asInstanceOf[js.Any], orientType = orientType.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], refX = refX.asInstanceOf[js.Any], refY = refY.asInstanceOf[js.Any], setOrientToAngle = js.Any.fromFunction1(setOrientToAngle), setOrientToAuto = js.Any.fromFunction0(setOrientToAuto), viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMarkerElement_typekey")(MSHTMLDotSVGMarkerElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMarkerElement]
  }
  @scala.inline
  implicit class SVGMarkerElementOps[Self <: SVGMarkerElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGMarkerElement_typekey(value: SVGMarkerElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGMarkerElement_typekey")(value.asInstanceOf[js.Any])
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
    def withMarkerHeight(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerUnits(value: SVGAnimatedEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerWidth(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientAngle(value: SVGAnimatedAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientType(value: SVGAnimatedEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientType")(value.asInstanceOf[js.Any])
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
    def withRefX(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefY(value: SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetOrientToAngle(value: SVGAngle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrientToAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOrientToAuto(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrientToAuto")(js.Any.fromFunction0(value))
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
  }
  
}

