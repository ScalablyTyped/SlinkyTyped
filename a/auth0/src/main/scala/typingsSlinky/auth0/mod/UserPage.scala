package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPage[A, U] extends Page {
  
  var users: js.Array[User[A, U]] = js.native
}
object UserPage {
  
  @scala.inline
  def apply[A, U](length: Double, limit: Double, start: Double, total: Double, users: js.Array[User[A, U]]): UserPage[A, U] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPage[A, U]]
  }
  
  @scala.inline
  implicit class UserPageMutableBuilder[Self <: UserPage[_, _], A, U] (val x: Self with (UserPage[A, U])) extends AnyVal {
    
    @scala.inline
    def setUsers(value: js.Array[User[A, U]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: (User[A, U])*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
