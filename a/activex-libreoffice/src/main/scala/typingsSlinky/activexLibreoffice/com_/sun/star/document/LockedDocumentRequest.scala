package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is used for interaction handle to query user decision regarding locked document.
  * @since OOo 3.0
  */
@js.native
trait LockedDocumentRequest extends Exception {
  
  /** The URL of the locked document. */
  var DocumentURL: String = js.native
  
  /** The user information of the locked document. */
  var UserInfo: String = js.native
}
object LockedDocumentRequest {
  
  @scala.inline
  def apply(Context: XInterface, DocumentURL: String, Message: String, UserInfo: String): LockedDocumentRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], UserInfo = UserInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockedDocumentRequest]
  }
  
  @scala.inline
  implicit class LockedDocumentRequestMutableBuilder[Self <: LockedDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: String): Self = StObject.set(x, "UserInfo", value.asInstanceOf[js.Any])
  }
}
