package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typingsSlinky.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XContent
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * an error specifying the lack of a document name
  *
  * Usually thrown if someone tries to save a document which hasn't a name yet.
  * @since OOo 2.0
  */
@js.native
trait DocumentSaveRequest extends ClassifiedInteractionRequest {
  
  /**
    * specifies the content where the document should save inside. Somebody handling the request could, e.g., use the content as root content to display the
    * hierarchy of the sub contents.
    */
  var Content: XContent = js.native
  
  /** The default name of the document, may be empty. */
  var Name: String = js.native
}
object DocumentSaveRequest {
  
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Content: XContent,
    Context: XInterface,
    Message: String,
    Name: String
  ): DocumentSaveRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSaveRequest]
  }
  
  @scala.inline
  implicit class DocumentSaveRequestMutableBuilder[Self <: DocumentSaveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
