package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGStyleElement extends StObject {
  
  @JSName("MSHTML.SVGStyleElement_typekey")
  var MSHTMLDotSVGStyleElement_typekey: SVGStyleElement = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  var media: String = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var `type`: String = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
  
  var xmllang: String = js.native
  
  var xmlspace: String = js.native
}
object SVGStyleElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGStyleElement_typekey: SVGStyleElement,
    focusable: SVGAnimatedEnumeration,
    media: String,
    ownerSVGElement: ISVGSVGElement,
    `type`: String,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGStyleElement = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGStyleElement_typekey")(MSHTMLDotSVGStyleElement_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGStyleElement]
  }
  
  @scala.inline
  implicit class SVGStyleElementMutableBuilder[Self <: SVGStyleElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGStyleElement_typekey(value: SVGStyleElement): Self = StObject.set(x, "MSHTML.SVGStyleElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
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
