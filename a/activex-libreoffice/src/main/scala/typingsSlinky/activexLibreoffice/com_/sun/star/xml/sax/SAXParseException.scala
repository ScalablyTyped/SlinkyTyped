package typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * stores information for locating the error in the original XML document.
  * @see XLocator
  */
@js.native
trait SAXParseException extends SAXException {
  
  /** contains the column number in the document. */
  var ColumnNumber: Double = js.native
  
  /** contains the line number in the document. */
  var LineNumber: Double = js.native
  
  /** contains the public identifier of the document where the exception has occurred. */
  var PublicId: String = js.native
  
  /** contains the system identifier of the document. */
  var SystemId: String = js.native
}
object SAXParseException {
  
  @scala.inline
  def apply(
    ColumnNumber: Double,
    Context: XInterface,
    LineNumber: Double,
    Message: String,
    PublicId: String,
    SystemId: String,
    WrappedException: js.Any
  ): SAXParseException = {
    val __obj = js.Dynamic.literal(ColumnNumber = ColumnNumber.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], PublicId = PublicId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any], WrappedException = WrappedException.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXParseException]
  }
  
  @scala.inline
  implicit class SAXParseExceptionMutableBuilder[Self <: SAXParseException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: Double): Self = StObject.set(x, "ColumnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "LineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "PublicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemId(value: String): Self = StObject.set(x, "SystemId", value.asInstanceOf[js.Any])
  }
}
