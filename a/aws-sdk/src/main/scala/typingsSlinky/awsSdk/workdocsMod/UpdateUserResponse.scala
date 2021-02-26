package typingsSlinky.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserResponse extends StObject {
  
  /**
    * The user information.
    */
  var User: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.User] = js.native
}
object UpdateUserResponse {
  
  @scala.inline
  def apply(): UpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserResponse]
  }
  
  @scala.inline
  implicit class UpdateUserResponseMutableBuilder[Self <: UpdateUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
