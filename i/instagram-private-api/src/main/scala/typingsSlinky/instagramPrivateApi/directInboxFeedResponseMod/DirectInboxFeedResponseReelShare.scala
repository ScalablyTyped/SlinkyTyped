package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectInboxFeedResponseReelShare extends StObject {
  
  var is_reel_persisted: Boolean = js.native
  
  var media: DirectInboxFeedResponseMedia = js.native
  
  var reel_owner_id: Double = js.native
  
  var reel_type: String = js.native
  
  var text: String = js.native
  
  var `type`: String = js.native
}
object DirectInboxFeedResponseReelShare {
  
  @scala.inline
  def apply(
    is_reel_persisted: Boolean,
    media: DirectInboxFeedResponseMedia,
    reel_owner_id: Double,
    reel_type: String,
    text: String,
    `type`: String
  ): DirectInboxFeedResponseReelShare = {
    val __obj = js.Dynamic.literal(is_reel_persisted = is_reel_persisted.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], reel_owner_id = reel_owner_id.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseReelShare]
  }
  
  @scala.inline
  implicit class DirectInboxFeedResponseReelShareMutableBuilder[Self <: DirectInboxFeedResponseReelShare] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs_reel_persisted(value: Boolean): Self = StObject.set(x, "is_reel_persisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: DirectInboxFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_owner_id(value: Double): Self = StObject.set(x, "reel_owner_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_type(value: String): Self = StObject.set(x, "reel_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
