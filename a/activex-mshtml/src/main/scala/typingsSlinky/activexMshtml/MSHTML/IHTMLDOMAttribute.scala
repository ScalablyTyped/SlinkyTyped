package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLDOMAttribute extends StObject {
  
  @JSName("MSHTML.IHTMLDOMAttribute_typekey")
  var MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute = js.native
  
  val nodeName: String = js.native
  
  var nodeValue: js.Any = js.native
  
  val specified: Boolean = js.native
}
object IHTMLDOMAttribute {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute,
    nodeName: String,
    nodeValue: js.Any,
    specified: Boolean
  ): IHTMLDOMAttribute = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], specified = specified.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDOMAttribute_typekey")(MSHTMLDotIHTMLDOMAttribute_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDOMAttribute]
  }
  
  @scala.inline
  implicit class IHTMLDOMAttributeMutableBuilder[Self <: IHTMLDOMAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotIHTMLDOMAttribute_typekey(value: IHTMLDOMAttribute): Self = StObject.set(x, "MSHTML.IHTMLDOMAttribute_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValue(value: js.Any): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecified(value: Boolean): Self = StObject.set(x, "specified", value.asInstanceOf[js.Any])
  }
}
