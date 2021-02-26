package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this request specifies if a password for opening or modifying a document is requested.
  *
  * It is supported by {@link InteractionHandler} service, and can be used to interact for a document password. Continuations for using with the mentioned
  * service are Abort and Approve.
  * @see com.sun.star.task.PasswordRequest
  * @see com.sun.star.task.DocumentPasswordRequest
  * @since OOo 3.3
  */
@js.native
trait DocumentPasswordRequest2 extends DocumentPasswordRequest {
  
  /** specifies if the requested password is for opening a document or for modifying it. */
  var IsRequestPasswordToModify: Boolean = js.native
}
object DocumentPasswordRequest2 {
  
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    IsRequestPasswordToModify: Boolean,
    Message: String,
    Mode: PasswordRequestMode,
    Name: String
  ): DocumentPasswordRequest2 = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], IsRequestPasswordToModify = IsRequestPasswordToModify.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPasswordRequest2]
  }
  
  @scala.inline
  implicit class DocumentPasswordRequest2MutableBuilder[Self <: DocumentPasswordRequest2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRequestPasswordToModify(value: Boolean): Self = StObject.set(x, "IsRequestPasswordToModify", value.asInstanceOf[js.Any])
  }
}
