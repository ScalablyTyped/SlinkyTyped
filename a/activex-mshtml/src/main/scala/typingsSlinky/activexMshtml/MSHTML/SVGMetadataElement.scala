package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGMetadataElement extends StObject {
  
  @JSName("MSHTML.SVGMetadataElement_typekey")
  var MSHTMLDotSVGMetadataElement_typekey: SVGMetadataElement = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
}
object SVGMetadataElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGMetadataElement_typekey: SVGMetadataElement,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGMetadataElement = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMetadataElement_typekey")(MSHTMLDotSVGMetadataElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMetadataElement]
  }
  
  @scala.inline
  implicit class SVGMetadataElementMutableBuilder[Self <: SVGMetadataElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGMetadataElement_typekey(value: SVGMetadataElement): Self = StObject.set(x, "MSHTML.SVGMetadataElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
