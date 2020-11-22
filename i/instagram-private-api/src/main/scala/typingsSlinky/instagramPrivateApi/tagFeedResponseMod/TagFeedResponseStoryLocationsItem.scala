package typingsSlinky.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseStoryLocationsItem extends js.Object {
  
  var height: String | Double = js.native
  
  var is_hidden: Double = js.native
  
  var is_pinned: Double = js.native
  
  var location: TagFeedResponseLocation = js.native
  
  var rotation: Double = js.native
  
  var width: Double | String = js.native
  
  var x: Double | String = js.native
  
  var y: Double | String = js.native
  
  var z: Double = js.native
}
object TagFeedResponseStoryLocationsItem {
  
  @scala.inline
  def apply(
    height: String | Double,
    is_hidden: Double,
    is_pinned: Double,
    location: TagFeedResponseLocation,
    rotation: Double,
    width: Double | String,
    x: Double | String,
    y: Double | String,
    z: Double
  ): TagFeedResponseStoryLocationsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseStoryLocationsItem]
  }
  
  @scala.inline
  implicit class TagFeedResponseStoryLocationsItemOps[Self <: TagFeedResponseStoryLocationsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = this.set("is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = this.set("is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: TagFeedResponseLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
