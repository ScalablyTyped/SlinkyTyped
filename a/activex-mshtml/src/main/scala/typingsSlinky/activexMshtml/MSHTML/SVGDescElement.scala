package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGDescElement extends StObject {
  
  @JSName("MSHTML.SVGDescElement_typekey")
  var MSHTMLDotSVGDescElement_typekey: SVGDescElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
  
  var xmllang: String = js.native
  
  var xmlspace: String = js.native
}
object SVGDescElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGDescElement_typekey: SVGDescElement,
    className: SVGAnimatedString,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGDescElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGDescElement_typekey")(MSHTMLDotSVGDescElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGDescElement]
  }
  
  @scala.inline
  implicit class SVGDescElementMutableBuilder[Self <: SVGDescElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGDescElement_typekey(value: SVGDescElement): Self = StObject.set(x, "MSHTML.SVGDescElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
  }
}
