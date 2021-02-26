package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMParser extends StObject {
  
  @JSName("MSHTML.DOMParser_typekey")
  var MSHTMLDotDOMParser_typekey: DOMParser = js.native
  
  def parseFromString(xmlSource: String, mimeType: String): IHTMLDocument2 = js.native
}
object DOMParser {
  
  @scala.inline
  def apply(MSHTMLDotDOMParser_typekey: DOMParser, parseFromString: (String, String) => IHTMLDocument2): DOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.updateDynamic("MSHTML.DOMParser_typekey")(MSHTMLDotDOMParser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMParser]
  }
  
  @scala.inline
  implicit class DOMParserMutableBuilder[Self <: DOMParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotDOMParser_typekey(value: DOMParser): Self = StObject.set(x, "MSHTML.DOMParser_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFromString(value: (String, String) => IHTMLDocument2): Self = StObject.set(x, "parseFromString", js.Any.fromFunction2(value))
  }
}
