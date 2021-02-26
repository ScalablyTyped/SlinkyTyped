package typingsSlinky.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockedUser extends StObject {
  
  var blocked_id: Double = js.native
  
  var blocked_url: String = js.native
}
object BlockedUser {
  
  @scala.inline
  def apply(blocked_id: Double, blocked_url: String): BlockedUser = {
    val __obj = js.Dynamic.literal(blocked_id = blocked_id.asInstanceOf[js.Any], blocked_url = blocked_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedUser]
  }
  
  @scala.inline
  implicit class BlockedUserMutableBuilder[Self <: BlockedUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked_id(value: Double): Self = StObject.set(x, "blocked_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocked_url(value: String): Self = StObject.set(x, "blocked_url", value.asInstanceOf[js.Any])
  }
}
