package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersListResponse extends StObject {
  
  /** A user of an enterprise. */
  var user: js.UndefOr[js.Array[User]] = js.native
}
object UsersListResponse {
  
  @scala.inline
  def apply(): UsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersListResponse]
  }
  
  @scala.inline
  implicit class UsersListResponseMutableBuilder[Self <: UsersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: js.Array[User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setUserVarargs(value: User*): Self = StObject.set(x, "user", js.Array(value :_*))
  }
}
