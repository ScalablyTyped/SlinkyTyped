package typingsSlinky.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserID extends StObject {
  
  var email: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object UserID {
  
  @scala.inline
  def apply(): UserID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserID]
  }
  
  @scala.inline
  implicit class UserIDMutableBuilder[Self <: UserID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
