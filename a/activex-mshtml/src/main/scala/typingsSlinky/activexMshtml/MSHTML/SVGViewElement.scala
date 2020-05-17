package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGViewElement extends js.Object {
  @JSName("MSHTML.SVGViewElement_typekey")
  var MSHTMLDotSVGViewElement_typekey: SVGViewElement = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewTarget: SVGStringList = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
  val zoomAndPan: Double = js.native
}

object SVGViewElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGViewElement_typekey: SVGViewElement,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    viewBox: SVGAnimatedRect,
    viewTarget: SVGStringList,
    viewportElement: ISVGElement,
    xmlbase: String,
    zoomAndPan: Double
  ): SVGViewElement = {
    val __obj = js.Dynamic.literal(externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewTarget = viewTarget.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGViewElement_typekey")(MSHTMLDotSVGViewElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGViewElement]
  }
  @scala.inline
  implicit class SVGViewElementOps[Self <: SVGViewElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGViewElement_typekey(value: SVGViewElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGViewElement_typekey")(value.asInstanceOf[js.Any])
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
    def withViewBox(value: SVGAnimatedRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewTarget(value: SVGStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewTarget")(value.asInstanceOf[js.Any])
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
    def withZoomAndPan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAndPan")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

