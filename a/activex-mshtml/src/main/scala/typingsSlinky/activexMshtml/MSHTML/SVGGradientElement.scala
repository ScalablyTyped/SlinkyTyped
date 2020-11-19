package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGGradientElement extends js.Object {
  
  @JSName("MSHTML.SVGGradientElement_typekey")
  var MSHTMLDotSVGGradientElement_typekey: SVGGradientElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  var gradientTransform: SVGAnimatedTransformList = js.native
  
  var gradientUnits: SVGAnimatedEnumeration = js.native
  
  val href: SVGAnimatedString = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var spreadMethod: SVGAnimatedEnumeration = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
}
object SVGGradientElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGGradientElement_typekey: SVGGradientElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGGradientElement_typekey")(MSHTMLDotSVGGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGGradientElement]
  }
  
  @scala.inline
  implicit class SVGGradientElementOps[Self <: SVGGradientElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotSVGGradientElement_typekey(value: SVGGradientElement): Self = this.set("MSHTML.SVGGradientElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransform(value: SVGAnimatedTransformList): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUnits(value: SVGAnimatedEnumeration): Self = this.set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: SVGAnimatedString): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = this.set("ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadMethod(value: SVGAnimatedEnumeration): Self = this.set("spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = this.set("viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = this.set("xmlbase", value.asInstanceOf[js.Any])
  }
}
