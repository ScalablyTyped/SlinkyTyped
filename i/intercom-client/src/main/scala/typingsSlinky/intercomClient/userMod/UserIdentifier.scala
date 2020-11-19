package typingsSlinky.intercomClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.userMod.UserIdIdentifier
  - typingsSlinky.intercomClient.userMod.UserEmailIdentifier
*/
trait UserIdentifier extends js.Object
object UserIdentifier {
  
  @scala.inline
  def UserEmailIdentifier(email: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentifier]
  }
  
  @scala.inline
  def Id(id: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentifier]
  }
  
  @scala.inline
  def Userid(user_id: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentifier]
  }
}
