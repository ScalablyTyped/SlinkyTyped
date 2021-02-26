package typingsSlinky.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseFriendshipStatus extends StObject {
  
  var following: Boolean = js.native
  
  var is_bestie: Boolean = js.native
  
  var outgoing_request: Boolean = js.native
}
object TagFeedResponseFriendshipStatus {
  
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, outgoing_request: Boolean): TagFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseFriendshipStatus]
  }
  
  @scala.inline
  implicit class TagFeedResponseFriendshipStatusMutableBuilder[Self <: TagFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
  }
}
