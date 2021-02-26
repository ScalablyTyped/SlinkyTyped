package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The argument for the command "insert" augmented with some properties */
@js.native
trait InsertCommandArgument2 extends InsertCommandArgument {
  
  /** contains the Document Id of the document to insert */
  var DocumentId: String = js.native
  
  /** contains the MIME type of the document to insert */
  var MimeType: String = js.native
}
object InsertCommandArgument2 {
  
  @scala.inline
  def apply(Data: XInputStream, DocumentId: String, MimeType: String, ReplaceExisting: Boolean): InsertCommandArgument2 = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], ReplaceExisting = ReplaceExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertCommandArgument2]
  }
  
  @scala.inline
  implicit class InsertCommandArgument2MutableBuilder[Self <: InsertCommandArgument2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
  }
}
