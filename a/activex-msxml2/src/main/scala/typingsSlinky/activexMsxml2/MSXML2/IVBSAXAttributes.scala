package typingsSlinky.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXAttributes interface */
@js.native
trait IVBSAXAttributes extends StObject {
  
  @JSName("MSXML2.IVBSAXAttributes_typekey")
  var MSXML2DotIVBSAXAttributes_typekey: IVBSAXAttributes = js.native
  
  /** Look up the index of an attribute by Namespace name. */
  def getIndexFromName(strURI: String, strLocalName: String): Double = js.native
  
  /** Look up the index of an attribute by XML 1.0 qualified name. */
  def getIndexFromQName(strQName: String): Double = js.native
  
  /** Look up an attribute's local name by index. */
  def getLocalName(nIndex: Double): String = js.native
  
  /** Look up an attribute's XML 1.0 qualified name by index. */
  def getQName(nIndex: Double): String = js.native
  
  /** Look up an attribute's type by index. */
  def getType(nIndex: Double): String = js.native
  
  /** Look up an attribute's type by Namespace name. */
  def getTypeFromName(strURI: String, strLocalName: String): String = js.native
  
  /** Look up an attribute's type by XML 1.0 qualified name. */
  def getTypeFromQName(strQName: String): String = js.native
  
  /** Look up an attribute's Namespace URI by index. */
  def getURI(nIndex: Double): String = js.native
  
  /** Look up an attribute's value by index. */
  def getValue(nIndex: Double): String = js.native
  
  /** Look up an attribute's value by Namespace name. */
  def getValueFromName(strURI: String, strLocalName: String): String = js.native
  
  /** Look up an attribute's value by XML 1.0 qualified name. */
  def getValueFromQName(strQName: String): String = js.native
  
  /** Get the number of attributes in the list. */
  val length: Double = js.native
}
object IVBSAXAttributes {
  
  @scala.inline
  def apply(
    MSXML2DotIVBSAXAttributes_typekey: IVBSAXAttributes,
    getIndexFromName: (String, String) => Double,
    getIndexFromQName: String => Double,
    getLocalName: Double => String,
    getQName: Double => String,
    getType: Double => String,
    getTypeFromName: (String, String) => String,
    getTypeFromQName: String => String,
    getURI: Double => String,
    getValue: Double => String,
    getValueFromName: (String, String) => String,
    getValueFromQName: String => String,
    length: Double
  ): IVBSAXAttributes = {
    val __obj = js.Dynamic.literal(getIndexFromName = js.Any.fromFunction2(getIndexFromName), getIndexFromQName = js.Any.fromFunction1(getIndexFromQName), getLocalName = js.Any.fromFunction1(getLocalName), getQName = js.Any.fromFunction1(getQName), getType = js.Any.fromFunction1(getType), getTypeFromName = js.Any.fromFunction2(getTypeFromName), getTypeFromQName = js.Any.fromFunction1(getTypeFromQName), getURI = js.Any.fromFunction1(getURI), getValue = js.Any.fromFunction1(getValue), getValueFromName = js.Any.fromFunction2(getValueFromName), getValueFromQName = js.Any.fromFunction1(getValueFromQName), length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.IVBSAXAttributes_typekey")(MSXML2DotIVBSAXAttributes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXAttributes]
  }
  
  @scala.inline
  implicit class IVBSAXAttributesMutableBuilder[Self <: IVBSAXAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetIndexFromName(value: (String, String) => Double): Self = StObject.set(x, "getIndexFromName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIndexFromQName(value: String => Double): Self = StObject.set(x, "getIndexFromQName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLocalName(value: Double => String): Self = StObject.set(x, "getLocalName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetQName(value: Double => String): Self = StObject.set(x, "getQName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetType(value: Double => String): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTypeFromName(value: (String, String) => String): Self = StObject.set(x, "getTypeFromName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTypeFromQName(value: String => String): Self = StObject.set(x, "getTypeFromQName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetURI(value: Double => String): Self = StObject.set(x, "getURI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: Double => String): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueFromName(value: (String, String) => String): Self = StObject.set(x, "getValueFromName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValueFromQName(value: String => String): Self = StObject.set(x, "getValueFromQName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSXML2DotIVBSAXAttributes_typekey(value: IVBSAXAttributes): Self = StObject.set(x, "MSXML2.IVBSAXAttributes_typekey", value.asInstanceOf[js.Any])
  }
}
