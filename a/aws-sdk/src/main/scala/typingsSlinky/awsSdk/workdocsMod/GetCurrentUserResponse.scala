package typingsSlinky.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCurrentUserResponse extends StObject {
  
  /**
    * Metadata of the user.
    */
  var User: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.User] = js.native
}
object GetCurrentUserResponse {
  
  @scala.inline
  def apply(): GetCurrentUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCurrentUserResponse]
  }
  
  @scala.inline
  implicit class GetCurrentUserResponseMutableBuilder[Self <: GetCurrentUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
