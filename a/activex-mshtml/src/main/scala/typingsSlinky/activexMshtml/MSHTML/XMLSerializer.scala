package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLSerializer extends StObject {
  
  @JSName("MSHTML.XMLSerializer_typekey")
  var MSHTMLDotXMLSerializer_typekey: XMLSerializer = js.native
  
  def serializeToString(pNode: IHTMLDOMNode): String = js.native
}
object XMLSerializer {
  
  @scala.inline
  def apply(MSHTMLDotXMLSerializer_typekey: XMLSerializer, serializeToString: IHTMLDOMNode => String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.updateDynamic("MSHTML.XMLSerializer_typekey")(MSHTMLDotXMLSerializer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLSerializer]
  }
  
  @scala.inline
  implicit class XMLSerializerMutableBuilder[Self <: XMLSerializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotXMLSerializer_typekey(value: XMLSerializer): Self = StObject.set(x, "MSHTML.XMLSerializer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeToString(value: IHTMLDOMNode => String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
  }
}
