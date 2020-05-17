package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGSymbolElement extends js.Object {
  @JSName("MSHTML.SVGSymbolElement_typekey")
  var MSHTMLDotSVGSymbolElement_typekey: SVGSymbolElement = js.native
  val className: SVGAnimatedString = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
}

object SVGSymbolElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGSymbolElement_typekey: SVGSymbolElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGSymbolElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGSymbolElement_typekey")(MSHTMLDotSVGSymbolElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGSymbolElement]
  }
  @scala.inline
  implicit class SVGSymbolElementOps[Self <: SVGSymbolElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGSymbolElement_typekey(value: SVGSymbolElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGSymbolElement_typekey")(value.asInstanceOf[js.Any])
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

