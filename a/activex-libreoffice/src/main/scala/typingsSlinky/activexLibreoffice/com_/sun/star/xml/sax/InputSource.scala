package typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax

import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the Datasource plus some additional information for the parser.
  *
  * There are two places where the application will deliver this input source to the parser:
  *
  * as the argument of {@link XParser.parseStream()}as the return value of XEntityReslover::resolveEntity().
  */
@js.native
trait InputSource extends StObject {
  
  /** contains the byte input stream of the document. */
  var aInputStream: XInputStream = js.native
  
  /**
    * contains the encoding of the data stream. This is used by the parser to do Unicode conversions.
    *
    * Note that in general you do not need to specify an encoding. Either it is UTF-8 or UTF-16 which is recognized by the parser or it is specified in the
    * first line of the XML-File ( e.g. **?xml encoding="EUC-JP"?** ).
    */
  var sEncoding: String = js.native
  
  /** contains the public Id of the document, for example, needed in exception-message strings. */
  var sPublicId: String = js.native
  
  /** contains the system ID of the document. */
  var sSystemId: String = js.native
}
object InputSource {
  
  @scala.inline
  def apply(aInputStream: XInputStream, sEncoding: String, sPublicId: String, sSystemId: String): InputSource = {
    val __obj = js.Dynamic.literal(aInputStream = aInputStream.asInstanceOf[js.Any], sEncoding = sEncoding.asInstanceOf[js.Any], sPublicId = sPublicId.asInstanceOf[js.Any], sSystemId = sSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSource]
  }
  
  @scala.inline
  implicit class InputSourceMutableBuilder[Self <: InputSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAInputStream(value: XInputStream): Self = StObject.set(x, "aInputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEncoding(value: String): Self = StObject.set(x, "sEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPublicId(value: String): Self = StObject.set(x, "sPublicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSystemId(value: String): Self = StObject.set(x, "sSystemId", value.asInstanceOf[js.Any])
  }
}
