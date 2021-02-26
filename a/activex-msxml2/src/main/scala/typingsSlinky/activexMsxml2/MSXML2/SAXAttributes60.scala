package typingsSlinky.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SAX Attributes 6.0 */
@js.native
trait SAXAttributes60 extends StObject {
  
  @JSName("MSXML2.SAXAttributes60_typekey")
  var MSXML2DotSAXAttributes60_typekey: SAXAttributes60 = js.native
  
  /** Add an attribute to the end of the list. */
  def addAttribute(strURI: String, strLocalName: String, strQName: String, strType: String, strValue: String): Unit = js.native
  
  /** Add an attribute, whose value is equal to the indexed attribute in the input attributes object, to the end of the list. */
  def addAttributeFromIndex(varAtts: js.Any, nIndex: Double): Unit = js.native
  
  /** Clear the attribute list for reuse. */
  def clear(): Unit = js.native
  
  /** Remove an attribute from the list. */
  def removeAttribute(nIndex: Double): Unit = js.native
  
  /** Set an attribute in the list. */
  def setAttribute(
    nIndex: Double,
    strURI: String,
    strLocalName: String,
    strQName: String,
    strType: String,
    strValue: String
  ): Unit = js.native
  
  /** Copy an entire Attributes object. */
  def setAttributes(varAtts: js.Any): Unit = js.native
  
  /** Set the local name of a specific attribute. */
  def setLocalName(nIndex: Double, strLocalName: String): Unit = js.native
  
  /** Set the qualified name of a specific attribute. */
  def setQName(nIndex: Double, strQName: String): Unit = js.native
  
  /** Set the type of a specific attribute. */
  def setType(nIndex: Double, strType: String): Unit = js.native
  
  /** Set the Namespace URI of a specific attribute. */
  def setURI(nIndex: Double, strURI: String): Unit = js.native
  
  /** Set the value of a specific attribute. */
  def setValue(nIndex: Double, strValue: String): Unit = js.native
}
object SAXAttributes60 {
  
  @scala.inline
  def apply(
    MSXML2DotSAXAttributes60_typekey: SAXAttributes60,
    addAttribute: (String, String, String, String, String) => Unit,
    addAttributeFromIndex: (js.Any, Double) => Unit,
    clear: () => Unit,
    removeAttribute: Double => Unit,
    setAttribute: (Double, String, String, String, String, String) => Unit,
    setAttributes: js.Any => Unit,
    setLocalName: (Double, String) => Unit,
    setQName: (Double, String) => Unit,
    setType: (Double, String) => Unit,
    setURI: (Double, String) => Unit,
    setValue: (Double, String) => Unit
  ): SAXAttributes60 = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction5(addAttribute), addAttributeFromIndex = js.Any.fromFunction2(addAttributeFromIndex), clear = js.Any.fromFunction0(clear), removeAttribute = js.Any.fromFunction1(removeAttribute), setAttribute = js.Any.fromFunction6(setAttribute), setAttributes = js.Any.fromFunction1(setAttributes), setLocalName = js.Any.fromFunction2(setLocalName), setQName = js.Any.fromFunction2(setQName), setType = js.Any.fromFunction2(setType), setURI = js.Any.fromFunction2(setURI), setValue = js.Any.fromFunction2(setValue))
    __obj.updateDynamic("MSXML2.SAXAttributes60_typekey")(MSXML2DotSAXAttributes60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXAttributes60]
  }
  
  @scala.inline
  implicit class SAXAttributes60MutableBuilder[Self <: SAXAttributes60] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAttribute(value: (String, String, String, String, String) => Unit): Self = StObject.set(x, "addAttribute", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddAttributeFromIndex(value: (js.Any, Double) => Unit): Self = StObject.set(x, "addAttributeFromIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSXML2DotSAXAttributes60_typekey(value: SAXAttributes60): Self = StObject.set(x, "MSXML2.SAXAttributes60_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAttribute(value: Double => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttribute(value: (Double, String, String, String, String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction6(value))
    
    @scala.inline
    def setSetAttributes(value: js.Any => Unit): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocalName(value: (Double, String) => Unit): Self = StObject.set(x, "setLocalName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetQName(value: (Double, String) => Unit): Self = StObject.set(x, "setQName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetType(value: (Double, String) => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetURI(value: (Double, String) => Unit): Self = StObject.set(x, "setURI", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: (Double, String) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
  }
}
