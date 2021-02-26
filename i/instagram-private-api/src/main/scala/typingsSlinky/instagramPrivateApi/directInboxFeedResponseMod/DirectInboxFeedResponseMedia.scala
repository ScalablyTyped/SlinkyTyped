package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectInboxFeedResponseMedia extends StObject {
  
  var expiring_at: Double = js.native
  
  var user: DirectInboxFeedResponseUser = js.native
}
object DirectInboxFeedResponseMedia {
  
  @scala.inline
  def apply(expiring_at: Double, user: DirectInboxFeedResponseUser): DirectInboxFeedResponseMedia = {
    val __obj = js.Dynamic.literal(expiring_at = expiring_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseMedia]
  }
  
  @scala.inline
  implicit class DirectInboxFeedResponseMediaMutableBuilder[Self <: DirectInboxFeedResponseMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: DirectInboxFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
