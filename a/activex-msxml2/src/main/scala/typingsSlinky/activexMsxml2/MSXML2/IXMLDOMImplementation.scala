package typingsSlinky.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXMLDOMImplementation extends StObject {
  
  @JSName("MSXML2.IXMLDOMImplementation_typekey")
  var MSXML2DotIXMLDOMImplementation_typekey: IXMLDOMImplementation = js.native
  
  def hasFeature(feature: String, version: String): Boolean = js.native
}
object IXMLDOMImplementation {
  
  @scala.inline
  def apply(
    MSXML2DotIXMLDOMImplementation_typekey: IXMLDOMImplementation,
    hasFeature: (String, String) => Boolean
  ): IXMLDOMImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.updateDynamic("MSXML2.IXMLDOMImplementation_typekey")(MSXML2DotIXMLDOMImplementation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLDOMImplementation]
  }
  
  @scala.inline
  implicit class IXMLDOMImplementationMutableBuilder[Self <: IXMLDOMImplementation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasFeature(value: (String, String) => Boolean): Self = StObject.set(x, "hasFeature", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMSXML2DotIXMLDOMImplementation_typekey(value: IXMLDOMImplementation): Self = StObject.set(x, "MSXML2.IXMLDOMImplementation_typekey", value.asInstanceOf[js.Any])
  }
}
