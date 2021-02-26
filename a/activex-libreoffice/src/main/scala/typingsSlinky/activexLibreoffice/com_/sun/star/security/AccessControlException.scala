package typingsSlinky.activexLibreoffice.com_.sun.star.security

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exception notifying a lacking permission to access data or execute code thus it is thrown if permission ought to be denied.
  * @since OOo 1.1.2
  */
@js.native
trait AccessControlException extends Exception {
  
  /** lacking permission. */
  var LackingPermission: js.Any = js.native
}
object AccessControlException {
  
  @scala.inline
  def apply(Context: XInterface, LackingPermission: js.Any, Message: String): AccessControlException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], LackingPermission = LackingPermission.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlException]
  }
  
  @scala.inline
  implicit class AccessControlExceptionMutableBuilder[Self <: AccessControlException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLackingPermission(value: js.Any): Self = StObject.set(x, "LackingPermission", value.asInstanceOf[js.Any])
  }
}
