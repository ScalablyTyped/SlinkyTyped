package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseReelMentionsItem extends StObject {
  
  var height: String = js.native
  
  var is_hidden: Double = js.native
  
  var is_pinned: Double = js.native
  
  var rotation: Double = js.native
  
  var user: ReelsMediaFeedResponseUser = js.native
  
  var width: String = js.native
  
  var x: String = js.native
  
  var y: String = js.native
  
  var z: Double = js.native
}
object ReelsMediaFeedResponseReelMentionsItem {
  
  @scala.inline
  def apply(
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    rotation: Double,
    user: ReelsMediaFeedResponseUser,
    width: String,
    x: String,
    y: String,
    z: Double
  ): ReelsMediaFeedResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseReelMentionsItem]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseReelMentionsItemMutableBuilder[Self <: ReelsMediaFeedResponseReelMentionsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ReelsMediaFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
